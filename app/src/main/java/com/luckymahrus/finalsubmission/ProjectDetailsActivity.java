package com.luckymahrus.finalsubmission;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class ProjectDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String projectId,projectName;
        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if(extras == null)
            {
                projectId = "";
                projectName = "";
            }
            else
            {
                projectId = extras.getString("EXTRA_PROJECTID");
                projectName = extras.getString("EXTRA_PROJECTNAME");
            }
        }
        else
        {
            projectId = (String) savedInstanceState.getSerializable("EXTRA_PROJECTID");
            projectName = (String) savedInstanceState.getSerializable("EXTRA_PROJECTNAME");
        }

        switch (projectId)
        {
            case "0":
                setContentView(R.layout.details_0);
                break;
        }

        setActionBarTitle(projectName);
        Toast.makeText(this, "Kamu memilih " + projectName, Toast.LENGTH_SHORT).show();

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if(id == android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private void setActionBarTitle(String title)
    {
        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setTitle(title);
        }
    }
}
