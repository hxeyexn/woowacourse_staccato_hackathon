package woowacourse.shopping.presentation.visitdetail.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import woowacourse.shopping.presentation.visitdetail.model.User
import woowacourse.shopping.presentation.visitdetail.model.VisitLog

class VisitDetailViewModel() : ViewModel() {
    private val _visitDefault = MutableLiveData<List<String>>()
    val visitDefault: LiveData<List<String>> get() = _visitDefault

    private val _visitLogs = MutableLiveData<List<VisitLog>>()
    val visitLogs: LiveData<List<VisitLog>> get() = _visitLogs

    fun fetchVisitDetailData() {
        _visitDefault.value = listOf("")
        _visitLogs.value =
            listOf(
                VisitLog(
                    User("s6m1n", ""),
                    "오랜만에 우테코 친구들과 여행!\n바다 색깔이 너무 예뻤다.",
                ),
                VisitLog(
                    User("haena", ""),
                    "안녕 ? 나는 해나야\n오늘은 내가 비눗방울 만드는 법을 아르켜줄게",
                ),
                VisitLog(
                    User("hodu", ""),
                    "좋은 사람, 좋은 시간.\n갓 두 ~!?",
                ),
            )
    }
}
