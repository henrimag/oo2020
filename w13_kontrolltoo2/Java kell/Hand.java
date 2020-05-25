public class Hand {
    int display;

    public Hand() {
    }

    public void setHandPosition(double protsent) {
        display = (int)(protsent * 60);
    }

    public String toString() {
        return String.valueOf(display);
    }
}