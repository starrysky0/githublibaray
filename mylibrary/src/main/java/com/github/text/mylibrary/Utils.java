package com.github.text.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/2/27.
 */

public class Utils {
    public static void showToast(Context context){
        Toast.makeText(context, "依赖成功", Toast.LENGTH_SHORT).show();
    }
}
