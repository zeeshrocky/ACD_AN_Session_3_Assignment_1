package com.example.admin.hidenshow;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         final Button b=(Button)findViewById(R.id.button);
         final TextView t=(TextView)findViewById(R.id.textimg);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b.getText().equals("Hide")){

                    t.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
                    b.setText("Show");

                }
                else {

                    t.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ic_location_city_black_24dp, 0, 0, 0);
                    b.setText("Hide");
                }
            }
        });
    }
}