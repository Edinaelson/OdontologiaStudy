package com.example.odontologia.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.odontologia.MainActivity2
import com.example.odontologia.MainActivity3
import com.example.odontologia.R
import com.example.odontologia.model.AlphaChar

class AlphaAdapters2(var context: Context, var arrayList: ArrayList<AlphaChar>) :
    RecyclerView.Adapter<AlphaAdapters2.ItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val itemHolder = LayoutInflater.from(parent.context).inflate(R.layout.grid_layout_list_item, parent, false)
        return ItemHolder(itemHolder)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

       //var alphaChar:AlphaChar = arrayList.get(position)
        val alphaChar: AlphaChar = arrayList[position]

        holder.icons.setImageResource(alphaChar.iconsChar!!)
        holder.alphas.text = alphaChar.alphaChar

        // clique agora é em cima da imagem para texto troque o icons por text
        holder.itemView.setOnClickListener {
            Toast.makeText(context, alphaChar.alphaChar, Toast.LENGTH_SHORT).show()

            //aqui fica as novas intents para ir para recycler view
            when (position) {
                1 -> {
                    val intent = Intent(holder.icons.context, com.example.odontologia.RecyclerView::class.java)
                    holder.icons.context.startActivity(intent)
                }
            }
        }

    }

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var icons = itemView.findViewById<ImageView>(R.id.icons_image)
        var alphas = itemView.findViewById<TextView>(R.id.alpha_text_view)
    }

}