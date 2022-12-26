package fikstureCreate;

public class Main {
    public static void main(String[] args) {


        Fixture teams = new Fixture();

        teams.teamList.add("Galatasaray");
        teams.teamList.add("FenerBahce");
        teams.teamList.add("Besiktas");
        teams.teamList.add("Bursaspor");
        teams.teamList.add("Hatayspor");
        teams.teamList.add("Trabzonspor");
        teams.teamList.add("Boluspor");

        teams.run();


    }
}
