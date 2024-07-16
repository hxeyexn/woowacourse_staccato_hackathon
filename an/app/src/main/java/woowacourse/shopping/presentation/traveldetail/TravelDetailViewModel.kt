package woowacourse.shopping.presentation.traveldetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import woowacourse.shopping.presentation.traveldetail.model.TravelUiModel

class TravelDetailViewModel : ViewModel() {
    private val _travelDetail = MutableLiveData<TravelUiModel>()
    val travelDetail: LiveData<TravelUiModel> get() = _travelDetail

    fun loadTravelDetail() {
        _travelDetail.value =
            TravelUiModel(
                id = 1L,
                title = "제주도 여행",
                thumbnail = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSA8EwTvV8MvmnT5SHmZVbqaPVflGBSRsj-uA&s",
                startAt = "2024년 6월 15일",
                endAt = "2024년 6월 18일",
                description = "우테코 친구들과 제주도 여행!",
            )
    }
}
