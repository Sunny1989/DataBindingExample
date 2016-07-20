package example.databindingexample.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import example.databindingexample.R;
import example.databindingexample.databinding.UserItemBinding;
import example.databindingexample.model.User;

/**
 * Created by sumeet on 19/7/16.
 */
public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.UserHolder> {

    private ObservableList<User> userObservableList;
    private Context context;
    private RecyclerView recyclerViewProjects;

    public UserListAdapter(RecyclerView recyclerViewProjects, ObservableArrayList<User> userObservableList) {
        this.userObservableList = userObservableList;
        this.recyclerViewProjects = recyclerViewProjects;
    }

    @Override
    public UserHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_recycler_item, parent, false);
        context = parent.getContext();
        return new UserHolder(v);
    }

    @Override
    public void onBindViewHolder(final UserHolder holder, int position) {
        final User user = userObservableList.get(position);
        holder.userItemBinding.setUserObj(user);
        //This is much important as when we have to bind its method !
        holder.userItemBinding.setUserListAdapter(this);
        //This is to bind immediately as it schedules binding, so to make force binding!
        holder.userItemBinding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return userObservableList.size();
    }

    public class UserHolder extends RecyclerView.ViewHolder {
        public UserItemBinding userItemBinding;

        public UserHolder(View itemView) {
            super(itemView);
            userItemBinding = DataBindingUtil.bind(itemView);
        }
    }

    public void adapterMethod(View view) {
        Toast.makeText(context, "Adapter method called on View Click", Toast.LENGTH_SHORT).show();
    }

    public boolean longClick(View view) {
        Toast.makeText(context, "Long clicked", Toast.LENGTH_SHORT).show();
        return false;
    }
}
