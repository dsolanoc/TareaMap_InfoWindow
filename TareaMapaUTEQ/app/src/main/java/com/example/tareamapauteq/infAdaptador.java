package com.example.tareamapauteq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.squareup.picasso.Picasso;

public class infAdaptador implements GoogleMap.InfoWindowAdapter {

    Context contex;

    public infAdaptador(Context contex) {
        this.contex = contex;
    }

    @Override
    public View getInfoWindow(Marker marker) {

        View infoFacultad= LayoutInflater.from(contex).inflate(R.layout.info_facultad,null);
        ImageView logo=infoFacultad.findViewById(R.id.logo);
        TextView contenido=infoFacultad.findViewById(R.id.contenido);

        Picasso.get().load(marker.getTitle())
                .resize(100,100)
                .centerCrop().into(logo);
        contenido.setText(marker.getSnippet());
        return infoFacultad;

    }
    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}
