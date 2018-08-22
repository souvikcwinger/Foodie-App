package com.example.aarya.foodie;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by aarya on 2/18/18.
 */

public class Go10 extends Activity {

    ImageButton men;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go10);

        men=(ImageButton) findViewById(R.id.imageButton9);
        men.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Go10.this,MenuImageSlider.class);
                startActivity(intent);
            }
        });


    }
}