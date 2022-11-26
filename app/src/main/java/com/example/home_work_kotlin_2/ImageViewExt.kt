package com.example.home_work_kotlin_2

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadImage(url : String){
    Glide.with(this).load(url).into(this)
}