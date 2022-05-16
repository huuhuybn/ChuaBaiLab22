package com.dotplays.chuabailab22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText oNhapThuNhat;
    EditText oNhapThuHai;
    TextView hienThiKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oNhapThuNhat = findViewById(R.id.editTextNumber3);
        oNhapThuHai = findViewById(R.id.editTextNumber4);
        hienThiKetQua = findViewById(R.id.tvKetQua);


    }


    public void tinhTong(View v){

        // lấy giá trị nhập từ 2 ô nhập
        String soThu1 = oNhapThuNhat.getText().toString();
        String soThu2 = oNhapThuHai.getText().toString();
        // tính tổng
        int so1 = Integer.parseInt(soThu1);
        int so2 = Integer.parseInt(soThu2);
        int tong = so1 + so2;

        // hiển thị lên textView
        String ketqua = String.valueOf(tong);
        hienThiKetQua.setText(ketqua);

        Intent chuyenManHinh =
                new Intent(MainActivity.this,SubActivity.class);
        
        chuyenManHinh.putExtra("kq",ketqua);
        startActivity(chuyenManHinh);

    }
}