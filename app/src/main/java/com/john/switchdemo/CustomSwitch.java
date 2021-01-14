package com.john.switchdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;

public class CustomSwitch extends Switch {
    public CustomSwitch(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setUpUI(context);
    }

    public CustomSwitch(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setUpUI(context);
    }

    public CustomSwitch(@NonNull Context context) {
        super(context);
        setUpUI(context);
    }

    private void setUpUI(Context context){
        setThumbDrawable(context.getDrawable(R.drawable.custom_thumb));
        setScaleX(2);
        setScaleY(2);
        setTrackDrawable(context.getDrawable(R.drawable.custom_track));
    }

}
