package com.example.finalproject2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_employee.eImageId
import kotlinx.android.synthetic.main.activity_edit_employee.eName
import kotlinx.android.synthetic.main.activity_edit_employee.eDescription
import kotlinx.android.synthetic.main.activity_edit_employee.ePrice
import kotlinx.android.synthetic.main.activity_employee_create.*

class employeeCreate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_create)

        createButton.setOnClickListener{
            if(eImageId.text == null || eImageId.text.toString() == "") {eImageId.setText("0")};
            val newEmployeeItem = EmployeeItem(eName.text.toString(), eDescription.text.toString(), ePrice.text.toString(), eImageId.text.toString().toInt())
            GlobalVariables.employeeList.add(newEmployeeItem)
            val intent = Intent(this, SecondaryActivity::class.java)
            startActivity(intent)
        }
    }
}