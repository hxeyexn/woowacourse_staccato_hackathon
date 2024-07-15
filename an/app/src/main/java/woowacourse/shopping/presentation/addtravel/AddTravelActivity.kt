package woowacourse.shopping.presentation.addtravel

import android.os.Bundle
import woowacourse.shopping.R
import woowacourse.shopping.databinding.ActivityAddTravelBinding
import woowacourse.shopping.presentation.BindingActivity

class AddTravelActivity : BindingActivity<ActivityAddTravelBinding>() {
    override val layoutResourceId: Int
        get() = R.layout.activity_add_travel

    override fun initStartView(savedInstanceState: Bundle?) {
    }
}
