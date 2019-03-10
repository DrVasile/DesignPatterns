public class Main {

    public static void main(String[] args) {
        Player playerA = new VolleyballPlayer(new FemalePlayer());
        Player playerB = new CaptainPlayer(new BasketballPlayer(new MalePlayer()));

        playerA.standards();
        playerB.standards();

        //System.out.println(playerA.getDescription());
        //System.out.println(playerB.getDescription());
        //playerA.play();
        //playerB.play();

        //PlayerBuilder playerBuilder = new PlayerBuilder();
        //playerBuilder.build("volleyball", "female");
    }
}
