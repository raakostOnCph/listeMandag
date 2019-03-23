public class Knude {

    Knude next= null;
    Knude previous = null;

    public Knude(String navn) {
        this.navn = navn;
    }

    private String navn;

    public String getNavn() {
        return navn;
    }
}
