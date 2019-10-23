package com.onurcemkarakoc.databindingfm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.onurcemkarakoc.databindingfm.databinding.ActivityMainBinding
import com.onurcemkarakoc.databindingfm.model.Person

class MainActivity : AppCompatActivity() {
    private lateinit var  dataBinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        dataBinding.person = Person("ONURCEM",24)
    }
}
