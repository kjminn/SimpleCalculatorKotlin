package kr.hs.emirim.kjminn.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var edit1 : EditText;
    lateinit var edit2 : EditText;
    lateinit var btnAdd : Button;
    lateinit var btnMinus : Button;
    lateinit var btnMultiply : Button;
    lateinit var btnDivide : Button;
    lateinit var num1 : String;
    lateinit var num2 : String;
    var result: Int? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}