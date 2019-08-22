package com.acer.gojeklatihanintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OrderGoFoodNotifActivity extends AppCompatActivity {
    TextView textNama;
    TextView textAlamat;
    TextView textPesanan;
    public static final String EXTRA_NAMA = "nama";
    public static final String EXTRA_ALAMAT = "alamat";
    public static final String EXTRA_PESANAN = "pesanan";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_go_food_notif);

        textNama = findViewById(R.id.text_hasil_nama);
        textAlamat = findViewById(R.id.text_hasil_alamat);
        textPesanan = findViewById(R.id.text_hasil_pesanan);

        Bundle bundle = getIntent().getExtras();

        textNama.setText(bundle.getCharSequence(EXTRA_NAMA));
        textAlamat.setText(bundle.getCharSequence(EXTRA_ALAMAT));
        textPesanan.setText(bundle.getCharSequence(EXTRA_PESANAN));

        Button button = findViewById(R.id.button_cancel_order);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OrderGoFoodNotifActivity.this, MainActivity.class));
            }
        });
    }
}
