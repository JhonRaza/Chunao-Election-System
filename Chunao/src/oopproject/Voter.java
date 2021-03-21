package oopproject;
/**
 *
 * @author Jhon Raza
 */
public class Voter {
    private String name;
    private String username; //generate randomly but different checked same way as in the LogIn project
    private String password;

    public Voter(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
