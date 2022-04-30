package ru.bauer.dormboard.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.bauer.dormboard.R
import ru.bauer.dormboard.models.Statement

class StatementAdapter(
    private val layoutId:Int,
    private val statementList:List<Statement>):RecyclerView.Adapter<StatementAdapter.ViewHolder>() {

    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val statementContent:TextView = view.findViewById(R.id.text_statement_content)
        val statementDateTime:TextView = view.findViewById(R.id.text_statement_date_time)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(layoutId,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentStatement = statementList[position]
        with(holder){
            statementContent.text = currentStatement.content
            statementDateTime.text = currentStatement.date+" "+currentStatement.time
        }
    }

    override fun getItemCount(): Int {
        return statementList.size
    }
}