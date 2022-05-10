package com.example.getapiusinghilt

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject

@AndroidEntryPoint
class TestActivity : AppCompatActivity() {
    val keys = ArrayList<String>()
    val values = ArrayList<String>()

    @Inject
    lateinit var retrofit: Retrofit
    val TAG: String = "success"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        getData()
//        val list = DataSub()
//        list.Account_Number.
    }

    fun getData() {
//        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.addItemDecoration(
//            DividerItemDecoration(
//                recyclerView.context,
//                DividerItemDecoration.VERTICAL
//            )
//        )
//        val textView: TextView = findViewById(R.id.text_test)
        val dataApi: ApiInterface = retrofit.create(ApiInterface::class.java)
        val call: Call<List<DataDto>> =
            dataApi.getDatas("Bearer 4|6OaeaDg4IRBMTQkd8AvjtjddS7WBLYu6aKCDPWk9")
        call.enqueue(object : Callback<List<DataDto>> {
            override fun onResponse(call: Call<List<DataDto>>, response: Response<List<DataDto>>) {
                Log.d(TAG, "success inside loop")
                Log.d("helloTagSuccess", "success")
                val data = response.body()
                println(response.body())

//                    Toast.makeText(this@TestActivity, "${data.status}", Toast.LENGTH_LONG).show()
            }

            override fun onFailure(call: Call<List<DataDto>>, t: Throwable) {
                Log.d("helloTagfailed", t.message.toString())
            }
        })
    }

//    fun makekeyAsList(data: LinkedHashMap<String, String>): List<String> {
//
//        data.forEach { key, value ->
//            keys.add(key)
//            System.out.println(values)
//        }
//
//        return keys
//    }

//    fun makevalueList(data: LinkedHashMap<String, String>): List<String> {
//
//        data.forEach { key, value ->
// //            if (value.equals("")) {
//            values.add("")
// //            } else {
// //                values.add(value)
// //            }
//        }
//        return values
//    }
}
