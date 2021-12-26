package com.aloke.libraries.signaturepad.ui.viewHelper;

import android.os.Build;
import android.view.View;

public class ViewCompat {


    public static boolean isLaidOut(View view) {
        // Future (API19+)...
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        // Legacy...
        return view.getWidth() > 0 && view.getHeight() > 0;
    }
}