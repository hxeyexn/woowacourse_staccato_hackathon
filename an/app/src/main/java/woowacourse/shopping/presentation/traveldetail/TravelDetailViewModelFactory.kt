package woowacourse.shopping.presentation.traveldetail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class TravelDetailViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TravelDetailViewModel::class.java)) {
            return TravelDetailViewModel() as T
        }
        throw IllegalArgumentException()
    }
}
