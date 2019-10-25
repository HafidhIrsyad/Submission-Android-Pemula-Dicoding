package com.example.sahambluechips

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.sahambluechips.ListStockAdapter.ListViewHolder


class ListStockAdapter(private val listStock: ArrayList<Stock>) : RecyclerView.Adapter<ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_stock, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val(name,desc,photo)=listStock[position]
        val stock = listStock[position]

        Glide.with(holder.itemView.context)
            .load(stock.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = stock.name
        holder.tvDetail.text = stock.detail

        val iContext = holder.itemView.context

        holder.itemView.setOnClickListener{
            onItemClickCallback.onItemClicked(listStock[holder.adapterPosition])
        }

        holder.itemView.setOnClickListener{
            val pindahHalaman = Intent(iContext, DetailStock::class.java)
            pindahHalaman.putExtra(DetailStock.EXTRA_PHOTO, photo)
            pindahHalaman.putExtra(DetailStock.EXTRA_NAME, name)
            pindahHalaman.putExtra(DetailStock.EXTRA_DESC, desc)
            iContext.startActivity(pindahHalaman)
        }
    }

    override fun getItemCount(): Int {
        return listStock.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
            var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
            var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

        }
    interface OnItemClickCallback {
        fun onItemClicked(data: Stock)
    }

}