package com.zet.learnserializable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.zet.learnserializable.bean.Animal;
import com.zet.learnserializable.bean.People;
import com.zet.learnserializable.field.FieldCalss;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBt01;
    private Button mBt02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mBt01 = (Button) findViewById(R.id.mBt01);
        mBt02 = (Button) findViewById(R.id.mBt02);

        mBt01.setOnClickListener(this);
        mBt02.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Main2Activity.class);

        switch (v.getId()) {
            case R.id.mBt01:
                People people = new People("p1", "男", 24);
                intent.putExtra(FieldCalss.KEY, FieldCalss.TYPE_PEOPLE);
                intent.putExtra(FieldCalss.OBJ, people);
                break;
            case R.id.mBt02:
                Animal animal = new Animal(28L, Animal.TYPE_FIY, 13);
                intent.putExtra(FieldCalss.KEY, FieldCalss.TYPE_ANIMAL);
                intent.putExtra(FieldCalss.OBJ, animal);
                break;
        }
        startActivity(intent);
    }
}
