package br.com.operations.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.operations.databinding.ItemViewPagerBinding

class ViewPagerAdapter(private val list: MutableList<String>) :
    RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val itemBinding =
            ItemViewPagerBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        return ViewHolder(itemBinding)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val text: String = list[position]
        holder.bind(text)
    }

    override fun getItemCount(): Int = list.size

    class ViewHolder(private val itemBinding: ItemViewPagerBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(text: String) {
           itemBinding.tvTextCount.text = text
        }

    }
}