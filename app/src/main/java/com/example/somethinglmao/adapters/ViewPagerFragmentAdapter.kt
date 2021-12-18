package com.example.somethinglmao.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.somethinglmao.fragments.FirstFragment
import com.example.somethinglmao.fragments.SecondFragment
import com.example.somethinglmao.fragments.ThirdFragment

class ViewPagerFragmentAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {

        return when(position) {

            0 -> FirstFragment()
            1 -> SecondFragment()
            2 -> ThirdFragment()
            else -> FirstFragment()

        }


    }
}