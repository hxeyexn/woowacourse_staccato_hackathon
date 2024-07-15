package woowacourse.shopping.presentation.addvisit

import android.os.Bundle
import woowacourse.shopping.R
import woowacourse.shopping.databinding.ActivityAddVisitBinding
import woowacourse.shopping.presentation.BindingActivity

class AddVisit : BindingActivity<ActivityAddVisitBinding>() {
    override val layoutResourceId: Int
        get() = R.layout.activity_add_visit

    override fun initStartView(savedInstanceState: Bundle?) {
    }
}
