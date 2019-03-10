public class BasketballPlayer extends BasicPlayer {

    BasketballPlayer(PlayerAPI playerAPI) {
        super(playerAPI);
        super.setSport("Basketball");
    }

    @Override
    public void play() {
        System.out.println("Playing Basketball!!");
    }
}
