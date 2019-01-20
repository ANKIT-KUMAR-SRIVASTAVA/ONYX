package com.as.ankitshubham.onyx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.as.ankitshubham.onyx.mylibrary.TextSurface;
import com.as.ankitshubham.onyx.checks.CookieThumperSample;

public class startscreen extends AppCompatActivity {
    private TextSurface textSurface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startscreen);
        textSurface = (TextSurface) findViewById(R.id.text_surface);

        textSurface.postDelayed(new Runnable() {
            @Override public void run() {
                show();
            }
        }, 1000);
        Thread background = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(11*1000);
                    Intent intent=new Intent(getBaseContext(),MainActivity.class);
                    startActivity(intent);
                    finish();

                }catch (Exception e){

                }
            }
        };
        background.start();

        //Typeface custom_font = Typeface.createFromAsset(getAssets(),"fonts/HarryP.TTF");
        //Paint paint = new Paint();
        //paint.setAntiAlias(true);
        //paint.setTypeface(custom_font);
        //findViewById(R.id.btn_refresh).setLayerPaint(paint);

        /*findViewById(R.id.btn_refresh).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent=new Intent(startscreen.this,MainActivity.class);
                startActivity(intent);
            }
        });*/
    }

    private void show() {
        textSurface.reset();
        CookieThumperSample.play(textSurface,getAssets());
    }


}