package app.babachan.l4s_intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        intentButton.setOnClickListener {
            val toSecondActivityIntent = Intent(this, SecondActivity::class.java)
            startActivity(toSecondActivityIntent)
        }

        playStoreButton.setOnClickListener {
            val playStoreIntent = Intent(Intent.ACTION_VIEW)
            playStoreIntent.data = Uri.parse("https://play.google.com/store/apps")
            playStoreIntent.setPackage("com.android.vending")
            startActivity(playStoreIntent)
        }
    }
}