package com.eclatsol.noteroomdatabase.newdatabase

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.eclatsol.noteroomdatabase.R

class AddDataAdapter(private val context: Context, private val iAddDataAdapter: IAddDataAdapter) :
    RecyclerView.Adapter<AddDataAdapter.AddViewHolder>() {

    val listAddData = ArrayList<AddData>()

    inner class AddViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvText = itemView.findViewById<TextView>(R.id.tvText)
        var ivDelete = itemView.findViewById<ImageView>(R.id.ivDelete)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AddViewHolder {
        val viewHolder =
            AddViewHolder(
                LayoutInflater.from(context).inflate(R.layout.item_add_data, parent, false)
            )
        viewHolder.ivDelete?.setOnClickListener {
            iAddDataAdapter.onItemClick(listAddData[viewHolder.adapterPosition])
        }
        return viewHolder
    }

    override fun getItemCount(): Int {
        return listAddData.size
    }

    override fun onBindViewHolder(holder: AddViewHolder, position: Int) {
        holder.tvText.text = listAddData[position].text
    }

    fun updateList(list: List<AddData>) {
        listAddData.clear()
        listAddData.addAll(list)
        notifyDataSetChanged()
    }
}

interface IAddDataAdapter {
    fun onItemClick(addData: AddData)
}