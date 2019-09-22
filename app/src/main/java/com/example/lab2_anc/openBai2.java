package com.example.lab2_anc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class openBai2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_bai2);

        final EditText edt=findViewById(R.id.edtNhap);
        Button btn=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra("name",edt.getText().toString().trim());
                intent.setAction("fppoly.android.CUSTOM_INTENT");
                sendBroadcast(intent);
            }
        });

    }
}
