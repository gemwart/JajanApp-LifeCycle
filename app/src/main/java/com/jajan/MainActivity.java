package com.jajan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

    private static String LOG = "MainActivity";

    private Button btnDua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(LOG, "onCreate");

        btnDua = (Button) findViewById(R.id.button1);
        btnDua.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(LOG, "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(LOG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(LOG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(LOG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(LOG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(LOG, "onDestroy");
    }
    @Override
    public void onClick(View v) {
        if (v.equals(btnDua)) {
            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
        }
    }
}

