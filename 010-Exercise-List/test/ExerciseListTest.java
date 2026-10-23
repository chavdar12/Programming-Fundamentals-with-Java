import org.junit.jupiter.api.Test;

import static console.Console.run;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExerciseListTest {

    @Test
    void anonymousThreat() {
        assertEquals("IvoJohnyTonyBonyMony", run(AnonymousThreat::main, "Ivo Johny Tony Bony Mony",
                "merge 0 3", "merge 3 4", "merge 0 3", "3:1"));
        assertEquals("abcd efgh ijkl mnop qr st uv wx yz", run(AnonymousThreat::main, "abcd efgh ijkl mnop qrst uvwx yz",
                "merge 4 10", "divide 4 5", "3:1"));
    }

    @Test
    void appendArrays() {
        assertEquals("7 8 4 5 6 1 2 3", run(AppendArrays::main, "1 2 3 |4 5 6 |  7  8"));
    }

    @Test
    void bombNumbers() {
        assertEquals("12", run(BombNumbers::main, "1 2 2 4 2 2 2 9", "4 2"));
        assertEquals("5", run(BombNumbers::main, "1 4 4 2 8 9 1", "9 3"));
    }

    @Test
    void carRace() {
        assertEquals("The winner is left with total time: 53.8", run(CarRace::main, "29 13 9 0 13 0 21 0 14 82 12"));
    }

    @Test
    void changeList() {
        assertEquals("1 10 2 3 4 6", run(ChangeList::main, "1 2 3 4 5 5 5 6", "Delete 5", "Insert 10 1", "Delete 5", "end"));
    }

    @Test
    void drumSetReplacesBrokenDrumsForThreeTimesTheirQuality() {
        assertEquals("50 20 20\nGabsy has 790.00lv.", run(DrumSet::main, "1000", "3", "50", "70", "20", "50", "Hit it again, Gabsy!"));
    }

    @Test
    void drumSetRemovesDrumsItCannotAfford() {
        assertEquals("5\nGabsy has 10.00lv.", run(DrumSet::main, "10", "2", "10", "20", "15", "Hit it again, Gabsy!"));
    }

    @Test
    void cardGame() {
        assertEquals("First player wins! Sum: 240", run(Game::main, "20 30 40 50", "10 20 30 40"));
        assertEquals("Second player wins! Sum: 240", run(Game::main, "10 20 30 40", "20 30 40 50"));
    }

    @Test
    void houseParty() {
        assertEquals("John is not in the list!\nAllie", run(HouseParty::main, "4",
                "Allie is going!", "George is going!", "John is not going!", "George is not going!"));
        assertEquals("Tom is already in the list!\nTom", run(HouseParty::main, "2", "Tom is going!", "Tom is going!"));
    }

    @Test
    void listOperations() {
        assertEquals("43 20 5 1 23 29 18", run(ListOperations::main, "1 23 29 18 43 21 20",
                "Add 5", "Remove 5", "Shift left 3", "Shift left 1", "End"));
        assertEquals("Invalid index\n3 1 2", run(ListOperations::main, "1 2 3", "Remove 9", "Shift right 1", "End"));
    }

    @Test
    void messaging() {
        assertEquals("hey", run(Messaging::main, "9992 562 8933", "This is some message for you"));
    }

    @Test
    void mixedUpLists() {
        assertEquals("5 4 3 2", run(MixedUpLists::main, "3", "1", "5", "10", "2", "3", "4"));
    }

    @Test
    void pokemonDontGo() {
        assertEquals("14", run(PokemonDontGo::main, "4 5 3", "1", "1", "0"));
        assertEquals("51", run(PokemonDontGo::main, "5 10 6 3 5", "2", "4", "1", "1", "3", "0", "0"));
    }

    @Test
    void coursePlanning() {
        assertEquals("1.Arrays\n2.Data Types\n3.Objects\n4.Databases", run(SoftUniCoursePlanning::main,
                "Data Types, Objects, Lists", "Add:Databases", "Insert:Arrays:0", "Remove:Lists", "course start"));
        assertEquals("1.Methods\n2.Databases\n3.Databases-Exercise\n4.Arrays\n5.Lists", run(SoftUniCoursePlanning::main,
                "Arrays, Lists, Methods", "Swap:Arrays:Methods", "Exercise:Databases", "Swap:Lists:Databases", "Insert:Arrays:0", "course start"));
    }

    @Test
    void coursePlanningRemovesExerciseWithItsLesson() {
        assertEquals("1.B", run(SoftUniCoursePlanning::main, "A, B", "Exercise:A", "Remove:A", "course start"));
    }

    @Test
    void takeSkipRope() {
        assertEquals("TestString", run(TakeSkipRope::main, "skipTest_String044170"));
    }

    @Test
    void takeSkipRopeStopsAtTheEnd() {
        assertEquals("a", run(TakeSkipRope::main, "ab1511"));
    }

    @Test
    void train() {
        assertEquals("72 54 21 12 4 75 23 10 0", run(Train::main, "32 54 21 12 4 0 23", "75",
                "Add 10", "Add 0", "30", "10", "75", "end"));
    }
}
