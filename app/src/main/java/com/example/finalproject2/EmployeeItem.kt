package com.example.finalproject2

class EmployeeItem(cName: String = "",
               cPosition: String = "",
               cWage: String = "",
               cImage: Int? = 0,
               cSchedule: String = "") {
    val name: String;
    val position: String?;
    val wage: String?;
    val image: Int?;
    val schedule: String?;

    init {
        name = cName;
        position = cPosition;
        wage = cWage;
        image = cImage;
        schedule = cSchedule;
    }
}