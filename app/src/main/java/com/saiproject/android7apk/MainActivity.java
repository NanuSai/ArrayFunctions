package com.saiproject.android7apk;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        TextView txtArrayDoubleVal = findViewById(R.id.txtArrayofDoubleValue);
        TextView txtArrayIntegerVal = findViewById(R.id.txtArrayofIntegerValue);
        TextView txtIntArray1 = findViewById(R.id.txtintArray1);
        TextView txtIntArray1Copy = findViewById(R.id.txtintArray1Copy);
        TextView txtLocationofArrayElm = findViewById(R.id.txtLocationArrElem);
        Switch swtEqual = findViewById(R.id.swtEqual);


        double[] doubleValArr = {6.3,5.3,4.3,5.4,3.2,9.99,4.5,6.89};
        Arrays.sort(doubleValArr);

        String oldDoubleTxtVal;

        for(int i =0 ; i < doubleValArr.length; i++){
            oldDoubleTxtVal = txtArrayDoubleVal.getText().toString();
            txtArrayDoubleVal.setText(oldDoubleTxtVal + doubleValArr[i] + "  ");
        }


        int[] intNumberArray = new int[20];
        Arrays.fill(intNumberArray,1);
        outputToScreen(intNumberArray,txtArrayIntegerVal);

        int[] integerArray1 = {100,200,300,400,500,600,700,800};
        int[] integerArray1Copy = new int[integerArray1.length];


        System.arraycopy(integerArray1,0,integerArray1Copy,0,integerArray1.length);
        outputToScreen(integerArray1,txtIntArray1);
        outputToScreen(integerArray1Copy,txtIntArray1Copy);


        boolean isEqual = Arrays.equals(integerArray1,integerArray1Copy);
        swtEqual.setChecked(isEqual);
        swtEqual.setText(isEqual ? "Values are equal" : "Values are not equal ");


        double valueToSearch = 2.7;
        int ArrayElement = Arrays.binarySearch(doubleValArr,valueToSearch);

        if(ArrayElement >=0)
            txtLocationofArrayElm.setText("Found element at: " + ArrayElement +" location, value " + valueToSearch);
        else
            txtLocationofArrayElm.setText("Can't Find element of value " + valueToSearch);


    }




    public void outputToScreen(int[] intArray, TextView txtArray){

        String oldArrayTxtVal;

        for(int i = 0 ; i < intArray.length; i++){
            oldArrayTxtVal = txtArray.getText().toString();
            txtArray.setText(oldArrayTxtVal + intArray[i] + "  ");
        }


    }


}
