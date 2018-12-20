package pe.utec.cs.androidcourse.ui.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import pe.utec.cs.androidcourse.R;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    private MainPresenter presenter;

    private RecyclerView rvTasks;
    private TasksAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);
        setupUI();
    }

    private void setupUI() {
        rvTasks = findViewById(R.id.rvTasks);
    }

    @Override
    public void updateText(String text) {

    }
}
