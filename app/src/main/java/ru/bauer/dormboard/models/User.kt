package ru.bauer.dormboard.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User (
    val firstName:String="Jacques",
    val lastName:String="Kibamba",
    val roomNumber:Int=533
):Parcelable