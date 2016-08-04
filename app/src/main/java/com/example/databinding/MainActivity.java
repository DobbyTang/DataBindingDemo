package com.example.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.databinding.bean.Student;
import com.example.databinding.bean.Subject;
import com.example.databinding.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private  ActivityMainBinding binding;
    private Student student;

    Subject subject;

    int sub1Num = 1;
    int sub2Num = 1;

    int age = 16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        student = new Student();
        binding.setStudent(student);
        student.age.set(16);
        student.name.set("汤ttttt");
        subject = new Subject();
        subject.sub1.set("学科a" + sub1Num);
        subject.sub2 .set("学科b" + sub2Num);
        student.subject.set(subject);

    }

    @Override
    protected void onStart() {
        super.onStart();
        student.age.set(18);
        student.name.set("onStart");
        ArrayList<String> list = new ArrayList<>();
        list.add("我是111");
        list.add("我是222");
        list.add("我是333");
        binding.setList(list);
        binding.setListPosition(2);
    }

    public void ageClick(View v){
        Log.d(TAG, "ageClick: " + student.age);
        student.age.set(age++);
    }

    public void sub1Click(View v){
        Log.d(TAG, "sub1Click: " + sub1Num++);
        subject.sub1.set("学科a" + sub1Num);
    }

    public void sub2Click(View v){
        Log.d(TAG, "sub2Click: " + sub2Num++);
        subject.sub2.set("学科b" + sub2Num);
    }
}
