package com.example.firstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sub_btn = findViewById<Button>(R.id.nextButton)    //画面のボタン
        val navView: NavigationView = findViewById(R.id.navView)
        //9月5日　profragmentの設定場所を調べるところから
        val navController = this.findNavController(R.id.proFragment)
//        val navController = this.findNavController(R.id.navHostFragment)
        NavigationUI.setupWithNavController(navView, navController)

        sub_btn.setOnClickListener {
            //Intentオブジェクト生成、遷移画面定義
            val nextIntent = Intent(this, SubActivity::class.java)
//            Intentオブジェクトにテキストの内容をプットする
//            nextIntent.putExtra("main_tv", main_tv.text.toString())
//            次のActivity実行
            startActivity(nextIntent)
        }

        val btn = findViewById<Button>(R.id.btn_web)    //画面のボタン
        btn.setOnClickListener {
            //Intentオブジェクト生成、遷移画面定義
            val nextIntent = Intent(this, WebviewActivity::class.java)
            //次のActivity実行
            startActivity(nextIntent)
        }
    }
}
