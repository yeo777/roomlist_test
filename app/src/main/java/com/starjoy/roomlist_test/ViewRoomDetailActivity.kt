package com.starjoy.roomlist_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.starjoy.roomlist_test.databinding.ActivityViewRoomDetailBinding

class ViewRoomDetailActivity : AppCompatActivity() {
    private var mBinding: ActivityViewRoomDetailBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityViewRoomDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}