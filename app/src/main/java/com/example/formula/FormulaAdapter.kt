package com.example.formula

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FormulaAdapter(
    private val formulaList: List<Formula>,
    private val clickListener: (Formula) -> Unit
) : RecyclerView.Adapter<FormulaAdapter.FormulaViewHolder>() {

    inner class FormulaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.formulaTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FormulaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.formula_item, parent, false)
        return FormulaViewHolder(view)
    }

    override fun onBindViewHolder(holder: FormulaViewHolder, position: Int) {
        val formula = formulaList[position]
        holder.title.text = formula.title
        holder.itemView.setOnClickListener { clickListener(formula) }
    }

    override fun getItemCount() = formulaList.size
}
