package com.dhiyaulhaqza.passingdata;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText etNim;
    private EditText etNama;
    private EditText etJurusan;
    private EditText etAlamat1;
    private EditText etAlamat2;
    private EditText etAlamat3;
    private Button btnSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNim = (EditText) findViewById(R.id.et_nim);
        etNama = (EditText) findViewById(R.id.et_nama);
        etJurusan = (EditText) findViewById(R.id.et_jurusan);
        etAlamat1 = (EditText) findViewById(R.id.et_alamat1);
        etAlamat2 = (EditText) findViewById(R.id.et_alamat2);
        etAlamat3 = (EditText) findViewById(R.id.et_alamat3);
        btnSignUp = (Button) findViewById(R.id.btn_sign_up);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("key_profile", passProfile());
                startActivity(intent);
            }
        });
    }

    private Profile passProfile() {
        Profile profile = new Profile();
        ArrayList<String> alamat = new ArrayList<>();
        profile.setNim(Integer.parseInt(etNim.getText().toString()));
        profile.setNama(etNama.getText().toString());
        profile.setJurusan(etJurusan.getText().toString());

        alamat.add(etAlamat1.getText().toString());
        alamat.add(etAlamat2.getText().toString());
        alamat.add(etAlamat3.getText().toString());

        profile.setAlamat(alamat);

        return profile;
    }
}
