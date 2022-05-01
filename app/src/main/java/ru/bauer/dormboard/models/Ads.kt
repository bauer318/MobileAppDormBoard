package ru.bauer.dormboard.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Ads (
    val user:User,
    val product:Product,
    val date:String="10.04.2022"
):Parcelable