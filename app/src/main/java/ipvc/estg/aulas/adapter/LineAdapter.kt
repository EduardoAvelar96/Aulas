package ipvc.estg.aulas.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ipvc.estg.aulas.R
import ipvc.estg.aulas.dataclasses.Place
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.recyclerline.view.*

class LineAdapter (val list: ArrayList<Place>):RecyclerView.Adapter<LineViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LineViewHolder {
        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.recyclerline, parent, false)
        return LineViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: LineViewHolder, position: Int) {
        val currentPlace = list[position]
        holder.name.text = currentPlace.name
        holder.capital.text = currentPlace.capital
        holder.nhabitants.text = currentPlace.habitants.toString()

    }
}

class LineViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    val name = itemView.name
    val capital = itemView.capital
    val nhabitants = itemView.habitants
}