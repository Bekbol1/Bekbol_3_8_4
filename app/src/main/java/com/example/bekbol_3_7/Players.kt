package com.example.bekbol_3_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.bekbol_3_7.databinding.FragmentPlayersBinding

class Players : Fragment() {

    private lateinit var binding: FragmentPlayersBinding
    private val playerList = arrayListOf(
        Player(
            "Steph Curry",
            "GSW",
            "https://www.mercurynews.com/wp-content/uploads/2022/11/BNG-L-WARRIORS-1108-56.jpg?w=1024"
        ),
        Player("Lebron James",
            "Lakers",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7a/LeBron_James_%2851959977144%29_%28cropped2%29.jpg/640px-LeBron_James_%2851959977144%29_%28cropped2%29.jpg"
        ),
        Player("Kobe Bryant",
        "Lakers",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Kobe_Bryant_2015.jpg/230px-Kobe_Bryant_2015.jpg"
        ),
        Player("Nikola Jokic",
        "Nuggets",
        "https://static01.nyt.com/images/2022/05/02/sports/00nba-mvp-jokic/merlin_204962220_fc67854e-4ccb-4109-bf53-9421d7f5929e-mediumSquareAt3X.jpg"
        ),
        Player("Jayson Tatum",
        "Boston Celtics",
        "https://gray-wagm-prod.cdn.arcpublishing.com/resizer/bObvXNidYWa-qGaSfZx2A1cXhGM=/1200x1800/smart/filters:quality(85)/cloudfront-us-east-1.images.arcpublishing.com/gray/5GWSVGB6SRPVDF6BQBS346WEBM.jpg"
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPlayersBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = PlayerAdapter(playerList,this::onClick)
        binding.rvPlayers.adapter = adapter
    }

    private fun onClick(position:Int){
        findNavController().navigate(R.id.playersInfo, bundleOf("Bekbol" to playerList[position]) )
    }
}