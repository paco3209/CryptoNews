package com.example.cryptonews.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cryptonews.Data
import com.example.cryptonews.R
import com.example.cryptonews.databinding.ActivityNewsBinding
import com.example.cryptonews.databinding.ItemArticlePreviewBinding

class NewsAdapter (
    private val NewsList: List<Data>
        ): RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    inner class NewsViewHolder(val binding: ItemArticlePreviewBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val binding = ItemArticlePreviewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return NewsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        with(holder){
            with(NewsList[position]){
                binding.tvTitle.text = NewsList[position].title
                Glide.with(holder.itemView.context)
                    .load(NewsList[position].imageurl)
                    .into(binding.ivArticleImage)




            }
        }
    }

    override fun getItemCount(): Int {
        return NewsList.size
    }


}