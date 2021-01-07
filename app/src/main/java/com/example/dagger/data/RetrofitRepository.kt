package com.example.dagger.data

interface RetrofitRepository{
    suspend fun loadBLogs(limit: Int, page: Int): BaseListingResponse<BlogModel>

}
class RetrofititRepositoryImpl(private val network: RetrofitIteractor): RetrofitRepository {

    override suspend fun loadBLogs(limit: Int, page: Int): BaseListingResponse<BlogModel> {
       return network.loadBLogs(limit = limit, page = page)
    }
}