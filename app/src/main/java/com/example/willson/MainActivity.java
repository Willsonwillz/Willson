package com.example.willson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button komponen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        komponen=(Button) findViewById(R.id.btn_komponen);
        komponen.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_komponen:
                Intent moveIntent = new Intent(MainActivity.this,KomponenActivity.class);
                startActivity(moveIntent);
                break;
        }
    }
}
