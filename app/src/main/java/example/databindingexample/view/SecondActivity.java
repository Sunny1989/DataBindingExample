package example.databindingexample.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import example.databindingexample.R;
import example.databindingexample.view.fragments.FirstFragment;

/**
 * Created by sumeet on 19/7/16.
 */
public class SecondActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private android.support.v4.app.FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        example.databindingexample.databinding.SecondActivityBinding secondActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_second);

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(secondActivityBinding.linContainer.getId(), new FirstFragment());
        fragmentTransaction.commit();
    }

    public void clickForActivity(View view, String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
