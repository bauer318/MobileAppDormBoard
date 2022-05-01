package ru.bauer.dormboard.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Product (
    val name:String="Стул для офиса",
    val price:Double = 2780.00,
    val imageResourceId:Int
):Parcelable