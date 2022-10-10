package com.if3b.pindahlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnpindah;
    EditText et_nama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("layout A");


        btnpindah = findViewById(R.id.btn_pindah);
        et_nama = findViewById(R.id.et_nama);

        btnpindah.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                String Nama = et_nama.getText().toString();

                if (Nama.trim().equals("")) {
                    et_nama.setError("Nama Tidak Boleh Kosong");
                }
                else {
                    Intent pindah = new Intent(MainActivity.this, SecondActivity.class);
                    pindah.putExtra("inputNama", Nama);
                    startActivity(pindah);

                }
            }

        });

    }
}