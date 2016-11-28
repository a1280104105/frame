package com.por.watermelon.mylibrary.utils;

import android.content.Context;

import com.afollestad.materialdialogs.MaterialDialog;

/**
 * Created by Watermelon on 2016/11/15.
 */

public class ShowDialogsUtil {

    public static MaterialDialog waitdialog;


    public static void showWaitDialog(Context context) {
        waitdialog = new MaterialDialog.Builder(context)
                .title("加载中")
                .content("请稍等...")
                .progress(true, 0)
                .canceledOnTouchOutside(false)
                .show();
    }

    public static void showForceDialog(Context context) {
        waitdialog = new MaterialDialog.Builder(context)
                .title("加载中")
                .content("请稍等...")
                .progress(true, 0)
                .canceledOnTouchOutside(false)
                .cancelable(false)
                .show();
    }

    public static void closeWaitDialog() {
        if (null != waitdialog) {
            waitdialog.dismiss();
        }
    }


}
