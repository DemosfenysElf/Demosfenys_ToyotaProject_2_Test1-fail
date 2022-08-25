// Для всех машин характерны следующие атрибуты: цвет, максимальная скорость, тип коробки передач (акпп, механика, робот), в состоянии движения (да/нет).
// Машины состоят из следующих компонентов: 4 колеса, бензобак, двигатель, электрика, фары
// Бензобак имеет атрибут - количество бензина
// Двигатель имеет атрибут - работоспособен
// Электрика имеет атрибут - работоспособна
// Фары имеют атрибут - работоспособны
// Цена - с центами
// Каждое колесо имеет состояние - проколото или нет. Колеса могуть быть заменяемы если они одинакового диаметра.

//Для всех машин характерны функции:
//  Начать движение - меняет состояние движения. Начать движение возможно только при: наличии всех колес и они не проколоты, непустом бензобаке,
//  работоспособным электрике и двигателю. Если что то из этого невыполняется, то выкидывается ошибка StartCarException, в сообщении которой
//  содержится причина невозможности движения.
//  Остановить движение - меняет состояние движения. Для остановки не нужно условий.
//  Включить фары - сообщает о работе фар.
//  Для всех машин характерны следующие атрибуты:
//  цвет, максимальная скорость, тип коробки передач (акпп, механика, робот), в состоянии движения (да/нет).

import java.util.concurrent.ThreadLocalRandom;

public abstract class AutoToyota {
    private Wheel[] wheels;
    private Gastank gastank;
    private Engine engine;
    private Electrics electrics;
    private Headlights headlights;
    private double price;
    private int carMovement;
    private CarColor carColor;
    private Transmission transmission;


    public AutoToyota(Wheel[] wheels, Gastank gastank, Engine engine, Electrics electrics, Headlights headlights, CarColor carColor, Transmission transmission, double price) {
        this.wheels = wheels;
        this.gastank = gastank;
        this.engine = engine;
        this.electrics = electrics;
        this.headlights = headlights;
        this.price = price;
        this.carMovement = 0;
        this.carColor = carColor;
        this.transmission = transmission;

    }


    public boolean getHeadlights() {
        return headlights.onHeadlights();
    }

    public void setHeadlights(boolean headlights) {
        this.headlights.onoffHeadlights(headlights);
        if (headlights) {
            System.out.println("Фары включены.");
        } else System.out.println("Фары выключены.");
    }

    public int getCarMovement() {
        return carMovement;
    }

    public void setCarMovement(int carMovement) {
        if (goDrive()) {
            this.carMovement = carMovement;
        }
    }

    public void CarStop() {
        this.carMovement = 0;
    }


//    public Wheel[] getWheels() {
//        return wheels;
//    }
//    public void setWheels(Wheel[] wheels) {
//        this.wheels = wheels;
//    }

    public void wheelFailure() {
        int j = 0;
        for (Wheel wheel : wheels) {
            if (!wheel.inGoodCondition()) {
                j++;
            }
        }
        if (j > 0) {
            System.out.println("Всего не исправно: " + j + " колёс.");
        } else {
            System.out.println("Все колеса исправны.");
        }

    }

    public Gastank getGastank() {
        return gastank;
    }

    public void setGastank(int setReadyForWork) {
        this.gastank.setReadyForWork(setReadyForWork);
    }

    public void setEngine(boolean setReadyForWork) {
        this.engine.setReadyForWork(setReadyForWork);
    }

    public void setElectrics(boolean setReadyForWork) {
        this.electrics.setReadyForWork(setReadyForWork);
    }

    public void setWorkedHeadlights(boolean setReadyForWork) {
        this.headlights.setReadyForWork(setReadyForWork);
    }

    private boolean goDrive() {

        for (Wheel wheel : wheels) {
            if (!wheel.inGoodCondition()) {
                throw new StartCarException("Одно из колёс явно пробито! Запустите полную проверку");
            }
        }
//        if (!gastank.readyForWork & !engine.readyForWork & !electrics.readyForWork & !headlights.readyForWork) {
//            throw new StartCarException("text1");
//        }

        if (!headlights.isReadyForWork()) {
            throw new StartCarException("Не работают фары, запустите полную проверку");
        }
        if (!engine.isReadyForWork()) {
            throw new StartCarException("Не работает двигатель, запустите полную проверку");
        }
        if (gastank.isReadyForWork() == 0) {
            throw new StartCarException("Пустой бак, запустите полную проверку");
        }
        if (!electrics.isReadyForWork()) {
            throw new StartCarException("Не работает проводка, запустите полную проверку");
        }
        return true;
    }

    public void punctureWheel() {
        int i = ThreadLocalRandom.current().nextInt(0, 4);
        wheels[i].punctureWheel();
    }

    @Override
    public String toString() {
        StringBuilder wheelsToString = new StringBuilder(" ");
        for (Wheel wheel : wheels) {
            wheelsToString.append(wheel).append("; ");
        }
        String s1 = "Gastank: " + gastank.isReadyForWork() + "; Engine: " + engine.isReadyForWork() + "; Electrics: " + electrics.isReadyForWork() + "; Headlights: " + headlights.isReadyForWork();
        String s2 = "Transmission: " + transmission + "; Color: " + carColor + "; price: " + price;
        return ("Auto toyota have " + wheelsToString + "\n" + s1 + "\n" + s2);
    }

    public double getPrice() {
        return price;
    }

}
