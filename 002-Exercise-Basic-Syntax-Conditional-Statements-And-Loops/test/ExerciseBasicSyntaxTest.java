import org.junit.jupiter.api.Test;

import static console.Console.run;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExerciseBasicSyntaxTest {

    @Test
    void ages() {
        assertEquals("baby", run(Exercise_001::main, "1"));
        assertEquals("teenager", run(Exercise_001::main, "15"));
        assertEquals("elder", run(Exercise_001::main, "100"));
    }

    @Test
    void division() {
        assertEquals("The number is divisible by 10", run(Exercise_002::main, "30"));
        assertEquals("The number is divisible by 6", run(Exercise_002::main, "12"));
        assertEquals("Not divisible", run(Exercise_002::main, "1643"));
    }

    @Test
    void vacation() {
        assertEquals("Total price: 266.73", run(Exercise_003::main, "30", "Students", "Sunday"));
        assertEquals("Total price: 800.00", run(Exercise_003::main, "40", "Regular", "Saturday"));
    }

    @Test
    void vacationBusinessGroupGetsTenPeopleFree() {
        assertEquals("Total price: 1600.00", run(Exercise_003::main, "110", "Business", "Sunday"));
    }

    @Test
    void sumNumbersInRange() {
        assertEquals("5 6 7 8 9 10\nSum: 45", run(Exercise_004::main, "5", "10"));
    }

    @Test
    void login() {
        assertEquals("Incorrect password. Try again.\nUser Acer logged in.", run(Exercise_005::main, "Acer", "login", "recA"));
        assertEquals("Incorrect password. Try again.\n".repeat(4) + "User sunny blocked!",
                run(Exercise_005::main, "sunny", "a", "b", "c", "d"));
    }

    @Test
    void strongNumber() {
        assertEquals("yes", run(Exercise_006::main, "145"));
        assertEquals("no", run(Exercise_006::main, "1234"));
    }

    @Test
    void vendingMachine() {
        assertEquals("""
                Cannot accept 0.6
                Purchased Nuts
                Sorry, not enough money
                Change: 0.50""", run(Exercise_007::main, "1", "1", "0.5", "0.6", "Start", "Nuts", "Coke", "End"));
    }

    @Test
    void vendingMachineDoesNotSellUnknownProducts() {
        assertEquals("Invalid product\nChange: 2.00", run(Exercise_007::main, "2", "Start", "Gum", "End"));
    }

    @Test
    void triangleOfNumbers() {
        assertEquals("1\n2 2\n3 3 3", run(Exercise_008::main, "3"));
    }

    @Test
    void padawanEquipment() {
        assertEquals("The money is enough - it would cost 13.00lv.", run(Exercise_009::main, "100", "2", "1.0", "2.0", "3.0"));
        assertEquals("Ivan Cho will need 737.00lv more.", run(Exercise_009::main, "100", "42", "12.0", "4.0", "3.0"));
    }

    @Test
    void padawanEquipmentRoundsTenPercentExactly() {
        // 10 * 1.1 must give 11 lightsabers, not ceil(11.000000000000002) = 12
        assertEquals("The money is enough - it would cost 11.00lv.", run(Exercise_009::main, "100", "10", "1.0", "0", "0"));
    }

    @Test
    void rageExpenses() {
        assertEquals("Rage expenses: 16.00 lv.", run(Exercise_010::main, "7", "2", "3", "4", "5"));
        assertEquals("Rage expenses: 608.00 lv.", run(Exercise_010::main, "23", "12.50", "21.50", "40", "200"));
    }

    @Test
    void sortNumbers() {
        assertEquals("3\n2\n1", run(Exercise_011::main, "2", "1", "3"));
        assertEquals("0\n-1\n-2", run(Exercise_011::main, "-2", "0", "-1"));
    }

    @Test
    void sortNumbersWithEqualValues() {
        assertEquals("5\n5\n1", run(Exercise_011::main, "5", "1", "5"));
    }

    @Test
    void sortNumbersAlternatives() {
        assertEquals("[3, 2, 1]", run(Exercise_012::main, "2", "1", "3"));
        assertEquals("3 2 1", run(Exercise_013::main, "2", "1", "3"));
    }

    @Test
    void englishNameOfLastDigit() {
        assertEquals("two", run(Exercise_014::main, "512"));
        assertEquals("one", run(Exercise_014::main, "-1"));
        assertEquals("zero", run(Exercise_014::main, "10"));
    }

    @Test
    void gamersTesting() {
        assertEquals("""
                Bought OutFall 4
                Bought RoverWatch Origins Edition
                Total spent: $79.98. Remaining: $40.02""",
                run(Exercise_015::main, "120", "OutFall 4", "RoverWatch Origins Edition", "Game Time"));
        assertEquals("Not Found\nToo Expensive\nBought RoverWatch\nOut of money!",
                run(Exercise_015::main, "29.99", "Bogus", "Honored 2", "RoverWatch", "Game Time"));
    }

    @Test
    void gamersTestingOutOfMoneyAfterSeveralPurchases() {
        // 59.97 - 19.99 - 19.99 - 19.99 is not exactly 0.0 in floating point
        assertEquals("Bought Zplinter Zell\nBought Zplinter Zell\nBought Zplinter Zell\nOut of money!",
                run(Exercise_015::main, "59.97", "Zplinter Zell", "Zplinter Zell", "Zplinter Zell", "Game Time"));
    }

    @Test
    void reverseString() {
        assertEquals("olleH", run(Exercise_016::main, "Hello"));
    }

    @Test
    void messages() {
        assertEquals("hey you", run(Exercise_017::main, "7", "44", "33", "999", "0", "999", "666", "88"));
    }
}
