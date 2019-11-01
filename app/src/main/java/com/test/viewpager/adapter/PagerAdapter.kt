package com.test.viewpager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.test.viewpager.fragment.ViewPagerFragment

class PagerAdapter : FragmentPagerAdapter{

    constructor(fm: FragmentManager, behavior: Int) : super(fm, behavior)

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> return ViewPagerFragment("First Fragment")
            1 -> return ViewPagerFragment("Second Fragment")
            2 -> return ViewPagerFragment("Third Fragment")
            3 -> return ViewPagerFragment("Fourth Fragment")
            else -> return Fragment()
        }
    }

    override fun getCount(): Int {
        return 4
    }
}