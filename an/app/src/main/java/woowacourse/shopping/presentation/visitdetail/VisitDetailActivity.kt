package woowacourse.shopping.presentation.visitdetail

import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.ConcatAdapter
import woowacourse.shopping.R
import woowacourse.shopping.databinding.ActivityVisitDetailBinding
import woowacourse.shopping.presentation.BindingActivity
import woowacourse.shopping.presentation.visitdetail.adapter.VisitDefaultAdapter
import woowacourse.shopping.presentation.visitdetail.adapter.VisitLogAdapter

class VisitDetailActivity : BindingActivity<ActivityVisitDetailBinding>() {
    override val layoutResourceId: Int
        get() = R.layout.activity_visit_detail

    override fun initStartView(savedInstanceState: Bundle?) {
        initToolbar()
        initAdapter()
    }

    private fun initToolbar() {
        binding.toolbarVisitDetail.setNavigationOnClickListener { finish() }
        binding.toolbarVisitDetail.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.action_delete -> {
                    Toast.makeText(this, "방문 로그 삭제할꾸양~", Toast.LENGTH_SHORT).show()
                    true
                }

                else -> {
                    false
                }
            }
        }
    }

    private fun initAdapter() {
        val defaultAdapter = VisitDefaultAdapter(listOf(""))
        val logAdapter =
            VisitLogAdapter(
                listOf(
                    "",
                    "",
                ),
            )
        val concatAdapter = ConcatAdapter(defaultAdapter, logAdapter)
        binding.rvVisitDetail.adapter = concatAdapter
    }
}
