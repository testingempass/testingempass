package com.mylibrary;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by Deepak on 13-02-2017.
 */


public class LibActivity extends Activity {

    public static void callLib(Activity context) {
        final Intent intent = new Intent(context, One.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        context.startActivity(intent);
    }
}
