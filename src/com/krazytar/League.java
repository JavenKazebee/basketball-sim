package com.krazytar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class League {
    ArrayList<Team> teams;
    ArrayList<HashMap<Team, Team>> schedule = new ArrayList();
    String name;
    List<Team> rankings;
    
    public League(String pName, ArrayList<Team> pTeams) {
        teams = pTeams;
        name = pName;
    }
    
    public void playWeek(int week) {
        for (Team t : schedule.get(week).keySet()) {
            Game g = new Game(t, schedule.get(week).get(t));
            g.sim();
        }
        calcRankings();
    }
    public void calcRankings() {
        rankings = teams;
        rankings.sort((Team t1, Team t2) -> {
            float t1wp = t1.getWinPercentage();
            float t2wp = t2.getWinPercentage();
            return Float.compare(t2wp, t1wp);
        });
        int counter = 0;
        for(Team t : rankings) {
            counter++;
            System.out.println("(" + counter + ") " + t.name + "\t" + t.getWinPercentage());
        }
    }
    
    public void setSchedule(ArrayList<HashMap<Team, Team>> pSchedule) {
        schedule = pSchedule;
    }
}
