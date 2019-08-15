package com.msyaiful.asuslaptopstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private RecyclerView rvAsus;
    private ArrayList<Asus> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        rvAsus = findViewById(R.id.rv_asus);
        rvAsus.setHasFixedSize(true);

        list.addAll(AsusData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView() {
        rvAsus.setLayoutManager(new LinearLayoutManager(this));
        CardViewAsusAdapter cardViewAsusAdapter = new CardViewAsusAdapter(list);
        rvAsus.setAdapter(cardViewAsusAdapter);
    }
}
