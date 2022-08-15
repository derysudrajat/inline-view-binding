package id.derysudrajat.inlinebind

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.derysudrajat.inlinebind.databinding.ActivityMainBinding
import id.derysudrajat.inlinebinding.viewBinding

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)

    private val listOfFragment = listOf(SampleFragment(), AnotherSampleFragment())
    var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tvHello.text = buildString { append("Hello World this is Main Activity") }
        changeFragment()
        binding.buttonChange.setOnClickListener {
            currentIndex = if (currentIndex == 0) 1 else 0
            changeFragment(currentIndex)
        }
    }

    private fun changeFragment(index: Int? = currentIndex) {
        supportFragmentManager.beginTransaction()
            .replace(binding.containerFragment.id, listOfFragment[index ?: 0])
            .commit()
    }
}