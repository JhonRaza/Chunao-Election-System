package oopproject;

/**
 *
 * @author Jhon Raza
 */
public class Administrator {
    private String name;
    private String username;
    private Candidate one;
    private Candidate two;
    private Candidate three;
    private Candidate four;
    private Candidate five;
    private String password; //log out of voter everytime someone completes voting, by voter = null

    public Administrator(String name, String username, Candidate one, Candidate two, Candidate three, Candidate four, Candidate five, String password) {
        this.name = name;
        this.username = username;
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
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
    public String getVotes()
    {
        return one.getDetails() + "\n" + two.getDetails()  + "\n" + three.getDetails() + "\n" + four.getDetails();
    }
}
