package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvTask;
    ArrayList<TaskItems> alTaskList;
    CustomerAdapter aaTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTask = findViewById(R.id.listViewTask);

        alTaskList = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2018,7, 1);
        Calendar date2 = Calendar.getInstance();
        date2.set(2018,9, 22);

        TaskItems task1 = new TaskItems("MSA", date1);
        TaskItems task2 = new TaskItems("Go for haircut", date2);
        alTaskList.add(task1);
        alTaskList.add(task2);

        aaTask = new CustomerAdapter(this, R.layout.task_items, alTaskList);

        lvTask.setAdapter(aaTask);
    }
}
