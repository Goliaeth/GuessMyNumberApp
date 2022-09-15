package com.nick.guessmynumberapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.nick.guessmynumberapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var number: Int = 5

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        printTheQuestion()

    }

    fun clickDownwardArrow(view: View) {
        when (number) {
            5 -> {
                guessTheNumber(3)
            }
            3 -> {
                guessTheNumber(2)
            }
            2 -> {
                guessTheNumber(1)
            }
            8 -> {
                guessTheNumber(7)
            }
            7 -> {
                guessTheNumber(6)
            }
        }
    }

    fun clickSuccess(view: View) {

        binding.questionTextView.visibility = View.INVISIBLE
        binding.resultTextView.visibility = View.VISIBLE
        binding.resultTextView.text = String.format(resources.getString(R.string.str_success), number)

    }

    fun clickUpwardArrow(view: View) {
        when (number) {
            3 -> {
                guessTheNumber(4)
            }
            5 -> {
                guessTheNumber(8)
            }
            8 -> {
                guessTheNumber(9)
            }
            9 -> {
                guessTheNumber(10)
            }
        }
    }

    fun clickResetBtn(view: View) {
        binding.questionTextView.visibility = View.VISIBLE
        binding.resultTextView.visibility = View.INVISIBLE
        number = 5
        printTheQuestion()
    }

    private fun printTheQuestion() {
        binding.questionTextView.text = String.format(resources.getString(R.string.str_question), number)
    }

    private fun guessTheNumber(myNumber: Int) {
        number = myNumber
        printTheQuestion()
    }

}