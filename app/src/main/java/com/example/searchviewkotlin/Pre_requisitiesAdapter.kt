package com.example.searchviewkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class Pre_requisitiesAdapter(private var mList: List<Pre_requisitiesData>) :
    RecyclerView.Adapter<Pre_requisitiesAdapter.LanguageViewHolder>() {

    inner class LanguageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val titleTv: TextView = itemView.findViewById(R.id.titleTv)
        val constraintLayout: ConstraintLayout = itemView.findViewById(R.id.constraintLayout)


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_prerequisitieslist, parent, false)
        return LanguageViewHolder(view)
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {

        val languageData = mList[position]
        holder.titleTv.text = languageData.title



        holder.constraintLayout.setOnClickListener {
            notifyItemChanged(position , Unit)
        }

    }





    override fun getItemCount(): Int {
        return mList.size
    }
}