package com.edandaniel.myandroidapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.edandaniel.mylibrary.demo.Calculator
import com.edandaniel.mylibrary.toast.CustomToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val customToast = CustomToast(this, layoutInflater)

        val calculator = Calculator()
        val sum = calculator.sum(1,2)

        if(BuildConfig.REPORT_CRASH){
            customToast.showToast("crash on","info")
        }else{
            customToast.showToast("crash off","info")
        }
    }
}
