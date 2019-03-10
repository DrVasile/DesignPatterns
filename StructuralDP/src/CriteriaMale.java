import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

    @Override
    public List<BasicPlayer> criteria(List<BasicPlayer> playerList) {
        List<BasicPlayer> malePlayers = new ArrayList<>();

        for (BasicPlayer player : playerList) {
            if (player.getGender().equalsIgnoreCase("Male")) {
                malePlayers.add(player);
            }
        }

        return malePlayers;
    }
}
