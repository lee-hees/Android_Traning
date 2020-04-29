package dsu.software.samplecallintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editText);

        Button button1 =findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data=editText.getText().toString();

                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(data));
                startActivity(intent);
            }
        });

        Button button2 =findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                ComponentName name=new ComponentName(
                        "dsu.software.samplecallintent",
                        "dsu.software.samplecallintent.MenuActivity"
                );
                intent.setComponent(name);

                startActivityForResult(intent,101);
            }
        });

    }
}
