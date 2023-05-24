package com.example.odontologia

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.app.ActivityCompat.finishAffinity
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

            //Logica para pegar index por nome
//            when(holder.textName.text){
//                "Kotlin" -> {
//                    val intent = Intent(holder.textName.context, MyPdfView::class.java)
//                    intent.putExtra("PDF", 5)
//                    holder.textName.context.startActivity(intent)
//                }
//                //teste do primeiro grid layout
//                "B" -> {
//                    val intent = Intent(holder.textName.context, MyPdfView::class.java)
//                    intent.putExtra("C", 0)
//                    holder.textName.context.startActivity(intent)
//                }
//            }

//            val textName = holder.textName.text
//            when {
//                textName == "Kotlin" -> {
//                    val intent = Intent(holder.textName.context, MyPdfView::class.java)
//                    intent.putExtra("PDF", 5)
//                    holder.textName.context.startActivity(intent)
//                    return@setOnClickListener
//                }
//                textName == "B" -> {
//                    val intent = Intent(holder.textName.context, MyPdfView::class.java)
//                    intent.putExtra("C", 0)
//                    holder.textName.context.startActivity(intent)
//                }
//            }

            //"Logica para montar index do pdf"
            //experimentar abrir PDF pelo nome, pq há varias lista, a posição vai ser quase as mesma.
//            when(position){
//                1 -> {
//                    val intent = Intent(holder.textName.context, MyPdfView::class.java)
//                    intent.putExtra("PDF", 5)
//                    holder.textName.context.startActivity(intent)
//                }
//                2 -> {
//                    val intent = Intent(holder.textName.context, MyPdfView::class.java)
//                    intent.putExtra("C", 0)
//                    holder.textName.context.startActivity(intent)
//                }
//            }
            val textName = holder.textName.text

            if (textName == "Kotlin") {
                val intent = Intent(holder.textName.context, MyPdfView::class.java)
                intent.putExtra("PDF", 10)
                holder.textName.context.startActivity(intent)

            }

            else if (textName == "PHP") {
                val intent = Intent(holder.textName.context, MyPdfView::class.java)
                intent.putExtra("PDF",5)
                holder.textName.context.startActivity(intent)

            }

            else if(textName == "Java") {
                val intent = Intent(holder.textName.context, MyPdfView::class.java)
                intent.putExtra("PDF", 0)
                holder.textName.context.startActivity(intent)
            }

        }
    }

    override fun getItemCount() = myList.size

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textName: TextView = itemView.findViewById(R.id.textName)
    }

}