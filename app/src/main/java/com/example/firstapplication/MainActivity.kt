package com.example.firstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sub_btn = findViewById<Button>(R.id.nextButton)    //画面のボタン

        sub_btn.setOnClickListener {



            //Intentオブジェクト生成、遷移画面定義
            val nextIntent = Intent(this, SubActivity::class.java)
            //Intentオブジェクトにテキストの内容をプットする
//            nextIntent.putExtra("main_tv", main_tv.text.toString())
            //次のActivity実行
            startActivity(nextIntent)

        }
    }
}
