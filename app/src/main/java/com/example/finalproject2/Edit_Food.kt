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

class Edit_Food : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_food)
        val index = intent.getStringExtra("index")!!.toInt()
        eName.setText(intent.getStringExtra("name"))
        eDescription.setText(intent.getStringExtra("description"))
        ePrice.setText(intent.getStringExtra("price"))
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
            val newFoodItem = FoodItem(eName.text.toString(), eDescription.text.toString(), ePrice.text.toString(), eImageId.text.toString().toInt())
            GlobalVariables.menuList.set(index, newFoodItem)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        deleteButton.setOnClickListener{
            GlobalVariables.menuList.removeAt(index)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}