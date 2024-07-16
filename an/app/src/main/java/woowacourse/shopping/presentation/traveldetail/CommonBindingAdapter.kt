package woowacourse.shopping.presentation.traveldetail

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
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

    @BindingAdapter("roundedCornerImage")
    @JvmStatic
    fun loadRoundedCornerImage(
        imageView: ImageView,
        url: String?,
    ) {
        Glide.with(imageView.context)
            .load(url)
            .placeholder(R.drawable.shape_all_card_4dp)
            .apply(RequestOptions.bitmapTransform(RoundedCorners(12)))
            .into(imageView)
    }

    @BindingAdapter("image")
    @JvmStatic
    fun loadImage(
        imageView: ImageView,
        url: String?,
    ) {
        Glide.with(imageView.context)
            .load(url)
            .placeholder(R.drawable.shape_all_default_image)
            .into(imageView)
    }
}
