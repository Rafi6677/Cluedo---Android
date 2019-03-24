package com.example.cluedo;

import android.graphics.drawable.ColorDrawable;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RadioGroupListener implements RadioGroup.OnCheckedChangeListener {

    MainActivity mainActivity;

    public RadioGroupListener(MainActivity mainActivity)
    {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        RadioButton radioButton = (RadioButton)mainActivity.findViewById(checkedId);
        int color = Integer.parseInt(radioButton.getTag().toString());

        if(color == 1) mainActivity.activeColor = 1;
        else if(color == 2) mainActivity.activeColor = 2;
        else if(color == 3) mainActivity.activeColor = 3;
        else if(color == 4) mainActivity.activeColor = 4;
        else mainActivity.activeColor = 5;
    }
}
