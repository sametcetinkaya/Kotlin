package com.sametcetinkaya.recyclerview

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*

class RecyclerAdapter(val heroList : ArrayList<String>, val heroImages : ArrayList<Int>) : RecyclerView.Adapter<RecyclerAdapter.SuperHeroVH>(){

    class SuperHeroVH(itemView : View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroVH {
        //Inflater, LayoutInflater, MenuInflater
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return SuperHeroVH(itemView)
    }

    override fun onBindViewHolder(holder: SuperHeroVH, position: Int) {
        holder.itemView.recyclerViewTextView.text = heroList.get(position)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, ExplanationActivity::class.java)
            intent.putExtra("superHeroName", heroList.get(position))
            intent.putExtra("superHeroImage",heroImages.get(position))

            /*val singleton = SingletonClass.ChoosenHero
            singleton.image = heroImages.get(position)*/

            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return heroList.size
    }

}