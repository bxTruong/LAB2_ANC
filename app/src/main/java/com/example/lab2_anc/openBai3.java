package com.example.lab2_anc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class openBai3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_bai3);

        final EditText edt=findViewById(R.id.edtnhap3);
        Button btn=findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edt1 = edt.getText().toString().trim();
                if (edt1.equals("")) {
                    Toast.makeText(openBai3.this, "Không Được Để Trống", Toast.LENGTH_SHORT).show();
                } else {
                    if (edt1.length() < 9 || edt1.length() > 9 ) {
                        Toast.makeText(openBai3.this, "Nhập Vào Đủ 9 Ký Tự", Toast.LENGTH_SHORT).show();
                    } else {
                        if (edt1.startsWith("MEM") == true || edt1.startsWith("VIP") == true) {
                            if (edt1.equals("MEM537128") || edt1.equals("MEM537129") || edt1.equals("VIP537128") || edt1.equals("VIP537129")) {
                                Intent intent = new Intent();
                                intent.putExtra("name", edt1);
                                intent.setAction("fppoly.android.CUSTOM_INTENT2");
                                sendBroadcast(intent);
                            } else {
                                Toast.makeText(openBai3.this, "Không Có Mã Giảm Giá Này", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(openBai3.this, "Chuỗi Nhập Bắt Đầu Với MEM Hoặc ViP", Toast.LENGTH_SHORT).show();

                        }

                    }
                }
            }
        });
    }
}
