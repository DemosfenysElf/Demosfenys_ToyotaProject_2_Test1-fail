import org.w3c.dom.ls.LSOutput;

// легковой, 17 колёса, круиз-контроль, наличие USB (включить/вылючить музыку)
public class Camry extends AutoToyota {
    private boolean onCruiseControl = false;
    private boolean onMusicUSB = false;
    private final int carMovementMax = 220;

    public Camry(Wheel[] wheels, Gastank gastank, Engine engine, Electrics electrics, Headlights headlights, CarColor carColor, Transmission transmission, double price) {
        super(wheels, gastank, engine, electrics, headlights, carColor, transmission, price);
        for (Wheel wheel : wheels) {
            if (wheel.getDiametr() != 17) {
                throw new RuntimeException("Диаметр колес для Camry должен быть: 17");
            }
        }
    }

    public void powerButtonCruiseControl() {
        this.onCruiseControl = !onCruiseControl;
        if (this.onCruiseControl) {
            System.out.println("Круиз-контроль включен");
        } else {
            System.out.println("Круиз-контроль выключен");
        }

    }

    public void powerButtonMusicUSB() {
        this.onMusicUSB = !onMusicUSB;
        if (this.onMusicUSB) {
            System.out.println("Музыка включена");
        } else {
            System.out.println("Музыка выключена");
        }
    }

    public boolean isOnCruiseControl() {
        return onCruiseControl;
    }

    public boolean isOnMusicUSB() {
        return onMusicUSB;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCamry max speed: " + carMovementMax;
    }
}