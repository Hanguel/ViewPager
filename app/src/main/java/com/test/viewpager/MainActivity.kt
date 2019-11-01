package com.test.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.test.viewpager.adapter.PagerAdapter
import com.test.viewpager.transformer.RotatePagerTransformer
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 기본적인 뷰페이저의 구성에 PageTranformer를 추가
 * */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vp_viewPager.adapter = PagerAdapter(supportFragmentManager,FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
        vp_viewPager.setPageTransformer(false, RotatePagerTransformer())
        vp_viewPager.currentItem = 0

        vp_viewPager.addOnPageChangeListener(mOnPageChangeListener)
    }

    var mOnPageChangeListener = object : ViewPager.OnPageChangeListener {
        override fun onPageScrollStateChanged(state: Int) {
        }

        override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        }

        override fun onPageSelected(position: Int) {
        }
    }
}
