package com.example.ayudatsenko.lesson7l;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Phone> phones = new ArrayList<>();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // заполняем список значениями
        setInitialData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);

        // создаем адаптер
        DataAdapter dataAdapter = new DataAdapter(this, phones);

        // устанавливаем для списка адаптер
        recyclerView.setAdapter(dataAdapter);
        
    }

    private void setInitialData() {

        phones.add(new Phone("Iphone 9", "Apple", R.drawable.iphone));
        phones.add(new Phone("Samsung S10", "Samsung", R.drawable.samsu));
        phones.add(new Phone("Nokia 1210", "Nokia", R.drawable.nokia));

    }
}
