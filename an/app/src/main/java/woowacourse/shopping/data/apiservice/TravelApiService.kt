package woowacourse.shopping.data.apiservice

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import woowacourse.shopping.data.dto.TravelDto

interface TravelApiService {
    @GET("/travels/{travelId}")
    suspend fun requestTravel(
        @Path("id") id: Long,
    ): Response<TravelDto>
}
