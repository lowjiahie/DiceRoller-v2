package com.example.diceroller_v2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
//    lateinit var diceImage2: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val clearButton: Button = findViewById(R.id.clear_button)
        rollButton.setOnClickListener { rollDice() }
        clearButton.setOnClickListener { clear() }
        diceImage = findViewById(R.id.dice_image)
//        diceImage2 = findViewById(R.id.dice_image2)
    }

    private fun rollDice() {
        diceImage.setImageResource(getRandomDiceImage())
//        diceImage2.setImageResource(getRandomDiceImage())
    }

    //challenge coding
    private fun getRandomDiceImage(): Int{
        return when((1..6).random()){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    //Homework
    private fun clear(){
        diceImage.setImageResource(R.drawable.empty_dice)
    }

}