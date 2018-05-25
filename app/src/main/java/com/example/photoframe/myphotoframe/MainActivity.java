package com.example.photoframe.myphotoframe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToClock(View view){
        Intent intent = new Intent(this, ClockActivity.class);
        startActivity(intent);
    }

    public void goToNoClock(View view){
        Intent intent = new Intent(this, NoClockActivity.class);
        startActivity(intent);
    }

    public void On(View view){
        Toast.makeText(getApplicationContext(), "You just clicked ON", Toast.LENGTH_LONG)
                .show();
    }

    public void Off(View view){
        Toast.makeText(getApplicationContext(), "You just clicked OFF", Toast.LENGTH_LONG)
                .show();
    }

    public void Show1Clock(View view){
        Toast.makeText(getApplicationContext(), "You just clicked show 1", Toast.LENGTH_LONG)
                .show();
    }

    public void Show2Clock(View view){
        Toast.makeText(getApplicationContext(), "You just clicked show 2", Toast.LENGTH_LONG)
                .show();
    }

    public void Show3Clock(View view){
        Toast.makeText(getApplicationContext(), "You just clicked show 3", Toast.LENGTH_LONG)
                .show();
    }



}
