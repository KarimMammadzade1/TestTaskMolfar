package com.rteam.testtaskmolfar.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.rteam.testtaskmolfar.databinding.RecyclerContentListItemBinding
import com.rteam.testtaskmolfar.model.RecyclerContent

class ContentRecyclerViewAdapter(val contentList:List<RecyclerContent>):RecyclerView.Adapter<ContentRecyclerViewAdapter.ContentViewHolder>() {
     inner class ContentViewHolder(val binding: RecyclerContentListItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RecyclerContentListItemBinding.inflate(layoutInflater, parent, false)


        return ContentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContentViewHolder, position: Int) {
        val model = contentList[position]
        holder.binding.model = model
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, model.titleText, Toast.LENGTH_SHORT).show()
        }
        holder.binding.executePendingBindings()
    }

    override fun getItemCount() = contentList.size
}