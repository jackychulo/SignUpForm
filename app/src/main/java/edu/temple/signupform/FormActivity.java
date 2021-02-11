package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.editText1);
        EditText pass = findViewById(R.id.editText2);
        TextView wuse = findViewById(R.id.inv1);
        TextView wpas = findViewById(R.id.inv2);

        Button button = findViewById(R.id.button1);

    }

}