package com.rk.actv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView ACTV_Contoh_IDJAVA;
    TextView TV_Contoh_IDJAVA;
    String[] Inputs = {"Rizky Khapidsyah",
            "Bambang Aditya",
            "Meliana Sari",
            "Suprayitno",
            "Inna Sukma Yanti",
            "Manusia Super"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ACTV_Contoh_IDJAVA = findViewById(R.id.ACTV_Contoh_IDXML);
        TV_Contoh_IDJAVA = findViewById(R.id.TV_Contoh_IDXML);

        TV_Contoh_IDJAVA.setText("Teks Input :\nRizky Khapidsyah\nBambang Aditya\nMeliana Sari\nSuprayitno\nInna Sukma Yanti\nManusia Super");

        ArrayAdapter<String> AdapterACTV = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Inputs);
        ACTV_Contoh_IDJAVA.setAdapter(AdapterACTV);

    }
}
