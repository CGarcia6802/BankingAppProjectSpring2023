package com.example.bankapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Background_Color_Settings1 extends AppCompatActivity {
    ImageView imgView;
    TextView ColVal;
    View ColView;

    Bitmap bitmap;
    int pix = -10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background_color);
        final RelativeLayout rl = findViewById(R.id.BackGround);;
        imgView = findViewById(R.id.image_view);
        ColView = findViewById(R.id.color_view);

        imgView.setDrawingCacheEnabled(true);
        imgView.buildDrawingCache(true);
        Button home = findViewById(R.id.Go_Back_Button);
        Button accept = findViewById(R.id.acceptBackColor);
        Button account = findViewById(R.id.Account);
        Button settings = findViewById(R.id.Settings);

        imgView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN || event.getAction() == MotionEvent.ACTION_MOVE){
                    bitmap = imgView.getDrawingCache();
                    pix = bitmap.getPixel((int)event.getX(), (int)event.getY());
                    int r = Color.red(pix);
                    int g = Color.green(pix);
                    int b = Color.blue(pix);
                    ColView.setBackgroundColor(Color.rgb(r,g,b));

                }
                return true;
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Home_Page.class);
                startActivity(intent);
            }
        });

        accept.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(pix != -10) {
                    rl.setBackgroundColor(Color.rgb(Color.red(pix), Color.green(pix), Color.blue(pix)));
                }
            }
        });

        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Account.class);
                startActivity(intent);
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Settings.class);
                startActivity(intent);
            }
        });

    }
}
