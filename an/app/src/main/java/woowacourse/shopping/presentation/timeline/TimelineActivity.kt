package woowacourse.shopping.presentation.timeline

import android.os.Bundle
import woowacourse.shopping.R
import woowacourse.shopping.databinding.ActivityTimelineBinding
import woowacourse.shopping.presentation.BindingActivity

class TimelineActivity : BindingActivity<ActivityTimelineBinding>() {
    private lateinit var timelineAdapter: TimelineAdapter

    override val layoutResourceId: Int
        get() = R.layout.activity_timeline

    override fun initStartView(savedInstanceState: Bundle?) {
        binding.lifecycleOwner = this
        setUpAdapter()
    }

    private fun setUpAdapter() {
        timelineAdapter = TimelineAdapter()
        binding.rvTimeline.adapter = timelineAdapter
//        timelineAdapter.setItems()
    }
}
