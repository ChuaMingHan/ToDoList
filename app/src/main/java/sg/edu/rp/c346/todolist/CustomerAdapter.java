package sg.edu.rp.c346.todolist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

import sg.edu.rp.c346.todolist.R;
import sg.edu.rp.c346.todolist.TaskItems;

/**
 * Created by 17010265 on 07/17/2018.
 */

public class CustomerAdapter extends ArrayAdapter {

    Context parent_content;
    int layout_id;
    ArrayList<TaskItems> taskList;

    //TODO
    public CustomerAdapter(@NonNull Context context, int resource, @NonNull ArrayList<TaskItems> objects) {
        super(context, resource, objects);
        parent_content = context;
        layout_id = resource;
        taskList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_content.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.textViewTask);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);
        TaskItems currentItem = taskList.get(position);
        String task = currentItem.getTask();
        String date = currentItem.getDateString();
        tvName.setText(task);
        tvDate.setText(date);
        return rowView;
    }
}
