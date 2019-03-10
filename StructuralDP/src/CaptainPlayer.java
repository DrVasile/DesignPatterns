public class CaptainPlayer extends PlayerDecorator{

    public CaptainPlayer(Player player) {
        super(player);
    }

    @Override
    public String getDescription() {
        return super.player.getDescription() + " - [ Captain ]";
    }
}
