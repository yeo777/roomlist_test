package com.starjoy.roomlist_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        val goMainHandler = Handler(Looper.getMainLooper())

        goMainHandler.postDelayed( {

                                   // 2.5초 뒤에 실행할 내용
                                   // 메인화면으로 이동하는 작업
                                   // splash 액티비티를 종료
            val goMainIntent = Intent(this, MainActivity::class.java)
            startActivity(goMainIntent)
            finish()


        }, 2500 )

    }
}