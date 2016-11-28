package com.por.watermelon.mylibrary.utils;


import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.TextView;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.blankj.utilcode.utils.NetworkUtils;
import com.blankj.utilcode.utils.SnackbarUtils;
import com.blankj.utilcode.utils.ToastUtils;

/**
 * Created by Watermelon on 2016/11/15.
 */

public class MyNetworkUtils {

    public static boolean isNetworkConnect(Context context) {
        if (!NetworkUtils.isConnected(context)) {
            showNetworkDialog(context);
            return false;
        } else if (!NetworkUtils.isAvailableByPing(context)) {
            ToastUtils.showShortToast(context, "您的网络异常，请先检查网络连接！");
            return false;
        } else {
            return true;
        }
    }

    public static void showNetworkDialog(final Context context) {
        new MaterialDialog.Builder(context)
                .title("网络设置")
                .content("您的网络连接未打开，是否前去设置网络！")
                .canceledOnTouchOutside(false)
                .negativeText("是")
                .positiveText("否")
                .onNegative(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        NetworkUtils.openWirelessSettings(context);
                    }
                })
                .show();
    }
}
