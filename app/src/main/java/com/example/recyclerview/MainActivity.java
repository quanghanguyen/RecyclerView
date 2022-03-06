package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvAttribute;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvAttribute = (RecyclerView) findViewById(R.id.rcvAttribute);
        adapter = new Adapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        rcvAttribute.setLayoutManager(linearLayoutManager);

        adapter.setData(getListAttribute());
        rcvAttribute.setAdapter(adapter);



    }

    private List<Attribute> getListAttribute() {

        List<Attribute> list = new ArrayList<>();
        list.add(new Attribute(R.drawable.avata_6));
        list.add(new Attribute(R.drawable.avatar_2));
        list.add(new Attribute(R.drawable.avatar_3));
        list.add(new Attribute(R.drawable.avatar_4));
        list.add(new Attribute(R.drawable.avatar_5));
        list.add(new Attribute(R.drawable.avatar_9));



        return list;

    }
}