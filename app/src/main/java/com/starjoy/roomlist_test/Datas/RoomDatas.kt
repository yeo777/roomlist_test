package com.starjoy.roomlist_test.Datas

class RoomDatas(val rValue:Int,
                val rAddress : String,
                val rStair : Int,
                val rExplain : String) {


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