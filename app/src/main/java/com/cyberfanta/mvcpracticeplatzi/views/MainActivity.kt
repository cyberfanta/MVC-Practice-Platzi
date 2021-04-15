package com.cyberfanta.mvcpracticeplatzi.views

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.cyberfanta.mvcpracticeplatzi.R
import com.cyberfanta.mvcpracticeplatzi.models.CryptoUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()



        Log.i("MainActivity", CryptoUtils.encrypt())
        Log.i("MainActivity", CryptoUtils.decrypt("NyWoRYUPmrIl+d1onvDuPgnJs3CxeamuFFeqE3F3PPu++FUPy1/N0w=="))
    }
}