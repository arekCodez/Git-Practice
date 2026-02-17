package poFolder;

public class Po {

    private String nationality;
    private String faveSaying;
    private String dumplingSkill;

    public Po() {
        //
        nationality = "Taiwanese";
        faveSaying = "Oh my days";
        dumplingSkill = "Above average (in the U.S.)";
    }

    public void getInfo() {
        System.out.println("Nationality: " + nationality);
        System.out.println("Favorite saying: " + faveSaying);
        System.out.println("Dumpling abilities: " + dumplingSkill);
    }
}
