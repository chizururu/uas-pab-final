package com.acr.animecommunityroom.Services;

import com.acr.animecommunityroom.Models.ValueData;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {
    @POST("insertPost")
    @FormUrlEncoded
    Call<ValueData>

}
