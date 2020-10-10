package jp.techacademy.youichi.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.text.TextUtils
import android.util.Log

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, SecondActivity::class.java)

        if (!TextUtils.isEmpty(editText1.text) && !TextUtils.isEmpty(editText2.text)){
            // 入力値が、どちらもnullでない場合のみ処理を実行
            val val1 = editText1.text.toString().toDouble()
            val val2 = editText2.text.toString().toDouble()
            val num: Int // 押されたボタンの情報を格納する

            intent.putExtra("VALUE1", val1)
            intent.putExtra("VALUE2", val2)

            if(v?.id == R.id.button1)
                num = 1
            else if (v?.id == R.id.button2)
                num = 2
            else if (v?.id == R.id.button3)
                num = 3
            else
                num = 4

            intent.putExtra("NUM", num)

            startActivity(intent)
        }
        else {
            // どちらかがnullの場合の処理。画面が遷移しない
            Log.d("MainActivity","Log-null")
        }
    }
}
