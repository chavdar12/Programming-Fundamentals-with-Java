import org.junit.jupiter.api.Test;

import static console.Console.run;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExerciseRegularExpressionsTest {

    @Test
    void extractEmails() {
        assertEquals("support@github.com", run(ExtractEmails::main, "Please contact us at: support@github.com."));
        assertEquals("s.miller@mit.edu\nj.hopking@york.ac.uk", run(ExtractEmails::main,
                "Just send email to s.miller@mit.edu and j.hopking@york.ac.uk for more information."));
        assertEquals("steve.parker@softuni.de", run(ExtractEmails::main,
                "Many users @ SoftUni confuse email addresses. We @ Softuni.BG provide high-quality training @ home or @ class. –- steve.parker@softuni.de."));
    }

    @Test
    void furnitureSkipsInvalidLines() {
        assertEquals("Bought furniture:\nSofa\nTV\nTotal money spend: 2436.69",
                run(Furniture::main, ">>Sofa<<312.23!3", ">>TV<<300!5", ">Invalid<<!5", "Purchase"));
    }

    @Test
    void netherRealms() {
        assertEquals("M3ph-0.5s-0.5t0.0** - 524 health, 8.00 damage", run(NetherRealms::main, "M3ph-0.5s-0.5t0.0**"));
        assertEquals("Azazel - 615 health, 0.00 damage\nM3ph1st0** - 524 health, 16.00 damage",
                run(NetherRealms::main, "M3ph1st0**, Azazel"));
        assertEquals("Gos/ho - 512 health, 0.00 damage", run(NetherRealms::main, "Gos/ho"));
    }

    @Test
    void postOffice() {
        assertEquals("Argo\nOr\nThe\nParahaos", run(PostOffice::main,
                "sdsGGasAOTPWEEEdas$AOTP$|a65:1.2s65:03d79:01ds84:02! -80:07++ABs90:1.1|adsaArmyd Gara So La Arm Armyw21 Argo O daOfa Or Ti Sar saTheww The Parahaos"));
    }

    @Test
    void race() {
        assertEquals("1st place: George\n2nd place: Peter\n3rd place: Tom", run(Race::main, "George, Peter, Bill, Tom",
                "G4e@55or%6g6!68e!!@", "R1@!3a$y4456@", "B5@i@#123ll", "G@e54o$r6ge#", "7P%et^#e5346r", "T$o553m&6", "end of race"));
    }

    @Test
    void rageQuit() {
        assertEquals("Unique symbols used: 1\nAAA", run(RageQuit::main, "a3"));
        assertEquals("Unique symbols used: 5\nASDASD&&&&&S@", run(RageQuit::main, "aSd2&5s@1"));
    }

    @Test
    void santaSecretHelperPrintsOnlyGoodChildren() {
        assertEquals("Kate\nBobbie", run(SantaSecretHelper::main, "3",
                encrypt("@Kate#abc!G!", 3), encrypt("@Bobbie!G!", 3), encrypt("@Tom!N!", 3), encrypt("@Bad-filler!G!", 3), "end"));
    }

    @Test
    void softUniBarIncome() {
        assertEquals("George: Croissant - 20.60\nPeter: Gum - 1.30\nMaria: Cola - 2.40\nTotal income: 24.30", run(SoftUniBarIncome::main,
                "%George%<Croissant>|2|10.3$", "%Peter%<Gum>|1|1.3$", "%Maria%<Cola>|1|2.4$", "%Invalid%<Cola>|1|2.4", "end of shift"));
    }

    @Test
    void starEnigma() {
        assertEquals("Attacked planets: 1\n-> Alderaa\nDestroyed planets: 1\n-> Cantonica", run(StarEnigma::main,
                "2", "STCDoghudd4=63333$D$0A53333", "EHfsytsnhf?8555&I&2C9555SR"));
    }

    @Test
    void winningTicket() {
        assertEquals("ticket \"Cash$$$$$$Ca$$$$$$sh\" - 6$", run(WinningTicket::main, "Cash$$$$$$Ca$$$$$$sh"));
        assertEquals("""
                ticket "$$$$$$$$$$$$$$$$$$$$" - 10$ Jackpot!
                invalid ticket
                ticket "th@@@@@@eemo@@@@@@ey" - 6@""", run(WinningTicket::main, "$$$$$$$$$$$$$$$$$$$$, aabb  , th@@@@@@eemo@@@@@@ey"));
        assertEquals("ticket \"validticketnomatch:(\" - no match", run(WinningTicket::main, "validticketnomatch:("));
    }

    private static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();
        text.chars().forEach(c -> result.append((char) (c + key)));
        return result.toString();
    }
}
