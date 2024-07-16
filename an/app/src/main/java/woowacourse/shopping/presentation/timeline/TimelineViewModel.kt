package woowacourse.shopping.presentation.timeline

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TimelineViewModel(private val repository: TempTimelineRepository) : ViewModel() {
    private val _travels: MutableLiveData<List<TravelItemUiModel>> = MutableLiveData()
    val travels: LiveData<List<TravelItemUiModel>>
        get() = _travels

    fun loadTimeline() {
        _travels.value = repository.loadTimeline()
//        viewModelScope.launch {
//
//        }
    }
}
