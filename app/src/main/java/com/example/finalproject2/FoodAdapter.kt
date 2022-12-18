package com.example.finalproject2

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.finalproject2.R

class FoodAdapter(private val context: Activity, private val foodItem: ArrayList<FoodItem>)
    : ArrayAdapter<FoodItem>(context, R.layout.food_item, foodItem) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.food_item, null, true)

        val titleText = rowView.findViewById(R.id.name) as TextView
        val imageView = rowView.findViewById(R.id.icon) as ImageView
        val subtitleText = rowView.findViewById(R.id.description) as TextView
        val priceText = rowView.findViewById(R.id.price) as TextView

        titleText.text = foodItem[position].name
        imageView.setImageResource(foodItem[position].image)
        subtitleText.text = foodItem[position].description
        priceText.text = "$" + foodItem[position].price.toString()
        return rowView
    }
}