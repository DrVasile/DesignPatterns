import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        while (true) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("\nEnter the sport of the current player(Or just Enter to exit): ");
                String sport = br.readLine();
                if (sport.length() == 0)
                    break;

                System.out.println("\nEnter the name and surname of the current player: ");
                String name = br.readLine();
                String surname = br.readLine();
                System.out.println("\nEnter the position of the current player: ");
                String position = br.readLine();

                AbstractFactory playerFactory = FactoryCreator.getFactory(sport);
                PlayerBuilder builder = playerFactory.getBuilder(position);
                builder.addName(name);
                builder.addSurname(surname);
                builder.addSport(sport);
                builder.addPosition(position);
                builder.getInfoAboutPosition();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
