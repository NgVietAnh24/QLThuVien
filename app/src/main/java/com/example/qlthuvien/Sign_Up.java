package com.example.qlthuvien;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Sign_Up extends AppCompatActivity {
    EditText edtUserName, edtConfirmPassword, edtPassWord;
    Button btnCancel, btnSignUp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setControl();
        setEvent();
    }

    private void setEvent() {
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kiểm tra tên người dùng và mật khẩu
                String username = edtUserName.getText().toString();
                String password = edtPassWord.getText().toString();
                String confirmPassword = edtConfirmPassword.getText().toString();
                // Kiểm tra điều kiện khi nhập thông tin
                if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    Toast.makeText(Sign_Up.this, "Vui lòng điền đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                } else if (!password.equals(confirmPassword)) {
                    Toast.makeText(Sign_Up.this, "Mật khẩu không khớp", Toast.LENGTH_SHORT).show();
                } else {
                    // Đăng ký thành công
                    Toast.makeText(Sign_Up.this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();

                    // Chuyển sang màn hình đăng nhập
                    Intent intent = new Intent(Sign_Up.this, Login.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void setControl() {
        edtUserName = findViewById(R.id.edtUserName);
        edtConfirmPassword = findViewById(R.id.edtConfirmPassword);
        edtPassWord = findViewById(R.id.edtPassword);
        btnSignUp = findViewById(R.id.btnSignUp);
        btnCancel = findViewById(R.id.btnCancel);
    }
}
