package com.example.challenge

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun makeColored(view: View){
        val boxOne = findViewById<TextView>(R.id.box_one_text)
        val boxTwo = findViewById<TextView>(R.id.box_two_text)
        val boxThree = findViewById<TextView>(R.id.box_three_text)
        val boxFour = findViewById<TextView>(R.id.box_four_text)
        val boxFive = findViewById<TextView>(R.id.box_five_text)
        val boxSix = findViewById<TextView>(R.id.box_six_text)
        val boxSeven = findViewById<TextView>(R.id.box_seven_text)
        when(view.id){
            R.id.box_one_text -> {
                boxOne.setBackgroundResource(R.color.aqua)
                boxTwo.setBackgroundResource(R.color.aqua)
                boxThree.setBackgroundResource(R.color.aqua)
                boxFour.setBackgroundResource(R.color.aqua)
                boxFive.setBackgroundResource(R.color.aqua)
                boxSix.setBackgroundResource(R.color.aqua)
                boxSeven.setBackgroundResource(R.color.aqua)

                Toast.makeText(this,"berhasil mengubah warna menjadi AQUA", Toast.LENGTH_SHORT).show()

            }
            R.id.box_two_text -> {
                boxOne.setBackgroundResource(R.color.crimson)
                boxTwo.setBackgroundResource(R.color.crimson)
                boxThree.setBackgroundResource(R.color.crimson)
                boxFour.setBackgroundResource(R.color.crimson)
                boxFive.setBackgroundResource(R.color.crimson)
                boxSix.setBackgroundResource(R.color.crimson)
                boxSeven.setBackgroundResource(R.color.crimson)

                Toast.makeText(this,"berhasil mengubah warna menjadi CRIMSON", Toast.LENGTH_SHORT).show()
            }
            R.id.box_three_text -> {
                boxOne.setBackgroundResource(R.color.orchid)
                boxTwo.setBackgroundResource(R.color.orchid)
                boxThree.setBackgroundResource(R.color.orchid)
                boxFour.setBackgroundResource(R.color.orchid)
                boxFive.setBackgroundResource(R.color.orchid)
                boxSix.setBackgroundResource(R.color.orchid)
                boxSeven.setBackgroundResource(R.color.orchid)

                Toast.makeText(this,"berhasil mengubah warna menjadi ORCHID", Toast.LENGTH_SHORT).show()
            }
            R.id.box_four_text -> {
                boxOne.setBackgroundResource(R.color.navy)
                boxTwo.setBackgroundResource(R.color.navy)
                boxThree.setBackgroundResource(R.color.navy)
                boxFour.setBackgroundResource(R.color.navy)
                boxFive.setBackgroundResource(R.color.navy)
                boxSix.setBackgroundResource(R.color.navy)
                boxSeven.setBackgroundResource(R.color.navy)

                Toast.makeText(this,"berhasil mengubah warna menjadi NAVY", Toast.LENGTH_SHORT).show()
            }
            R.id.box_five_text -> {
                boxOne.setBackgroundResource(R.color.royal_blue)
                boxTwo.setBackgroundResource(R.color.royal_blue)
                boxThree.setBackgroundResource(R.color.royal_blue)
                boxFour.setBackgroundResource(R.color.royal_blue)
                boxFive.setBackgroundResource(R.color.royal_blue)
                boxSix.setBackgroundResource(R.color.royal_blue)
                boxSeven.setBackgroundResource(R.color.royal_blue)

                Toast.makeText(this,"berhasil mengubah warna menjadi ROYAL BLUE", Toast.LENGTH_SHORT).show()
            }
            R.id.box_six_text -> {
                boxOne.setBackgroundResource(R.color.violet)
                boxTwo.setBackgroundResource(R.color.violet)
                boxThree.setBackgroundResource(R.color.violet)
                boxFour.setBackgroundResource(R.color.violet)
                boxFive.setBackgroundResource(R.color.violet)
                boxSix.setBackgroundResource(R.color.violet)
                boxSeven.setBackgroundResource(R.color.violet)

                Toast.makeText(this,"berhasil mengubah warna menjadi VIOLET", Toast.LENGTH_SHORT).show()
            }
            R.id.box_seven_text -> {
                boxOne.setBackgroundResource(R.color.aqua)
                boxTwo.setBackgroundResource(R.color.crimson)
                boxThree.setBackgroundResource(R.color.orchid)
                boxFour.setBackgroundResource(R.color.navy)
                boxFive.setBackgroundResource(R.color.royal_blue)
                boxSix.setBackgroundResource(R.color.violet)
                boxSeven.setBackgroundResource(R.color.black)

                Toast.makeText(this,"berhasil mengembalikan warna deafult", Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun setListeners(){
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)
        val boxSevenText = findViewById<TextView>(R.id.box_seven_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)
        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText,boxFourText, boxFiveText,boxSixText, boxSevenText, rootConstraintLayout)
        for (item in clickableViews){
            item.setOnClickListener{makeColored(it)}
        }

    }
}