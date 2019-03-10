public abstract class PlayerDecorator implements Player {

    Player player;

    PlayerDecorator(BasicPlayer player) {
        this.player = player;
    }

    @Override
    public String getDescription() {
        return this.player.toString();
    }
}
