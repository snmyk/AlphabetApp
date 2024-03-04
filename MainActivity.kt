package com.android.myapplication
//Author: Sphiwe Nyoni
//Version: 18/09/2022
//Purpose: displays an overview of all alphabets and starts the AlphabetActivity in response to a button

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity()  {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item)



        var indexImg: Int

        //All button from A to Z including first and last pages
        val buttonA : Button= findViewById(R.id.button1)
        buttonA.setOnClickListener{
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 1
            btnAction(intent, indexImg)
        }
        val buttonB:Button = findViewById(R.id.button2)
        buttonB.setOnClickListener {
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 2
            btnAction(intent, indexImg)
        }
        val buttonC : Button= findViewById(R.id.button3)
        buttonC.setOnClickListener{
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 3
            btnAction(intent, indexImg)
        }
        val buttonD:Button = findViewById(R.id.button4)
        buttonD.setOnClickListener {
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 4
            btnAction(intent, indexImg)
        }
        val buttonE : Button= findViewById(R.id.button5)
        buttonE.setOnClickListener{
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 5
            btnAction(intent, indexImg)
        }
        val buttonF:Button = findViewById(R.id.button6)
        buttonF.setOnClickListener {
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 6
            btnAction(intent, indexImg)
        }
        val buttonG : Button= findViewById(R.id.button7)
        buttonG.setOnClickListener{
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 7
            btnAction(intent, indexImg)
        }
        val buttonH:Button = findViewById(R.id.button8)
        buttonH.setOnClickListener {
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 8
            btnAction(intent, indexImg)
        }
        val buttonI : Button= findViewById(R.id.button9)
        buttonI.setOnClickListener{
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 9
            btnAction(intent, indexImg)
        }
        val buttonJ:Button = findViewById(R.id.button10)
        buttonJ.setOnClickListener {
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 10
            btnAction(intent, indexImg)
        }
        val buttonK : Button= findViewById(R.id.button11)
        buttonK.setOnClickListener{
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 11
            btnAction(intent, indexImg)
        }
        val buttonL:Button = findViewById(R.id.button12)
        buttonL.setOnClickListener {
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 12
            btnAction(intent, indexImg)
        }
        val buttonM : Button= findViewById(R.id.button13)
        buttonM.setOnClickListener{
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 13
            btnAction(intent, indexImg)
        }
        val buttonN:Button = findViewById(R.id.button14)
        buttonN.setOnClickListener {
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 14
            btnAction(intent, indexImg)
        }
        val buttonO : Button= findViewById(R.id.button15)
        buttonO.setOnClickListener{
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 15
            btnAction(intent, indexImg)
        }
        val buttonP:Button = findViewById(R.id.button16)
        buttonP.setOnClickListener {
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 16
            btnAction(intent, indexImg)
        }
        val buttonQ : Button= findViewById(R.id.button17)
        buttonQ.setOnClickListener{
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 17
            btnAction(intent, indexImg)
        }
        val buttonR:Button = findViewById(R.id.button18)
        buttonR.setOnClickListener {
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 18
            btnAction(intent, indexImg)
        }
        val buttonS : Button= findViewById(R.id.button19)
        buttonS.setOnClickListener{
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 19
            btnAction(intent, indexImg)
        }
        val buttonT:Button = findViewById(R.id.button20)
        buttonT.setOnClickListener {
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 20
            btnAction(intent, indexImg)
        }
        val buttonU : Button= findViewById(R.id.button21)
        buttonU.setOnClickListener{
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 21
            btnAction(intent, indexImg)
        }
        val buttonV:Button = findViewById(R.id.button22)
        buttonV.setOnClickListener {
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 22
            btnAction(intent, indexImg)
        }
        val buttonW : Button= findViewById(R.id.button23)
        buttonW.setOnClickListener{
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 23
            btnAction(intent, indexImg)
        }
        val buttonX:Button = findViewById(R.id.button24)
        buttonX.setOnClickListener {
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 24
            btnAction(intent, indexImg)
        }
        val buttonY : Button= findViewById(R.id.button25)
        buttonY.setOnClickListener{
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 25
            btnAction(intent, indexImg)
        }
        val buttonZ:Button = findViewById(R.id.button26)
        buttonZ.setOnClickListener {
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 26
            btnAction(intent, indexImg)
        }
        val firstBut : Button= findViewById(R.id.first)
        firstBut.setOnClickListener{
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 1
            btnAction(intent, indexImg)
        }
        val lastBut:Button = findViewById(R.id.last)
        lastBut.setOnClickListener {
            val intent = Intent(this, AlphabetActivity::class.java)
            indexImg = 26
            btnAction(intent, indexImg)
        }

    }

    //method that starts the Alphabet activity and adds the index of the button clicked to the intent
    private fun btnAction(intent: Intent, index:Int)
    {
        intent.putExtra("index", index)
        startActivity(intent)
    }


}