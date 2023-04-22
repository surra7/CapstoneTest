package techtown.org.kotlintest.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import techtown.org.kotlintest.AddActivity2
import techtown.org.kotlintest.AddNewPost
import techtown.org.kotlintest.ListData
import techtown.org.kotlintest.R
import techtown.org.kotlintest.databinding.ActivityMainBinding
import techtown.org.kotlintest.databinding.FragmentAddNewPostBinding
import techtown.org.kotlintest.databinding.FragmentCommunityBinding
import techtown.org.kotlintest.databinding.FragmentGridBinding

class CommunityFragment: Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentCommunityBinding.inflate(inflater, container, false)

        val requestLauncher: ActivityResultLauncher<Intent> = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()) {
            it.data!!.getStringExtra("result")?.let {
            }
        }

        binding.addNewPost.setOnClickListener{
            val intent = Intent(context, AddNewPost::class.java)
            requestLauncher.launch(intent)
        }

        return binding.root
    }
}