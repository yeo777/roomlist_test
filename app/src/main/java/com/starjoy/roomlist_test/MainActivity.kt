package com.starjoy.roomlist_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.starjoy.roomlist_test.Adapter.RoomListAdapter
import com.starjoy.roomlist_test.Datas.RoomDatas
import com.starjoy.roomlist_test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomDatas>()


    lateinit var mAdapter : RoomListAdapter

    private var mBinding : ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mRoomList.add(RoomDatas(80000000,"마포구 서교동",1,"\uD83D\uDE0A 망원/홍대역 풀옵션 넓은 원룸"))
        mRoomList.add(RoomDatas(285000000,"마포구 서교동",3,"신혼부부의 보금자리 서교동 신축"))
        mRoomList.add(RoomDatas(120000000,"마포구 서교동",-3,"★홍대입구역 인근 원룸 전세★"))
        mRoomList.add(RoomDatas(120000000,"마포구 성산동",0,"♥♥강추!! 보세요!! 넓고 반듯한 원룸"))
        mRoomList.add(RoomDatas(150000000,"마포구 망원동",2,"초역세권★ 베란다 공간 있는 원룸"))
        mRoomList.add(RoomDatas(175000000,"마포구 연남동",-1,"※풀옵션 원룸 전세※"))

        mAdapter = RoomListAdapter(this,R.layout.room_list_item, mRoomList)
        binding.roomListView.adapter = mAdapter

    }
}