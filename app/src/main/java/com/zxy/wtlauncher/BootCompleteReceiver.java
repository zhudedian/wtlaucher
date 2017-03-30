package com.zxy.wtlauncher;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class BootCompleteReceiver extends BroadcastReceiver {
    public BootCompleteReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast toast = Toast.makeText(context,"建議搭配無線滑鼠會有更好的體驗！", Toast.LENGTH_LONG);
        LinearLayout linearLayout = (LinearLayout) toast.getView();
        TextView messageTextView = (TextView) linearLayout.getChildAt(0);
        messageTextView.setTextSize(33);
        toast.setGravity(Gravity.TOP , 0, 50);
        toast.show();
    }
}
