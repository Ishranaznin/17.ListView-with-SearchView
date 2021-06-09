package com.example.listiew_with_searchview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

 String[] aarray={"Chitagong","Rajshahi","magura","Dhaka","Cumilla","Khulna"};

 ListView lv;

ArrayAdapter<String> adapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.list2);
       adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, aarray);

        lv.setAdapter(adapter);
        adapter .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        SearchView sView = findViewById(R.id.seview);

        sView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });




}
}
