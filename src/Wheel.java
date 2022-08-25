public class Wheel {
    private final int diametr;
    private boolean isPunctured = false; //false = колесо целое;

    public Wheel(int diametr) {
        this.diametr = diametr;
    }

    public int getDiametr() {
        return diametr;
    }

    public boolean inGoodCondition() {
        return !isPunctured;
    }

    public void patchWheel() {
        this.isPunctured = false;
    }

    public void punctureWheel() {
        this.isPunctured = true;
    }

    @Override
    public String toString() {
        return ("Wheel[" + "diametr=" + diametr + ", isPunctured=" + isPunctured + ']');
    }
}
