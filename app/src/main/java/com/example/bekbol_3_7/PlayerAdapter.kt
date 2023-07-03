package com.example.bekbol_3_7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.example.bekbol_3_7.databinding.ItemPlayersBinding

class PlayerAdapter(
    val list: ArrayList<Player>,val onClick: (position:Int)->Unit
) : Adapter<PlayerAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemPlayersBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    inner class ViewHolder(private val binding: ItemPlayersBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind() {
        val item = list[adapterPosition]
        binding.tvName.text = item.name
            binding.tvTeam.text = item.team
            item.image?.let { binding.imgPlayer.loadImage(it)}

            itemView.setOnClickListener { onClick (adapterPosition) }
        }

    }

}