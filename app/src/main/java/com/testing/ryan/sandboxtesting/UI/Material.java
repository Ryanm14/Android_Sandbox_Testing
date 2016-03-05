package com.testing.ryan.sandboxtesting.UI;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.testing.ryan.sandboxtesting.R;

public class Material extends AppCompatActivity {
    private static Intent mIntent;

    public static Intent newInstance(Context context){
        mIntent = new Intent(context, Material.class);
        return mIntent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material);
    }
}
