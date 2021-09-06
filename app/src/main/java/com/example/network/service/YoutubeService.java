package com.example.network.service;

import com.google.gson.JsonElement;

import retrofit2.Call;
import retrofit2.http.GET;

public interface YoutubeService {
    String SERVER_URL = "https://youtube.googleapis.com/";

    @GET("youtube/v3/videos?part=snippet&contentDetails=statistics&id=7ReC8on7sLs&key=AIzaSyB1GwwlExjwjzBerjzDft8_GHxLH0Zhjb0")
    Call<JsonElement> getItemData();
}
