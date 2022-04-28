package com.example.imgdiceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.imgdiceroll.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.btnSource = "Roll"
        binding.Btn.setOnClickListener {
            roll()
        }
    }

    private fun roll(){
        var randNum = (1..6).random()
        binding.imageView.setImageResource(rollDice(randNum))
        binding.txtSource = randNum.toString()
    }

    private fun rollDice(randNum: Int):Int = when(randNum){
        1 -> R.drawable.dice1
        2 -> R.drawable.dice2
        3 -> R.drawable.dice3
        4 -> R.drawable.dice4
        5 -> R.drawable.dice5
        else -> R.drawable.dice6
    }
}