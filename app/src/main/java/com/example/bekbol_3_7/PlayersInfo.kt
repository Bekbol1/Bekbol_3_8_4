package com.example.bekbol_3_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import com.example.bekbol_3_7.databinding.FragmentPlayersInfoBinding


class PlayersInfo : Fragment() {

    private lateinit var binding: FragmentPlayersInfoBinding
    private lateinit var navArgs: PlayersInfoArgs
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPlayersInfoBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        arguments?.let { navArgs = PlayersInfoArgs.fromBundle(it)
        }
        val player = navArgs.player
        binding.tvName.text = player.name
        binding.tvAlive.text = player.team
        player.image?.let { binding.imgPerson.loadImage(it) }

    }


}