package com.example.finalproject2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global
import android.view.View
import android.widget.ListView
import android.widget.Toast
import androidx.core.view.get
import kotlinx.android.synthetic.main.employee_item.view.*



class SecondaryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

    }

    override fun onStart() {
        super.onStart()
        val listView = findViewById<ListView>(R.id.listViewEmployee)
        val employeeAdapter = EmployeeAdapter(this, GlobalVariables.employeeList)
        listView.adapter = employeeAdapter
        listView.setOnItemClickListener() { adapterView, view, position, id ->
            val index = position
            val itemName = GlobalVariables.employeeList[position].name
            val itemPosition = GlobalVariables.employeeList[position].position
            val itemWage = GlobalVariables.employeeList[position].wage
            val itemImage = GlobalVariables.employeeList[position].image
            val intent = Intent(this, Edit_Employee::class.java)
            intent.putExtra("index", index.toString())
            intent.putExtra("name", itemName.toString())
            intent.putExtra("position", itemPosition.toString())
            intent.putExtra("wage", itemWage.toString())
            intent.putExtra("imageid", itemImage.toString())
            startActivity(intent)
        }
    }

    fun goToMainActivity(view: View)
    {
        var intent  = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
    fun goToEmployeeCreate(view: View)
    {
        var intent  = Intent(this,employeeCreate::class.java)
        startActivity(intent)
    }
}