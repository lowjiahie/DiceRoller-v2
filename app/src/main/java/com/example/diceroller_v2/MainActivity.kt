package com.example.diceroller_v2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    lateinit var numText : TextView
//    lateinit var diceImage2: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val clearButton = findViewById<Button>(R.id.clear_button)
        rollButton.setOnClickListener { rollDice() }
        clearButton.setOnClickListener { clear() }
        diceImage = findViewById(R.id.dice_image)
        numText = findViewById(R.id.num_text)
//        diceImage2 = findViewById(R.id.dice_image2)
    }

    private fun rollDice() {
        val (randomImage, randomNum) = getRandomDiceImage()
        numText.text = randomNum.toString()
        diceImage.setImageResource(randomImage)
//        diceImage2.setImageResource(getRandomDiceImage())
        Toast.makeText(this, randomNum.toString(),Toast.LENGTH_SHORT).show()
    }

    //challenge coding
    private fun getRandomDiceImage(): Pair<Int,Int>{
        val randomNum = (1..6).random()
        return when(randomNum){
            1 -> Pair(R.drawable.dice_1,randomNum)
            2 -> Pair(R.drawable.dice_2,randomNum)
            3 -> Pair(R.drawable.dice_3,randomNum)
            4 -> Pair(R.drawable.dice_4,randomNum)
            5 -> Pair(R.drawable.dice_5,randomNum)
            else -> Pair(R.drawable.dice_6,randomNum)
        }
    }

    //Homework
    private fun clear(){
        diceImage.setImageResource(R.drawable.empty_dice)
    }

}