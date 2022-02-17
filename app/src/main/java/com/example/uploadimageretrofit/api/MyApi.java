package com.example.uploadimageretrofit.api;

import android.net.Uri;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface MyApi {

    @FormUrlEncoded
    @POST("uploadimg.php")
    Call<ResponseBody> insertdata(
            @Field("name") String imageurl
    );
}
