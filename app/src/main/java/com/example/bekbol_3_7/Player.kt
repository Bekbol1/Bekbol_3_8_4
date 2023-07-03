package com.example.bekbol_3_7

import java.io.Serializable

data class Player(
    val name:String? = "Неизвостно",
    val team:String? = "Неизвестная команда",
    val image:String? = null
):Serializable
