package com.udacity.android.portfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    Context context;
    static Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
    }

    public void displayToast(String text) {
        if (toast != null)
            toast.cancel();

        toast.makeText(context, "This button will launch " + text + " App!", Toast.LENGTH_SHORT).show();
    }

    public void ShowToast(View view) {
        //Switch based on button ID
        //Currently they all call displayToast - later they might launch intents
        switch(view.getId()) {
            case R.id.btnSpotify:
            case R.id.btnScores:
            case R.id.btnLibrary:
            case R.id.btnBigger:
            case R.id.btnReader:
            case R.id.btnCapstone:
                displayToast(((Button)view).getText().toString());
                break;
            default:
                break;
        }
    }
}
