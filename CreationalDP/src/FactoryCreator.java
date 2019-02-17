public class FactoryCreator {

    public static  AbstractFactory getFactory(String sport) {
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
