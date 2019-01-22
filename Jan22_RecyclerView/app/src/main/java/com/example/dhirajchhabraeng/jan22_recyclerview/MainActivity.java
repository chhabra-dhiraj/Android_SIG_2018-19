package com.example.dhirajchhabraeng.jan22_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    LinearLayoutManager mLayoutManager;
    MyAdapter mAdapter;
    ArrayList<MyContacts>myDataset=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView=findViewById(R.id.rv);

        myDataset.add(new MyContacts("ashutosh","1234"));
        myDataset.add(new MyContacts("ashutosh","12345"));
        myDataset.add(new MyContacts("ashutosh","1sjg"));
        myDataset.add(new MyContacts("ashutosh","1234"));
        myDataset.add(new MyContacts("ashutosh","12384"));
        myDataset.add(new MyContacts("ashutosh","1234"));
        myDataset.add(new MyContacts("ashutosh","1234"));


        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);



    }
}
