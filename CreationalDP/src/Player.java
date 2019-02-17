class Player {
    private String name = "";
    private String surname = "";
    private String sport = "";
    private String position = "";

    public Player clone() {
        Player newClone = new Player();
        newClone.sport = this.sport;
        return newClone;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSurname(String surname) {
        this.surname = surname;
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

    String getSport() {
        return this.sport;
    }

    String getPosition() {
        return this.position;
    }
}
