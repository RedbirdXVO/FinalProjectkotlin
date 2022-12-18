package com.example.finalproject2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_employee.*
import kotlinx.android.synthetic.main.activity_employee_create.*
import kotlinx.android.synthetic.main.activity_employee_create.eDescription
import kotlinx.android.synthetic.main.activity_employee_create.eImageId
import kotlinx.android.synthetic.main.activity_employee_create.eName
import kotlinx.android.synthetic.main.activity_employee_create.ePrice

class FoodCreate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_create)

        createButton.setOnClickListener{
            if(eImageId.text == null || eImageId.text.toString() == "") {eImageId.setText("0")};
            val newFoodItem = FoodItem(eName.text.toString(), eDescription.text.toString(), ePrice.text.toString(), eImageId.text.toString().toInt())
            GlobalVariables.menuList.add(newFoodItem)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}