package com.krazytar;

import java.util.Scanner;

public class Player {
    Team team;
    
    public Player(Team pTeam) {
        Scanner in = new Scanner(System.in);
        team = pTeam;
        System.out.print("Please enter your team name: ");
        team.name = in.nextLine();
    }
    
    public Team getTeam() {
        return team;
    }
    public void setTeam(Team pTeam) {
        team = pTeam;
    }
}
