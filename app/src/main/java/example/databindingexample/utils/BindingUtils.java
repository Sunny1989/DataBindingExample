package example.databindingexample.utils;

import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;
import android.graphics.Typeface;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import example.databindingexample.adapters.UserListAdapter;
import example.databindingexample.model.User;

/**
 * Created by sumeet on 19/7/16.
 */
public class BindingUtils {

    @BindingAdapter({"bind:font"})
    public static void setFont(TextView textView, String fontName) {
        textView.setTypeface(Typeface.createFromAsset(textView.getContext().getAssets(), "fonts/" + fontName));
    }


    @BindingAdapter("bind:items")
    public static void bindList(RecyclerView view, ObservableArrayList<User> list) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        view.setLayoutManager(layoutManager);
        view.setAdapter(new UserListAdapter(view, list));
    }

}
