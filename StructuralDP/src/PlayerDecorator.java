public abstract class PlayerDecorator extends Player {

    Player player;

    PlayerDecorator(BasicPlayer player) {
        this.player = player;
    }

    @Override
    public String getDescription() {
        return this.player.toString();
    }
}
