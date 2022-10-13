package com.rteam.testtaskmolfar.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter(value = ["setImgDrawable"])
fun ImageView.bindImageResource(resource: Int?) {
    if (resource != null) {
        this.setImageResource(resource)
        //Glide.with(this.context).load(resource).into(this)
    }
}