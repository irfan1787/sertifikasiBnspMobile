package net.bkn.mystudents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import net.bkn.mystudents.db.DbHelper;

public class BerandaActivity extends AppCompatActivity {
    TextView angka1 , angka2;
    ImageView btn1 , btn2 , btn3, btn4;
    private DbHelper dbHelper;
//    private Chasflow student;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);
        angka1 = findViewById(R.id.pemasukanid);
        angka2 = findViewById(R.id.pengeluaranid);

        btn1 = findViewById(R.id.tambahpemasukan);
        btn2 = findViewById(R.id.tambahpengeluaran);
        btn3 = findViewById(R.id.detailcash);
        btn4 = findViewById(R.id.pengaturan);

        dbHelper = new DbHelper(this);
        angka1.setText(String.format("Rp. %s",dbHelper.getSum() ));
        angka2.setText(String.format("Rp. %s",dbHelper.getKeluarSum() ));



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BerandaActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BerandaActivity.this, KeluarActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BerandaActivity.this, ListStudentsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BerandaActivity.this, SettingActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
