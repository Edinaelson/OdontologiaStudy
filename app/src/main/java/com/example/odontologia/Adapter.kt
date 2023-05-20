package com.example.odontologia

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class Adapter(

    //aqui onde fica as configuracoes da lista ou sumario

    private val myList: List<String>,
    val nameSelected: (String) -> Unit

) : RecyclerView.Adapter<Adapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_adapter, parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val name = myList[position]

        holder.textName.text = name

        holder.itemView.setOnClickListener{
            nameSelected(name)

            //"Logica para montar index do pdf"

            when(position){
                1 -> {
                    val intent = Intent(holder.textName.context, MainActivity::class.java)
                    holder.textName.context.startActivity(intent)
                }
            }

        }

    }

    override fun getItemCount() = myList.size

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textName: TextView = itemView.findViewById(R.id.textName)
    }

}