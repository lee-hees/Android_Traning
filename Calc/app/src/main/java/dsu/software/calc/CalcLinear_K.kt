package dsu.software.calc

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalcLinear_K : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.calc_linear)

        // xml에서 정의된 디자인 파일의 아이디 정보 기반 객체 생성
        val editText1 = findViewById<EditText>(R.id.editText)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val textView = findViewById<TextView>(R.id.textView)
        val button1 = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)

        // 버튼 이벤트 처리
        // 덧셈
        button1.setOnClickListener {
            textView.text =
                (editText1.text.toString().toInt() + editText2.text.toString().toInt()).toString()
        }
        // 뺄셈
        button2.setOnClickListener {
            textView.text =
                (editText1.text.toString().toInt() - editText2.text.toString().toInt()).toString()
        }
        // 곱셈
        button3.setOnClickListener {
            textView.text =
                (editText1.text.toString().toInt() * editText2.text.toString().toInt()).toString()
        }
        // 나눗셈
        button4.setOnClickListener {
            textView.text =
                (editText1.text.toString().toInt() / editText2.text.toString().toInt()).toString()
        }

    }
}