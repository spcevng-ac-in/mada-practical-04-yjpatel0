package com.example.pra_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= findViewById(R.id.btn);
        textView = findViewById(R.id.TV);
        textView = findViewById(R.id.TV4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("TV"," data got frome page 1 ");
                startActivity(intent);
            }
        });
        Intent revIntent = getIntent();
        String str = revIntent.getStringExtra("TV3");
        textView.setText(str);



    }
}