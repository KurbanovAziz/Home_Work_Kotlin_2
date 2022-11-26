package com.example.home_work_kotlin_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.home_work_kotlin_2.databinding.FragmentPlaylistBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class PlaylistFragment : Fragment() {

    private lateinit var binding: FragmentPlaylistBinding
    private var list = arrayListOf<Music>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPlaylistBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = MusicAdapter(list)
        binding.rvPlaylist.adapter = adapter
    }

    private fun loadData() {
        list.add(Music("1","Не Сегодня","Ulukmanapo","2:01"))
        list.add(Music("2","Особа крутая","Hiro","3:26"))
        list.add(Music("3","Lonely","Lucaveros","3:42"))
        list.add(Music("4","SnD","Jah Khalib","4:10"))
        list.add(Music("5","Между нами","Lizer","4:20"))
        list.add(Music("6","Ne gime","Ирина Кайратовна","3:31"))
        list.add(Music("7","Brooklyn","Miyagi&Andy Panda","3:13"))
        list.add(Music("8","Не гадай","Akim","3:14"))
        list.add(Music("9","На Всех","Macan","2:19"))
        list.add(Music("10","Забытый бала","Santiz","3:42"))

    }

}