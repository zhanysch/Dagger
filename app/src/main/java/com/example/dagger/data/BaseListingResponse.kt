package com.example.dagger.data

data class BaseListingResponse <T>(
    val total_count: Int,
    val rows: List<T>
)