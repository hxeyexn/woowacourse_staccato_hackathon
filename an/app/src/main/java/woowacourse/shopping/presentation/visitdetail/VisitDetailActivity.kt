package woowacourse.shopping.presentation.visitdetail

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.recyclerview.widget.ConcatAdapter
import woowacourse.shopping.R
import woowacourse.shopping.databinding.ActivityVisitDetailBinding
import woowacourse.shopping.presentation.BindingActivity
import woowacourse.shopping.presentation.visitdetail.adapter.VisitDefaultAdapter
import woowacourse.shopping.presentation.visitdetail.adapter.VisitLogAdapter
import woowacourse.shopping.presentation.visitdetail.viewmodel.ViewModelFactory
import woowacourse.shopping.presentation.visitdetail.viewmodel.VisitDetailViewModel

class VisitDetailActivity : BindingActivity<ActivityVisitDetailBinding>() {
    override val layoutResourceId: Int
        get() = R.layout.activity_visit_detail
    private val viewModel: VisitDetailViewModel by viewModels { ViewModelFactory() }
    private lateinit var defaultAdapter: VisitDefaultAdapter
    private lateinit var visitLogAdapter: VisitLogAdapter

    override fun initStartView(savedInstanceState: Bundle?) {
        initViewModel()
        initToolbar()
        initAdapter()
        observeData()
    }

    private fun initViewModel() {
        viewModel.fetchVisitDetailData()
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
        defaultAdapter = VisitDefaultAdapter(mutableListOf())
        visitLogAdapter = VisitLogAdapter(mutableListOf())
        val concatAdapter = ConcatAdapter(defaultAdapter, visitLogAdapter)
        binding.rvVisitDetail.adapter = concatAdapter
    }

    private fun observeData() {
        viewModel.visitDefault.observe(this) { visitDefault ->
            defaultAdapter.setItems(visitDefault)
        }
        viewModel.visitLogs.observe(this) { visitLogs ->
            visitLogAdapter.setItems(visitLogs)
        }
    }
}
