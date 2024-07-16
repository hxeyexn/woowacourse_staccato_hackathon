package woowacourse.shopping.presentation.visitdetail

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

@BindingAdapter("bindLoadCircleImage")
fun ImageView.loadCircleImage(imgUrl: String?) {
    Glide.with(context)
        .load(imgUrl)
        .circleCrop()
        .into(this)
}

@BindingAdapter("bindLoadImage")
fun ImageView.loadImage(imgUrl: String?) {
    Glide.with(context)
        .load(imgUrl)
        .skipMemoryCache(true)
        .diskCacheStrategy(DiskCacheStrategy.NONE)
        .centerCrop()
        .into(this)
}
