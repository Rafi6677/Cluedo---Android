package com.example.cluedo;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    Button[][] buttons;
    RadioGroup optionButtons;
    int activeColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttons = new Button[21][6];
        optionButtons = (RadioGroup)findViewById(R.id.radioGroup);
        activeColor = 5;
        setButtons();
        optionButtons.setOnCheckedChangeListener(new RadioGroupListener(this));
    }

    private void setButtons()
    {
        for(int i=0;i<21;i++)
        {
            for(int j=0;j<6;j++)
            {
                String buttonID = "button"+(i+1)+(j+1);
                int resID = getResources().getIdentifier(buttonID.toLowerCase(), "id", getPackageName());
                buttons[i][j] = (Button)findViewById(resID);
                buttons[i][j].setOnClickListener(new ButtonClickListener(this, i ,j));
            }
        }
    }
}
