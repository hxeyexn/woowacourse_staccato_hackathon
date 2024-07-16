package woowacourse.shopping.presentation.visitdetail.adapter

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import woowacourse.shopping.databinding.ItemVisitLogLeftBinding
import woowacourse.shopping.databinding.ItemVisitLogRightBinding
import woowacourse.shopping.presentation.visitdetail.model.Comment

sealed class VisitLogViewHolder(binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {
    class LeftVisitLogViewHolder(
        private val binding: ItemVisitLogLeftBinding,
    ) : VisitLogViewHolder(binding) {
        fun bind(item: Comment) {
            binding.visitLog = item
        }
    }

    class RightVisitLogViewHolder(
        private val binding: ItemVisitLogRightBinding,
    ) : VisitLogViewHolder(binding) {
        fun bind(item: Comment) {
            binding.visitLog = item
        }
    }
}
