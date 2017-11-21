package com.ovitrif.myappjv;

import android.content.Context;
import android.widget.Toast;

public class Utils implements MyI {

    private final Context context;

    public Utils(Context context) {
        this.context = context;
    }

    @Override
    public void showToast() {
        Toast toast = Toast.makeText(context, "Hello there", Toast.LENGTH_LONG);
        toast.show();
    }
}
