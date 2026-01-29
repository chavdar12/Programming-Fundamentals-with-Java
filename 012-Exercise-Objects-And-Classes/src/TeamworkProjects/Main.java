package TeamworkProjects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Team> teams = new ArrayList<>();
        IntStream.range(0, n).forEach(i -> {
            String[] input = scan.nextLine().split("-");
            String creator = input[0];
            String teamName = input[1];
            if (teams.stream().anyMatch(t -> t.getName().equals(teamName))) {
                System.out.printf("Team %s was already created!%n", teamName);
            } else if (teams.stream().anyMatch(t -> t.getCreator().equals(creator))) {
                System.out.printf("%s cannot create another team!%n", creator);
            } else {
                Team team = new Team(teamName, creator);
                teams.add(team);
                System.out.printf("Team %s has been created by %s!%n", teamName, creator);
            }
        });
        String input = scan.nextLine();
        while (!input.equals("end of assignment")) {
            String[] tokens = input.split("->");
            String user = tokens[0];
            String teamName = tokens[1];
            if (teams.stream().noneMatch(t -> t.getName().equals(teamName))) {
                System.out.printf("Team %s does not exist!%n", teamName);
            } else if (teams.stream().anyMatch(t -> t.getMembers().contains(user)) || teams.stream().anyMatch(t -> t.getCreator().equals(user))) {
                System.out.printf("Member %s cannot join team %s!%n", user, teamName);
            } else {
                teams.stream().filter(t -> t.getName().equals(teamName)).forEach(t -> t.getMembers().add(user));
            }
            input = scan.nextLine();
        }
        teams.stream().filter(t -> t.getMembers().size() > 0).sorted(Comparator.comparing(Team::getName)).forEach(t -> {
            System.out.println(t.getName());
            System.out.println("- " + t.getCreator());
            t.getMembers().stream().sorted(String::compareTo).forEach(m -> System.out.println("-- " + m));
        });
        System.out.println("Teams to disband:");
        teams.stream().filter(t -> t.getMembers().size() == 0).sorted(Comparator.comparing(Team::getName)).forEach(t -> System.out.println(t.getName()));
    }
}