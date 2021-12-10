package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HasilActivity extends AppCompatActivity {
    TextView txt1,txt2,txt3,txt4,txt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txt1 = findViewById(R.id.hasilnama);
        txt2 = findViewById(R.id.hasilnim);
        txt3 = findViewById(R.id.hasiltgl);
        txt4 = findViewById(R.id.hasiljenis);
        txt5 = findViewById(R.id.hasilprodi);


        String nama = getIntent().getExtras().getString("nama");
        String nim = getIntent().getExtras().getString("nim");
        String tgl = getIntent().getExtras().getString("tanggallahir");
        String jeniskelamin = getIntent().getExtras().getString("jeniskelamin");
        String prodi = getIntent().getExtras().getString("prodi");



        txt1.setText("Nama: "+nama);
        txt2.setText("Nim: "+nim);
        txt3.setText("Tanggal Lahir: "+tgl);
        txt4.setText("Jenis Kelamin: "+jeniskelamin);
        txt5.setText("Prodi: "+prodi);



    }
}