package com.example.photoframe.myphotoframe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class NoClockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_clock);
    }

    public void Show1NoClock(View view){
        Toast.makeText(getApplicationContext(), "You just clicked show 1", Toast.LENGTH_LONG)
                .show();
    }

    public void Show2NoClock(View view){
        Toast.makeText(getApplicationContext(), "You just clicked show 2", Toast.LENGTH_LONG)
                .show();
    }

    public void Show3NoClock(View view){
        Toast.makeText(getApplicationContext(), "You just clicked show 3", Toast.LENGTH_LONG)
                .show();
    }

    public void goToClock(View view){
        Intent intent = new Intent(this, ClockActivity.class);
        startActivity(intent);
    }
}
