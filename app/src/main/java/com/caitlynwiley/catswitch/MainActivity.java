package com.caitlynwiley.catswitch;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private boolean showingCat = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchCats(View view) {
        ImageView image = (ImageView) findViewById(R.id.catImage);
        if (showingCat) {
            image.setImageDrawable(getResources().getDrawable(R.drawable.cat2));
            showingCat = false;
        } else {
            image.setImageDrawable(getResources().getDrawable(R.drawable.cat));
            showingCat = true;
        }
    }
}
