package com.ecom.app.modules.product.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ecom.app.R
import com.ecom.app.databinding.RowProductBinding
import com.ecom.app.modules.product.`data`.model.ProductRowModel
import kotlin.Int
import kotlin.collections.List

class ProductAdapter(
  var list: List<ProductRowModel>
) : RecyclerView.Adapter<ProductAdapter.RowProductVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProductVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_product,parent,false)
    return RowProductVH(view)
  }

  override fun onBindViewHolder(holder: RowProductVH, position: Int) {
    val productRowModel = ProductRowModel()
    // TODO uncomment following line after integration with data source
    // val productRowModel = list[position]
    holder.binding.productRowModel = productRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ProductRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ProductRowModel
    ) {
    }
  }

  inner class RowProductVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowProductBinding = RowProductBinding.bind(itemView)
  }
}
