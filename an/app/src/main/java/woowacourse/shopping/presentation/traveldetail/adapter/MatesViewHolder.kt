package woowacourse.shopping.presentation.traveldetail.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import woowacourse.shopping.databinding.ItemMatesBinding
import woowacourse.shopping.presentation.traveldetail.model.MateUiModel

class MatesViewHolder(
    private val binding: ItemMatesBinding,
) : ViewHolder(binding.root) {
    fun bind(mate: MateUiModel) {
        binding.mate = mate
    }
}
