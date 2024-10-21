package com.example.a3d;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Используем наш класс HouseView для отображения дома
        HouseView houseView = new HouseView(this);
        setContentView(houseView);


    }
}
