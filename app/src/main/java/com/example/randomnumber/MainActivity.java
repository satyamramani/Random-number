package com.example.randomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;
    public void makeToast(String string)
    {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }
    public void Guess(View view)
    {


        EditText randomnumber= (EditText) findViewById(R.id.randomnumber);
        int guess=Integer.parseInt(randomnumber.getText().toString());
        if(guess>randomNumber)
        {
            makeToast("ENTER LOWER NUMBER");
        }
        else if (guess<randomNumber)
        {
            makeToast("ENTER GREATER NUMBER");
        }
        else {
            makeToast("CORRECT! TRY AGAIN");


            Random rand = new Random();
            randomNumber = rand.nextInt(20) + 1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand =new Random();
        randomNumber=rand.nextInt(20)+1;
    }
}
