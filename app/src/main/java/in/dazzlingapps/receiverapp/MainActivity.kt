package `in`.dazzlingapps.receiverapp

import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerBR()
    }

    private fun registerBR() {
        // Register broadcast receiver
        val receiver = ExampleReceiver()
        registerReceiver(receiver, IntentFilter("android.example.CUSTOM_INTENT"))
    }
}