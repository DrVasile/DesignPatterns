public abstract class Player {

    protected PlayerAPI playerAPI;

    public Player() {
        // default constructor
    }

    public Player(PlayerAPI playerAPI) {
        this.playerAPI = playerAPI;
    }

    abstract void play();
    abstract String getDescription();
    abstract void standards();
}