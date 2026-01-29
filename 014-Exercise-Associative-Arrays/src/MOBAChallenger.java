import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MOBAChallenger {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Integer>> players = new TreeMap<>();
        String input = scanner.nextLine();
        while (!input.equals("Season end")) {
            String[] tokens = input.split(" -> ");
            if (tokens.length > 1) {
                String player = tokens[0];
                String position = tokens[1];
                int skill = Integer.parseInt(tokens[2]);
                players.putIfAbsent(player, new LinkedHashMap<>());
                players.get(player).putIfAbsent(position, 0);
                if (players.get(player).get(position) < skill) {
                    players.get(player).put(position, skill);
                }
            } else {
                tokens = input.split(" vs ");
                String firstPlayer = tokens[0];
                String secondPlayer = tokens[1];
                if (players.containsKey(firstPlayer) && players.containsKey(secondPlayer)) {
                    boolean isFound = false;
                    for (Map.Entry<String, Integer> entry : players.get(firstPlayer).entrySet()) {
                        if (players.get(secondPlayer).containsKey(entry.getKey())) {
                            isFound = true;
                            break;
                        }
                    }
                    if (isFound) {
                        int firstPlayerSkill = players.get(firstPlayer).values().stream().mapToInt(i -> i).sum();
                        int secondPlayerSkill = players.get(secondPlayer).values().stream().mapToInt(i -> i).sum();
                        if (firstPlayerSkill > secondPlayerSkill) {
                            players.remove(secondPlayer);
                        } else if (firstPlayerSkill < secondPlayerSkill) {
                            players.remove(firstPlayer);
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }
        players.entrySet().stream().sorted((f, s) -> {
            int firstPlayerSkill = f.getValue().values().stream().mapToInt(i -> i).sum();
            int secondPlayerSkill = s.getValue().values().stream().mapToInt(i -> i).sum();
            return Integer.compare(secondPlayerSkill, firstPlayerSkill);
        }).forEach(player -> {
            int totalSkill = player.getValue().values().stream().mapToInt(i -> i).sum();
            System.out.printf("%s: %d skill%n", player.getKey(), totalSkill);
            player.getValue().entrySet().stream().sorted((f, s) -> {
                int result = Integer.compare(s.getValue(), f.getValue());
                if (result == 0) {
                    result = f.getKey().compareTo(s.getKey());
                }
                return result;
            }).forEach(position -> System.out.printf("- %s <::> %d%n", position.getKey(), position.getValue()));
        });
    }
}