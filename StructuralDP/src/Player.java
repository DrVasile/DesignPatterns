public class Player {

    private String name;
    private String surname;
    private String gender;
    private String sport;
    private String position;

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

    @Override
    public String toString() {
        return "Player [ Name : " + name + " " + surname
                + ", Gender : " + gender
                + ", Sport : " + sport
                + ", Position : " + position + " ]";
    }
}