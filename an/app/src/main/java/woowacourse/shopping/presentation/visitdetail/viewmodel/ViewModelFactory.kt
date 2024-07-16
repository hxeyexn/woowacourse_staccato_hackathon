package woowacourse.shopping.presentation.visitdetail.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory() : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(VisitDetailViewModel::class.java) -> {
                VisitDetailViewModel() as T
            }

            else -> {
                throw IllegalArgumentException()
            }
        }
    }
}
