

public class Running {
    public static void main(String[] args) {
        System.out.println(" --------- ");
        Wheel wheel1 = new Wheel(17);
        Wheel wheel2 = new Wheel(17);
        Wheel wheel3 = new Wheel(17);
        Wheel wheel4 = new Wheel(17);
        Wheel[] camry1_whells = new Wheel[]{wheel1, wheel2, wheel3, wheel4};

        Gastank camry1_gastank = new Gastank();
        Engine camry1_engine = new Engine();
        Headlights camry1_headlights = new Headlights();
        Electrics camry1_electrics = new Electrics();

        Camry camry1 = new Camry(camry1_whells, camry1_gastank, camry1_engine, camry1_electrics, camry1_headlights, CarColor.white, Transmission.automatic, 300.99);
        System.out.println(camry1);
//        camry1.wheelFailure();
//        System.out.println(camry1.wheelFailure());
//        camry1.punctureWheel();
//        camry1.setGastank(false);
//        camry1.setEngine(false);
//        camry1.setElectrics(false);
//        camry1.setHeadlights(false);
//        System.out.println(camry1);
//        System.out.println(camry1.getPrice());
//        camry1.setGastank(10);
//        camry1.setCarMovement(20);
//        System.out.println(camry1.getCarMovement());
//        camry1.CarStop();
//        System.out.println(camry1.getCarMovement());
//        camry1.setHeadlights(false);
//        System.out.println(camry1.getHeadlights());
//        camry1.powerButtonMusicUSB();
//        camry1.powerButtonCruiseControl();
        System.out.println(" --------- ");

        // Hiance
        Wheel wheelH1 = new Wheel(20);
        Wheel wheelH2 = new Wheel(20);
        Wheel wheelH3 = new Wheel(20);
        Wheel wheelH4 = new Wheel(20);
        Wheel wheelH5 = new Wheel(20);
        Wheel[] hiance1_whells = new Wheel[]{wheelH1, wheelH2, wheelH3, wheelH4};
        Gastank hiance1_gastank = new Gastank();
        Engine hiance1_engine = new Engine();
        Headlights hiance1_headlights = new Headlights();
        Electrics hiance1_electrics = new Electrics();
        Hiance hiance1 = new Hiance(hiance1_whells, hiance1_gastank, hiance1_engine, hiance1_electrics, hiance1_headlights, CarColor.black, Transmission.robot, wheelH5, 450.99);
        System.out.println(hiance1);
        System.out.println(hiance1.getZapaskaWheel());
        hiance1.punctureWheel();
        hiance1.wheelFailure();
        System.out.println(hiance1);
        System.out.println("___________");
        hiance1.wheelSwitch();
        hiance1.wheelFailure();
        System.out.println(hiance1);
        System.out.println(hiance1.getZapaskaWheel());
        System.out.println(" --------- ");

        // Dyna
        Wheel wheelD1 = new Wheel(20);
        Wheel wheelD2 = new Wheel(20);
        Wheel wheelD3 = new Wheel(20);
        Wheel wheelD4 = new Wheel(20);
        Wheel[] dyna1_whells = new Wheel[]{wheelD1, wheelD2, wheelD3, wheelD4};

        Gastank dyna1_gastank = new Gastank();
        Engine dyna1_engine = new Engine();
        Headlights dyna1_headlights = new Headlights();
        Electrics dyna1_electrics = new Electrics();

        Dyna dyna1 = new Dyna(dyna1_whells, dyna1_gastank, dyna1_engine, dyna1_electrics, dyna1_headlights, CarColor.red, Transmission.robot, 600.99);
        System.out.println(dyna1);
        System.out.println(" --------- ");

        //Solara
        Wheel wheelS1 = new Wheel(16);
        Wheel wheelS2 = new Wheel(16);
        Wheel wheelS3 = new Wheel(16);
        Wheel wheelS4 = new Wheel(16);
        Wheel[] solara1_whells = new Wheel[]{wheelS1, wheelS2, wheelS3, wheelS4};

        Gastank solara1_gastank = new Gastank();
        Engine solara1_engine = new Engine();
        Headlights solara1_headlights = new Headlights();
        Electrics solara1_electrics = new Electrics();

        Solara solara1 = new Solara(solara1_whells, solara1_gastank, solara1_engine, solara1_electrics, solara1_headlights, CarColor.silver, Transmission.mechanics, 500.99);
        System.out.println(solara1);


    }
}

