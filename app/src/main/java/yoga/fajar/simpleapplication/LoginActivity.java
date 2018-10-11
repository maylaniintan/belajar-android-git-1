package yoga.fajar.simpleapplication;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.prefs.Preferences;

import yoga.fajar.simpleapplication.util.PreferencesHelper;

import static android.Manifest.permission.READ_CONTACTS;

import yoga.fajar.simpleapplication.util.PreferencesHelper;

public class LoginActivity extends AppCompatActivity  {

    PreferencesHelper instance;
    private EditText name;
    private EditText email;
    private Button button;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        instance = PreferencesHelper.getInstance(getApplicationContext());

        name = (EditText) findViewById(R.id.etNama);
        email = (EditText) findViewById(R.id.etEmail);
        button = (Button) findViewById(R.id.button);
    }

    public void Login (View view) {
        String n = name.getText().toString();
        String e = email.getText().toString();
        Toast.makeText(getApplicationContext(),"Succes Login",Toast.LENGTH_SHORT).show();
        instance.setLogin(true);
        instance.setName(n);

        Intent intent = new Intent(LoginActivity.this,MainActivity.class);
        intent.putExtra(KEY_NAME, n);
        startActivity(intent);
    }


}

