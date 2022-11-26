package com.example.home_work_kotlin_2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.home_work_kotlin_2.databinding.ItemPlaylistBinding

class MusicAdapter(var musicList: ArrayList<Music>):
    RecyclerView.Adapter<MusicAdapter.MusicViewHolder>(){

    inner class MusicViewHolder(private val binding: ItemPlaylistBinding):
        RecyclerView.ViewHolder(binding.root) {
        fun bind(){
            val item = musicList[adapterPosition]
            binding.apply {
                numMusic.text = item.num
                tvName.text = item.name
                tvAuthor.text = item.author
                tvTime.text = item.time
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        return MusicViewHolder(ItemPlaylistBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) = holder.bind()

    override fun getItemCount(): Int = musicList.size
}