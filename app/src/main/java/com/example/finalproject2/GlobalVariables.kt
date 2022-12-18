package com.example.finalproject2

import android.app.Application

class GlobalVariables: Application() {
    companion object{
        var employeeList = arrayListOf<EmployeeItem>(
            EmployeeItem("Bob", "Cook", "15.09", R.drawable.face3),
            EmployeeItem("Phil", "Manager", "40.32", R.drawable.face2),
            EmployeeItem("Mike", "Register", "5.05", R.drawable.face1),
        )
        val menuList = arrayListOf(
            FoodItem("Bread", "Muy Delicioso con manteca!", "3.99", R.drawable.moldy_bread),
            FoodItem("Taco", "Muy gaseoso!", "2.99", R.drawable.tacos),
            FoodItem("Rice", "Bien", "1.99", R.drawable.rice),
        )
    }
}