package com.khamvongsa.victor.poc_getmapapi.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.khamvongsa.victor.poc_getmapapi.R;

import org.osmdroid.api.IMapController;
import org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.MapTileIndex;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;

import androidx.fragment.app.Fragment;


/**
 * Created by <Victor Khamvongsa> on <31/03/2022>
 */
public class MainFragment extends Fragment {

    /*
    TODO : Show map with OSM on Android : https://stackoverflow.com/questions/34881459/how-to-use-overlay-for-osmdroid-with-fragments
         https://stackoverflow.com/questions/57413881/how-to-implement-a-map-in-android-studio-with-leaflet-and-openstreetmap

    TODO : Show Marker Info  : https://stackoverflow.com/questions/23108709/show-marker-details-with-image-onclick-marker-openstreetmap
     */

    /*
    TODO : OverPassAPi : https://wiki.openstreetmap.org/wiki/Overpass_API
    TODO : OverPassAPi Documntation :  https://dev.overpass-api.de/overpass-doc/fr/preface/index.html
                                        https://tel.archives-ouvertes.fr/tel-01683028/document
                                        https://wiki.openstreetmap.org/wiki/FR:Overpass_API/Overpass_QL
                                        https://wiki.openstreetmap.org/wiki/Overpass_API/Overpass_API_by_Example
    TODO : Overpass Turbo to get data : https://overpass-turbo.eu/
          Wiki : https://wiki.openstreetmap.org/wiki/Overpass_turbo#For_the_developer
          FR Overpass : https://wiki.openstreetmap.org/wiki/FR:Overpass_turbo

     TODO : Doc Geodatamine : https://geodatamine.fr/doc/

     MAP Features : https://wiki.openstreetmap.org/wiki/Map_features

     */


    public MainFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_map_main, container, false);

        MapView mMapView = (MapView) view.findViewById(R.id.mapview);

        mMapView.setUseDataConnection(true);
        mMapView.getTileProvider().clearTileCache();
        // Create a custom tile source
        mMapView.setTileSource(new OnlineTileSourceBase("", 1, 20, 512, ".png",
                new String[] { "https://api.openstreetmap.org/" }) {
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
