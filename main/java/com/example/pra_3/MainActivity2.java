package com.example.pra_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Instant;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button= findViewById(R.id.btn2);
        textView=findViewById(R.id.TV3);


        Intent intent = getIntent();
        String s = intent.getStringExtra("TV");
        textView.setText(s);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity2.this,MainActivity.class);
                intent1.putExtra("TV3","data got frome page 2");
                startActivity(intent1);
                finish();
            }
        });
    }
}