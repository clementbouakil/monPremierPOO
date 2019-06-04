public class Wilder {

    // attributs
    private String firstName;
    private boolean aware;

    // constructeurs
    public Wilder(String firstName, boolean aware) {
        this.firstName = firstName;
        this.aware = aware;
    }

    // Ci-dessous, un getter (permettant la lecture d'un attribut privée)
    public String getFirstName() {
        return this.firstName;
    }

    // Ci-dessous, un setter (permettant la modification d'un attribut)
    public void getFirstName(String firstName) {
        this.firstName = firstName;
    }

    // getter
    public boolean isAware() {
        return this.aware;
    }

    // setter
    public void isAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        if (aware) {
            return "Je m'appelle " + this.getFirstName() + " et je suis aware";
        } else {
            return "Je m'appelle " + this.getFirstName() + " et je ne suis pas aware";
        }
    }

}