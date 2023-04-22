package techtown.org.kotlintest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import techtown.org.kotlintest.databinding.ActivityAdd2Binding
import techtown.org.kotlintest.databinding.ActivityAddBinding

class AddActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityAdd2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdd2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.topBar)
        //툴바에 타이틀 없애기
        supportActionBar?.setDisplayShowTitleEnabled(false)
        /*toggle = ActionBarDrawerToggle(this, binding.btnSave, R.string.drawer_opened,
            R.string.drawer_closed
        )*/
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val requestLauncher: ActivityResultLauncher<Intent> = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()) {
        }

        binding.applyDate.setOnClickListener{
            val intent = Intent(this, Add_Country::class.java)
            requestLauncher.launch(intent)
        }
    }
}