import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

    @Override
    public List<Player> criteria(List<Player> playerList) {
        List<Player> malePlayers = new ArrayList<>();

        for (Player player : playerList) {
            if (player.getGender().equalsIgnoreCase("Male")) {
                malePlayers.add(player);
            }
        }

        return malePlayers;
    }
}
