package com.example.worldcinematest

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.worldcinematest.databinding.ImageItemBinding

class RecyclerAdapter: RecyclerView.Adapter<RecyclerView.ItemHolder> {
    class ItemHolder(image: View): RecyclerView.ViewHolder(image) {
        val binding = ImageItemBinding.bind()
        fun bind(item: Item) {
            binding.imgItem.setImageResource()
            binding.tvtvItem.text = item.title
        }
    }

    fun onCreateViewHolder(){

    }

    fun onBindViewHolder(){

    }

    fun getItemCount(){

    }
}