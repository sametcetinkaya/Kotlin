package com.sametcetinkaya.recyclerview

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.recycler_row.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Data preparation
        var superHeroNames = ArrayList<String>()
        superHeroNames.add("Batman")
        superHeroNames.add("Superman")
        superHeroNames.add("Ironman")
        superHeroNames.add("Aquaman")
        superHeroNames.add("Spiderman")
        /*
        val supermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val ironmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)
        val aquamanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aquaman)
        val spidermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spiderman)
        val batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)

        var superHeroImages = ArrayList<Bitmap>()
        superHeroImages.add(supermanBitmap)
        superHeroImages.add(ironmanBitmap)
        superHeroImages.add(aquamanBitmap)
        superHeroImages.add(spidermanBitmap)
        superHeroImages.add(batmanBitmap)
        -----------------------------------------------------------------------------------------------------*/

        val batmanDrawableId = R.drawable.batman
        val supermanDrawableId = R.drawable.superman
        val ironmanDrawableId = R.drawable.ironman
        val aquamanDrawableId = R.drawable.aquaman
        val spidermanDrawableId = R.drawable.spiderman

        var superHeroDrawableList = ArrayList<Int>()
        superHeroDrawableList.add(batmanDrawableId)
        superHeroDrawableList.add(supermanDrawableId)
        superHeroDrawableList.add(ironmanDrawableId)
        superHeroDrawableList.add(aquamanDrawableId)
        superHeroDrawableList.add(spidermanDrawableId)


        //Adapter

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(superHeroNames, superHeroDrawableList)
        recyclerView.adapter = adapter


    }
}