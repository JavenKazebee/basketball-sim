package com.krazytar;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<Team> teams = new ArrayList();
        teams.add(new Team("Duke", 72, 75));
        teams.add(new Team("Arizona", 79, 78));
        teams.add(new Team("North Carolina", 77, 81));
        teams.add(new Team("Syracuse", 77, 74));
        teams.add(new Team("Gonzaga", 79, 80));
        teams.add(new Team("Kentucky", 80, 84));
        
        League mm = new League("Krazy League", teams);
        Player p = new Player(teams.get(5));
        
        ArrayList<HashMap<Team, Team>> schedule = new ArrayList();
        HashMap<Team, Team> week1 = new HashMap(), week2 = new HashMap(), week3 = new HashMap(), week4 = new HashMap(), week5 = new HashMap();
        schedule.add(week1);
        schedule.add(week2);
        schedule.add(week3);
        schedule.add(week4);
        schedule.add(week5);
        
        week1.put(teams.get(0), teams.get(1));
        week1.put(teams.get(2), teams.get(3));
        week1.put(teams.get(4), teams.get(5));

        week2.put(teams.get(0), teams.get(2));
        week2.put(teams.get(1), teams.get(4));
        week2.put(teams.get(3), teams.get(5));
        
        week3.put(teams.get(0), teams.get(5));
        week3.put(teams.get(1), teams.get(2));
        week3.put(teams.get(3), teams.get(4));
        
        week4.put(teams.get(0), teams.get(3));
        week4.put(teams.get(1), teams.get(5));
        week4.put(teams.get(2), teams.get(4));
        
        week5.put(teams.get(0), teams.get(4));
        week5.put(teams.get(1), teams.get(3));
        week5.put(teams.get(2), teams.get(5));
        
        mm.setSchedule(schedule);
        mm.playWeek(0);
        System.out.println("\n");
        mm.playWeek(1);
        System.out.println("\n");
        mm.playWeek(2);
        System.out.println("\n");
        mm.playWeek(3);
        System.out.println("\n");
        mm.playWeek(4);
        System.out.println("\n");
        mm.playWeek(0);
        System.out.println("\n");
        mm.playWeek(1);
        System.out.println("\n");
        mm.playWeek(2);
        System.out.println("\n");
        mm.playWeek(3);
        System.out.println("\n");
        mm.playWeek(4);
        
        System.out.println(teams.get(0).name + " " + teams.get(0).wins + "-" + teams.get(0).losses + "\t");
        System.out.println(teams.get(1).name + " " + teams.get(1).wins + "-" + teams.get(1).losses + "\t");
        System.out.println(teams.get(2).name + " " + teams.get(2).wins + "-" + teams.get(2).losses + "\t");
        System.out.println(teams.get(3).name + " " + teams.get(3).wins + "-" + teams.get(3).losses + "\t");
        System.out.println(teams.get(4).name + " " + teams.get(4).wins + "-" + teams.get(4).losses + "\t");
        System.out.println(teams.get(5).name + " " + teams.get(5).wins + "-" + teams.get(5).losses + "\t");
    }
}
