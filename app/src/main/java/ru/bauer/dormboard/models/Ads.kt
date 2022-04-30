package ru.bauer.dormboard.models

data class Ads (
    val user:User,
    val product:Product,
    val date:String="10.04.2022"
)