package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
        rollDice()
        /*
//            val toast = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT)
//            toast.show()
//            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show() (Cach viet gon)
*/
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)
        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
        diceImage.contentDescription = diceRoll.toString()
        /*
        val drawableResource = when (diceRoll) {
           1 -> R.drawable.dice_1
           2 -> R.drawable.dice_2
           3 -> R.drawable.dice_3
           4 -> R.drawable.dice_4
           5 -> R.drawable.dice_5
           6 -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
         */
        /*val drawableResource = when (diceRoll) {
   1 -> R.drawable.dice_1
   2 -> R.drawable.dice_2
   3 -> R.drawable.dice_3
   4 -> R.drawable.dice_4
   5 -> R.drawable.dice_5
   else -> R.drawable.dice_6
}

diceImage.setImageResource(drawableResource)
    }
}

         */
    }
}
class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}