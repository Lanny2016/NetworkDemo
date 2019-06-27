package com.exabarermple.latif.networkdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<ArrayValues> {

    public CustomAdapter(Context context, ArrayList<ArrayValues> earthQuakeArrayList) {
        super ( context, 0, earthQuakeArrayList );
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listView = convertView;
        if (listView == null) {

            listView = LayoutInflater.from ( getContext () ).inflate ( R.layout.cusom_list, parent, false );
        }
        ArrayValues getValues = getItem ( position );

        // referencing the textViews in the custom_list layout

        TextView magnitude = (TextView)listView.findViewById ( R.id.magnitude );
        magnitude.setText ( getValues.getMagnitude ());
        TextView location = (TextView)listView.findViewById ( R.id.location );
        location.setText ( getValues.getLocation ());
        TextView date = (TextView)listView.findViewById ( R.id.date_time );
        date.setText ( getValues.getDate ());

        return listView;

    }
}
