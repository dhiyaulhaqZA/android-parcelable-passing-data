package com.dhiyaulhaqza.passingdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {

    private TextView tvNim;
    private TextView tvNama;
    private TextView tvJurusan;
    private TextView tvAlamat1;
    private TextView tvAlamat2;
    private TextView tvAlamat3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setTitle("Profile");

        Profile profile = getIntent().getParcelableExtra("key_profile");

        tvNim = (TextView) findViewById(R.id.tv_nim);
        tvNama = (TextView) findViewById(R.id.tv_nama);
        tvJurusan = (TextView) findViewById(R.id.tv_jurusan);
        tvAlamat1 = (TextView) findViewById(R.id.tv_alamat1);
        tvAlamat2 = (TextView) findViewById(R.id.tv_alamat2);
        tvAlamat3 = (TextView) findViewById(R.id.tv_alamat3);

        if (profile != null) {
            tvNim.setText(String.valueOf(profile.getNim()));
            tvNama.setText(profile.getNama());
            tvJurusan.setText(profile.getJurusan());
            ArrayList<String> alamat = new ArrayList<>();
            alamat.addAll(profile.getAlamat());
            tvAlamat1.setText(alamat.get(0));
            tvAlamat2.setText(alamat.get(1));
            tvAlamat3.setText(alamat.get(2));
        }
    }
}
