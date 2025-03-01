package com.example.vaginandreyyurievich;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Locale;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        String fio = intent.getStringExtra("fio");
        String group = intent.getStringExtra("group");
        int age = intent.getIntExtra("age", 0);
        float grade = intent.getFloatExtra("grade", 0.0f);

        TextView Data = findViewById(R.id.textView2);
        Data.setText(String.format(
                Locale.getDefault(),
                "ФИО: %s\nГруппа: %s\nВозраст: %d\nОценка: %.1f",
                fio, group, age, grade
        ));
    }
}