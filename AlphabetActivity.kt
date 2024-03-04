package com.android.myapplication
//Author: Sphiwe Nyoni
//Version: 18/09/2022
//Purpose: displays an image in response to a button clicked



import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class AlphabetActivity: AppCompatActivity()
{
    private var  images : ArrayList<Int> = ArrayList()  //array to add all the images
    private lateinit var displayImg: ImageView          //variable used to display images


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.image_layout)

        val btns = arrayOf("overview")                         //for activity bar
        val spinner: Spinner = findViewById(R.id.dropdown_menu)   //spinner used for dropdown
        if (spinner!=null)
        {
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, btns)
            spinner.adapter = adapter
            val intent = Intent(this, MainActivity::class.java)
            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(parent: AdapterView<*>?,view: View?, position: Int, id: Long) {
                    val overview1:Button = findViewById(R.id.overview)
                    overview1.setOnClickListener {
                        startActivity(intent)
                    }
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    //code
                }

            }
        }


        images.add(R.drawable.slide01)
        images.add(R.drawable.slide02)
        images.add(R.drawable.slide03)
        images.add(R.drawable.slide04)
        images.add(R.drawable.slide05)
        images.add(R.drawable.slide06)
        images.add(R.drawable.slide07)
        images.add(R.drawable.slide08)
        images.add(R.drawable.slide09)
        images.add(R.drawable.slide10)
        images.add(R.drawable.slide11)
        images.add(R.drawable.slide12)
        images.add(R.drawable.slide13)
        images.add(R.drawable.slide14)
        images.add(R.drawable.slide15)
        images.add(R.drawable.slide16)
        images.add(R.drawable.slide17)
        images.add(R.drawable.slide18)
        images.add(R.drawable.slide19)
        images.add(R.drawable.slide20)
        images.add(R.drawable.slide21)
        images.add(R.drawable.slide22)
        images.add(R.drawable.slide23)
        images.add(R.drawable.slide24)
        images.add(R.drawable.slide25)
        images.add(R.drawable.slide26)



        var count  = intent.extras?.get("index") as Int    //gets the index of the image to be viewed in response to a button clicked
        count-=1

        displayImg= findViewById(R.id.images)
        imageFactory(images[count])                       //method that return and prints out the images (image factory)



        val first : Button = findViewById(R.id.first_page)                  //takes you to the first page
        first.setOnClickListener {
            count=0
            imageFactory(images[count])
        }

        val next : Button = findViewById(R.id.next)                         //takes you to the next page
        next.setOnClickListener {
            count+=1
            imageFactory(images[count])
        }

        val previous : Button = findViewById(R.id.previous)                 //takes you to the previous image
        previous.setOnClickListener {
            count-=1
            imageFactory(images[count])
        }

        val last : Button = findViewById(R.id.last_page)                    //takes you to the last image
        last.setOnClickListener {
            count=25
            imageFactory(images[count])
        }

        val overview:Button = findViewById(R.id.overview)                     //overview button to take you back to overview
        overview.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val back: Button = findViewById(R.id.back)                            //back button that takes you back to overview
        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
    private fun imageFactory(img:Int):Unit        //methods to display the image
    {
        return displayImg.setImageResource(img)
    }




}
