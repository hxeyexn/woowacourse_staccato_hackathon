package woowacourse.shopping.presentation.timeline

class TempTimelineRepository {
    private var travelItems: List<TravelItemUiModel> = listOf(
        TravelItemUiModel(
            0,
            "제주도 가족 여행",
            "https://www.kkday.com/ko/blog/wp-content/uploads/korea_jeju_rainbow_coastal_road_4.jpg",
            "2024.05.06 - 09"
        ),
        TravelItemUiModel(
            1,
            "우테코 부산 여행",
            "https://avatars.githubusercontent.com/u/92203597?v=4",
            "2024.06.17 - 21"
        ),
        TravelItemUiModel(
            2,
            "서울 망원 한강 공원",
            "https://file.notion.so/f/f/ba7d3f51-9fa2-4951-a5b4-cd258aa3a16f/bc36390b-60b5-4f66-bce4-4969ee4b97e1/profile.png?id=f5dff214-2f30-4c24-939b-7e44140c9678&table=block&spaceId=ba7d3f51-9fa2-4951-a5b4-cd258aa3a16f&expirationTimestamp=1721160000000&signature=BFks47qrP7y0Kd_5cHl9G-Yjftpt6oXdJwYbMmPctcg&downloadName=profile.png",
            "2024.06.15"
        ),
        TravelItemUiModel(
            3,
            "제주도 가족 여행",
            "https://www.kkday.com/ko/blog/wp-content/uploads/korea_jeju_rainbow_coastal_road_4.jpg",
            "2024.05.06 - 09"
        ),
        TravelItemUiModel(
            4,
            "서울 망원 한강 공원",
            "https://file.notion.so/f/f/ba7d3f51-9fa2-4951-a5b4-cd258aa3a16f/bc36390b-60b5-4f66-bce4-4969ee4b97e1/profile.png?id=f5dff214-2f30-4c24-939b-7e44140c9678&table=block&spaceId=ba7d3f51-9fa2-4951-a5b4-cd258aa3a16f&expirationTimestamp=1721160000000&signature=BFks47qrP7y0Kd_5cHl9G-Yjftpt6oXdJwYbMmPctcg&downloadName=profile.png",
            "2024.06.15"
        ),
        TravelItemUiModel(
            5,
            "제주도 가족 여행",
            "https://www.kkday.com/ko/blog/wp-content/uploads/korea_jeju_rainbow_coastal_road_4.jpg",
            "2024.05.06 - 09"
        ),
        TravelItemUiModel(
            6,
            "서울 망원 한강 공원",
            "https://www.kkday.com/ko/blog/wp-content/uploads/korea_jeju_rainbow_coastal_road_4.jpg",
            "2024.06.15"
        ),
    )

    fun loadTimeline(): List<TravelItemUiModel> {
        return travelItems
    }
}
