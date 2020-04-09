package model;

public class Client {

    private String username;
    private String password;
    private static int idnr = 0;
    private int id;

    public Client(String username) {
        this.username = username;
        this.id = ++idnr;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static int getIdnr() {
        return idnr;
    }

    public static void setIdnr(int idnr) {
        Client.idnr = idnr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void show() {
        System.out.println("Client " + getId() + ": " + getUsername() + ", " + getPassword());
    }
}
