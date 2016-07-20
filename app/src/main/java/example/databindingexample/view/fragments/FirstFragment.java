package example.databindingexample.view.fragments;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import example.databindingexample.R;
import example.databindingexample.databinding.FirstFragmentBinding;
import example.databindingexample.view.SecondActivity;

/**
 * Created by sumeet on 19/7/16.
 */
public class FirstFragment extends Fragment {
    private Context context;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FirstFragmentBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false);
        binding.setFirstFrag(this);
        binding.setSecondActivity((SecondActivity) context);
        View view = binding.getRoot();
        return view;
    }


    public void clickFromFragment(View view, String text) {
        Toast.makeText(getActivity(), text, Toast.LENGTH_SHORT).show();
    }

}
