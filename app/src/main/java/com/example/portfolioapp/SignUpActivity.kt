package com.example.portfolioapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.portfolioapp.databinding.ActivitySignUpBinding
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    companion object{
        const val USER_SHARED_PREF = "com.example.portfolioapp.PREFERENCES"
        const val EMAIL = "EMAIL"
        const val PASSWORD = "PASSWORD"

    }

    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun saveToSharedPref(){
        val sharedPref = getSharedPreferences(USER_SHARED_PREF, Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putString(EMAIL, binding.ChooseEmailEt.text.toString())
        editor.putString(PASSWORD, binding.choosepasswordEt.text.toString())
        if (ChooseEmailEt.text.toString().trim().isNotEmpty() && choosepasswordEt.text.toString().trim().isNotEmpty()){
            editor.apply()
            Toast.makeText(this, "Sign up successful", Toast.LENGTH_LONG).show()
        }


    }

    fun goToLogIn(view: View){
        // Check if the text fields are empty
         if (ChooseEmailEt.text.trim().isEmpty()) {
             ChooseEmailEt.error = "Required"
        } else if (choosepasswordEt.text.trim().isEmpty()){
            choosepasswordEt.error = "Required"
        } else if (ChooseEmailEt.text.toString().trim().isEmpty() && choosepasswordEt.text.toString().trim().isEmpty()) {
             Toast.makeText(this, "Email or password field cant be empty", Toast.LENGTH_LONG).show()
         } else{
            saveToSharedPref()

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }

    fun goToSignIn(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)

    }


}
