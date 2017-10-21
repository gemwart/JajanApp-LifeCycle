package com.jajan;

/**
 * Created by Firman Gemwart on 21/10/2017.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class LoginActivity extends Activity implements OnClickListener{

    private Button btnKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        btnKembali = (Button) findViewById(R.id.button1);
        btnKembali.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.equals(btnKembali)) {
            finish();
        }
    }
}
