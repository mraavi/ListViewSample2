package com.appcrops.listviewsample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {
    ListView mListView;
    CricketerDataModel mCricketerDataModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.sample_list);
        mCricketerDataModel = new CricketerDataModel();

        CricketerListAdapter cricketerListAdapter = new CricketerListAdapter(this, mCricketerDataModel.getCricketerList());
        mListView.setAdapter(cricketerListAdapter);
    }
}
