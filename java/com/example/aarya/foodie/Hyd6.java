package com.example.aarya.foodie;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by aarya on 2/18/18.
 */

public class Hyd6 extends Activity {

    ImageButton men;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyd6);

        men=(ImageButton) findViewById(R.id.imageButton5);
        men.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Hyd6.this,MenuImageSlider.class);
                startActivity(intent);
            }
        });


    }
}