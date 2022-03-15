package com.example.marvelheroes4.jsonresponse

import com.google.gson.annotations.SerializedName

//class Response : ArrayList<ResponseItem>()

data class Response(
    @field:SerializedName("bio")
    val bio: String? = null,

    @field:SerializedName("createdby")
    val createdby: String? = null,

    @field:SerializedName("firstappearance")
    val firstappearance: String? = null,

    @field:SerializedName("imageurl")
    val imageurl: String? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("publisher")
    val publisher: String? = null,

    @field:SerializedName("realname")
    val realname: String? = null,

    @field:SerializedName("team")
    val team: String? = null
)