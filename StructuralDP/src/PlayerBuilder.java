public class PlayerBuilder {

    PlayerAdapter playerAdapter;

    public void build(String sport) {
        if (sport.equalsIgnoreCase("Volleyball") || sport.equalsIgnoreCase("Basketball")) {
            playerAdapter = new PlayerAdapter(sport);
            playerAdapter.playSport();
        } else {
            System.out.println("Invalid sport entered.");
        }
    }
}
