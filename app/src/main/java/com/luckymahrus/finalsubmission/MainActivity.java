package com.luckymahrus.finalsubmission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.luckymahrus.finalsubmission.adapter.ListBrandAdapter;
import com.luckymahrus.finalsubmission.model.Brand;
import com.luckymahrus.finalsubmission.model.BrandsData;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity
{
    private RecyclerView rvBrands;
    private ArrayList<Brand> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBrands = findViewById(R.id.rv_brands);
        rvBrands.setHasFixedSize(true);

        list.addAll(BrandsData.getListData());
        showBrandRecyclerList();
    }

    private void showBrandRecyclerList()
    {
        rvBrands.setLayoutManager(new LinearLayoutManager(this));
        ListBrandAdapter listHeroAdapter = new ListBrandAdapter(list);
        rvBrands.setAdapter(listHeroAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode)
    {
        switch (selectedMode)
        {
            case R.id.menu_about:
                Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(aboutIntent);
                break;
        }
    }
}