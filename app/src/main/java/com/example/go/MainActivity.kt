package com.example.go

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    private var math_operation: TextView = findViewById(R.id.math_operation)
    private var result_text: TextView = findViewById(R.id.result_text)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_0)
            .setOnClickListener {setTextFields("0")}

        findViewById<Button>(R.id.btn_1)
            .setOnClickListener {setTextFields("1")}

        findViewById<Button>(R.id.btn_3)
            .setOnClickListener {setTextFields("3")}

        findViewById<Button>(R.id.btn_4)
            .setOnClickListener {setTextFields("4")}

        findViewById<Button>(R.id.btn_5)
            .setOnClickListener {setTextFields("5")}

        findViewById<Button>(R.id.btn_6)
            .setOnClickListener {setTextFields("6")}

        findViewById<Button>(R.id.btn_7)
            .setOnClickListener {setTextFields("7")}

        findViewById<Button>(R.id.btn_8)
            .setOnClickListener {setTextFields("8")}

        findViewById<Button>(R.id.btn_9)
            .setOnClickListener {setTextFields("9")}

        findViewById<Button>(R.id.btn_thk)
            .setOnClickListener {setTextFields(".")}

        findViewById<Button>(R.id.btn_delit)
            .setOnClickListener {setTextFields("/")}

        findViewById<Button>(R.id.btn_ymnog)
            .setOnClickListener {setTextFields("*")}

        findViewById<Button>(R.id.btn_minus)
            .setOnClickListener {setTextFields("-")}

        findViewById<Button>(R.id.btn_plus)
            .setOnClickListener {setTextFields("+")}

        findViewById<Button>(R.id.btn_scob1)
            .setOnClickListener {setTextFields("(")}

        findViewById<Button>(R.id.btn_scob2)
            .setOnClickListener {setTextFields(")")}

        findViewById<Button>(R.id.btn_0)
            .setOnClickListener {setTextFields("0")}

        findViewById<Button>(R.id.btn_0)
            .setOnClickListener {setTextFields("0")}

        findViewById<Button>(R.id.btn_AC)
            .setOnClickListener{math_operation.text = ""}

        findViewById<Button>(R.id.btn_AC)
            .setOnClickListener{result_text.text = ""}

        findViewById<Button>(R.id.btn_back)
            .setOnClickListener{
                val str = math_operation.text.toString()
            if (str.isNotEmpty()){
                math_operation.text = str.substring(0, str.length - 1)
            result_text.text = ""}
            }
    }

    private fun setTextFields(str: String){
        math_operation.append(str)
        result_text.append(str)
    }

}