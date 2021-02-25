package com.busedagidir.bootcamp01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var textView : TextView
    lateinit var button : Button
    lateinit var diceImage : ImageView
    lateinit var sendButton : Button
    lateinit var sendText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textViewID)
        button = findViewById(R.id.buttonID)
        diceImage = findViewById(R.id.imageViewID)
        sendButton = findViewById(R.id.sendButton)
        sendText = findViewById(R.id.sendTextID)


        button.setOnClickListener{
            changeText()
        }

        sendButton.setOnClickListener{
            sendText();
        }
    }

    private fun changeText(){
        val randomNo = (1..6).random()
        val drawableResource = when(randomNo){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }

        diceImage.setImageResource(drawableResource)

        textView.text = randomNo.toString()

        Toast.makeText(this, "Number : ${textView.text}", Toast.LENGTH_SHORT).show()
    }

    private fun sendText(){
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("send", sendText.text.toString())
        startActivity(intent)
    }
}