import java.util.List;

public class Main {

    public static void main(String[] args) {
        /**
         * Test Decorator and Bridge
        Player playerA = new VolleyballPlayer(new FemalePlayer());
        Player playerB = new CaptainPlayer(new BasketballPlayer(new MalePlayer()));

        System.out.println(playerA.getDescription());
        System.out.println(playerB.getDescription());
        playerA.play();
        playerB.play();*/

        /**
         * Test Adapter
        PlayerBuilder playerBuilder = new PlayerBuilder();
        playerBuilder.build("volleyball", "female");
        playerBuilder.build("Basketball", "Male");*/

        /**
         * Test Composite and Filter

        BasicPlayer player1 = new BasicPlayer(new FemalePlayer());
        BasicPlayer player2 = new BasicPlayer(new MalePlayer());
        BasicPlayer player3 = new BasicPlayer(new MalePlayer());
        BasicPlayer player4 = new BasicPlayer(new MalePlayer());
        BasicPlayer player5 = new BasicPlayer(new MalePlayer());
        player1.setName("Ana"); player1.setGender("female");
        player2.setName("Boris"); player2.setGender("Male");
        player3.setName("Ion"); player3.setGender("male");
        player4.setName("Ioan"); player4.setGender("male");
        player5.setName("Ivan"); player5.setGender("Male");
        player5.addTeammate(player2);
        player5.addTeammate(player1);
        player5.addTeammate(player3);

        Criteria malePlayers = new CriteriaMale();
        List<BasicPlayer> males = malePlayers.criteria(player5.getTeammates());
        for (BasicPlayer player : males) {
            System.out.println(player.getDescription());
        } */
    }
}
