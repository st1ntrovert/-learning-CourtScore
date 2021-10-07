package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int firstScore = 0;
    int secondScore = 0;

    Button firstThreePointsButton;
    Button firstTwoPointsButton;
    Button firstFreeThrowButton;
    Button secondThreePointsButton;
    Button secondTwoPointsButton;
    Button secondFreeThrowButton;
    Button resetScoreButton;

    TextView firstTeamScore;
    TextView secondTeamScore;


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.firstThreePointsButton:
                firstScore += 3;
                firstTeamScore.setText("" + firstScore);
                break;
            case R.id.firstTwoPointsButton:
                firstScore += 2;
                firstTeamScore.setText("" + firstScore);
                break;
            case R.id.firstFreeThrowButton:
                firstScore += 1;
                firstTeamScore.setText("" + firstScore);
                break;
            case R.id.secondThreePointsButton:
                secondScore += 3;
                secondTeamScore.setText("" + secondScore);
                break;
            case R.id.secondTwoPointsButton:
                secondScore += 2;
                secondTeamScore.setText("" + secondScore);
                break;
            case R.id.secondFreeThrowButton:
                secondScore += 1;
                secondTeamScore.setText("" + secondScore);
                break;
            case R.id.resetScoreButton:
                firstScore = 0;
                secondScore = 0;
                firstTeamScore.setText("" + firstScore);
                secondTeamScore.setText("" + secondScore);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstThreePointsButton = (Button) findViewById(R.id.firstThreePointsButton);
        firstTwoPointsButton = (Button) findViewById(R.id.firstTwoPointsButton);
        firstFreeThrowButton = (Button) findViewById(R.id.firstFreeThrowButton);
        secondThreePointsButton = (Button) findViewById(R.id.secondThreePointsButton);
        secondTwoPointsButton = (Button) findViewById(R.id.secondTwoPointsButton);
        secondFreeThrowButton = (Button) findViewById(R.id.secondFreeThrowButton);
        resetScoreButton = (Button) findViewById(R.id.resetScoreButton);

        firstTeamScore = (TextView) findViewById(R.id.firstTeamScore);
        secondTeamScore = (TextView) findViewById(R.id.secondTeamScore);

        firstThreePointsButton.setOnClickListener(this);
        firstTwoPointsButton.setOnClickListener(this);
        firstFreeThrowButton.setOnClickListener(this);
        secondThreePointsButton.setOnClickListener(this);
        secondTwoPointsButton.setOnClickListener(this);
        secondFreeThrowButton.setOnClickListener(this);
        resetScoreButton.setOnClickListener(this);
    }
}