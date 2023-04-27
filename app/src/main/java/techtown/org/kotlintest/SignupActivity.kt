package techtown.org.kotlintest

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import techtown.org.kotlintest.databinding.ActivityFriendsBinding
import techtown.org.kotlintest.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.topBar)
        //툴바에 타이틀 없애기
        supportActionBar?.setDisplayShowTitleEnabled(false)
        /*toggle = ActionBarDrawerToggle(this, binding.btnSave, R.string.drawer_opened,
            R.string.drawer_closed
        )*/
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.signupApplyBtn.setOnClickListener(({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }))
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            /*R.id.signup_apply_btn -> {
                val intent = intent
                setResult(Activity.RESULT_OK, intent)
                finish()
                true
            }*/
            android.R.id.home -> {
                val intent = intent
                setResult(Activity.RESULT_OK, intent)
                finish()
                return true
            }
            else -> {}
        }
        return super.onOptionsItemSelected(item)
    }
}