package com.example.qlthuvien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView tvMaHD, tvTenSach, tvMaSach, tvDanhMuc, tvSoTrang, tvGia, tvTacGia, tvTenNXB, tvLanguage, tvNV, tvSL, tvNXB, tvCC;
    EditText edtMaHD, edtTenSach, edtMaSach, edtDanhMuc, edtSoTrang, edtGia, edtTacGia, edtSL, edtNXB;
    Spinner spTenNXB, spLanguage, spNV, spCC;
    Button btnThem, btnBack, btnThoat;
    List<String> data_s = new ArrayList<>();
    ArrayAdapter adapter_s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }

    private void setEvent() {
        KhoiTao();
        adapter_s = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data_s);
        spTenNXB.setAdapter(adapter_s);
//        spLanguage.setAdapter(adapter_s);
//        spNV.setAdapter(adapter_s);
//        spCC.setAdapter(adapter_s);

    }
    private void KhoiTao(){
        data_s.add("Nhà xuất bản Kim Đồng");
    }
    private void setControl() {
        tvMaHD = findViewById(R.id.tvMaHD);
        tvTenSach = findViewById(R.id.tvTenSach);
        tvMaSach = findViewById(R.id.tvMaSach);
        tvDanhMuc = findViewById(R.id.tvDanhMuc);
        tvSoTrang = findViewById(R.id.tvSoTrang);
        tvGia = findViewById(R.id.tvGia);
        tvTacGia = findViewById(R.id.tvGia);
        tvTenNXB = findViewById(R.id.tvTenNXB);
        tvLanguage = findViewById(R.id.tvLanguage);
        tvNV = findViewById(R.id.tvNV);
        tvSL = findViewById(R.id.tvSL);
        tvNXB = findViewById(R.id.tvNXB);
        tvCC = findViewById(R.id.tvCC);
        edtMaHD = findViewById(R.id.edtMaHD);
        edtTenSach = findViewById(R.id.edtTenSach);
        edtMaSach = findViewById(R.id.edtMaSach);
        edtDanhMuc = findViewById(R.id.edtDanhMuc);
        edtSoTrang = findViewById(R.id.edtSoTrang);
        edtGia = findViewById(R.id.edtGia);
        edtTacGia = findViewById(R.id.edtTacGia);
        edtSL = findViewById(R.id.edtSL);
        edtNXB = findViewById(R.id.edtNXB);
        spTenNXB = findViewById(R.id.spTenNXB);
        spLanguage = findViewById(R.id.spLanguage);
        spNV = findViewById(R.id.spNV);
        spCC = findViewById(R.id.spCC);
        btnThem = findViewById(R.id.btnThem);
        btnBack = findViewById(R.id.btnBack);
        btnThoat = findViewById(R.id.btnThoat);
    }
}