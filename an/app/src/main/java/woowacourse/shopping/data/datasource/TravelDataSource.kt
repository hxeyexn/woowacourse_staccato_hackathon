package woowacourse.shopping.data.datasource

import woowacourse.shopping.data.dto.TravelDto

interface TravelDataSource {
    suspend fun fetchTravelById(travelId: Long): Result<TravelDto>
}
