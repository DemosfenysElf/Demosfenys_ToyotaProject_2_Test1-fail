public class StartCarException extends RuntimeException {
    public StartCarException() {
        super();
    }

    public StartCarException(String message) {
        super(message);

    }
}

//         if (!headlights.isReadyForWork()) {
//         throw new StartCarException("Не работают фары");
//         }
//         if (!engine.isReadyForWork()) {
//         throw new StartCarException("Не работает двигатель");
//         }
//         if (!gastank.isReadyForWork()) {
//         throw new StartCarException("Пустой бак");
//         }
//         if (!electrics.isReadyForWork()) {
//         throw new StartCarException("Не работает проводка");
//         }