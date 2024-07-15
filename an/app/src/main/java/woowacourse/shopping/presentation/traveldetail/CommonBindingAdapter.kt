package woowacourse.shopping.presentation.traveldetail

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import woowacourse.shopping.R

object CommonBindingAdapter {
    @BindingAdapter("circleImage")
    @JvmStatic
    fun loadCircleImage(
        imageView: ImageView,
        url: String?,
    ) {
        Glide.with(imageView.context)
            .load(url)
            .placeholder(R.drawable.user_default_thumbnail)
            .circleCrop()
            .into(imageView)
    }
}
