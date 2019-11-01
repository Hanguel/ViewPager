package com.test.viewpager.fragment

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.test.viewpager.R
import kotlinx.android.synthetic.main.fragment_frame.view.*

class ViewPagerFragment : Fragment {
    lateinit var text: String
    constructor() : super()

    constructor(text: String) {
        this.text = text
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var fragmentLayout = inflater.inflate(R.layout.fragment_frame, container, false) as ConstraintLayout

        with(fragmentLayout) {
            tv_fragment_textView.text = text
        }

        return fragmentLayout
    }

}