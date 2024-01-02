package com.example.imageview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView imageView;
    Random rnd = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicked(View view) {
        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);
        int x = rnd.nextInt(3) + 1;
        button.setText(""+x);
        if (x == 1)
            imageView.setImageResource(R.drawable.image1);
        if (x == 2)
            imageView.setImageResource(R.drawable.image2);
        if (x == 3)
            imageView.setImageResource(R.drawable.image3);
    }
}