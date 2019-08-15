package com.luckymahrus.finalsubmission;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        setActionBarTitle(getString(R.string.page_title_about));

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView txtEmail = findViewById(R.id.tv_author_email);
        txtEmail.setOnClickListener(this);

        TextView txtPhone = findViewById(R.id.tv_author_phone);
        txtPhone.setOnClickListener(this);
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

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.tv_author_phone:
                TextView textPhoneView = findViewById(v.getId());
                String phoneNumber = textPhoneView.getText().toString();
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;
            case R.id.tv_author_email:
                TextView textEmailView = findViewById(v.getId());
                String emailAddress = textEmailView.getText().toString();
                Intent sendEmailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto",emailAddress, null));
                startActivity(sendEmailIntent);
                break;
        }
    }

    private void setActionBarTitle(String title)
    {
        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setTitle(title);
        }
    }
}
