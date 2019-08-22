package com.acer.gojeklatihanintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OrderGoFoodActivity extends AppCompatActivity {
    EditText editTextNama;
    EditText editTextAlamat;
    EditText editTextPesanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_go_food);

        editTextNama = findViewById(R.id.editText_nama);
        editTextAlamat = findViewById(R.id.editText_alamat);
        editTextPesanan = findViewById(R.id.editText_pesanan);

        Button buttonOrder = findViewById(R.id.button_order);
        buttonOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence nama = editTextNama.getText();
                CharSequence alamat = editTextAlamat.getText();
                CharSequence pesanan = editTextPesanan.getText();

                Intent intent = new Intent(OrderGoFoodActivity.this, OrderGoFoodNotifActivity.class);
                intent.putExtra(OrderGoFoodNotifActivity.EXTRA_NAMA, nama);
                intent.putExtra(OrderGoFoodNotifActivity.EXTRA_ALAMAT, alamat);
                intent.putExtra(OrderGoFoodNotifActivity.EXTRA_PESANAN, pesanan);
                startActivity(intent);
            }
        });
    }
}
