package com.gavhane.b.vivek.a9blinksample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    TextView t1,t2;
    Animation fdin,fdout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.btn_fadein);
        t1 = (TextView) findViewById(R.id.tv_fadein);

        b2 = (Button) findViewById(R.id.btn_fadeout);
        t2 = (TextView) findViewById(R.id.tv_fadeout);

        fdin = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);           //Name of XML is passed here
        fdout = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setVisibility(View.VISIBLE);
                t1.startAnimation(fdin);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setVisibility(View.VISIBLE);
                t2.startAnimation(fdout);
            }
        });

//similarly we can set animation for blink

    }
}
