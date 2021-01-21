package android.example.handballapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int penaltyTeamA = 0;
    int scoreTeamB = 0;
    int penaltyTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamAscore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void goalTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamAscore(scoreTeamA);
    }

    public void displayForTeamApenalty(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_penalty);
        scoreView.setText(String.valueOf(score));
    }

    public void penaltyTeamA(View view) {
        penaltyTeamA = penaltyTeamA + 1;
        displayForTeamApenalty(penaltyTeamA);
    }

    public void displayForTeamBscore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void goalTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamBscore(scoreTeamB);
    }

    public void displayForTeamBpenalty(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_penalty);
        scoreView.setText(String.valueOf(score));
    }

    public void penaltyTeamB(View view) {
        penaltyTeamB = penaltyTeamB + 1;
        displayForTeamBpenalty(penaltyTeamB);
    }

    public void resetScore (View view) {
        displayForTeamAscore(scoreTeamA = 0);
        displayForTeamBscore(scoreTeamB = 0);
        displayForTeamApenalty(penaltyTeamA = 0);
        displayForTeamBpenalty(penaltyTeamB = 0);
    }
}
