package woowacourse.shopping.presentation.visitdetail

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("bindLoadCircleImage")
fun ImageView.loadCircleImage(imgUrl: String?) {
    Glide.with(context)
        .load(imgUrl)
        .circleCrop()
        .into(this)
}
