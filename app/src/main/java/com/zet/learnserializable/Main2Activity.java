package com.zet.learnserializable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.zet.learnserializable.bean.Animal;
import com.zet.learnserializable.bean.People;
import com.zet.learnserializable.field.FieldCalss;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG = "Main2Activity";
    private TextView mTvInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();

        Intent intent = getIntent();
        String key = intent.getStringExtra(FieldCalss.KEY);
        if (key != null) {
            switch (key) {
                case FieldCalss.TYPE_PEOPLE:
                    People people = (People) intent.getSerializableExtra(FieldCalss.OBJ);
                    Log.e(TAG, "onCreate: people=" + people);
                    mTvInfo.setText(people.toString());
                    break;
                case FieldCalss.TYPE_ANIMAL:
                    Animal animal = intent.<Animal>getParcelableExtra(FieldCalss.OBJ);
                    Log.e(TAG, "onCreate: animal=" + animal);
                    mTvInfo.setText(animal.toString());
                    break;
            }
        }
    }

    private void initView() {
        mTvInfo = (TextView) findViewById(R.id.mTvInfo);
    }
}
