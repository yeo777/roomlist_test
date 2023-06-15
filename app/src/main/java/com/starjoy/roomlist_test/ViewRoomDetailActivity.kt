package com.starjoy.roomlist_test

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.starjoy.roomlist_test.Datas.RoomDatas
import com.starjoy.roomlist_test.databinding.ActivityViewRoomDetailBinding
import kotlinx.coroutines.currentCoroutineContext
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Date
import java.util.Locale

class ViewRoomDetailActivity : AppCompatActivity() {
    private var mBinding: ActivityViewRoomDetailBinding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityViewRoomDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val roomData = intent.getSerializableExtra("roomDetail") as RoomDatas

        val longNow = System.currentTimeMillis()
        val tDate = Date(longNow)
        val tDateFormat = SimpleDateFormat("yyyy년 MM월 dd일", Locale.KOREA)
        val stringDate = tDateFormat.format(tDate)

        binding.valueTxt.text = roomData.getFormattedValue()
        binding.addressTxt.text = roomData.rAddress
        binding.explainTxt.text = roomData.rExplain
        binding.stairTxt.text = roomData.getFormattedStair()
        binding.DateTxt.text = stringDate


    }

}