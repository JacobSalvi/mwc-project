package com.example.mwcproject.utils;

import android.location.Location;

import com.google.android.gms.maps.model.LatLng;

public class LocationUtils {

    public static LatLng locationToLatLng(Location location) {
        return new LatLng(location.getLatitude(), location.getLongitude());
    }

    public static Location getLuganoLocation() {
        Location location =  new Location("BASE");
        location.setLongitude(8.96139);
        location.setLatitude(46.011674);
        return location;
    }

    public static int GetRange() {
        return 10000;
    }


}
