package com.bignerdranch.android.authorisation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

private const val correctLogin = "Admin"
private const val correctPassword = "root"

class MainActivity : AppCompatActivity() {

    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var loginButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username = findViewById(R.id.login_username_text)
        password = findViewById(R.id.login_password_text)
        loginButton = findViewById(R.id.login_button)

        loginButton.setOnClickListener{

            if(username.text.toString() == correctLogin && password.text.toString() == correctPassword){
                Toast.makeText(this, "You are successfully logged in", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Username or password incorrect", Toast.LENGTH_SHORT).show()
            }

        }



    }
}