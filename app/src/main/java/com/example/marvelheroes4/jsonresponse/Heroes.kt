package com.example.marvelheroes4.jsonresponse

import com.google.gson.Gson
import java.net.URL

//class Heroes() {
    fun main(args: Array<String>) {
        val response = URL("https://www.simplifiedcoding.net/demos/marvel/").readText()
        val gson = Gson()
        val data = gson.fromJson(response, Array<Response>::class.java)
        for (el in data)
            print("${el.name}\n")
        for (el in data)
            print("${el.imageurl}\n")
    }
//}