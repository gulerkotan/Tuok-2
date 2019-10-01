package com.example.deneme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class KayitOl extends AppCompatActivity {

    private Button btnSivil;
    private Button btnEngelli;
    private Button btnYasli;
    private Button btnOgrenci;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayit_ol);

        btnSivil = (Button) findViewById(R.id.btn_kayit);
        btnSivil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent kayit = new Intent(KayitOl.this, KayitSivilActivity.class);
                startActivity(kayit);
                //sivil tuşununun aktivesi
            }
        });

        btnYasli = (Button) findViewById(R.id.btn_kayit);
        btnYasli.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent kayit = new Intent(KayitOl.this, KayitAyricalikliActivity.class);
                startActivity(kayit);
                //yaşlı tuşununun aktivesi
            }
        });
    }


}
