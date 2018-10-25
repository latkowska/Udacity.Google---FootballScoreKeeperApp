package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

// This app helps to track the football match score.

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int yellowCardsTeamA = 0;
    int yellowCardsTeamB = 0;
    int redCardsTeamA = 0;
    int redCardsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // TEAM A/First

    /**
     * After pushing the goal button one point is added to the Team A score.
     */
    public void addOnePointsForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * After pushing add yellow card button one point is added to the yellow cards for Team A score.
     */
    public void addYellowCardForTeamA(View v) {
        yellowCardsTeamA = yellowCardsTeamA + 1;
        displayYellowCardForTeamA(yellowCardsTeamA);
    }

    /**
     * After pushing add red card button one point is added to the red cards for Team A score.
     */
    public void addRedCardForTeamA(View v) {
        redCardsTeamA = redCardsTeamA + 1;
        displayRedCardForTeamA(redCardsTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays yellow cards score for Team A.
     */
    public void displayYellowCardForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_yellow_cards);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays red cards score for Team A.
     */
    public void displayRedCardForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_red_cards);
        scoreView.setText(String.valueOf(score));
    }


    // TEAM B

    /**
     * After pushing the goal button one point is added to the Team B score.
     */
    public void addOnePointsForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * After pushing add yellow card button one point is added to the yellow cards for Team B score.
     */
    public void addYellowCardForTeamB(View v) {
        yellowCardsTeamB = yellowCardsTeamB + 1;
        displayYellowCardForTeamB(yellowCardsTeamB);
    }

    /**
     * After pushing add red card button one point is added to the red cards for Team B score.
     */
    public void addRedCardForTeamB(View v) {
        redCardsTeamB = redCardsTeamB + 1;
        displayRedCardForTeamB(redCardsTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays yellow cards score for Team B.
     */
    public void displayYellowCardForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_yellow_cards);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays red cards score for Team B.
     */
    public void displayRedCardForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_red_cards);
        scoreView.setText(String.valueOf(score));
    }


    //THE RESET BUTTON

    public void resetButton(View v) {
        scoreTeamA = 0;
        yellowCardsTeamA = 0;
        redCardsTeamA = 0;
        scoreTeamB = 0;
        yellowCardsTeamB = 0;
        redCardsTeamB = 0;
        EditText teamAName = findViewById(R.id.first_team);
        teamAName.setText(null);
        EditText teamBName = findViewById(R.id.second_team);
        teamBName.setText(null);
        displayForTeamA(scoreTeamA);
        displayYellowCardForTeamA(yellowCardsTeamA);
        displayRedCardForTeamA(redCardsTeamA);
        displayForTeamB(scoreTeamB);
        displayYellowCardForTeamB(yellowCardsTeamB);
        displayRedCardForTeamB(redCardsTeamB);
    }
}

