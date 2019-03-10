public class Main {

    public static void main(String[] args) {
        Player playerA = new VolleyballPlayer();
        Player playerB = new CaptainPlayer(new VolleyballPlayer());

        System.out.println(playerA.getDescription());
        System.out.println(playerB.getDescription());
        playerA.play();
        playerB.play();

        PlayerBuilder playerBuilder = new PlayerBuilder();
        playerBuilder.build("volleyball");
    }
}
