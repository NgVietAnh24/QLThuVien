package com.example.qlthuvien;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Screen_Muon_Tra extends AppCompatActivity {
    Button btnMuon, btnTra, btnThoat;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setControl();
        setEvent();
    }

    private void setEvent() {
        btnMuon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  Chuyển sang màn hình mượn sách

            }
        });
        btnMuon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  Chuyển sang màn hình trả sách
                Intent intent = new Intent(Screen_Muon_Tra.this, TraSach.class);
                startActivity(intent);
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  Chuyển sang màn hình Chính
                Intent intent = new Intent(Screen_Muon_Tra.this, Home.class);
                startActivity(intent);
            }
        });
    }

    private void setControl() {
        btnMuon = findViewById(R.id.btnMuon);
        btnTra = findViewById(R.id.btnTra);
        btnThoat = findViewById(R.id.btnThoat);
    }
}
