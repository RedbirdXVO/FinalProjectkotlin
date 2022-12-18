
package com.example.finalproject2

import android.content.Intent
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_employee.*
import kotlinx.android.synthetic.main.activity_edit_employee.eDescription
import kotlinx.android.synthetic.main.activity_edit_employee.eImageId
import kotlinx.android.synthetic.main.activity_edit_employee.eName
import kotlinx.android.synthetic.main.activity_edit_employee.ePrice
import kotlinx.android.synthetic.main.activity_edit_employee.imageView
import kotlinx.android.synthetic.main.activity_employee_create.*

class Edit_Employee : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_employee)
        val index = intent.getStringExtra("index")!!.toInt()
        eName.setText(intent.getStringExtra("name"))
        eDescription.setText(intent.getStringExtra("position"))
        ePrice.setText(intent.getStringExtra("wage"))
        eImageId.setText(intent.getStringExtra("imageid"))
        val imageId = intent.getStringExtra("imageid")!!.toInt()
        try {
            imageView.setImageResource(imageId.toInt())
        }
        catch(e: Resources.NotFoundException){
            imageView.setImageResource(R.drawable.ic_launcher_background)
        }

        editButton.setOnClickListener{
            if(eImageId.text == null || eImageId.text.toString() == "") {eImageId.setText("0")};
            val newEmployeeItem = EmployeeItem(eName.text.toString(), eDescription.text.toString(), ePrice.text.toString(), eImageId.text.toString().toInt())
            GlobalVariables.employeeList.set(index, newEmployeeItem)
            val intent = Intent(this, SecondaryActivity::class.java)
            startActivity(intent)
        }
        deleteButton.setOnClickListener{
            GlobalVariables.employeeList.removeAt(index)
            val intent = Intent(this, SecondaryActivity::class.java)
            startActivity(intent)
        }
    }
}