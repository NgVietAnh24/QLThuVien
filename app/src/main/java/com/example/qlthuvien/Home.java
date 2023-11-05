package com.example.qlthuvien;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    ImageButton ibtnUser, ibtnMuonTra, ibtnSach, ibtnThe, ibtnThongKe, ibtnTimSach;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setControl();
        setEvent();
    }

    private void setEvent() {
        ibtnMuonTra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang màn hình mượn sách - trả sách
                Intent intent = new Intent(Home.this, Screen_Muon_Tra.class);
                startActivity(intent);
            }
        });
    }

    private void setControl() {
        ibtnUser = findViewById(R.id.ibtnUser);
        ibtnMuonTra = findViewById(R.id.ibtnMuonTra);
        ibtnSach = findViewById(R.id.ibtnSach);
        ibtnThe = findViewById(R.id.ibtnThe);
        ibtnThongKe = findViewById(R.id.ibtnThongKe);
        ibtnTimSach = findViewById(R.id.ibtnTimSach);
    }
}
