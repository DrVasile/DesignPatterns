public final class FactoryCreator {
    private static volatile FactoryCreator instance;

    private FactoryCreator() {};

    public static FactoryCreator getInstance() {
        if (instance == null) {
            synchronized (FactoryCreator.class) {
                if (instance == null) {
                    instance = new FactoryCreator();
                }
            }
        }
        return instance;
    }

    public AbstractFactory getFactory(String sport) {
        AbstractFactory factory = null;
        switch (sport) {
            case "Volleyball":
            case "volleyball":
                factory = new VolleyballFactory();
                break;
            case "Basketball":
            case "basketball":
                factory = new BasketballFactory();
                break;
            case "Football":
            case "football":
                factory = new FootballFactory();
                break;
            default:
                System.out.println("Unknown sport entered!");
                break;
        }
        return factory;
    }
}
