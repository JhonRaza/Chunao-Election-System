/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject;

/**
 *
 * @author Jhon Raza
 */
public class Candidate {
    private String username;
    private String password;
    private String name;
    private Position position;
    private int age;
    private int votes;

    public Candidate(String name, String party, int age) {
        this.name = name;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public int getVotes() {
        return votes;
    }
    public String getName()
    {
        return name;
    }
    public String getDetails()
    {
        return "The candidate named " + name + " recieved " + votes + " number of voted";
    }
}
