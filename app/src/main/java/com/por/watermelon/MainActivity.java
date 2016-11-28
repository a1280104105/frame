package com.por.watermelon;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;

import com.blankj.utilcode.utils.BarUtils;
import com.blankj.utilcode.utils.EmptyUtils;
import com.por.watermelon.mylibrary.utils.MyNetworkUtils;
import com.por.watermelon.mylibrary.utils.ShowDialogsUtil;

public class MainActivity extends Activity {
    Context mcontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mcontext = this;
//        BarUtils.setTransparentStatusBar(this);
        MyNetworkUtils.isNetworkConnect(mcontext);
//        ShowDialogsUtil.showForceDialog(this);
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                ShowDialogsUtil.closeWaitDialog();
//            }
//        }, 5000);

    }
}
