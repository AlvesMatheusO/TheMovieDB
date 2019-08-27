package com.example.filmes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.filmes.ApiService.RetrofitInitializer
import com.example.filmes.Models.Netflix
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val call = RetrofitInitializer().netflixService().listFilmes()

        call.enqueue(object: Callback<Netflix>{

            override fun onFailure(call: Call<Netflix>, t: Throwable) {
                Log.e("Erro Netflix",t.message)
                    TesteHome.setText(t.message)
            }

            override fun onResponse(call: Call<Netflix>, response: Response<Netflix>) {
                val filmes = response.body()

                TesteHome.setText(filmes?.results?.get(0)?.title)
            }
        })

    }
}
