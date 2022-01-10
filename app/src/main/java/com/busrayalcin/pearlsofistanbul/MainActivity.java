package com.busrayalcin.pearlsofistanbul;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.busrayalcin.pearlsofistanbul.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<Landmark> landmarkArrayList ;
    private ActivityMainBinding binding ;


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

       landmarkArrayList = new ArrayList<>();

        // Data

        Landmark blue_mosque = new Landmark("Blue Mosque",R.drawable.blue_mosque);
        Landmark cistern = new Landmark("Cistern",R.drawable.cistern);
        Landmark galata_tower = new Landmark("Galata Tower",R.drawable.galata_tower);
        Landmark hagia_sophia = new Landmark("Hagia Sophia",R.drawable.hagia_sophia);
        Landmark maiden_tower = new Landmark("Maiden Tower",R.drawable.maiden_tower);
        Landmark taksim_square = new Landmark("Taksim Square",R.drawable.taksim_square);


        landmarkArrayList.add(blue_mosque);
        landmarkArrayList.add(cistern);
        landmarkArrayList.add(galata_tower);
        landmarkArrayList.add(hagia_sophia);
        landmarkArrayList.add(maiden_tower);
        landmarkArrayList.add(taksim_square);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);

        /*
        //Adapter
        //ListView

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landmarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("landmark",landmarkArrayList.get(i));
                startActivity(intent);

            }
        });

         */






    }
}