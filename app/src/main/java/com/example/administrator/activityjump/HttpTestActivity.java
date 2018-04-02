package com.example.administrator.activityjump;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public class HttpTestActivity extends AppCompatActivity {

    public static final String BASE_URL = "http://59.110.153.248:1024/";
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public interface MovieService {
        //获取豆瓣Top250 榜单
        @FormUrlEncoded
        @POST("api/home/newindex")
        Call<MovieSubject> getTop250(@Field("start") String star);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_http_test);

        Log.d("httptes2132131t","开始请求");
        //获取接口实例
       MovieService movieService = retrofit.create(MovieService.class);
        //调用方法得到一个Call
        Call<MovieSubject> call = movieService.getTop250(null);
        //进行网络请求
        call.enqueue(new Callback<MovieSubject>() {

            @Override
            public void onResponse(Call<MovieSubject> call, Response<MovieSubject> response) {
                Log.d("httptes2132131t","请求成功");
            }
            @Override
            public void onFailure(Call<MovieSubject> call, Throwable t) {
                Log.d("httptes2132131t","请求失败");
                t.printStackTrace();
            }
        });
    }

}

class MovieSubject{
    public String currentRole;

    public String scenesList;

    public String userRoleId;

    public String userRoleName;
}