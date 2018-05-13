package com.thishkt.demotoast2

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BasicActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_show_toast.setOnClickListener {
            mytoast("哈囉！顯示訊息")
        }
    }


}
