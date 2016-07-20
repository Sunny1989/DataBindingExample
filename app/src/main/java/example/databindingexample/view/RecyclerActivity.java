package example.databindingexample.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import example.databindingexample.R;
import example.databindingexample.databinding.RecyclerActivityBinding;
import example.databindingexample.utils.DividerItemDecoration;
import example.databindingexample.viewmodel.UserListModel;

/**
 * Created by sumeet on 19/7/16.
 */
public class RecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RecyclerActivityBinding recyclerActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_recyclerview);
        recyclerActivityBinding.recyclerUser.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerActivityBinding.setUserList(new UserListModel());
    }

}
