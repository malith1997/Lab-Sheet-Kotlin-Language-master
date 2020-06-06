package gavi.sliit.loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email = findViewById<EditText>(R.id.userNameInput)
        val pass = findViewById<EditText>(R.id.passInput)

        val loginClick = findViewById<Button>(R.id.loginBtn)
        loginClick.setOnClickListener {
            val mail: String = email.text.toString()
            val pwd: String = pass.text.toString()

            if (mail.trim().isEmpty()) {
                Toast.makeText(applicationContext, "Email field cannot be empty", Toast.LENGTH_SHORT).show()
            }

            if (pwd.trim().isEmpty()) {
                Toast.makeText(applicationContext, "Password field cannot be empty", Toast.LENGTH_SHORT).show()
            }

            if (mail == "rusiru@gmail.com" &&(pwd == "rusiru97")){
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
            } else{
                Toast.makeText(applicationContext, "Wrong Email or Password!!", Toast.LENGTH_SHORT).show()
            }



        }
    }
}
