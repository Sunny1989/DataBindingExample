package example.databindingexample.viewmodel;

import android.databinding.ObservableArrayList;
import android.view.View;

import example.databindingexample.model.User;

/**
 * Created by sumeet on 19/7/16.
 *
 * This class represents as our view-model, which will be interacting with both view and model layer.
 * Its been recommended that view should interact with view-model layer and this layer should interact with model layer.
 * So that unit testing can be done individually on View-Model layer.
 *
 */
public class UserListModel {
    public ObservableArrayList<User> userObservableArrayList = new ObservableArrayList<>();

    public UserListModel() {
        for (int i = 0; i < 20; i++) {
            userObservableArrayList.add(new User("Test " + i, " name"));
        }
    }

    public void add(View v) {
        userObservableArrayList.add(new User("Test New", "Name new"));
    }

    public void remove(View v) {
        if (!userObservableArrayList.isEmpty()) {
            userObservableArrayList.remove(0);
        }
    }
}
