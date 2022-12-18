package com.example.finalproject2

class FoodItem(cName: String = "",
                      cDescription: String = "",
                      cPrice: String = "",
                      cImage: Int = 0,
                      cServingSize: String = "",
                      cCalories: String = "",
                      cCarbs: String = "",
                      cFat: String = "",
                      cCholesterol : String = "",
                      cSodium: String = "",
                      cPotassium : String = "",
                      cProtein : String = "") {
    val name: String;
    val description: String?;
    val price: String?;
    var image: Int = 0;
    val servingSize: String?;
    val calories: String?;
    val carbs: String?;
    val fat: String?;
    val cholesterol : String?;
    val sodium: String?;
    val potassium : String?;
    val protein : String?;

    init {
        name = cName;
        description = cDescription;
        price = cPrice;
        image = cImage;
        servingSize = cServingSize;
        calories = cCalories;
        carbs = cCarbs;
        fat = cFat;
        cholesterol = cCholesterol;
        sodium = cSodium;
        potassium = cPotassium;
        protein = cProtein;
    }




}