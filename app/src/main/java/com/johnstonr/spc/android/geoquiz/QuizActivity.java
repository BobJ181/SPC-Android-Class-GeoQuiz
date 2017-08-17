package com.johnstonr.spc.android.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    //Setup Buttons for Activity - Chapter 1
    private Button mButton_False;
    private Button mButton_True;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        //Setup Buttons - Chapter 1
        mButton_True = (Button) findViewById(R.id.button_true);
        mButton_False = (Button) findViewById(R.id.button_false);

        //Add Click Listeners - Chapter 1
        mButton_True.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Added via Chapter 1
                Toast.makeText(QuizActivity.this, R.string.correct_toast, Toast.LENGTH_SHORT);
                //Adding for Fun
                Log.d("TrueButton", "Someone Pressed the true button!");
            }
        });

        mButton_False.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(QuizActivity.this, R.string.incorrect_toast, Toast.LENGTH_SHORT);
                //Adding for Fun
                Log.d("TrueButton", "Someone Pressed the true button!");
            }
        });
    }
}
