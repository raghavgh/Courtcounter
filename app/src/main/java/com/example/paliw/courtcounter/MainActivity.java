package com.example.paliw.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int TeamAScore = 0,TeamBScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void plus3button(View view){
        TeamAScore+=3;
        display(TeamAScore);
    }
    public void plus2button(View view){
        TeamAScore+=2;
        display(TeamAScore);
    }
    public void FreeThrow(View view){
        TeamAScore++;
        display(TeamAScore);
    }
    public void plus3buttonb(View view){
        TeamBScore+=3;
        displayb(TeamBScore);
    }
    public void plus2buttonb(View view){
        TeamBScore+=2;
        displayb(TeamBScore);
    }
    public void FreeThrowb(View view){
        TeamBScore++;
        displayb(TeamBScore);
    }
    public void display(int n){
        TextView t = (TextView)findViewById(R.id.teama);
        t.setText("" + n);
    }
    public void displayb(int n){
        TextView t = (TextView)findViewById(R.id.teamb);
        t.setText("" + n);
    }
    public void reset(View view){
        TeamAScore = 0;
        TeamBScore = 0;
        display(TeamAScore);
        displayb(TeamBScore);
    }
}

