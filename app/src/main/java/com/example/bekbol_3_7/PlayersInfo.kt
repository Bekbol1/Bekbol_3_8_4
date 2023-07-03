package com.example.bekbol_3_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import com.example.bekbol_3_7.databinding.FragmentPlayersInfoBinding


class PlayersInfo : Fragment() {

    private lateinit var binding: FragmentPlayersInfoBinding
    private lateinit var dataFromMainFragment:Player

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPlayersInfoBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataFromMainFragment = arguments?.getSerializable("Bekbol") as Player
        binding.apply {
            tvName.text = dataFromMainFragment.name
            tvAlive.text = dataFromMainFragment.name
            dataFromMainFragment.image?.let { imgPerson.loadImage(it) }
        }
    }
}