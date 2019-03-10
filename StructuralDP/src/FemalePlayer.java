public class FemalePlayer implements PlayerAPI {

    @Override
    public void standards(String sport) {
        if (sport.equalsIgnoreCase("Volleyball")) {
            System.out.println("The net's height is 2.24 meters!");
        } else {
            System.out.println("The rim's height is 3.05 meters!");
        }
    }
}
