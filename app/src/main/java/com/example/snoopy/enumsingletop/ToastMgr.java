package com.example.snoopy.enumsingletop;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by snoopy on 2016/9/5.
 */

public enum ToastMgr {
    builder;

    private Toast toast;
   private Context context;
    /**
     * 初始化Toast
     * @param context
     */
    public void init(Context context){

        this.context =context;
        toast = Toast.makeText(context, "", Toast.LENGTH_SHORT);
    }
    /**
     * 显示Toast
     * @param content
     */
    public void display(CharSequence content ){

        toast.setText(content);
        toast.show();
    }
}

