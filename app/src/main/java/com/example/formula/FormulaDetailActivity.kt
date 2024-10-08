package com.example.formula

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FormulaDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formula_detail)

        val title = intent.getStringExtra("FORMULA_TITLE")
        val description = intent.getStringExtra("FORMULA_DESC")

        findViewById<TextView>(R.id.formulaTitle).text = title
        findViewById<TextView>(R.id.formulaDescription).text = description
    }
}
