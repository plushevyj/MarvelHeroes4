package com.example.marvelheroes4

import android.media.Image
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.example.marvelheroes4.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

//import com.example.marvelheroes4.jsonresponse.Heroes

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = HeroAdapter()
//    private val imageIdList = listOf(
//        R.drawable.captainamerica,
//        R.drawable.ironman,
//        R.drawable.logan,
//        R.drawable.spiderman,
//        R.drawable.thor
//    )

    private val names = listOf("Captain America", "Iron Man", "Wolvarine", "Spiderman", "Thor")

    val heroesUrlImages = listOf("https://www.simplifiedcoding.net/demos/marvel/captainamerica.jpg", "https://www.simplifiedcoding.net/demos/marvel/ironman.jpg", "https://www.simplifiedcoding.net/demos/marvel/logan.jpg", "https://www.simplifiedcoding.net/demos/marvel/spiderman.jpg", "https://www.simplifiedcoding.net/demos/marvel/thor.jpg")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        binding.apply {
            heroesView.layoutManager = GridLayoutManager(this@MainActivity, 1)
            heroesView.adapter = adapter
            Log.d("kek", heroesUrlImages.size.toString())
            for (i in 0 until heroesUrlImages.size) {
                val image = Picasso.get().load(heroesUrlImages[i])
                adapter.addHero(Hero(image, names[i]))
            }
        }
    }
}