package com.example.willson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class KomponenActivity extends AppCompatActivity implements View.OnClickListener {

    private Button syntax1;
    private Button materi1;

    private Button syntax2;
    private Button materi2;

    private Button syntax3;
    private Button materi3;

    private Button syntax4;
    private Button materi4;

    private Button syntax5;
    private Button materi5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen);

        syntax1=(Button) findViewById(R.id.btn_kom1);
        syntax1.setOnClickListener(this);

        materi1=(Button) findViewById(R.id.btn_kom11);
        materi1.setOnClickListener(this);

        syntax2=(Button) findViewById(R.id.btn_kom2);
        syntax2.setOnClickListener(this);

        materi2=(Button) findViewById(R.id.btn_kom22);
        materi2.setOnClickListener(this);

        syntax3=(Button) findViewById(R.id.btn_kom3);
        syntax3.setOnClickListener(this);

        materi3=(Button) findViewById(R.id.btn_kom33);
        materi3.setOnClickListener(this);

        syntax4=(Button) findViewById(R.id.btn_kom4);
        syntax4.setOnClickListener(this);

        materi4=(Button) findViewById(R.id.btn_kom44);
        materi4.setOnClickListener(this);

        syntax5=(Button) findViewById(R.id.btn_kom5);
        syntax5.setOnClickListener(this);

        materi5=(Button) findViewById(R.id.btn_kom55);
        materi5.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_kom1:
                Intent moveIntent = new Intent(KomponenActivity.this, SyntaxActivity1.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_kom11:
                String url = "https://developer.android.com/guide/components/activities";
                Uri webpage = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    Log.d("ImplicitIntents", "Can't handle this intent!");
                }
                break;


            case R.id.btn_kom2:
                Intent moveIntentt = new Intent(KomponenActivity.this, SyntaxActivity2.class);
                startActivity(moveIntentt);
                break;
            case R.id.btn_kom22:
                String urll = "https://developer.android.com/guide/components/services";
                Uri webpagee = Uri.parse(urll);
                Intent intentt = new Intent(Intent.ACTION_VIEW, webpagee);
                if (intentt.resolveActivity(getPackageManager()) != null) {
                    startActivity(intentt);
                } else {
                    Log.d("ImplicitIntents", "Can't handle this intent!");
                }
                break;


            case R.id.btn_kom3:
                Intent moveIntenttt = new Intent(KomponenActivity.this, SyntaxActivity3.class);
                startActivity(moveIntenttt);
                break;
            case R.id.btn_kom33:
                String urlll = "https://developer.android.com/guide/components/broadcasts";
                Uri webpageee = Uri.parse(urlll);
                Intent intenttt = new Intent(Intent.ACTION_VIEW, webpageee);
                if (intenttt.resolveActivity(getPackageManager()) != null) {
                    startActivity(intenttt);
                } else {
                    Log.d("ImplicitIntents", "Can't handle this intent!");
                }
                break;


            case R.id.btn_kom4:
                Intent moveIntentttt = new Intent(KomponenActivity.this, SyntaxActivity4.class);
                startActivity(moveIntentttt);
                break;
            case R.id.btn_kom44:
                String urllll = "https://developer.android.com/guide/topics/providers/content-providers";
                Uri webpageeee = Uri.parse(urllll);
                Intent intentttt = new Intent(Intent.ACTION_VIEW, webpageeee);
                if (intentttt.resolveActivity(getPackageManager()) != null) {
                    startActivity(intentttt);
                } else {
                    Log.d("ImplicitIntents", "Can't handle this intent!");
                }
                break;


            case R.id.btn_kom5:
                Intent moveIntenttttt = new Intent(KomponenActivity.this, SyntaxActivity5.class);
                startActivity(moveIntenttttt);
                break;
            case R.id.btn_kom55:
                String urlllll = "https://developer.android.com/guide";
                Uri webpageeeee = Uri.parse(urlllll);
                Intent intenttttt = new Intent(Intent.ACTION_VIEW, webpageeeee);
                if (intenttttt.resolveActivity(getPackageManager()) != null) {
                    startActivity(intenttttt);
                } else {
                    Log.d("ImplicitIntents", "Can't handle this intent!");
                }
                break;
        }
    }
}
