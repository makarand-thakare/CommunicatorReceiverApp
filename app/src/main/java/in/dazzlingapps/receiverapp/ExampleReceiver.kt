package `in`.dazzlingapps.receiverapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class ExampleReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val data = intent.getStringExtra("key")
        Toast.makeText(context, "data received $data", Toast.LENGTH_SHORT).show()
    }
}
