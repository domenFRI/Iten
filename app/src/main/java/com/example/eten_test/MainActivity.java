package com.example.eten_test;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    public static Narocilo testno_narocilo1 = new Narocilo(1, 1, false);
    public static Narocilo testno_narocilo2 = new Narocilo(2, 1, false);
    public static Narocilo testno_narocilo3 = new Narocilo(3, 1, false);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void znotrajNarocilaCB1(View view) {
        Intent intent = new Intent(this, ZmStrankaOddajaOcene.class); //kero aktivnost klicemo

        int indeks = 1;
        intent.putExtra("idButton", indeks); //da je spremenljivka dosegljiva v drugem activityju,
        startActivity(intent);

    }

    public void znotrajNarocilaCB2(View view) {
        Intent intent = new Intent(this, ZmStrankaOddajaOcene.class);

        int indeks = 2;
        intent.putExtra("idButton", indeks);
        startActivity(intent);


    }

    public void znotrajNarocilaCB3(View view) {
        Intent intent = new Intent(this, ZmStrankaOddajaOcene.class);

        int indeks = 3;
        intent.putExtra("idButton", indeks);
        startActivity(intent);

    }

}