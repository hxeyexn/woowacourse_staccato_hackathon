package woowacourse.shopping.presentation.traveldetail

import android.os.Bundle
import androidx.activity.viewModels
import woowacourse.shopping.R
import woowacourse.shopping.databinding.ActivityTravelDetailBinding
import woowacourse.shopping.presentation.BindingActivity
import woowacourse.shopping.presentation.traveldetail.adapter.MatesAdapter
import woowacourse.shopping.presentation.traveldetail.adapter.VisitsAdapter
import woowacourse.shopping.presentation.traveldetail.model.dummyMates
import woowacourse.shopping.presentation.traveldetail.model.dummyVisits

class TravelDetailActivity : BindingActivity<ActivityTravelDetailBinding>() {
    override val layoutResourceId: Int
        get() = R.layout.activity_travel_detail

    private lateinit var matesAdapter: MatesAdapter
    private lateinit var visitsAdapter: VisitsAdapter

    private val travelDetailViewModel: TravelDetailViewModel by viewModels {
        TravelDetailViewModelFactory()
    }

    override fun initStartView(savedInstanceState: Bundle?) {
        initBinding()
        initMatesAdapter()
        initVisitsAdapter()
        travelDetailViewModel.loadTravelDetail()
    }

    private fun initBinding() {
        binding.lifecycleOwner = this
        binding.viewModel = travelDetailViewModel
    }

    private fun initMatesAdapter() {
        matesAdapter = MatesAdapter()
        binding.rvTravelDetailMates.adapter = matesAdapter
        matesAdapter.updateMates(dummyMates)
    }

    private fun initVisitsAdapter() {
        visitsAdapter = VisitsAdapter()
        binding.rvTravelDetailVisits.adapter = visitsAdapter
        visitsAdapter.updateVisits(dummyVisits)
    }
}
