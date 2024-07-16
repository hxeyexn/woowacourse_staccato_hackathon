package woowacourse.shopping.presentation.traveldetail.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import woowacourse.shopping.databinding.ItemVisitsBinding
import woowacourse.shopping.presentation.traveldetail.model.VisitUiModel

class VisitsAdapter : ListAdapter<VisitUiModel, VisitsViewHolder>(diffUtil) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): VisitsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemVisitsBinding.inflate(inflater, parent, false)
        return VisitsViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: VisitsViewHolder,
        position: Int,
    ) {
        holder.bind(getItem(position))
    }

    fun updateVisits(visits: List<VisitUiModel>) {
        submitList(visits)
    }

    companion object {
        val diffUtil =
            object : DiffUtil.ItemCallback<VisitUiModel>() {
                override fun areItemsTheSame(
                    oldItem: VisitUiModel,
                    newItem: VisitUiModel,
                ): Boolean = oldItem.id == newItem.id

                override fun areContentsTheSame(
                    oldItem: VisitUiModel,
                    newItem: VisitUiModel,
                ): Boolean = oldItem == newItem
            }
    }
}
