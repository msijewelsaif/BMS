// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var abeer = new User("Abeer", "jfldjlfd");
        Profile  abeer_profile = abeer.setProfile("O+", "tangail");
        var sifat = new User("Sifat", "jfldjlfd");
        Profile sifat_profile = abeer.setProfile("O+", "chittagong");
        abeer_profile.donateBlood(sifat_profile);
    }
}