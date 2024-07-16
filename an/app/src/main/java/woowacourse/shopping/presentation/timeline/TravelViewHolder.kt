package woowacourse.shopping.presentation.timeline

import androidx.recyclerview.widget.RecyclerView
import woowacourse.shopping.databinding.ItemTravelBinding

class TravelViewHolder(
    private val binding: ItemTravelBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(
        travelItemUiModel: TravelItemUiModel,
        eventHandler: TimelineEventHandler,
    ) {
        binding.travelUi = travelItemUiModel
        binding.eventHandler = eventHandler
    }
}
