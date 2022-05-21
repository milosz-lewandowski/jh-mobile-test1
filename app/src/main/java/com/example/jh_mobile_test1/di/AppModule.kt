package com.example.jh_mobile_test1.di

import com.example.jh_mobile_test1.api.PatientApi
import com.example.jh_mobile_test1.repository.PatientRepository
import com.example.jh_mobile_test1.utils.Constants.Companion.LOCALHOST_IP
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providePatientRepository(
        api: PatientApi
    ) = PatientRepository(api)

    @Singleton
    @Provides
    fun providePatientApi(): PatientApi {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(LOCALHOST_IP)
            .build()
            .create(PatientApi::class.java)
    }
}