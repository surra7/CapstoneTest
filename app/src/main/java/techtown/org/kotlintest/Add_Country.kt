package techtown.org.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import techtown.org.kotlintest.databinding.ActivityAdd2Binding
import techtown.org.kotlintest.databinding.ActivityAddCountryBinding

class Add_Country : AppCompatActivity() {
    lateinit var binding: ActivityAddCountryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddCountryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.topBar)
        //툴바에 타이틀 없애기
        supportActionBar?.setDisplayShowTitleEnabled(false)
        /*toggle = ActionBarDrawerToggle(this, binding.btnSave, R.string.drawer_opened,
            R.string.drawer_closed
        )*/
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}