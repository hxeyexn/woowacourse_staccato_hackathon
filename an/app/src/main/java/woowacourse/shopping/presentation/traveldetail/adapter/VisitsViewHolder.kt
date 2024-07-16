package woowacourse.shopping.presentation.traveldetail.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import woowacourse.shopping.databinding.ItemVisitsBinding
import woowacourse.shopping.presentation.traveldetail.model.VisitUiModel

class VisitsViewHolder(
    private val binding: ItemVisitsBinding,
): ViewHolder(binding.root) {
    fun bind(visit: VisitUiModel) {
        binding.visit = visit
    }
}