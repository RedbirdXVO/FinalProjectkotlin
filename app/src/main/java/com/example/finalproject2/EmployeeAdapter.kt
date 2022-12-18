package com.example.finalproject2

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.finalproject2.R

class EmployeeAdapter(private val context: Activity, private val employeeItem: ArrayList<EmployeeItem>)
    : ArrayAdapter<EmployeeItem>(context, R.layout.food_item, employeeItem) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.employee_item, null, true)

        val titleText = rowView.findViewById(R.id.name) as TextView
        val imageView = rowView.findViewById(R.id.icon) as ImageView
        val subtitleText = rowView.findViewById(R.id.position) as TextView
        val priceText = rowView.findViewById(R.id.wage) as TextView

        titleText.text = employeeItem[position].name
        imageView.setImageResource(employeeItem[position].image!!)
        subtitleText.text = employeeItem[position].position
        priceText.text = "$" + employeeItem[position].wage + "/hr"

        return rowView
    }
}