abstract class PlayerBuilder {
    private Player player;

    public Player getPlayer() {
        return player;
    }

    public PlayerBuilder() {
        player = new Player();
    }

    void addName(String name) {
        player.setName(name);
    }
    void addSurname(String surname) {
        player.setSurname(surname);
    }
    void addSport(String sport) {
        player.setSport(sport);
    }
    void addPosition(String position) {
        player.setPosition(position);
    }

    public abstract String getInfoAboutPosition();
}

/**
 * Builders for volleyball players
 */
class SetterBuilder extends PlayerBuilder {
    public String getInfoAboutPosition() {
        return "The setter is the player responsible for setting the ball for the hitters.";
    }
}

class HitterBuilder extends PlayerBuilder {
    public String getInfoAboutPosition() {
        return "The hitters are the players who score the most points by spiking the ball.";
    }
}

class LiberoBuilder extends PlayerBuilder {
    public String getInfoAboutPosition() {
        return "The libero is a back row player who is not allowed to play in front.";
    }
}

/**
 * Builders for basketball players
 */
class ForwardBuilder extends PlayerBuilder {
    public String getInfoAboutPosition() {
        return "The forward player is a quick player who mostly plays in front.";
    }
}

class GuardBuilder extends PlayerBuilder {
    public String getInfoAboutPosition() {
        return "The guard is responsible for guarding enemies.";
    }
}

class CentralBuilder extends PlayerBuilder {
    public String getInfoAboutPosition() {
        return "The center mostly receives passes near the bucket.";
    }
}

/**
 * Builders for football players
 */
class OffensiveBuilder extends PlayerBuilder {
    public String getInfoAboutPosition() {
        return "The offensive line is formed by five men.";
    }
}

class FullbackBuilder extends PlayerBuilder {
    public String getInfoAboutPosition() {
        return "The fullback players are normally good runners.";
    }
}

class QuarterbackBuilder extends PlayerBuilder {
    public String getInfoAboutPosition() {
        return "The quarterback is the field general.";
    }
}


