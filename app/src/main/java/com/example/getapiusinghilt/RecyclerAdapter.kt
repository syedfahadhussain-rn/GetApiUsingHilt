package com.example.getapiusinghilt

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val key: List<String>, val value: List<String>, val context: Context) :
    RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.key_value, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

//        holder.mainText.text= data.name
//        holder.subText.text = data.destination
//        Glide.with(context).load(data.img).into(holder.imageview)
//        Picasso.get().load(data.img).into(holder.imageview)

//        holder.imageview.load(data.img)

        holder.key.text = key[position]
        holder.value.text = value[position]
    }

    override fun getItemCount(): Int = key.size

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //        val imageview : ImageView = itemView.findViewById(R.id.image)
        val key: TextView = itemView.findViewById(R.id.key)
        val value: TextView = itemView.findViewById(R.id.value)
    }
}
