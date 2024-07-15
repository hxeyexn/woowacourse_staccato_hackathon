package woowacourse.shopping.presentation.traveldetail

import android.os.Bundle
import woowacourse.shopping.R
import woowacourse.shopping.databinding.ActivityTravelDetailBinding
import woowacourse.shopping.presentation.BindingActivity

class TravelDetailActivity : BindingActivity<ActivityTravelDetailBinding>() {
    override val layoutResourceId: Int
        get() = R.layout.activity_travel_detail

    override fun initStartView(savedInstanceState: Bundle?) {
    }
}
