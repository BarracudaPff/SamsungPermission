package com.samsung.barracudapff.samsung3;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;

public class MainActivity2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences.Editor editor = getBaseContext().getSharedPreferences("pref", MODE_PRIVATE).edit();

        editor.putBoolean(getString(R.string.notification), true);
        editor.putFloat(getString(R.string.brght), 0.34f);
        editor.apply();

        getBaseContext().getSharedPreferences("pref", MODE_PRIVATE).getFloat(getString(R.string.brght),0);



    }
}
