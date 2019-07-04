package com.supersociety.newsapp.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import com.supersociety.newsapp.MyPrefs
import com.supersociety.newsapp.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        checkNightMode.isChecked = MyPrefs.nightMode

        checkNightMode.setOnCheckedChangeListener{ _: CompoundButton, b: Boolean ->
            MyPrefs.nightMode = b
        }
    }


}
