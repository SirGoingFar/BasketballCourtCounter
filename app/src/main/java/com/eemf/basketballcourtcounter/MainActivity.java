package com.eemf.basketballcourtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This adds 1 point to the class variable scoreTeamA
    public void addOnePointTeamA(View view){
        scoreTeamA += 1;
        displayScoreTeamA(scoreTeamA);
    }

    //This adds 2 points to the class variable scoreTeamA
    public void addTwoPointsTeamA(View view){
        scoreTeamA += 2;
        displayScoreTeamA(scoreTeamA);
    }

    //This adds 3 points to the class variable scoreTeamA
    public void addThreePointsTeamA(View view){
        scoreTeamA += 3;
        displayScoreTeamA(scoreTeamA);
    }

    //This adds 1 point to the class variable scoreTeamB
    public void addOnePointTeamB(View view){
        scoreTeamB += 1;
        displayScoreTeamB(scoreTeamB);
    }

    //This adds 2 points to the class variable scoreTeamB
    public void addTwoPointsTeamB(View view){
        scoreTeamB += 2;
        displayScoreTeamB(scoreTeamB);
    }

    //This adds 3 points to the class variable scoreTeamB
    public void addThreePointsTeamB(View view){
        scoreTeamB += 3;
        displayScoreTeamB(scoreTeamB);
    }

    public void displayScoreTeamA(int currentScore){
        TextView scoreA = (TextView) findViewById(R.id.teamA_text_view);
        scoreA.setText(String.valueOf(currentScore));
    }

    public void displayScoreTeamB(int currentScore){
        TextView scoreB = (TextView) findViewById(R.id.teamB_text_view);
        scoreB.setText(String.valueOf(currentScore));
    }

    public void resetScores(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
    }
}
