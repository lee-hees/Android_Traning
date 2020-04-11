package dsu.software.calc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CalcLinear_J extends AppCompatActivity {

    EditText editText1, editText2;
    TextView textView;
    Button button1, button2, button3, button4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.calc_linear);

        editText1 = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        textView = findViewById(R.id.textView);
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText((Integer.parseInt(editText1.getText().toString())
                        + Integer.parseInt(editText2.getText().toString())) + "");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText((Integer.parseInt(editText1.getText().toString())
                        - Integer.parseInt(editText2.getText().toString())) + "");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText((Integer.parseInt(editText1.getText().toString())
                        * Integer.parseInt(editText2.getText().toString())) + "");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText((Integer.parseInt(editText1.getText().toString())
                        / Integer.parseInt(editText2.getText().toString())) + "");
            }
        });

    }
}
