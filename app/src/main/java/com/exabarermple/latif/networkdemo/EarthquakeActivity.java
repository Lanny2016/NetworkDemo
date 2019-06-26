package com.exabarermple.latif.networkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.earthquake_activity );
//creating a fake arrayList

//ArrayList<String> earthQuakeArrayList = new ArrayList<String>();
//earthQuakeArrayList.add ( "Istanbul" );
// modifying the ArrayList according to the ArrayValues class
        ArrayList<ArrayValues> earthQuakeArrayList = new ArrayList<ArrayValues> ();
        ArrayValues values = new ArrayValues ( "1", "Istanbul","Feb 5,2019" );
        earthQuakeArrayList.add ( values );
        // or we can add the values like this below
        earthQuakeArrayList.add ( new ArrayValues ( "2.5", "Ankara", "March 7,2019" ) );
        earthQuakeArrayList.add ( new ArrayValues ( "3.7", "Izmit", "April 9,2019" ) );
        earthQuakeArrayList.add ( new ArrayValues ( "4.5", "Antalya", "May 8,2019" ) );
        earthQuakeArrayList.add ( new ArrayValues ( "5.5", "kocaeli", "June 10,2019" ) );
        earthQuakeArrayList.add ( new ArrayValues ( "6.9", "Aydin", "July 11,2019" ) );

// creating an ArrayAdapter to display the list of arrays
//        ArrayAdapter<String> adapter = new ArrayAdapter<String> ( this,
//                android.R.layout.simple_expandable_list_item_1, earthQuakeArrayList );
        // creating customAdapter to show the list of values in our own custom_list layout

         CustomAdapter adapter = new CustomAdapter ( this,earthQuakeArrayList);

        // Find a reference to the {@link ListView} in the layout for systems default layout
        listView = (ListView) findViewById ( R.id.list );
        // setting the adapter to the listView
        listView.setAdapter ( adapter );


    }
}
