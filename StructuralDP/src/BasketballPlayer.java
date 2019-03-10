public class BasketballPlayer extends BasicPlayer {

    BasketballPlayer(PlayerAPI playerAPI) {
        super(playerAPI);
    }

    @Override
    public void play() {
        System.out.println("Playing Basketball!!");
    }
}
