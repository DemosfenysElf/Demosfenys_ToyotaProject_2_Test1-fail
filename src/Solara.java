// легковой, кабриолет (опустить/поднять крышу), 16 колёса, круиз-контроль, мини-холодильник (охладить напиток)
public class Solara extends AutoToyota {
    private boolean roofUp = true;
    private boolean drinkСhilled = false;
    private boolean onCruiseControl = false;
    private final int carMovementMax = 280;

    public Solara(Wheel[] wheels, Gastank gastank, Engine engine, Electrics electrics, Headlights headlights, CarColor carColor, Transmission transmission, double price) {
        super(wheels, gastank, engine, electrics, headlights, carColor, transmission, price);
        for (Wheel wheel : wheels) {
            if (wheel.getDiametr() != 16) {
                throw new RuntimeException("Диаметр колес для Solara должен быть: 16");
            }
        }
    }

    public void powerButtonRoofUp() {
        this.roofUp = !roofUp;
        if (this.roofUp) {
            System.out.println("Крыша опускается");
        } else {
            System.out.println("Крыша поднимается");
        }

    }

    public void powerButtonDrinkСhilled() {
        this.drinkСhilled = !drinkСhilled;
        if (this.drinkСhilled) {
            System.out.println("Напиток охлаждается");
        } else {
            System.out.println("Охлаждение отключено");
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

    public boolean isOnCruiseControl() {
        return onCruiseControl;
    }

    public boolean isOnRoofUp() {
        return roofUp;
    }

    public boolean isOnDrinkСhilled() {
        return drinkСhilled;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSolara max speed: " + carMovementMax;
    }
}