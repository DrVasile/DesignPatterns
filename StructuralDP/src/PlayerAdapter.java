public class PlayerAdapter extends BasicPlayer {

    BasicPlayer advancedPlayer;

    public PlayerAdapter(String sport) {
        if (sport.equalsIgnoreCase("Volleyball")) {
            advancedPlayer = new VolleyballPlayer();
        } else {
            advancedPlayer = new BasketballPlayer();
        }
    }

    public void playSport() {
        advancedPlayer.play();
    }
}
