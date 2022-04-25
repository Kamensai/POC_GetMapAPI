package com.khamvongsa.victor.poc_getmapapi.Fragments;

import android.content.Context;
import android.content.res.loader.ResourcesProvider;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.khamvongsa.victor.poc_getmapapi.BuildConfig;
import com.khamvongsa.victor.poc_getmapapi.R;

import org.osmdroid.api.IMapController;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.MapTileIndex;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;
import org.osmdroid.views.overlay.mylocation.GpsMyLocationProvider;
import org.osmdroid.views.overlay.mylocation.MyLocationNewOverlay;

import androidx.fragment.app.Fragment;


/**
 * Created by <Victor Khamvongsa> on <31/03/2022>
 */
public class MainFragment extends Fragment {

    public MainFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_map_main, container, false);

        MapView mMapView = (MapView) view.findViewById(R.id.mapview);

        mMapView.setUseDataConnection(true);
        mMapView.getTileProvider().clearTileCache();
        // Create a custom tile source
        mMapView.setTileSource(new OnlineTileSourceBase("", 1, 20, 512, ".png",
                new String[] { "https://a.tile.openstreetmap.org/" }) {
            @Override
            public String getTileURLString(long pMapTileIndex) {
                return getBaseUrl()
                        + MapTileIndex.getZoom(pMapTileIndex)
                        + "/" + MapTileIndex.getX(pMapTileIndex)
                        + "/" + MapTileIndex.getY(pMapTileIndex)
                        + mImageFilenameEnding;
            }
        });


        // mMapView.setTileSource(TileSourceFactory.DEFAULT_TILE_SOURCE);
        mMapView.setBuiltInZoomControls(false);
        mMapView.setMultiTouchControls(true);
        IMapController mapController;
        mapController = mMapView.getController();
        mapController.setZoom(14.5);

        GeoPoint startPoint = new GeoPoint(45.188529, 5.724524);
        mapController.setCenter(startPoint);

        final Marker marker = new Marker(mMapView);
        marker.setPosition(startPoint);
        mMapView.getOverlays().add(marker);

        return view;
    }
}
