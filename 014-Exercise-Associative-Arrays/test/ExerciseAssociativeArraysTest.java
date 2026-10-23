import org.junit.jupiter.api.Test;

import static console.Console.run;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExerciseAssociativeArraysTest {

    @Test
    void aMinerTask() {
        assertEquals("Gold -> 170\nSilver -> 10\nCopper -> 17",
                run(AMinerTask::main, "Gold", "155", "Silver", "10", "Copper", "17", "Gold", "15", "stop"));
    }

    @Test
    void companyUsers() {
        assertEquals("HP\n-- BB12345\nMicrosoft\n-- CC12345\nSoftUni\n-- AA12345\n-- BB12345", run(CompanyUsers::main,
                "SoftUni -> AA12345", "SoftUni -> BB12345", "Microsoft -> CC12345", "HP -> BB12345", "SoftUni -> AA12345", "End"));
    }

    @Test
    void countCharsInAString() {
        assertEquals("t -> 2\ne -> 1\nx -> 1", run(CountCharsInAString::main, "text"));
        assertEquals("t -> 6\ne -> 3\nx -> 3", run(CountCharsInAString::main, "text text text"));
    }

    @Test
    void courses() {
        assertEquals("""
                Programming Fundamentals: 2
                -- John Smith
                -- Linda Johnson
                JS Core: 1
                -- Will Wilson
                Java Advanced: 1
                -- Harrison White""", run(Courses::main, "Programming Fundamentals : John Smith",
                "Programming Fundamentals : Linda Johnson", "JS Core : Will Wilson", "Java Advanced : Harrison White", "end"));
    }

    @Test
    void dragonArmy() {
        assertEquals("""
                Red::(160.00/2350.00/30.00)
                -Bazgargal -> damage: 100, health: 2500, armor: 25
                -Obsidion -> damage: 220, health: 2200, armor: 35
                Black::(200.00/3500.00/18.00)
                -Dargonax -> damage: 200, health: 3500, armor: 18
                Blue::(62.50/1950.00/35.00)
                -Algordox -> damage: 65, health: 1800, armor: 50
                -Kerizsa -> damage: 60, health: 2100, armor: 20
                Green::(45.00/250.00/10.00)
                -Leaf -> damage: 45, health: 250, armor: 10""", run(DragonArmy.Main::main, "6",
                "Red Bazgargal 100 2500 25", "Black Dargonax 200 3500 18", "Red Obsidion 220 2200 35",
                "Blue Kerizsa 60 2100 20", "Blue Algordox 65 1800 50", "Green Leaf null null null"));
    }

    @Test
    void forceBook() {
        assertEquals("Kim joins the Light side!\nSide: Light, Members: 2\n! Kim\n! Peter",
                run(ForceBook::main, "Light | Peter", "Dark | Kim", "Kim -> Light", "Lumpawaroo"));
    }

    @Test
    void forceBookIgnoresUserAlreadyOnAnotherSide() {
        assertEquals("Side: Light, Members: 1\n! Peter", run(ForceBook::main, "Light | Peter", "Dark | Peter", "Lumpawaroo"));
    }

    @Test
    void judge() {
        assertEquals("""
                Algo: 3 participants
                1. Peter <::> 400
                2. George <::> 300
                3. Simo <::> 200
                DS: 2 participants
                1. Maria <::> 600
                2. Peter <::> 150
                Individual standings:
                1. Maria -> 600
                2. Peter -> 550
                3. George -> 300
                4. Simo -> 200""", run(Judge::main, "Peter -> Algo -> 400", "George -> Algo -> 300", "Simo -> Algo -> 200",
                "Peter -> DS -> 150", "Maria -> DS -> 600", "no more time"));
    }

    @Test
    void judgeBreaksTiesByName() {
        assertEquals("A: 2 participants\n1. Amy <::> 100\n2. Zed <::> 100\nIndividual standings:\n1. Amy -> 100\n2. Zed -> 100",
                run(Judge::main, "Zed -> A -> 100", "Amy -> A -> 100", "no more time"));
    }

    @Test
    void legendaryFarming() {
        assertEquals("Valanyr obtained!\nfragments: 5\nshards: 5\nmotes: 3\nleathers: 6\nstones: 5",
                run(LegendaryFarming::main, "3 Motes 5 stones 5 Shards", "6 leathers 255 fragments 7 Shards"));
    }

    @Test
    void mobaChallenger() {
        assertEquals("""
                Simo: 450 skill
                - Support <::> 250
                - Mid <::> 200
                Peter: 400 skill
                - Adc <::> 400
                George: 300 skill
                - Jungle <::> 300""", run(MOBAChallenger::main, "Peter -> Adc -> 400", "George -> Jungle -> 300",
                "Simo -> Mid -> 200", "Simo -> Support -> 250", "Peter vs George", "Season end"));
        assertEquals("A: 100 skill\n- Mid <::> 100", run(MOBAChallenger::main, "A -> Mid -> 100", "B -> Mid -> 50", "A vs B", "Season end"));
    }

    @Test
    void ordersMergesRepeatedProductsWithLatestPrice() {
        assertEquals("Beer -> 660.00\nWater -> 250.00\nIceTea -> 110.00", run(Orders.Main::main,
                "Beer 2.40 350", "Water 1.25 200", "IceTea 5.20 100", "Beer 1.20 200", "IceTea 0.50 120", "buy"));
    }

    @Test
    void ranking() {
        assertEquals("""
                Best candidate is Tanya with total 950 points.
                Ranking:
                Nikola
                #  Algorithms -> 290
                #  Part One Interview -> 120
                Tanya
                #  Algorithms -> 380
                #  C# Fundamentals -> 350
                #  Part One Interview -> 220""", run(Ranking::main,
                "Part One Interview:success", "Js Fundamentals:fundExam", "C# Fundamentals:fundPass", "Algorithms:fun", "end of contests",
                "C# Fundamentals=>fundPass=>Tanya=>350", "Algorithms=>fun=>Tanya=>380", "Part One Interview=>success=>Nikola=>120",
                "Java Basics Exam=>wrong_pass=>Teo=>400", "Part One Interview=>success=>Tanya=>220", "OOP Advanced=>password123=>Nikola=>350",
                "Algorithms=>fun=>Nikola=>290", "end of submissions"));
    }

    @Test
    void snowWhiteCountsEachDwarfOncePerColor() {
        assertEquals("(Blue) Cher <-> 10000\n(Red) Cher <-> 10000\n(Blue) Tony <-> 5000", run(SnowWhite::main,
                "Cher <:> Red <:> 10000", "Tony <:> Blue <:> 5000", "Cher <:> Red <:> 5000", "Cher <:> Blue <:> 10000", "Once upon a time"));
    }

    @Test
    void examResults() {
        assertEquals("Results:\nKatya | 94\nGeorge | 84\nPeter | 84\nSubmissions:\nC# - 3\nJava - 1", run(SoftUniExamResults::main,
                "Peter-Java-84", "George-C#-84", "George-C#-70", "Katya-C#-94", "exam finished"));
        assertEquals("Results:\nKatya | 94\nSubmissions:\nC# - 2", run(SoftUniExamResults::main,
                "Peter-C#-84", "Katya-C#-94", "Peter-banned", "exam finished"));
    }

    @Test
    void parking() {
        assertEquals("""
                John registered CS1234JS successfully
                ERROR: already registered with plate number XX
                ERROR: user Bob not found
                Andy registered AB4142CD successfully
                Andy unregistered successfully
                John => CS1234JS""", run(SoftUniParking::main, "5", "register John CS1234JS", "register John XX",
                "unregister Bob", "register Andy AB4142CD", "unregister Andy"));
    }

    @Test
    void studentAcademy() {
        assertEquals("John -> 5.00\nGeorge -> 5.00", run(StudentAcademy::main,
                "5", "John", "5.5", "John", "4.5", "Alice", "6", "Alice", "2", "George", "5"));
    }
}
