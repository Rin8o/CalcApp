package jp.techacademy.youichi.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value1 = intent.getDoubleExtra("VALUE1", 0.0)
        val value2 = intent.getDoubleExtra("VALUE2", 0.0)
        val num = intent.getIntExtra("NUM", 0)

        if(num == 1)
            textView.text = "Answer: ${value1 + value2}"
        else if(num == 2)
            textView.text = "Answer: ${value1 - value2}"
        else if(num == 3)
            textView.text = "Answer: ${value1 * value2}"
        else
            textView.text = "Answer: ${value1 / value2}"
    }
}