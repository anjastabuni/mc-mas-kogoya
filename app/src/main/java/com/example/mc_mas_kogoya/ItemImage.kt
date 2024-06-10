package com.example.mc_mas_kogoya

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class ItemImage(
val imageSrc:Int,
val imageTitle: String,
val imageDesc: String
): Parcelable

