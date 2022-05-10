package com.example.getapiusinghilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun retrofitApi(): Retrofit {
        return Retrofit.Builder().baseUrl("http://lmtapi.mycipl.in/").addConverterFactory(
            GsonConverterFactory.create()
        ).build()
    }
}


//Retrofit.Builder().baseUrl("https://raw.githubusercontent.com/").addConverterFactory(
//GsonConverterFactory.create()
//).build()
