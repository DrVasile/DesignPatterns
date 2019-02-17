public abstract class AbstractFactory {
    public abstract PlayerBuilder getBuilder(String position);
}

class VolleyballFactory extends AbstractFactory {
    public PlayerBuilder getBuilder(String position) {

        PlayerBuilder builder = null;
        switch (position) {
            case "Setter":
            case "setter":
                builder = new SetterBuilder();
                break;
            case "Hitter":
            case "hitter":
                builder = new HitterBuilder();
                break;
            case "Libero":
            case "libero":
                builder = new LiberoBuilder();
                break;
            default:
                System.out.println("Unknown position entered!");
                break;
        }
        return builder;
    }
}

class BasketballFactory extends AbstractFactory {
    public PlayerBuilder getBuilder(String position) {

        PlayerBuilder builder = null;
        switch (position) {
            case "Forward":
            case "forward":
                builder = new ForwardBuilder();
                break;
            case "Central":
            case "central":
                builder = new CentralBuilder();
                break;
            case "Guard":
            case "guard":
                builder = new GuardBuilder();
                break;
            default:
                System.out.println("Unknown position entered!");
                break;
        }
        return builder;
    }
}

class FootballFactory extends AbstractFactory {
    public PlayerBuilder getBuilder(String position) {

        PlayerBuilder builder = null;
        switch (position) {
            case "Offensive":
            case "offensive":
                builder = new OffensiveBuilder();
                break;
            case "Fullback":
            case "fullback":
                builder = new FullbackBuilder();
                break;
            case "Quarterback":
            case "quarterback":
                builder = new QuarterbackBuilder();
                break;
            default:
                System.out.println("Unknown position entered!");
                break;
        }
        return builder;
    }
}



