public class VolleyballPlayer extends BasicPlayer {

    VolleyballPlayer(PlayerAPI playerAPI) {
        super(playerAPI);
        super.setSport("Volleyball");
    }

    @Override
    public void play() {
        System.out.println("Playing Volleyball!!");
    }
}
