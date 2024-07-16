package woowacourse.shopping.presentation.visitdetail

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.recyclerview.widget.ConcatAdapter
import com.google.android.material.dialog.MaterialAlertDialogBuilder
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
                    materialBasicDialog()
                    true
                }

                else -> {
                    false
                }
            }
        }
    }

    private fun materialBasicDialog() {
        MaterialAlertDialogBuilder(this)
            .setMessage("진짜로,, 방문 로그를,, 지우시려구요,,?")
            .setNegativeButton("취소") { dialog, which ->
                Toast.makeText(this, "삭제 안 돼!!! 평생 함께야!!!", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("삭제") { dialog, which ->
                Toast.makeText(this, "삭제 안 돼!!! 평생 함께야!!!", Toast.LENGTH_SHORT).show()
            }
            .show()
    }

    private fun initAdapter() {
        defaultAdapter = VisitDefaultAdapter(mutableListOf())
        visitLogAdapter = VisitLogAdapter(mutableListOf())
        val concatAdapter = ConcatAdapter(defaultAdapter, visitLogAdapter)
        binding.rvVisitDetail.adapter = concatAdapter
    }

    private fun observeData() {
        viewModel.visitDefault.observe(this) { visitDefault ->
            defaultAdapter.setItems(listOf(visitDefault))
        }
        viewModel.visitLogs.observe(this) { visitLogs ->
            visitLogAdapter.setItems(visitLogs)
        }
    }
}
