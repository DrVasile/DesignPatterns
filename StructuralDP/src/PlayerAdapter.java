class PlayerAdapter extends BasicPlayer {

    BasicPlayer advancedPlayer;

    PlayerAdapter(String sport, String gender) {
        if (sport.equalsIgnoreCase("Volleyball")) {
            advancedPlayer = new VolleyballPlayer(gender.equalsIgnoreCase("male") ? new MalePlayer() : new FemalePlayer());
        } else {
            advancedPlayer = new BasketballPlayer(gender.equalsIgnoreCase("male") ? new MalePlayer() : new FemalePlayer());
        }
    }

    void playSport() {
        advancedPlayer.play();
    }
}
