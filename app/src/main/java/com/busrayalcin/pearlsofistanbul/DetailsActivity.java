package com.busrayalcin.pearlsofistanbul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.busrayalcin.pearlsofistanbul.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Intent intent = getIntent();
        //Landmark selectedLandmark = (Landmark) intent.getSerializableExtra("landmark");

        Singleton singleton = Singleton.getInstance();
        Landmark selectedLandmark = singleton.getSentLandmark();

        binding.nameText.setText(selectedLandmark.name);
        binding.imageView.setImageResource(selectedLandmark.image);
    }
}