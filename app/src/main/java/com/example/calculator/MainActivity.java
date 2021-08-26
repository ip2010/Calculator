package com.example.calculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity_Log";
    private float valueFloat1, valueFloat2;
    private String valueString = "";
    private TextView result;
    private int plus, minus, multi, split;

    private void buidCount(String key) {
        valueString = valueString + key;
        result.setText(valueString);
    }

    private void addOperation(String key) {
        if (key == "+") plus = 1;
        if (key == "-") minus = 1;
        if (key == "*") multi = 1;
        if (key == "/") split = 1;
        valueFloat1 = Float.parseFloat(valueString);
        valueString = "";
        log(key);
    }

    private void equalOperation() {
        valueFloat2 = Float.parseFloat(valueString);
        result();
    }

    private void result() {
        if (plus == 1) {
            result.setText(String.valueOf(valueFloat1 + valueFloat2));
        }
        ;
        if (minus == 1) {
            result.setText(String.valueOf(valueFloat1 - valueFloat2));
        }
        ;
        if (multi == 1) {
            result.setText(String.valueOf(valueFloat1 * valueFloat2));
        }
        ;
        if (split == 1) {
            result.setText(String.valueOf(valueFloat1 / valueFloat2));
        }
        ;
        valueFloat1 = 0;
        valueFloat2 = 0;
        valueString = "";

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);

        findViewById(R.id.key_0).setOnClickListener(this);
        findViewById(R.id.key_1).setOnClickListener(this);
        findViewById(R.id.key_2).setOnClickListener(this);
        findViewById(R.id.key_3).setOnClickListener(this);
        findViewById(R.id.key_4).setOnClickListener(this);
        findViewById(R.id.key_5).setOnClickListener(this);
        findViewById(R.id.key_6).setOnClickListener(this);
        findViewById(R.id.key_7).setOnClickListener(this);
        findViewById(R.id.key_8).setOnClickListener(this);
        findViewById(R.id.key_9).setOnClickListener(this);
        findViewById(R.id.key_dot).setOnClickListener(this);
        findViewById(R.id.key_equals).setOnClickListener(this);
        findViewById(R.id.key_summ).setOnClickListener(this);
        findViewById(R.id.key_split).setOnClickListener(this);
        findViewById(R.id.key_minus).setOnClickListener(this);
        findViewById(R.id.key_multi).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.key_0) {
            buidCount("0");
        }
        if (v.getId() == R.id.key_1) {
            buidCount("1");
        }
        if (v.getId() == R.id.key_2) {
            buidCount("2");
        }
        if (v.getId() == R.id.key_3) {
            buidCount("3");
        }
        if (v.getId() == R.id.key_4) {
            buidCount("4");
        }
        if (v.getId() == R.id.key_5) {
            buidCount("5");
        }
        if (v.getId() == R.id.key_6) {
            buidCount("6");
        }
        if (v.getId() == R.id.key_7) {
            buidCount("7");
        }
        if (v.getId() == R.id.key_8) {
            buidCount("8");
        }
        if (v.getId() == R.id.key_9) {
            buidCount("9");
        }
        if (v.getId() == R.id.key_dot) {
            buidCount(".");
        }
        if (v.getId() == R.id.key_equals) {
            equalOperation();
        }
        if (v.getId() == R.id.key_minus) {
            addOperation("-");
        }
        if (v.getId() == R.id.key_summ) {
            addOperation("+");
        }
        if (v.getId() == R.id.key_split) {
            addOperation("/");
        }
        if (v.getId() == R.id.key_multi) {
            addOperation("*");
        }
    }

    private void log(String message) {
        Log.d(TAG, message);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}