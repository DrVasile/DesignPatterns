class PlayerBuilder {

    void build(String sport, String gender) {
        if (sport.equalsIgnoreCase("Volleyball") || sport.equalsIgnoreCase("Basketball")) {
            PlayerAdapter playerAdapter = new PlayerAdapter(sport, gender);
            playerAdapter.playSport();
        } else {
            System.out.println("Invalid sport entered.");
        }
    }
}
