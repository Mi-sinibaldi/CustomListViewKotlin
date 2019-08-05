package com.example.customlistviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(var Contex: Context, var pokemon: ArrayList<Pokemon>) : BaseAdapter() {

    private class viewHolder(row: View?){
        var textViewName : TextView
        var imagePokemon : ImageView

        init {
            this.textViewName = row?.findViewById(R.id.textViewName) as TextView
            this.imagePokemon = row?.findViewById(R.id.imagePokemon) as ImageView

        }
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var view: View?
        var viewHolder : viewHolder
        if(convertView == null){
            var layout = LayoutInflater.from(Contex)
            view = layout.inflate(R.layout.pokemon_item_list, parent, false)
            viewHolder = viewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as viewHolder
        }

        var pokemon : Pokemon = getItem(position) as Pokemon
        viewHolder.textViewName.text = pokemon.name
        viewHolder.imagePokemon.setImageResource(pokemon.image)

        return view as View
    }

    override fun getItem(position: Int): Any {
        return pokemon.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
       return pokemon.count()
    }
}