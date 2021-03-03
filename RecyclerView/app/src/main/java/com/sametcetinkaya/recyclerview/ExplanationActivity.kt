package com.sametcetinkaya.recyclerview

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_explanation.*

class ExplanationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explanation)

        val intent = intent
        val chosenHeroName= intent.getStringExtra("superHeroName")
        textView.text = chosenHeroName

        val choosenHeroImage = intent.getIntExtra("superHeroImage",0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources, choosenHeroImage)
        imageView.setImageBitmap(bitmap)
        /*
        val choosenHero = SingletonClass.ChoosenHero
        val choosenImage = choosenHero.image
        imageView.setImageBitmap(choosenImage)
         */
    }
}