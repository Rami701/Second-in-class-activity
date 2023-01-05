package com.example.secondinclassactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText editName, editSalary;
    private Button btnAdd;
    private Spinner spnTime;
    private ListView listView;
    private List<String> list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpViews();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate()){
                    String name = editName.getText().toString();
                    String salary = editSalary.getText().toString();
                    String time = spnTime.getSelectedItem().toString();
                    Employee employee = new Employee(name, salary, time);
                    list.add(name + "    " + salary);
                    adapter.notifyDataSetChanged();
                }
            }
        });


        listView.setAdapter(adapter);
    }

    private void setUpViews() {
        editName = findViewById(R.id.editName);
        editSalary = findViewById(R.id.editSalary);
        btnAdd = findViewById(R.id.btnAdd);
        spnTime = findViewById(R.id.spnTime);
        listView = findViewById(R.id.listView);
    }

    public boolean validate(){
        if(editName.getText().toString().equals("") || editSalary.getText().toString().equals("")){
            return false;
        }
        return true;
    }




}