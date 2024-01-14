package mainPackage;

public class Tally {
    public static void main(String[] args) {
        Firetruck firetruck = Firetruck.GBA;
        Firetruck firetruck1 = Firetruck.GBM;
        Tally tally = new Tally();
        tally.run();
    }

    private void run() {
        Firefighterable[] firefightersPeople = new Firefighterable[]{
                new FirefightersList(" Karol ", " Kowalski ", " Dowodca "),
                new FirefightersList(" Jan ", " Kowalski ", " Kierowca "),
                new FirefightersList(" Anna ", " Kowalska ", " Ratownik "),
                new FirefightersList(" Hanna ", " Kowalska ", " Ratownik "),
                new FirefightersList(" Franek ", " Kowalski ", " Ratownik "),
        };

        for (Firefighterable firefightersPerson : firefightersPeople) {
            System.out.println(firefightersPerson);
        }
    }
}
