public class CaptainPlayer extends PlayerDecorator{

    public CaptainPlayer(BasicPlayer player) {
        super(player);
    }

    @Override
    public void play() {
        super.player.play();
    }

    @Override
    public String getDescription() {
        return super.player.getDescription() + " - [ Captain ]";
    }
}
