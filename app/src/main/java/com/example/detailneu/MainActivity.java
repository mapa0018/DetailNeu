package com.example.detailneu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity {

    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView eventName = (TextView) findViewById(R.id.name_event);
        eventName.setText("Dies ist der Default-Wert");

        TextView eventType = (TextView) findViewById(R.id.event_type);
        eventType.setText("DEFAULT // WERTE");

        TextView startDate = (TextView) findViewById(R.id.event_startdate);
        startDate.setText("01.07.2018");

        TextView eventLong = (TextView) findViewById(R.id.logitude);
        eventLong.setText("50.447772");

        TextView endDate = (TextView) findViewById(R.id.event_endDate);
        endDate.setText("11.07.2018");

        TextView eventLat = (TextView) findViewById(R.id.event_lat);
        eventLat.setText("8.898966");

        TextView eventTime = (TextView) findViewById(R.id.event_time);
        eventTime.setText("10:00 A.M.");

        TextView eventGPX = (TextView) findViewById(R.id.gpx);
        eventGPX.setText("N.A.");

        TextView eventOrg = (TextView) findViewById(R.id.event_org);
        eventOrg.setText("Organisation");

        TextView eventSA1 = (TextView) findViewById(R.id.street_adress1);
        eventSA1.setText("Street Adress 1");

        TextView eventSA2 = (TextView) findViewById(R.id.street_adress2);
        eventSA2.setText("Street Adress 2");

        TextView eventPLZ = (TextView) findViewById(R.id.plz);
        eventPLZ.setText("PLZPLZ");

        TextView eventCity = (TextView) findViewById(R.id.city);
        eventCity.setText("CityName");


        SupportMapFragment mapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                map = googleMap;
                LatLng latLng = new LatLng(28.11, 21.11);
                map.addMarker(new MarkerOptions().position(latLng).title("EVENT"));
                map.moveCamera(CameraUpdateFactory.newLatLng(latLng));


            }
        });
    }
}
