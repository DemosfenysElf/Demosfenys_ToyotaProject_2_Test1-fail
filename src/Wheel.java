public class Wheels {
    private int diametr;
    private boolean isPunctured = false; //false = колесо целое;

    public Wheels(int diametr) {
        this.diametr = diametr;
    }

    public int getDiametr() {
        return diametr;
    }

    public boolean inGoodCondition() {
        return !isPunctured;
    }

    public String wheelIntegrity() {
        if (isPunctured) {
            return "Колесо проколото";
        }

        return "Колесо не проколото";
    }

    public void patchWheel() {
        this.isPunctured = false;
    }

    public void punctureWheel() {
        this.isPunctured = true;
    }


}
