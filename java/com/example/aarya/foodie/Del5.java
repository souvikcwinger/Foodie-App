package com.example.aarya.foodie;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by aarya on 2/18/18.
 */

public class Del5 extends Activity {

    ImageButton men;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_del5);

        men=(ImageButton) findViewById(R.id.imageButton4);
        men.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Del5.this,MenuImageSlider.class);
                startActivity(intent);
            }
        });


    }
}