package com.testing.ryan.sandboxtesting;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.testing.ryan.sandboxtesting.UI.Material;

import java.util.ArrayList;
import java.util.Arrays;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.main_activity_list_view)
    ListView mListView;
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        final String[] mValues = new String[]{"Material", "Test2"};
        ArrayList<String> activityList = new ArrayList<>(Arrays.asList(mValues));
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, activityList);
        mListView.setAdapter(adapter);

        mContext = this;
       mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view,
                                   int position, long id) {
               switch(position){
                   case 0:
                       startActivity(Material.newInstance(mContext));
                       break;
                   default:
                       Toast.makeText(MainActivity.this, "No Activity", Toast.LENGTH_LONG).show();
                       break;
               }
           }
           });


    }
}
