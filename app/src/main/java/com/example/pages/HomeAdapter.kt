package com.example.pages

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.loginpage.R

class HomeAdapter(private val item_homes: List<DataHome>) : RecyclerView.Adapter<HomeAdapter.ItemHomeViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHomeViewHolder {
        // inflate the item Layout
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_home_adapter, parent, false)
        // set the view's size, margins, paddings and layout parameters

        return ItemHomeViewHolder(v)
    }

    inner class ItemHomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var lParentContent : ViewGroup
        private var cvParent: CardView
        internal var tvTitle: TextView
        internal var tvDesc1: TextView
        internal var tvDesc2: TextView
        internal var ivImage: ImageView

        init {
            tvTitle = itemView.findViewById(R.id.tvTitle)
            tvDesc1 = itemView.findViewById(R.id.tvDesc1)
            tvDesc2 = itemView.findViewById(R.id.tvDesc2)
            ivImage = itemView.findViewById(R.id.ivImage)
            cvParent = itemView.findViewById(R.id.cvParent)
            lParentContent = itemView.findViewById(R.id.lParentContent)

        }
    }

    override fun onBindViewHolder(holder: ItemHomeViewHolder, position: Int) {
        val item = item_homes[position]

        holder.tvTitle.text = item.title
        holder.tvDesc1.text = item.description1
        holder.tvDesc2.text = item.description2

        holder.ivImage.setImageResource(item.image)
    }

    override fun getItemCount(): Int {
        return item_homes.size
    }
}