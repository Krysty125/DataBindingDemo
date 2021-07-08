package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var aPerson: Person = Person("Lau","001225-14-2039","lau@gmail.com","miaoiao Jalan abc")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.personData = aPerson

        binding.btnUpdate.setOnClickListener() {
            aPerson.email = "liu@gmail.com"
            aPerson.address = "Jalan biu, 1225 KL"

            binding.apply { invalidateAll() }
        }


        /*binding.tvName.text = "Krysty"

        binding.tvName.text = aPerson.name
        binding.tvNRIC.text = aPerson.ic
        binding.tvEmail.text = aPerson.email
        binding.tvAddress.text = aPerson.address
        */

        /*
        val x: Int = 10 (value can only assign one time
        var x = Int ( variable can assign many time)
        x = 10
        x = 20

        val name : TextView = findViewById(R.id.tvName)
        val ic : TextView = findViewById(R.id.tvNRIC)
        val email : TextView = findViewById(R.id.tvEmail)
        val address : TextView = findViewById(R.id.tvAddress)
        */

    }
}