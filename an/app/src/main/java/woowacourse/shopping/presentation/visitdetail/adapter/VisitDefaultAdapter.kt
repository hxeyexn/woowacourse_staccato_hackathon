package woowacourse.shopping.presentation.visitdetail.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import woowacourse.shopping.databinding.ItemVisitDefaultBinding

class VisitDefaultAdapter(private val items: MutableList<String>) :
    RecyclerView.Adapter<VisitDefaultHolder>() {
    fun setItems(newItems: List<String>) {
        items.clear()
        items.addAll(newItems.toList())
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): VisitDefaultHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemVisitDefaultBinding.inflate(inflater, parent, false)
        return VisitDefaultHolder(binding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(
        holder: VisitDefaultHolder,
        position: Int,
    ) {
        holder.bind()
    }
}
