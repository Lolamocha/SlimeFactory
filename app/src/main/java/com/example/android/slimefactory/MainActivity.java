package com.example.android.slimefactory;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    int scoreTeamZoe = 0;
    int scoreTeamLola = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamZoe(0);
        displayForTeamLola(0);
    }
    /**
     * Displays the given score for Team Zoe.
     */
    public void displayForTeamZoe(int score) {
        TextView scoreView = findViewById(R.id.team_zoe_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team Lola.
     */
    public void displayForTeamLola(int score) {
        TextView scoreView = findViewById(R.id.team_lola_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * This method is called when the addThreeForTeamZoe button is clicked.
     */
    public void addThreeForTeamZoe(View view) {
        scoreTeamZoe = scoreTeamZoe + 3;
        displayForTeamZoe(scoreTeamZoe);
    }
    /**
     * This method is called when the addThreeForTeamLola button is clicked.
     */
    public void addThreeForTeamLola(View view) {
        scoreTeamLola = scoreTeamLola + 3;
        displayForTeamLola(scoreTeamLola);
    }
    /**
     * This method is called when the addTwoForTeamZoe button is clicked.
     */
    public void addTwoForTeamZoe(View view) {
        scoreTeamZoe = scoreTeamZoe + 2;
        displayForTeamZoe(scoreTeamZoe);
    }
    /**
     * This method is called when the addTwoForTeamLola button is clicked.
     */
    public void addTwoForTeamLola(View view) {
        scoreTeamLola = scoreTeamLola + 2;
        displayForTeamLola(scoreTeamLola);
    }
    /**
     * This method is called when the addOneForTeamZoe button is clicked.
     */
    public void addOneForTeamZoe(View view) {
        scoreTeamZoe = scoreTeamZoe + 1;
        displayForTeamZoe(scoreTeamZoe);
    }
    /**
     * This method is called when the addOneForTeamLola button is clicked.
     */
    public void addOneForTeamLola(View view) {
        scoreTeamLola = scoreTeamLola + 1;
        displayForTeamLola(scoreTeamLola);
    }
    public void  resetScore(View view) {
        scoreTeamZoe = 0;
        scoreTeamLola = 0;
        displayForTeamZoe(scoreTeamZoe);
        displayForTeamLola(scoreTeamLola);
    }
    /**
     * This method displays the given score value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = findViewById(R.id.team_zoe_score);
        quantityTextView.setText(String.valueOf(number));
    }

}
