package example.databindingexample.model;

/**
 * Created by sumeet on 19/7/16.
 *
 * This layer will consist of data part, whether we fetch it from Database or Network Calls.
 * And from here we should pass data to View-Model Layer. (Not directly to View Layer).
 */
public class User {
    public String firstName;
    public String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
