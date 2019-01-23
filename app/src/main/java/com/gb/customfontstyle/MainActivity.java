package com.gb.customfontstyle;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner spinner;
    TextView tvFirst;
    Typeface typeface;
    String recognitionFontsPath = "fonts/RECOGNITION.ttf";
    String droidSansBoldFontPath = "fonts/DroidSans-Bold.ttf";
    String crochetPatternFontPath = "fonts/CROCHET PATTERN.ttf";
    String droidSansFontPath = "fonts/DroidSans.ttf";
    String montserratReguarFontPath = "fonts/Montserrat-Regular.otf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        tvFirst = (TextView) findViewById(R.id.tv_first);

        ArrayAdapter adapter=ArrayAdapter.createFromResource(this,R.array.font_name,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        TextView myText = (TextView) view;
        onTextSelected(myText.getText().toString());
    }

    private void onTextSelected(String text) {

        if (text.equals("Crochet Pattern")) {
            typeface=Typeface.createFromAsset(getAssets(),crochetPatternFontPath);
            tvFirst.setTypeface(typeface);
        }
        else if (text.equals("DroidSans")) {
            typeface=Typeface.createFromAsset(getAssets(),droidSansFontPath);
            tvFirst.setTypeface(typeface);
        }
        else if (text.equals("DroidSans Bold")) {
            typeface=Typeface.createFromAsset(getAssets(),droidSansBoldFontPath);
            tvFirst.setTypeface(typeface);
        }
        else if (text.equals("Montserrat Regular")) {
            typeface=Typeface.createFromAsset(getAssets(),montserratReguarFontPath);
            tvFirst.setTypeface(typeface);
        }
        else if (text.equals("Recognition")) {
            typeface=Typeface.createFromAsset(getAssets(),recognitionFontsPath);
            tvFirst.setTypeface(typeface);
        }
        else {
            tvFirst.setTypeface(Typeface.DEFAULT);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
