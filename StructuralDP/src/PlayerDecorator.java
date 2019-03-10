public abstract class PlayerDecorator implements PlayerInterface {

    Player player;

    PlayerDecorator(Player player) {
        this.player = player;
    }

    @Override
    public String getDescription() {
        return this.player.toString();
    }
}
