import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pokemons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;

        while (!pokemons.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());
            int removedElement = 0;

            if (index < 0) {
                removedElement = pokemons.get(0);
                pokemons.set(0, pokemons.get(pokemons.size() - 1));
            } else if (index >= pokemons.size()) {
                removedElement = pokemons.get(pokemons.size() - 1);
                pokemons.set(pokemons.size() - 1, pokemons.get(0));
            } else {
                removedElement = pokemons.get(index);
                pokemons.remove(index);
            }

            sum += removedElement;

            for (int i = 0; i < pokemons.size(); i++) {
                if (pokemons.get(i) <= removedElement) {
                    pokemons.set(i, pokemons.get(i) + removedElement);
                } else {
                    pokemons.set(i, pokemons.get(i) - removedElement);
                }
            }
        }

        System.out.println(sum);
    }
}