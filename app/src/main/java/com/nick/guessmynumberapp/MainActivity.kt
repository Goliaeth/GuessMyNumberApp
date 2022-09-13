package com.nick.guessmynumberapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.nick.guessmynumberapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var number: Int = 5

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        printTheQuestion()

    }

    fun clickDownwardArrow(view: View) {
        if (number == 5) {
            number = 3
            printTheQuestion()
        } else if (number == 3) {
            number = 2
            printTheQuestion()
        } else if (number == 2)  {
            number = 1
            printTheQuestion()
        } else if (number == 8) {
            number = 7
            printTheQuestion()
        } else if (number == 7) {
            number = 6
            printTheQuestion()
        }
    }

    fun clickSuccess(view: View) {

        binding.questionTextView.visibility = View.INVISIBLE
        binding.resultTextView.visibility = View.VISIBLE
        binding.resultTextView.text = String.format(resources.getString(R.string.str_success), number)

    }

    fun clickUpwardArrow(view: View) {
        if (number == 3) {
            number = 4
            printTheQuestion()
        } else if (number == 5) {
            number = 8
            printTheQuestion()
        } else if (number == 8) {
            number = 9
            printTheQuestion()
        } else if (number ==9) {
            number = 10
            printTheQuestion()
        }
    }

    fun clickResetBtn(view: View) {
        binding.questionTextView.visibility = View.VISIBLE
        binding.resultTextView.visibility = View.INVISIBLE
        number = 5
        printTheQuestion()
    }

    fun printTheQuestion() {
        binding.questionTextView.text = String.format(resources.getString(R.string.str_question), number)
    }

}