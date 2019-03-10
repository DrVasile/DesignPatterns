import java.util.ArrayList;
import java.util.List;

public class BasicPlayer implements Player {

    private String name;
    private String surname;
    private String gender;
    private String sport;
    private String position;
    private List<BasicPlayer> teammates;

    public BasicPlayer() {
        teammates = new ArrayList<BasicPlayer>();
    }

    void setName(String name) {
        this.name = name;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    void setGender(String gender) {
        this.gender = gender;
    }

    void setSport(String sport) {
        this.sport = sport;
    }

    void setPosition(String position) {
        this.position = position;
    }

    String getName() {
        return this.name;
    }

    String getSurname() {
        return this.surname;
    }

    String getGender() {
        return this.gender;
    }

    String getSport() {
        return this.sport;
    }

    String getPosition() {
        return this.position;
    }

    List<BasicPlayer> getTeammates() {
        return this.teammates;
    }

    @Override
    public void play() {
        System.out.println("Playing something!!");
    }

    @Override
    public String getDescription() {
        return "Player [ Name : " + name + " " + surname
                + ", Gender : " + gender
                + ", Sport : " + sport
                + ", Position : " + position + " ]";
    }
}