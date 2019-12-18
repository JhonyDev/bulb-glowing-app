package com.example.bulbglowing;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ImageView blb;
    private ToggleButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blb=findViewById(R.id.bulb);
        btn=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TransitionDrawable drawable =(TransitionDrawable) blb.getDrawable();
                if(btn.isChecked()){
                    drawable.startTransition(1000);
                }else{
                    drawable.reverseTransition(1000);
                }



            }
        });


    }
}
