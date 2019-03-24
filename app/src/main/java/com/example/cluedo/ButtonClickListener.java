package com.example.cluedo;

import android.view.View;

public class ButtonClickListener implements View.OnClickListener {

    private MainActivity mainActivity;
    int i, j;

    public ButtonClickListener(MainActivity mainActivity, int i, int j)
    {
        this.mainActivity = mainActivity;
        this.i = i;
        this.j = j;
    }

    @Override
    public void onClick(View v) {

        switch (mainActivity.activeColor)
        {
            case 1: mainActivity.buttons[i][j].setBackgroundColor(mainActivity.buttons[i][j].getContext().getResources().getColor(R.color.green));
                break;
            case 2: mainActivity.buttons[i][j].setBackgroundColor(mainActivity.buttons[i][j].getContext().getResources().getColor(R.color.red));
                break;
            case 3: mainActivity.buttons[i][j].setBackgroundColor(mainActivity.buttons[i][j].getContext().getResources().getColor(R.color.yellow));
                break;
            case 4: mainActivity.buttons[i][j].setBackgroundColor(mainActivity.buttons[i][j].getContext().getResources().getColor(R.color.black));
                break;
            default: mainActivity.buttons[i][j].setBackgroundColor(mainActivity.buttons[i][j].getContext().getResources().getColor(R.color.second));
                break;
        }

    }
}
