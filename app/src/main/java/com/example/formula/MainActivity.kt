package com.example.formula

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val formulaRecyclerView = findViewById<RecyclerView>(R.id.formulaRecyclerView)
        formulaRecyclerView.layoutManager = LinearLayoutManager(this)

        val formulaList = listOf(
            Formula("Quadratic Equation", "ax² + bx + c = 0"),
            Formula("Pythagoras Theorem", "a² + b² = c²"),
            Formula("Area of Circle", "A = πr²"),
            Formula("Derivative of x²", "d/dx(x²) = 2x")
        )

        formulaRecyclerView.adapter = FormulaAdapter(formulaList) { formula ->
            val intent = Intent(this, FormulaDetailActivity::class.java)
            intent.putExtra("FORMULA_TITLE", formula.title)
            intent.putExtra("FORMULA_DESC", formula.description)
            startActivity(intent)
        }
    }
}
