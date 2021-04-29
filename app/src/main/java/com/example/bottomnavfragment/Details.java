package com.example.bottomnavfragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Details extends AppCompatActivity {
    private TextView tvVacayPlaces,tvVacayDesc;
    private ImageView ivVacayPhoto;

    String name, desc;
    int photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        tvVacayDesc = findViewById(R.id.tvDetailSum);
        tvVacayPlaces = findViewById(R.id.tvDetailName);
        ivVacayPhoto = findViewById(R.id.ivDetail);

        Intent intent = getIntent();
        VacationModel vm = intent.getParcelableExtra("VacationModel");
        ActionBar actionbar = getSupportActionBar();

        actionbar.setTitle(vm.getName());
        actionbar.setDisplayHomeAsUpEnabled(true);

        tvVacayPlaces.setText(vm.getName());
        tvVacayDesc.setText(vm.getSummary());
        ivVacayPhoto.setImageResource(vm.getPhoto());
     
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                Intent a = new Intent(Details.this, MainActivity.class);
                startActivity(a);
                finish();
        }
        return super.onOptionsItemSelected(item);
    }
}