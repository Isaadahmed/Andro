package com.example.uploadimageretrofit.api;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface MyApi {

    @FormUrlEncoded
    @POST("api-file-upload.php")
    Call<ResponseBody> insertdata(
            @Field("name") String imageurl


    );
}
