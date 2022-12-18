package com.example.finalproject2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.finalproject2.R.id.goToEmployeeManager
import com.example.finalproject2.R.id.listView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.buttonPopup)

        button.setOnClickListener{
            helpAlert()
        }



    }
    override fun onStart() {
        super.onStart()
        val listView = findViewById<ListView>(listView)
        val foodAdapter = FoodAdapter(this, GlobalVariables.menuList)
        listView.adapter = foodAdapter
        listView.setOnItemClickListener() { adapterView, view, position, id ->
            val index = position
            val itemName = GlobalVariables.menuList[position].name
            val itemDescription = GlobalVariables.menuList[position].description
            val itemPrice = GlobalVariables.menuList[position].price
            var itemImage = GlobalVariables.menuList[position].image
            val intent = Intent(this, Edit_Food::class.java)
            if(itemImage == null) {itemImage = 0};
            intent.putExtra("index", index.toString())
            intent.putExtra("name", itemName.toString())
            intent.putExtra("description", itemDescription.toString())
            intent.putExtra("price", itemPrice.toString())
            intent.putExtra("imageid", itemImage.toString())
            startActivity(intent)
        }
    }

    fun goToSecondActivity(view: View)
    {
        var intent  = Intent(this,SecondaryActivity::class.java)
        startActivity(intent)
    }
    fun goToFoodCreate(view: View)
    {
        var intent  = Intent(this,FoodCreate::class.java)
        startActivity(intent)
    }

    fun helpAlert()
    {

            val builder = AlertDialog.Builder(this)
            //set title for alert dialog
            builder.setTitle("About")
            //set message for alert dialog
            builder.setMessage("This app allows the user to manage a restaurant's menu and waiting staff. " +
                    "By adding or editing the menu the user can control the various dishes available and their pricing. " +
                    "The user can also manage their restaurant's staff list with the employee manager allowing them to keep track of " +
                    "information such as position and wage.\n " +
                    "The user can edit items in the list by clicking on an item\n" +
                    "To save changes the user can press the save button\n " +
                    "To delete the item the user can select delete\n " +
                    "To add a new list item the user can select the button at the bottom of the page " +
                    "that says 'add new item'\n " +
                    "Each list contains a button along the bottom that allows them to navigate to the other manager")
            builder.setIcon(android.R.drawable.ic_dialog_alert)
            //performing cancel action
            builder.setNeutralButton("Ok"){dialogInterface , which ->

            }
            // Create the AlertDialog
            val alertDialog: AlertDialog = builder.create()
            // Set other dialog properties
            alertDialog.setCancelable(false)
            alertDialog.show()
    }
}