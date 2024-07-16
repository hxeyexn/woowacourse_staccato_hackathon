package woowacourse.shopping.presentation.timeline

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import woowacourse.shopping.databinding.ItemTravelBinding

class TimelineAdapter(private val eventHandler: TimelineEventHandler): RecyclerView.Adapter<TravelViewHolder>() {
    private var travelItems: List<TravelItemUiModel> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TravelViewHolder {
        val binding = ItemTravelBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TravelViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TravelViewHolder, position: Int) {
        holder.bind(travelItems[position])
    }

    override fun getItemCount(): Int = travelItems.size

    fun setItems(loadedItems: List<TravelItemUiModel>) {
        val loadedItemsSize = loadedItems.size
        travelItems = loadedItems
        notifyItemRangeInserted(0, loadedItemsSize)
//        notifyDataSetChanged()
    }
}
