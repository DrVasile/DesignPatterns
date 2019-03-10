public class Main {

    public static void main(String[] args) {
        Player playerA = new Player();
        PlayerInterface playerB = new CaptainPlayer(new Player());

        System.out.println(playerA.getDescription());
        System.out.println(playerB.getDescription());
    }
}
