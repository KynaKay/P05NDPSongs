package com.example.a16046508.p05ndpsongs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    SongArrayAdapter adapter;
    ArrayList<String> al;
    ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lv);

        DBHelper dbh = new DBHelper(this);
        ArrayList<Song> songs = dbh.getAllSongs();

        adapter = new SongArrayAdapter(this, R.layout.row, songs);
        lv.setAdapter(adapter);
    }

}
