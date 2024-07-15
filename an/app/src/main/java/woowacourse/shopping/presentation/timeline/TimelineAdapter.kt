package woowacourse.shopping.presentation.timeline

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import woowacourse.shopping.databinding.ItemTravelBinding

class TimelineAdapter: RecyclerView.Adapter<TravelViewHolder>() {
    private var travelItems: List<TravelItemUiModel> = listOf(
        TravelItemUiModel(
            0,
            "제주도 가족 여행",
            "",
            "2024.05.06 - 09"
        ),
        TravelItemUiModel(
            1,
            "우테코 부산 여행",
            "",
            "2024.06.17 - 21"
        ),
        TravelItemUiModel(
            2,
            "서울 망원 한강 공원",
            "",
            "2024.06.15"
        ),
        TravelItemUiModel(
            0,
            "제주도 가족 여행",
            "",
            "2024.05.06 - 09"
        ),
        TravelItemUiModel(
            2,
            "서울 망원 한강 공원",
            "",
            "2024.06.15"
        ),
        TravelItemUiModel(
            0,
            "제주도 가족 여행",
            "",
            "2024.05.06 - 09"
        ),
        TravelItemUiModel(
            2,
            "서울 망원 한강 공원",
            "",
            "2024.06.15"
        ),
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TravelViewHolder {
        val binding = ItemTravelBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TravelViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TravelViewHolder, position: Int) {
        holder.bind(travelItems[position])
    }

    override fun getItemCount(): Int = travelItems.size

    fun setItems() {
        notifyDataSetChanged()
    }
}
