package com.example.uielements1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AccountView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_view)

        val intent = getIntent()

        val first_name = findViewById<TextView>(R.id.first_name)
        val last_name = findViewById<TextView>(R.id.last_name)
        val age_view = findViewById<TextView>(R.id.age_view)
        val Birthday = findViewById(R.id.birth) as TextView
        val view_email = findViewById<TextView>(R.id.email_view)
        val phone_view = findViewById<TextView>(R.id.phone_number)

        val Firstname = intent.getStringExtra("first")
        val Lastname = intent.getStringExtra("last")
        val Ageview = intent.getStringExtra("age")
        val Birth_day = intent.getStringExtra("Date")
        val email_view = intent.getStringExtra("email")
        val view_phone = intent.getStringExtra("phone")

        first_name.setText("First Name: " + Firstname)
        last_name.text = "Last Name: " + Lastname
        age_view.text = "Age: " + Ageview
        Birthday.text = "Birthday: " + Birth_day
        view_email.text = "Email: " + email_view
        phone_view.text = "Phone Number: " + view_phone
    }
}