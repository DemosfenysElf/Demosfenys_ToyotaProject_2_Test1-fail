public class Headlights {
    private boolean readyForWork = true; //готовы к работе?
    private boolean onHeadlights = false; //включены?

    public boolean isReadyForWork() {
        return readyForWork;
    }

    public void setReadyForWork(boolean readyForWork) {
        this.readyForWork = readyForWork;
    }

    public Headlights() {
    }

    public void onoffHeadlights(boolean onHeadlights) {
        this.onHeadlights = onHeadlights;
    }

    public boolean onHeadlights() {
        return onHeadlights;
    }
}