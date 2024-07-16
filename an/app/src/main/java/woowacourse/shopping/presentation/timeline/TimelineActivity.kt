package woowacourse.shopping.presentation.timeline

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import woowacourse.shopping.R
import woowacourse.shopping.databinding.ActivityTimelineBinding
import woowacourse.shopping.presentation.BindingActivity

class TimelineActivity : BindingActivity<ActivityTimelineBinding>(), TimelineEventHandler {
    private lateinit var timelineAdapter: TimelineAdapter
    private lateinit var timelineViewModel: TimelineViewModel

    override val layoutResourceId: Int
        get() = R.layout.activity_timeline

    override fun initStartView(savedInstanceState: Bundle?) {
        binding.lifecycleOwner = this
        setUpViewModel()
        setUpAdapter()
        observeViewModel()
        loadTimeline(savedInstanceState)
    }

    private fun setUpViewModel() {
        // 수정 필요
        val viewModelFactory = TimelineViewModelFactory(TempTimelineRepository())
        timelineViewModel = ViewModelProvider(this, viewModelFactory)[TimelineViewModel::class.java]
    }

    private fun setUpAdapter() {
        timelineAdapter = TimelineAdapter(this)
        binding.rvTimeline.adapter = timelineAdapter
    }

    private fun observeViewModel() {
        timelineViewModel.travels.observe(this) {
            timelineAdapter.setItems(it)
        }
    }

    private fun loadTimeline(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            timelineViewModel.loadTimeline()
        }
    }

    override fun onTravelClicked(travelId: Long) {
        // 화면 이동 로직 필요
        // val intent = Intent(this, classname).apply {
        //     putExtra(TRAVEL_ID_KEY, travelId)
        // }
        // startActivity(intent)
    }

    companion object {
        const val TRAVEL_ID_KEY = "travelId"
    }
}
