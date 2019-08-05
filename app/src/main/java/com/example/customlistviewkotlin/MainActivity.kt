package com.example.customlistviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView = findViewById<ListView>(R.id.listView)

        var arrPokemon : ArrayList<Pokemon> = ArrayList()
        arrPokemon.add(Pokemon("rowlet", R.drawable.rowlet))
        arrPokemon.add(Pokemon("snorlax", R.drawable.snorlax))
        arrPokemon.add(Pokemon("Caterpi", R.drawable.caterpi))
        arrPokemon.add(Pokemon("Charmander", R.drawable.charmander))
        arrPokemon.add(Pokemon("Pikachu", R.drawable.pikachu))
        arrPokemon.add(Pokemon("Totodile", R.drawable.totodile))

        listView.adapter = CustomAdapter(applicationContext, arrPokemon)

    }
}
