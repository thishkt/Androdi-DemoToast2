package com.thishkt.demotoast2

import android.support.v7.app.AppCompatActivity
import android.widget.Toast

open class BasicActivity : AppCompatActivity() {

    fun mytoast(text: String, duration: Int=Toast.LENGTH_LONG) {
        Toast.makeText(this, text, duration).show()
    }

}
