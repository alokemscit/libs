package com.aloke.libraries.signaturepad.ui.viewHelper;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewTreeObserver;

public class ViewTreeObserverCompat {


    @SuppressLint("NewApi")
    @SuppressWarnings("deprecation")
    public static void removeOnGlobalLayoutListener(ViewTreeObserver observer, ViewTreeObserver.OnGlobalLayoutListener victim) {
        // Future (API16+)...
        if (Build.VERSION.SDK_INT >= 16) {
            observer.removeOnGlobalLayoutListener(victim);
        }
        // Legacy...
        else {
            observer.removeGlobalOnLayoutListener(victim);
        }
    }
}
