package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var firstName: String = ""
    var lastName: String = ""
    var Phone_Number: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun SetUpProfileData() {
        firstName = "Purvesh"
        lastName = "Doodiya"
        Phone_Number = "9876543121"
    }

}
