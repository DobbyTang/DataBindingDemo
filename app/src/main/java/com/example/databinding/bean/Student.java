package com.example.databinding.bean;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by user on 16/8/3.
 */
public class Student {

    public ObservableField<String> name = new ObservableField<>();
    public ObservableInt age = new ObservableInt();

    public ObservableField<Subject> subject = new ObservableField<>();
}
