// грузовой фургон, 20 колеса, грузоподъемность 3000кг, наличие USB-розетки (зарядить телефон).

public class Dyna extends AutoToyota {
    private final String carrying = "3000 кг";
    private boolean onUSBCharge = false;
    private final int carMovementMax = 100;

    public Dyna(Wheel[] wheels, Gastank gastank, Engine engine, Electrics electrics, Headlights headlights, CarColor carColor, Transmission transmission, double price) {
        super(wheels, gastank, engine, electrics, headlights, carColor, transmission, price);
        for (Wheel wheel : wheels) {
            if (wheel.getDiametr() != 20) {
                throw new RuntimeException("Диаметр колес для Dyna должен быть: 20");
            }
        }
    }

    public boolean onUSBCharge() {
        return onUSBCharge;
    }

    public void powerButtonUSBCharge() {
        this.onUSBCharge = !onUSBCharge;
        if (this.onUSBCharge) {
            System.out.println("Зарядка подключена");
        } else {
            System.out.println("Зарядка выключена");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nDyna max speed: " + carMovementMax + "; Dyna max carrying: " + carrying;
    }
}