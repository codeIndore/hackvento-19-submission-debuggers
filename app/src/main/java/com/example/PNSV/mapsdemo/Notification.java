package com.example.PNSV.mapsdemo;

import com.google.android.gms.maps.model.LatLng;

public class Notification {

    public static boolean notification(LatLng currentL , LatLng DestinationL) {

        double distance = 300;

        try {


            double C1 = currentL.latitude;
            double C2 = currentL.longitude;

            double D1 = DestinationL.latitude;
            double D2 = DestinationL.longitude;

            final int R = 6371; // Radius of the earth

            double latDistance = Math.toRadians(D1 - C1);
            double lonDistance = Math.toRadians(D2 - C2);
            double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                    + Math.cos(Math.toRadians(C1)) * Math.cos(Math.toRadians(D1))
                    * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
            double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
            distance = R * c * 1000; // convert to meters
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        if(distance < 200)
            return false;
        else
            return true;

    }



}
