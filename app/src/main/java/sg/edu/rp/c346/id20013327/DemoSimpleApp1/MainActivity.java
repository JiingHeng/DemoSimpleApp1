package sg.edu.rp.c346.id20013327.DemoSimpleApp1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button btnDisplay;
    TextView tv;
    EditText etData;
    ToggleButton tbEnabler;
    ToggleButton tbGender;
    RadioGroup rgGender;
    RadioButton radioButtonGenderMale;
    RadioButton radioButtonGenderFemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDisplay = findViewById(R.id.btnDisplay);
        tv = findViewById(R.id.tvResult);
        etData = findViewById(R.id.etData);
        tbEnabler = findViewById(R.id.tbEnabler);
        tbGender = findViewById(R.id.tbGender);
        radioButtonGenderFemale = findViewById(R.id.radioButtonGenderFemale);
        radioButtonGenderMale = findViewById(R.id.radioButtonGenderMale);
        rgGender = findViewById(R.id.radioGroupGender);

        String abc = tv.getText().toString();
        System.out.print(abc);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String abc = etData.getText().toString();
//                String stringResponse = etData.getText().toString();
//                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if (abc.isEmpty()) {
                    tv.setText("Nothing has been entered");
                    Toast.makeText(MainActivity.this,
                            "Please inupt something",
                            Toast.LENGTH_SHORT).show();

                } else {
//                    if(checkedRadioId == R.id.radioButtonGenderMale) {
//                        tv.setText("He says");
//                    } else {
//                        tv.setText("She says");
//                    }
                    tv.setText(abc);
                }



            }
        });

        tbEnabler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tbEnabler.isChecked() == true) {
                    etData.setEnabled(true);
                    etData.setBackgroundColor(Color.TRANSPARENT);
                } else {
                    etData.setEnabled(false);
                    etData.setBackgroundColor(Color.GRAY);
                    etData.setText("");
                }
            }
        });

        tbGender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tbGender.isChecked() == true) {
                    radioButtonGenderFemale.setEnabled(true);
                    radioButtonGenderMale.setEnabled(true);
                    radioButtonGenderFemale.setBackgroundColor(Color.TRANSPARENT);
                    radioButtonGenderMale.setBackgroundColor(Color.TRANSPARENT);
                } else {
                    radioButtonGenderFemale.setEnabled(false);
                    radioButtonGenderMale.setEnabled(false);
                    radioButtonGenderFemale.setBackgroundColor(Color.GRAY);
                    radioButtonGenderMale.setBackgroundColor(Color.GRAY);
                }
            }
        });

    }
}