package com.khamvongsa.victor.poc_getmapapi.Utils;

import com.khamvongsa.victor.poc_getmapapi.Models.RestaurantInfo;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by <Victor Khamvongsa> on <26/04/2022>
 */
public interface OpenStreetMapService {

    // TODO :

    @GET("users/{username}/following")
    Observable<List<RestaurantInfo>> getRestaurantInGrenoble(@Path("username") String username);

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.openstreetmap.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build();

}
