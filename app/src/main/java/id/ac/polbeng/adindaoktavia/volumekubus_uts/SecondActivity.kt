package id.ac.polbeng.adindaoktavia.volumekubus_uts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.polbeng.adindaoktavia.volumekubus_uts.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val volume = intent.getDoubleExtra("volume", 0.0)
        val surfaceArea = intent.getDoubleExtra("surfaceArea", 0.0)

        binding.textView.text = getString(R.string.volume_text, volume) + "\n" + getString(R.string.luas_text, surfaceArea)
    }
}