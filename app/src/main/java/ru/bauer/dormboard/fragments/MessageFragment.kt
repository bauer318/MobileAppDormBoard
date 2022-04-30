package ru.bauer.dormboard.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import ru.bauer.dormboard.R
import ru.bauer.dormboard.adapters.MessageAdapter

class MessageFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_message,container, false)
        val messaRecyclerView =view.findViewById<RecyclerView>(R.id.message_recyclerview)
        messaRecyclerView.adapter = MessageAdapter(R.layout.message_item)
        return view
    }
}