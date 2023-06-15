package com.starjoy.roomlist_test.Datas

import java.text.NumberFormat
import java.util.Locale

class RoomDatas(val rValue:Int,
                val rAddress : String,
                val rStair : Int,
                val rExplain : String) {



    fun getFormattedValue() : String {

        if (this.rValue >= 10000) {

            val upValue = this.rValue / 10000  // 정수와 정수의 나눗셈은 소숫점을 다 버리고 몫만 남긴다.
            val downValue = this.rValue % 10000 // %는 나머지를 구하는 기호

            return "${upValue}억 ${android.icu.text.NumberFormat.getNumberInstance(Locale.KOREA).format(downValue)}"
        }

        else {

            return "${android.icu.text.NumberFormat.getNumberInstance(Locale.KOREA).format(this.rValue)}"

        }


    }


    fun getFormattedStair() : String{

        if (this.rStair >=1) {
            return "${this.rStair}층"

        }

        else if (this.rStair == 0) {
            return "반지하"
        }

        else {
            return "지하 ${-this.rStair}층"

        }
    }





}