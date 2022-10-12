package com.rteam.testtaskmolfar.model

import android.graphics.drawable.Drawable

data class InnerContentModel(
    val catId:Int,
    val contentList:List<RecyclerContent>
)
data class RecyclerContent(val titleText:String,val descriptionText:String,val image:Int)