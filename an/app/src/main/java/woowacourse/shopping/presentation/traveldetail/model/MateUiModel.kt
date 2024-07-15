package woowacourse.shopping.presentation.traveldetail.model

data class MateUiModel(
    val id: Long,
    val nickName: String,
    val memberImage: String,
)

val dummyMates: List<MateUiModel> =
    listOf(
        MateUiModel(
            id = 1L,
            nickName = "hxeyexn",
            memberImage = "https://avatars.githubusercontent.com/u/103019852?v=4",
        ),
        MateUiModel(
            id = 2L,
            nickName = "s6m1n",
            memberImage = "https://avatars.githubusercontent.com/u/46596035?v=4",
        ),
        MateUiModel(
            id = 3L,
            nickName = "hodu",
            memberImage = "https://avatars.githubusercontent.com/u/92203597?v=4",
        ),
    )
