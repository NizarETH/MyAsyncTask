package com.ofppt.myasynctask

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.lang.ref.WeakReference

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val weak = WeakReference(this@MainActivity)

        findViewById<View>(R.id.run)
            .setOnClickListener(View.OnClickListener {
                Async(this).execute(10)

            })
        findViewById<View>(R.id.weak)
            .setOnClickListener(View.OnClickListener {
                AsyncWeakReference( weak as WeakReference<Context>).execute(10)

            })

    }
}