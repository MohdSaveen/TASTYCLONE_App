package com.example.tastycloneapp.view.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tastycloneapp.model.remote.api.response.InstructionX
import com.example.tastycloneapp.R
import kotlinx.android.synthetic.main.preparation_item_view.view.*

class PreparationAdapter(val prepList:ArrayList<InstructionX>): RecyclerView.Adapter<PreparationAdapter.PreparationHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PreparationHolder {
        return PreparationHolder(LayoutInflater.from(parent.context).inflate(R.layout.preparation_item_view,parent,false))

    }

    override fun onBindViewHolder(holder: PreparationHolder, position: Int) {
        holder.setData(prepList[position])
    }


    override fun getItemCount(): Int {
        return prepList.size
    }

    class PreparationHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun setData(instruction: InstructionX) {
            itemView.apply {
                tvStepId.text = instruction.position.toString()
                tvStep.text = instruction.display_text
            }
        }
    }
}