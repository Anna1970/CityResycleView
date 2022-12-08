package ru.naa.cityresycleview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import ru.naa.cityresycleview.databinding.FragmentCityBinding

class CityFragment : Fragment() {

    lateinit var binding: FragmentCityBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCityBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnToFavorite.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_cityFragment_to_favoriteFragment)
        }
    }
}