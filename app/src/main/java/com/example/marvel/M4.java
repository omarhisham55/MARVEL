package com.example.marvel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//3aizen design ll profile picture el (Unknown) 3alshan tet7at gamb el listner fy M4 page 3alshan yn2a dah esm el account bta3o
public class M4 extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m4);
        button =(Button)findViewById(R.id.PlayBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_M5();
            }
        });
        Intent intent = getIntent();
        String message =intent.getStringExtra(M3.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);
    }
    public void open_M5(){
        Intent intent=new Intent(this,M5.class);
        startActivity(intent);
    }

}