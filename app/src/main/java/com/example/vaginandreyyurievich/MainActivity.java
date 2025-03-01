package com.example.vaginandreyyurievich;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Lifecycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Create");

        // Программная кнопка
        Button btnProg = findViewById(R.id.btn_prog);
        btnProg.setOnClickListener(v -> sendDataToActivity());
    };

    // Передача данных
    private void sendDataToActivity() {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("fio", ((EditText) findViewById(R.id.fio)).getText().toString());
        intent.putExtra("group", ((EditText) findViewById(R.id.group)).getText().toString());
        intent.putExtra("age", Integer.parseInt(((EditText) findViewById(R.id.age)).getText().toString()));
        intent.putExtra("grade", Float.parseFloat(((EditText) findViewById(R.id.grade)).getText().toString()));
        startActivity(intent);
    }

    // Для декларативной кнопки
    public void sendData(View view) {
        sendDataToActivity();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Destroy");
    }
}