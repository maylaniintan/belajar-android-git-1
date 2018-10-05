package yoga.fajar.simpleapplication;

import android.content.Intent;
import android.os.Handler;
import android.preference.Preference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import yoga.fajar.simpleapplication.util.PreferencesHelper;

public class Splashscreen extends AppCompatActivity {
    PreferencesHelper instance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        instance = PreferencesHelper.getInstance(getApplicationContext());
        int splashInterval = 10;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (!instance.isLogin()) {
                    startActivity(new Intent(Splashscreen.this, LoginActivity.class));
                } else {
                    startActivity(new Intent(Splashscreen.this, MainActivity.class));
                }
            }, splashInterval);
    }
}

