package com.example.getapiusinghilt

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface ApiInterface  {

//    @GET("Oclemy/SampleJSON/338d9585/spacecrafts.json")
//    fun getData() : Call<List<Data>>

    @GET("api/leavetyp")
    fun getDatas(@Header("Authorization") token: String) : Call<List<DataDto>>
}