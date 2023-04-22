package techtown.org.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import techtown.org.kotlintest.databinding.ActivityMainBinding
import techtown.org.kotlintest.fragment.*

/*
class MainActivity : AppCompatActivity() {
    //private lateinit var binding : ActivityMainBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        var navController = navHostFragment.navController
        //navController = findNavController(R.id.nav_host_fragment)

    }
}
*/

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener{

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var homeFragment = HomeFragment()
        supportFragmentManager.beginTransaction().add(R.id.main_content, homeFragment).commit()

        binding.bottomNavigation.setOnNavigationItemSelectedListener(this)
    }

    /*myAdapter.SetOnItemClickListener(object : MyAdapter.OnItemClickListener{
        override fun onItemClick(v: View, data: ListData, pos : Int) {
            Intent(this, Recycle_Main::class.java).apply {
                putExtra("data", data)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }.run { startActivity(this) }
        }

    })*/

    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        when(p0.itemId){
            R.id.action_home -> {
                var homeFragment = HomeFragment()
                supportFragmentManager.beginTransaction().replace(R.id.main_content,homeFragment).commit()
                return true
            }
            R.id.action_my_travel -> {
                var gridFragment = GridFragment()
                supportFragmentManager.beginTransaction().replace(R.id.main_content,gridFragment).commit()
                return true
            }
            R.id.action_community -> {
                var communityFragment = CommunityFragment()
                supportFragmentManager.beginTransaction().replace(R.id.main_content,communityFragment).commit()
                return true
            }
            R.id.action_account -> {
                var userFragment = UserFragment()
                supportFragmentManager.beginTransaction().replace(R.id.main_content,userFragment).commit()
                return true
            }
        }
        return false
    }
}

