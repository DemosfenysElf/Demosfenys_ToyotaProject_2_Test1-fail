// грузовой фургон, 20 колеса, грузоподъемность 740кг, наличие запасного колеса

public class Hiance extends AutoToyota {
    private final String carrying = "740 кг";
    private Wheel zapaskaWheel;
    private Wheel[] wheels;
    private final int carMovementMax = 130;

    public Hiance(Wheel[] wheels, Gastank gastank, Engine engine, Electrics electrics, Headlights headlights, CarColor carColor, Transmission transmission, Wheel zapaskaWheel, double price) {
        super(wheels, gastank, engine, electrics, headlights, carColor, transmission, price);
        this.zapaskaWheel = zapaskaWheel;
        this.wheels = wheels;
        for (Wheel wheel : wheels) {
            if (wheel.getDiametr() != 20) {
                throw new RuntimeException("Диаметр колес для Hiance должен быть: 20");
            }
        }
    }

    // Замена запасного колеса
    public void wheelSwitch() {
        Wheel wheelsmen = new Wheel(20);
        if (zapaskaWheel.getDiametr() == 20 & zapaskaWheel.inGoodCondition()) {
            for (int i = 0; i < 4; i++) {
                if (!wheels[i].inGoodCondition()) {
                    wheelsmen = wheels[i];
                    wheels[i] = zapaskaWheel;
                    zapaskaWheel = wheelsmen;
                    System.out.println("Колесо заменено");
                    break;
                }
            }
            System.out.println("Колеса  целые");
        } else System.out.println("Колесо не подходит, используейте исправные колёса 20 диаметра");
    }

    public Wheel getZapaskaWheel() {
        return zapaskaWheel;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHiance max speed: " + carMovementMax + "; Hiance max carrying: " + carrying + "; Hiance spare wheel is Punctured: " + zapaskaWheel.inGoodCondition();
    }

}