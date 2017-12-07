package com.krazytar;

public class Game {
    Team team1;
    Team team2;
    float team1Score;
    float team2Score;
    float team1Attack;
    float team2Attack;
    float scoreChances = 150f;
    float overtimeScoreChances = 20f;
    float scoreBaseProbability = 0.5f;
    int overtimes;
    
    public Game(Team pTeam1, Team pTeam2) {
        team1 = pTeam1;
        team2 = pTeam2;
        
        team1Attack = scoreBaseProbability + (( team1.getOffenseRating() - team2.getDefenseRating() ) / 200f);
        team2Attack = scoreBaseProbability + (( team2.getOffenseRating() - team1.getDefenseRating() ) / 200f);
    }
    
    public void sim() {
        team1Score = 0;
        team2Score = 0;
        overtimes = 0;
        // For every chance to score....TEAM 1
        for (int i = 0; i < scoreChances; i++) {
            if (Math.random() < team1Attack) {
                team1Score++;
            }
        }
        
        // For every chance to score....TEAM 2
        for (int i = 0; i < scoreChances; i++) {
            if (Math.random() < team2Attack) {
                team2Score++;
            }
        }
        
        while(team1Score == team2Score) {
            overtimes++;
            for (int i = 0; i < overtimeScoreChances; i++) {
                if (Math.random() < team1Attack) {
                    team1Score++;
                }
            }
            
            for (int i = 0; i < overtimeScoreChances; i++) {
                if (Math.random() < team2Attack) {
                    team2Score++;
                }
            }
        }
        team1.addTeamPlayed(team2);
        team2.addTeamPlayed(team1);
        
        if(team1Score > team2Score) {
            team1.wins++;
            team2.losses++;
        } else {
            team1.losses++;
            team2.wins++;
        }
        
        System.out.println("Game Played: " + team1.name + " (" + team1Score + ") " + "vs " + team2.name + " (" + team2Score + ")");
    }
    
    public double getTeam1Score () {
        return team1Score;
    }
    public double getTeam2Score() {
        return team2Score;
    }
    public int getOvertimes() {
        return overtimes;
    }
}
