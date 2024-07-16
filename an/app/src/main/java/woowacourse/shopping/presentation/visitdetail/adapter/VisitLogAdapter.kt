package woowacourse.shopping.presentation.visitdetail.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import woowacourse.shopping.databinding.ItemVisitLogLeftBinding
import woowacourse.shopping.databinding.ItemVisitLogRightBinding

class VisitLogAdapter(private val items: List<String>) :
    RecyclerView.Adapter<VisitLogViewHolder>() {
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
            is VisitLogViewHolder.LeftVisitLogViewHolder -> holder.bind("오른쪽이미지 url")
            is VisitLogViewHolder.RightVisitLogViewHolder -> holder.bind("오른쪽이미지 url")
        }
    }
}
