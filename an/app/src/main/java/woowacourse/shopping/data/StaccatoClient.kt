package woowacourse.shopping.data

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import woowacourse.shopping.BuildConfig

object StaccatoClient {
    private const val BASE_URL = BuildConfig.BASE_URL

    private val provideLoggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    private val provideHttpClient = OkHttpClient.Builder()
        .addInterceptor(provideLoggingInterceptor)
        .build()

    private val provideRetrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(provideHttpClient)
        .addConverterFactory(
            Json { ignoreUnknownKeys = true }
                .asConverterFactory("application/json".toMediaType())
        )
        .build()

    fun <T> create(service: Class<T>): T {
        return provideRetrofit.create(service)
    }
}
