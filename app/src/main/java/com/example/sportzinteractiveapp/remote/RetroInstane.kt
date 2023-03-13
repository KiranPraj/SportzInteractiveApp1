package com.example.sportzinteractiveapp.remote


import androidx.viewbinding.BuildConfig
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetroInstane
{
    companion object{
        private fun getRetrofitClient(): OkHttpClient {
            return OkHttpClient.Builder()
                .addInterceptor {chain ->
                    chain.proceed(chain.request().newBuilder().also {
                        it.addHeader("Accept","application/json")
                        it.addHeader("version","1")
                    }.build())

                }.also {
                        client->
                    if (BuildConfig.DEBUG){
                        val logging= HttpLoggingInterceptor()
                        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
                        client.addInterceptor(logging)
                    }

                }.build()
        }

        var gson= GsonBuilder()
            .setLenient()
            .create()


        //var retrofitService:RetrofitService?=null

        fun getInstance():Retrofit
        {

                return Retrofit.Builder()
                    .baseUrl("https://demo.sportz.io/")
                    .client(getRetrofitClient())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()

            }

        }
    }
