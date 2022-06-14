package Exercise_011;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExerciseMore_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int teamsNum = Integer.parseInt(sc.nextLine());
        List<Team> teamList = new ArrayList<>();

        for (int i = 0; i < teamsNum; i++) {

            String[] teamInfo = sc.nextLine().split("-");
            boolean newTeam = true;

            for (Team team : teamList) {

                if (team.getName().equals(teamInfo[1])) {

                    newTeam = false;
                    System.out.printf("Team %s was already created!%n", teamInfo[1]);
                    break;
                }
                if (team.getMembers().get(0).equals(teamInfo[0])) {

                    newTeam = false;
                    System.out.printf("%s cannot create another team!%n", teamInfo[0]);
                    break;
                }
            }


            if (newTeam) {
                List<String> members = new ArrayList<>();
                members.add(teamInfo[0]);

                Team team = new Team(teamInfo[1], members);

                System.out.printf("Team %s has been created by %s!%n", teamInfo[1], teamInfo[0]);

                teamList.add(team);
            }
        }

        String[] assignment = sc.nextLine().split("->");

        while (!assignment[0].equals("end of assignment")) {

            boolean existingTeam = false;
            boolean canJoin = true;
            int teamIndex = 0;

            for (int i = 0; i < teamList.size(); i++) {

                if (assignment[1].equals(teamList.get(i).getName())) {

                    existingTeam = true;
                    teamIndex = i;
                }
            }

            if (!existingTeam) {

                System.out.printf("Team %s does not exist!%n", assignment[1]);

            } else {

                for (Team team : teamList) {

                    if (!canJoin) {
                        break;
                    }

                    for (String member : team.getMembers()) {

                        if (assignment[0].equals(member)) {

                            System.out.printf("Member %s cannot join team %s!%n", assignment[0], assignment[1]);
                            canJoin = false;
                            break;
                        }
                    }
                }

                if (canJoin) {

                    teamList.get(teamIndex).getMembers().add(assignment[0]);
                }
            }

            assignment = sc.nextLine().split("->");
        }

        List<String> teamsToDisband = new ArrayList<>();

        teamList = teamList.stream().sorted(Comparator.comparingInt(Team::membersCount).reversed())
                .collect(Collectors.toList());

        for (Team team : teamList) {

            if (team.getMembers().size() > 1) {

                System.out.println(team.getName());
                System.out.println("- " + team.getMembers().get(0));
                team.getMembers().remove(0);

                team.setMembers(team.getMembers().stream().sorted().collect(Collectors.toList()));

                for (int i = 0; i < team.getMembers().size(); i++) {

                    System.out.println("-- " + team.getMember(i));
                }
            } else {

                teamsToDisband.add(team.getName());
            }
        }

        System.out.println("Teams to disband:");

        if (teamsToDisband.size() > 0) {

            teamsToDisband.stream().sorted().forEach(System.out::println);
        }
    }
}
