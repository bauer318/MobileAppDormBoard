package ru.bauer.dormboard.models

data class Statement (
    val user:User,
    val content:String="Тенисная комната не работает",
    val date:String = "10.04.22",
    val time:String="14:39"
)