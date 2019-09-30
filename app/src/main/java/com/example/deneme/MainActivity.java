package com.example.deneme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnKayit;
    private Button btnGiris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKayit = (Button) findViewById(R.id.btn_kayit);
        btnKayit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent kayit = new Intent(MainActivity.this, KayitOl.class);
                startActivity(kayit);
                //kayıt ol tuşununun aktivesi
            }
        });


        btnGiris = (Button) findViewById(R.id.btn_giris);
        btnGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent giris = new Intent(MainActivity.this, GirisActivity.class);
                startActivity(giris);
                //giriş tuşununun aktivesi
            }
        });

    }
}
