package com.example.portfolioapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.portfolioapp.databinding.ActivityLoginBinding
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }


    fun goToMainApp(view: View) {
        val sharedPref = getSharedPreferences(SignUpActivity.USER_SHARED_PREF, Context.MODE_PRIVATE)
        val eMail = sharedPref.getString(SignUpActivity.EMAIL, "DEF_VAL")
        val password = sharedPref.getString(SignUpActivity.PASSWORD, "DEF_VAL")

        // Check if email and password field is empty
        if (UsernameEt.text.trim().isEmpty()) {
            UsernameEt.error = "Required"

        } else if (passwordEt.text.trim().isEmpty()) {

            passwordEt.error = "Required"

            // Validate the password and email
        }else if (eMail.equals(binding.UsernameEt.text.toString()) && password.equals(binding.passwordEt.text.toString())) {
            // Go to main Activity on validation of the log in details
            Toast.makeText(this, "Login Successful", Toast.LENGTH_LONG).show()
            val  intent = Intent(this, MainActivity::class.java)
            intent.putExtra("email", eMail)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Incorrect username or password", Toast.LENGTH_LONG).show()


        }



    }

    fun goToSignUp(view: View) {

        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }


}
