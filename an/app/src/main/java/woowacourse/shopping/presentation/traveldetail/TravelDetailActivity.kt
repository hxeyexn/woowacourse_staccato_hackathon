package woowacourse.shopping.presentation.traveldetail

import android.os.Bundle
import woowacourse.shopping.R
import woowacourse.shopping.databinding.ActivityTravelDetailBinding
import woowacourse.shopping.presentation.BindingActivity
import woowacourse.shopping.presentation.traveldetail.adapter.MatesAdapter
import woowacourse.shopping.presentation.traveldetail.model.dummyMates

class TravelDetailActivity : BindingActivity<ActivityTravelDetailBinding>() {
    override val layoutResourceId: Int
        get() = R.layout.activity_travel_detail

    private lateinit var matesAdapter: MatesAdapter

    override fun initStartView(savedInstanceState: Bundle?) {
        initMatesAdapter()
    }

    private fun initMatesAdapter() {
        matesAdapter = MatesAdapter()
        binding.rvTravelDetailMates.adapter = matesAdapter
        matesAdapter.updateMates(dummyMates)
    }
}
