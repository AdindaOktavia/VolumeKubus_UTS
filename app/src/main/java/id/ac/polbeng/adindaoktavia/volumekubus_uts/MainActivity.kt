package id.ac.polbeng.adindaoktavia.volumekubus_uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.polbeng.adindaoktavia.volumekubus_uts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val sideLength = binding.editText.text.toString().toDouble()
            val volume = sideLength * sideLength * sideLength
            val surfaceArea = 6 * sideLength * sideLength

            val intent = Intent(this@MainActivity, SecondActivity::class.java).apply {
                putExtra("volume", volume)
                putExtra("surfaceArea", surfaceArea)
            }
            startActivity(intent)
        }
    }
}