package com.starjoy.roomlist_test.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.starjoy.roomlist_test.Datas.Room
import com.starjoy.roomlist_test.R

class RoomListAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Room>)
: ArrayAdapter<Room>(mContext,resId,mList) {

    val inf = LayoutInflater.from(mContext)


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if(tempRow ==null) {
            tempRow = inf.inflate(R.layout.room_list_item, null)
        }

        val row = tempRow!!

        val Room = mList[position]

        val rValueTxt = row.findViewById<TextView>(R.id.valueTxt)
        val rAddressTxt = row.findViewById<TextView>(R.id.addressTxt)
        val rStairTxt = row.findViewById<TextView>(R.id.stairTxt)
        val rExplainTxt = row.findViewById<TextView>(R.id.explainTxt)

        rValueTxt.text = Room.rValue.toString()
        rAddressTxt.text = Room.rAddress
        rStairTxt.text = Room.rStair.toString()
        rExplainTxt.text = Room.rExplain


        return row
    }

}