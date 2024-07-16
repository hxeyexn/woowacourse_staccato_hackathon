package woowacourse.shopping.presentation.visitdetail.adapter

import androidx.recyclerview.widget.RecyclerView
import woowacourse.shopping.databinding.ItemVisitDefaultBinding
import woowacourse.shopping.presentation.visitdetail.model.VisitDefault

class VisitDefaultHolder(private val binding: ItemVisitDefaultBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: VisitDefault) {
        binding.visitDefault = item
    }
}
