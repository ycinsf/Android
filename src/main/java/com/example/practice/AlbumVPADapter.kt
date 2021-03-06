package com.example.practice

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class AlbumVPADapter(fragment:Fragment):FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int=3

    override fun createFragment(position: Int): Fragment {
        return  when(position){
            0->SongFragment()
            1->DetailFragment()
            else ->VideoFragment()
        }
    }

}