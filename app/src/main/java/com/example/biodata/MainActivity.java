package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText namaKamu;
    EditText nim;
    EditText tgl;
    RadioGroup radio;
    RadioButton perempuan;
    Spinner programs;
    TextView tp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        namaKamu = findViewById(R.id.namaKamu);
        nim = findViewById(R.id.nim);
        tgl = findViewById(R.id.tgl);

        radio = findViewById(R.id.radio);

        programs = findViewById(R.id.programs);
        tp = findViewById(R.id.tp);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.nama_prodi, android.R.layout.simple_spinner_dropdown_item);
        programs.setAdapter(adapter);
        programs.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
        String programstudi = parent.getItemAtPosition(position).toString();
        tp.setText(String.valueOf(programstudi));

}
    @Override
    public void onNothingSelected(AdapterView<?> parent){
    }

    public void kirimdata(View view){
        int idradio = radio.getCheckedRadioButtonId();
        perempuan = findViewById(idradio);

        Intent i1 = new Intent(this,HasilActivity.class);
        i1.putExtra("nama",namaKamu.getText().toString());
        i1.putExtra("nim",nim.getText().toString());
        i1.putExtra("tanggal",tgl.getText().toString());
        i1.putExtra("jeniskelamin",perempuan.getText().toString());
        i1.putExtra("prodi",programs.getSelectedItem().getClass());
        startActivity(i1);





    }
}