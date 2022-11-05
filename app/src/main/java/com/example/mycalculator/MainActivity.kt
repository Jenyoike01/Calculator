package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var myAnswer: TextView?=null
    var myFnum : EditText?=null
    var mySnum: EditText?=null
    var buttonAdd: Button?=null
    var buttonSubtract: Button?=null
    var buttonDivide: Button?=null
    var buttonMultiply: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myAnswer = findViewById(R.id.mTvAnswer)
        myFnum = findViewById(R.id.myFnum)
        mySnum = findViewById(R.id.mySnum)
        buttonAdd =findViewById(R.id.mBtnAdd)
        buttonSubtract = findViewById(R.id.mBtnSubtract)
        buttonDivide = findViewById(R.id.mBtnDivide)
        buttonMultiply = findViewById(R.id.mBtnMultiply)

        //set on click listeners
        buttonAdd!!.setOnClickListener {
            //Receive the two numbers from the user
            var firstNumber = myFnum!!.text.toString().trim()
            var secondNumber = mySnum!!.text.toString().trim()
            //check if the user is submitting empty fields
            if (firstNumber.isEmpty()){
                //set an error to the firstNumber to the edit text
                myFnum!!.setError("Please fill this input")
                myFnum!!.requestFocus()
            }else if (secondNumber.isEmpty()){
                mySnum!!.setError("Please fill in this input")
                mySnum!!.requestFocus()
            }else{
                //Proceed to calculate the numbers
                var answer = firstNumber.toDouble()+ secondNumber.toDouble()
                //Display the result on the text view myAnswer
                myAnswer!!.text = answer.toString()
            }

            }
        buttonSubtract!!.setOnClickListener {
//Receive the two numbers from the user
            var firstNumber = myFnum!!.text.toString().trim()
            var secondNumber = mySnum!!.text.toString().trim()
            //check if the user is submitting empty fields
            if (firstNumber.isEmpty()){
                //set an error to the firstNumber to the edit text
                myFnum!!.setError("Please fill this input")
                myFnum!!.requestFocus()
            }else if (secondNumber.isEmpty()){
                mySnum!!.setError("Please fill in this input")
                mySnum!!.requestFocus()
            }else{
                //Procced to calculate the numbers
                var answer = firstNumber.toDouble()- secondNumber.toDouble()
                //Display the result on the text view myAnswer
                myAnswer!!.text = answer.toString()
            }
        }
        buttonDivide!!.setOnClickListener {
//Receive the two numbers from the user
            var firstNumber = myFnum!!.text.toString().trim()
            var secondNumber = mySnum!!.text.toString().trim()
            //check if the user is submitting empty fields
            if (firstNumber.isEmpty()){
                //set an error to the firstNumber to the edit text
                myFnum!!.setError("Please fill this input")
                myFnum!!.requestFocus()
            }else if (secondNumber.isEmpty()){
                mySnum!!.setError("Please fill in this input")
                mySnum!!.requestFocus()
            }else{
                //Procced to calculate the numbers
                var answer = firstNumber.toDouble()/ secondNumber.toDouble()
                //Display the result on the text view myAnswer
                myAnswer!!.text = answer.toString()
            }
        }
        buttonMultiply!!.setOnClickListener {
//Receive the two numbers from the user
            var firstNumber = myFnum!!.text.toString().trim()
            var secondNumber = mySnum!!.text.toString().trim()
            //check if the user is submitting empty fields
            if (firstNumber.isEmpty()){
                //set an error to the firstNumber to the edit text
                myFnum!!.setError("Please fill this input")
                myFnum!!.requestFocus()
            }else if (secondNumber.isEmpty()){
                mySnum!!.setError("Please fill in this input")
                mySnum!!.requestFocus()
            }else{
                //Procced to calculate the numbers
                var answer = firstNumber.toDouble()* secondNumber.toDouble()
                //Display the result on the text view myAnswer
                myAnswer!!.text = answer.toString()
            }
        }
    }
}