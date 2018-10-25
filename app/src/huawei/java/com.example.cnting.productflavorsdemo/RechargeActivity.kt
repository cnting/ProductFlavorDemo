package com.example.cnting.productflavorsdemo

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.huawei.activity_recharge.*

class RechargeActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recharge)
        payBtn.setOnClickListener {
            Toast.makeText(this@RechargeActivity, "华为支付", Toast.LENGTH_SHORT).show()
        }
    }
}
