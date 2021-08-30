package com.example.calculator;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;

public class ClickChecker {
    private float valueFloat1;
    private float valueFloat2;
    private String stringToResult;
    private String tmpValueString;
    private int plus;
    private int minus;
    private int multi;
    private int split;
    private TextView result;
    private TextView store;

    public ClickChecker(TextView result, TextView store) {
        this.result = result;
        this.store = store;
        tmpValueString = "";
        stringToResult = "";
        valueFloat1 = 0;
        valueFloat2 = 0;
        plus = 0;
        minus = 0;
        multi = 0;
        split = 0;
    }

    @SuppressLint("SetTextI18n")
    public void buidCount(View v) {
        if (v.getId() == R.id.key_0) {
            tmpValueString = tmpValueString + "0";
            result.setText(stringToResult + tmpValueString);
        }
        if (v.getId() == R.id.key_1) {
            tmpValueString = tmpValueString + "1";
            result.setText(stringToResult + tmpValueString);
        }
        if (v.getId() == R.id.key_2) {
            tmpValueString = tmpValueString + "2";
            result.setText(stringToResult + tmpValueString);
        }
        if (v.getId() == R.id.key_3) {
            tmpValueString = tmpValueString + "3";
            result.setText(stringToResult + tmpValueString);
        }
        if (v.getId() == R.id.key_4) {
            tmpValueString = tmpValueString + "4";
            result.setText(stringToResult + tmpValueString);
        }
        if (v.getId() == R.id.key_5) {
            tmpValueString = tmpValueString + "5";
            result.setText(stringToResult + tmpValueString);
        }
        if (v.getId() == R.id.key_6) {
            tmpValueString = tmpValueString + "6";
            result.setText(stringToResult + tmpValueString);
        }
        if (v.getId() == R.id.key_7) {
            tmpValueString = tmpValueString + "7";
            result.setText(stringToResult + tmpValueString);
        }
        if (v.getId() == R.id.key_8) {
            tmpValueString = tmpValueString + "8";
            result.setText(stringToResult + tmpValueString);
        }
        if (v.getId() == R.id.key_9) {
            tmpValueString = tmpValueString + "9";
            result.setText(stringToResult + tmpValueString);
        }
        if (v.getId() == R.id.key_dot) {
            tmpValueString = tmpValueString + ".";
            result.setText(stringToResult + tmpValueString);
        }
        if (v.getId() == R.id.key_equals) {
            equalOperation();
        }
        if (v.getId() == R.id.key_minus) {
            addOperation(result, "-");
        }
        if (v.getId() == R.id.key_summ) {
            addOperation(result, "+");
        }
        if (v.getId() == R.id.key_split) {
            addOperation(result, "/");
        }
        if (v.getId() == R.id.key_multi) {
            addOperation(result, "*");
        }
    }

    public void addOperation(TextView result, String key) {
        if (key.equals("+")) plus = 1;
        if (key.equals("-")) minus = 1;
        if (key.equals("*")) multi = 1;
        if (key.equals("/")) split = 1;
        valueFloat1 = Float.parseFloat(tmpValueString);
        stringToResult = stringToResult + tmpValueString + key;
        result.setText(stringToResult);
        tmpValueString = "";
    }

    public void equalOperation() {
        valueFloat2 = Float.parseFloat(tmpValueString);
        stringToResult = stringToResult + tmpValueString + "=";
        result();

    }

    public void result() {
        String res = null;
        float tmpres = 0;

        if (plus == 1) {
            tmpres = valueFloat1 + valueFloat2;
            res = Float.toString(valueFloat1) + "+" + Float.toString(valueFloat2) + "=" + Float.toString(tmpres);
        }
        if (minus == 1) {
            tmpres = valueFloat1 - valueFloat2;
            res = Float.toString(valueFloat1) + "-" + Float.toString(valueFloat2) + "=" + Float.toString(tmpres);
        }
        if (multi == 1) {
            tmpres = valueFloat1 * valueFloat2;
            res = Float.toString(valueFloat1) + "*" + Float.toString(valueFloat2) + "=" + Float.toString(tmpres);
        }
        if (split == 1) {
            tmpres = valueFloat1 / valueFloat2;
            res = Float.toString(valueFloat1) + "/" + Float.toString(valueFloat2) + "=" + Float.toString(tmpres);
        }
        result.setText("0");
        store.setText(res);
        valueFloat1 = 0;
        valueFloat2 = 0;
        plus = 0;
        minus = 0;
        multi = 0;
        split = 0;
        tmpValueString = "";
        stringToResult = "";

    }

}

