package com.khamvongsa.victor.poc_getmapapi.Utils;

import com.khamvongsa.victor.poc_getmapapi.Models.RestaurantInfo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by <Victor Khamvongsa> on <26/04/2022>
 */
public class OpenStreetMapStreams {

    public static Observable<List<RestaurantInfo>> streamFetchUserFollowing(String username){
        OpenStreetMapService openStreetMapService = OpenStreetMapService.retrofit.create(OpenStreetMapService.class);
        return openStreetMapService.getRestaurantInGrenoble(username)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .timeout(10, TimeUnit.SECONDS);
    }
}
