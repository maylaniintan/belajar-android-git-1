package yoga.fajar.simpleapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static yoga.fajar.simpleapplication.R.layout.activity_main3;

public class MainActivity extends AppCompatActivity {
    private Button fragment, activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity=(Button) findViewById(R.id.activity);
        fragment = (Button) findViewById(R.id.fragment);

        //fragment
        fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().add(R.id.frame, new Main3Activity()).commit();
            }
        });

        //activity
        activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(i);
            }
        });

    }
}
