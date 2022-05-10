package com.example.getapiusinghilt

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var retrofit: Retrofit
    val TAG: String = "success"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        getData()

    }

//    fun getData() {
//
//        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        val dataApi: ApiInterface = retrofit.create(ApiInterface::class.java)
//
////        val call: Call<List<Data>> = dataApi.getData()
//        Log.d(TAG, "success")
//        call.enqueue(object : Callback<List<Data>> {
//            override fun onResponse(call: Call<List<Data>>, response: Response<List<Data>>) {
//                Log.d(TAG, "success inside loop")
//                val data: List<Data>? = response.body()
//                println(data)
//                recyclerView.adapter = data?.let { RecyclerAdapter(it, this@MainActivity) }
//            }
//
//            override fun onFailure(call: Call<List<Data>>, t: Throwable) {
//            }
//        })
//    }
}
