package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int homeGoal = 0, awayGoal = 0, homePenalties = 0, awayPenalties = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForHome(homeGoal);
        displayForHomePenalties(homePenalties);
        displayForAway(awayGoal);
        displayForAwayPenalties(awayPenalties);
    }

    public void homeGoal(View view)
    {
        homeGoal += 1;
        displayForHome(homeGoal);
    }

    public void awayGoal(View view)
    {
        awayGoal += 1;
        displayForAway(awayGoal);
    }

    public void homeTwoPenalties(View view)
    {
        homePenalties += 2;
        displayForHomePenalties(homePenalties);
    }

    public void homeFivePenalties(View view)
    {
        homePenalties += 5;
        displayForHomePenalties(homePenalties);
    }

    public void awayTwoPenalties(View view)
    {
        awayPenalties += 2;
        displayForAwayPenalties(awayPenalties);
    }

    public void awayFivePenalties(View view)
    {
        awayPenalties += 5;
        displayForAwayPenalties(awayPenalties);
    }

    public void displayForHome(int amountOfGoals)
    {
        TextView scoreView = (TextView) findViewById(R.id.home_goals);
        scoreView.setText(String.valueOf(amountOfGoals));
    }

    public void displayForAway(int amountOfGoals)
    {
        TextView scoreView = (TextView) findViewById(R.id.away_goals);
        scoreView.setText(String.valueOf(amountOfGoals));
    }

    public void displayForHomePenalties(int amountOfPenalties)
    {
        TextView scoreView = (TextView) findViewById(R.id.home_penalties);
        scoreView.setText(String.valueOf(amountOfPenalties));
    }

    public void displayForAwayPenalties(int amountOfPenalties)
    {
        TextView scoreView = (TextView) findViewById(R.id.away_penalties);
        scoreView.setText(String.valueOf(amountOfPenalties));
    }

    public void resetEverything(View view)
    {
        homeGoal = 0;
        homePenalties = 0;
        awayGoal = 0;
        awayPenalties = 0;

        displayForHome(homeGoal);
        displayForHomePenalties(homePenalties);
        displayForAway(awayGoal);
        displayForAwayPenalties(awayPenalties);
    }

}
