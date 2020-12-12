package com.star_zero.migrate_hilt.core.api

import retrofit2.http.GET

interface SampleAPI {
    @GET("foo")
    fun foo(): String
}
