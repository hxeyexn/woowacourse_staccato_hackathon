package woowacourse.shopping.presentation.visitdetail.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import woowacourse.shopping.databinding.ItemVisitLogLeftBinding
import woowacourse.shopping.databinding.ItemVisitLogRightBinding
import woowacourse.shopping.presentation.visitdetail.model.Comment

class VisitLogAdapter(private val items: MutableList<Comment>) :
    RecyclerView.Adapter<VisitLogViewHolder>() {
    fun setItems(newItems: List<Comment>) {
        items.clear()
        items.addAll(newItems.toList())
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        return when (position % 2) {
            0 -> 0
            else -> 1
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): VisitLogViewHolder {
        return when (viewType) {
            0 -> {
                val inflater = LayoutInflater.from(parent.context)
                val binding = ItemVisitLogRightBinding.inflate(inflater, parent, false)
                VisitLogViewHolder.RightVisitLogViewHolder(binding)
            }

            else -> {
                val inflater = LayoutInflater.from(parent.context)
                val binding = ItemVisitLogLeftBinding.inflate(inflater, parent, false)
                VisitLogViewHolder.LeftVisitLogViewHolder(binding)
            }
        }
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(
        holder: VisitLogViewHolder,
        position: Int,
    ) {
        when (holder) {
            is VisitLogViewHolder.LeftVisitLogViewHolder -> holder.bind(items[position])
            is VisitLogViewHolder.RightVisitLogViewHolder -> holder.bind(items[position])
        }
    }
}
