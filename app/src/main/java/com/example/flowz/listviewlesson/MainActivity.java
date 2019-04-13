package com.example.flowz.listviewlesson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] teams = {"Madrid","Arsenal","Manchester city","Manchester united","PSG","AC Millain","A.Madrid","Lyon","Chelsea","Inter Millian"};
        ListAdapter flowzAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, teams);
        ListView flowzList = (ListView)findViewById(R.id.flowzListView);
        flowzList.setAdapter(flowzAdapter);
    }
}
