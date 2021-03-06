package com.uv.eventhandling;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

import java.lang.reflect.AccessibleObject;

public class MainActivity extends Activity {

    Button showHide;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showHide = (Button)findViewById(R.id.hideShow);
        image = (ImageView)findViewById(R.id.image);
        showHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageVisibility = image.getVisibility();
                if(imageVisibility == View.VISIBLE) {
                    String show = getString(R.string.show);
                    showHide.setText(show);
                    image.setVisibility(View.INVISIBLE);
                } else {
                    String hide = getString(R.string.hide);
                    showHide.setText(hide);
                    image.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
