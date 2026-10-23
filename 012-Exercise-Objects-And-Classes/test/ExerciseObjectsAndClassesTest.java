import org.junit.jupiter.api.Test;

import static console.Console.run;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ExerciseObjectsAndClassesTest {

    @Test
    void advertisementMessage() {
        String[] lines = run(AdvertisementMessage::main, "3").split("\n");
        assertEquals(3, lines.length);
        for (String line : lines) {
            assertTrue(line.matches(".+ .+ [A-Z][a-z]+ - [A-Z][a-z]+"), line);
        }
    }

    @Test
    void articles() {
        assertEquals("better title - better content: better author", run(Articles.Main::main,
                "some title, some content, some author", "3", "Edit: better content", "ChangeAuthor: better author", "Rename: better title"));
    }

    @Test
    void articlesTwo() {
        assertEquals("Science\nJohnny", run(ArticlesTwo.Main::main, "2", "Science, planets, Bill", "title", "Article, content, Johnny", "author"));
    }

    @Test
    void carSalesman() {
        assertEquals("""
                FordFocus:
                  V4-33:
                    Power: 140
                    Displacement: 28
                    Efficiency: B
                  Weight: 1300
                  Color: Silver
                FordMustang:
                  V8-101:
                    Power: 220
                    Displacement: 50
                    Efficiency: n/a
                  Weight: n/a
                  Color: n/a
                VolkswagenGolf:
                  V4-33:
                    Power: 140
                    Displacement: 28
                    Efficiency: B
                  Weight: n/a
                  Color: Orange""", run(CarSalesman.Main::main, "2", "V8-101 220 50", "V4-33 140 28 B",
                "3", "FordFocus V4-33 1300 Silver", "FordMustang V8-101", "VolkswagenGolf V4-33 Orange"));
    }

    @Test
    void carSalesmanEngineWithEfficiencyOnly() {
        assertEquals("""
                Golf:
                  V6:
                    Power: 200
                    Displacement: n/a
                    Efficiency: A
                  Weight: n/a
                  Color: n/a""", run(CarSalesman.Main::main, "1", "V6 200 A", "1", "Golf V6"));
    }

    @Test
    void companyRoster() {
        assertEquals("Highest Average Salary: Development\nSam 840.20 sam@sam.com -1\nPeter 120.00 peter@abv.bg 28",
                run(CompanyRoster.Main::main, "4",
                        "Peter 120.00 Dev Development peter@abv.bg 28",
                        "Tina 333.33 Manager Marketing 33",
                        "Sam 840.20 ProjectLeader Development sam@sam.com",
                        "George 0.20 Freeloader Nowhere 18"));
    }

    @Test
    void opinionPoll() {
        assertEquals("Ivan - 48\nSam - 31", run(OpinionPoll.Main::main, "3", "Peter 12", "Sam 31", "Ivan 48"));
    }

    @Test
    void orderByAge() {
        assertEquals("""
                Stephan with ID: 524244 is 10 years old.
                Peter with ID: 78911 is 15 years old.
                George with ID: 123456 is 20 years old.""",
                run(OrderByAge.Main::main, "George 123456 20", "Peter 78911 15", "Stephan 524244 10", "End"));
    }

    @Test
    void rawDataFragile() {
        assertEquals("Citroen2CV", run(RawData.Main::main, "2",
                "ChevroletAstro 200 180 1000 fragile 1.3 1 1.5 2 1.4 2 1.7 4",
                "Citroen2CV 190 165 1200 fragile 0.9 3 0.85 2 0.95 2 1.1 1",
                "fragile"));
    }

    @Test
    void rawDataFlamable() {
        assertEquals("ChevroletExpress\nDaciaDokker", run(RawData.Main::main, "4",
                "ChevroletExpress 215 255 1200 flamable 2.5 1 2.4 2 2.7 1 2.8 1",
                "ChevroletAstro 210 230 1000 flamable 2 1 1.9 2 1.7 3 2.1 1",
                "DaciaDokker 230 275 1400 flamable 3.2 2 3.0 1 3.0 1 3.1 1",
                "Citroen2CV 190 165 1200 fragile 0.8 3 0.85 2 0.7 5 0.95 2",
                "flamable"));
    }

    @Test
    void rawDataFragileQueryIgnoresFlamableCars() {
        assertEquals("", run(RawData.Main::main, "1", "Truck 200 300 1000 flamable 2 1 2 1 2 1 2 1", "fragile"));
    }

    @Test
    void students() {
        assertEquals("Rocco Erben: 6.00\nPrince Messing: 5.49\nAkiko Segers: 4.85\nLakia Eason: 3.90", run(Students.Main::main,
                "4", "Lakia Eason 3.90", "Prince Messing 5.49", "Akiko Segers 4.85", "Rocco Erben 6.00"));
    }

    @Test
    void teamworkProjects() {
        assertEquals("""
                Team PowerPuffsCoders has been created by Didi!
                Team Toni is the best has been created by Toni!
                Member Toni cannot join team Toni is the best!
                PowerPuffsCoders
                - Didi
                -- Petq
                Teams to disband:
                Toni is the best""", run(TeamworkProjects.Main::main, "2", "Didi-PowerPuffsCoders", "Toni-Toni is the best",
                "Petq->PowerPuffsCoders", "Toni->Toni is the best", "end of assignment"));
    }

    @Test
    void teamworkProjectsSortsByMemberCountThenName() {
        assertEquals("""
                Team A has been created by a!
                Team B has been created by b!
                Team Ghost does not exist!
                B
                - b
                -- x
                -- y
                A
                - a
                -- z
                Teams to disband:""", run(TeamworkProjects.Main::main, "2", "a-A", "b-B",
                "x->B", "y->B", "z->A", "w->Ghost", "end of assignment"));
    }

    @Test
    void vehicleCatalogue() {
        assertEquals("""
                Type: Car
                Model: Ferrari
                Color: red
                Horsepower: 550
                Type: Car
                Model: Ford
                Color: green
                Horsepower: 120
                Type: Truck
                Model: Man
                Color: red
                Horsepower: 200
                Cars have average horsepower of: 413.33.
                Trucks have average horsepower of: 250.00.""", run(VehicleCatalogue.Main::main,
                "truck Man red 200", "truck Mercedes blue 300", "car Ford green 120", "car Ferrari red 550", "car Lamborghini orange 570",
                "End", "Ferrari", "Ford", "Man", "Close the Catalogue"));
    }
}
