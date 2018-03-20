/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the basketball score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int TeamCascadia = 0;

    // Tracks the score for Team B
    int TeamWizard = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addThirtyForTeamC(View v) {
        TeamCascadia = TeamCascadia + 30;
        displayForTeamA(TeamCascadia);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addTenForTeamC(View v) {
        TeamCascadia = TeamCascadia + 10;
        displayForTeamA(TeamCascadia);
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addThirtyForTeamW(View v) {
        TeamWizard = TeamWizard + 30;
        displayForTeamB(TeamWizard);
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    public void addTenForTeamW(View v) {
        TeamWizard = TeamWizard + 10;
        displayForTeamB(TeamWizard);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        TeamCascadia = 0;
        TeamWizard = 0;
        displayForTeamA(TeamCascadia);
        displayForTeamB(TeamWizard);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_c_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_w_score);
        scoreView.setText(String.valueOf(score));
    }
}
