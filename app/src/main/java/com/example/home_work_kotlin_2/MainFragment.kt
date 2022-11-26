package com.example.home_work_kotlin_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.home_work_kotlin_2.databinding.FragmentMainBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private var list = arrayListOf<Main>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = MainAdapter(list, this::onClick)
        binding.rvMain.adapter = adapter
    }

    private fun onClick(position: Int) {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main, PlaylistFragment()).addToBackStack(null)
            .commit()
    }

    private fun loadData() {
        list.add(
            Main(
                "Now playing",
                "Не сегодня",
                "Ulukmanapo",
                "https://static.wixstatic.com/media/d7e3bd0b8acc406393d8752fedd77c2b.jpg/v1/fill/w_920,h_1139,al_c,q_85,usm_0.66_1.00_0.01,enc_auto/d7e3bd0b8acc406393d8752fedd77c2b.jpg"
            )
        )
    }

}