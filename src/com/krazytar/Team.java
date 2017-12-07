package com.krazytar;

import java.util.ArrayList;

public class Team {
    String name;
    float offenseRating;
    float defenseRating;
    int wins;
    int losses;
    ArrayList<Team> teamsPlayed = new ArrayList();
    
    public Team(String pName, int pOffenseRating, int pDefenseRating) {
        name = pName;
        offenseRating = pOffenseRating;
        defenseRating = pDefenseRating;
    }
    
    public float getOffenseRating() {
        return offenseRating;
    }
    public float getDefenseRating() {
        return defenseRating;
    }
    public void setName(String pName) {
        name = pName;
    }
    public void setRating(int offense, int defense) {
        offenseRating = offense;
        defenseRating = defense;
    }
    public ArrayList<Team> getTeamsPlayed() {
        return teamsPlayed;
    }
    public void addTeamPlayed(Team t) {
        teamsPlayed.add(t);
    }
    public float getWinPercentage() {
        if (wins == 0f) {
            return 0f;
        }
        return (float) wins / (wins + losses);
    }
}
