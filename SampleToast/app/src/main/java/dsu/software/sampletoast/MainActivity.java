package dsu.software.sampletoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);
    }


    public void onButton1Clicked(View v) {
        try{
            Toast toastView =
                    Toast.makeText(this, "위치가 바뀐 토스트 메시지 입니다.",Toast.LENGTH_LONG);
            int xOffset = Integer.parseInt(editText1.getText().toString());
            int yOffset = Integer.parseInt(editText2.getText().toString());
            toastView.setGravity(Gravity.TOP | Gravity.TOP , xOffset,yOffset);

            toastView.show();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void onButton2Clicked(View v) {
        LayoutInflater inflater=getLayoutInflater();

        View layout=inflater.inflate(
                R.layout.toastborder,
                (ViewGroup)findViewById(R.id.toast_layout_root)
        );

        TextView text=layout.findViewById(R.id.text);

        Toast toast=new Toast(this);
        text.setText("모양 바꾼 토스트");
        toast.setGravity(Gravity.CENTER,0,-100);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        toast.show();
    }

    public void onButton3Clicked(View v) {
        Snackbar.make(v, "스낵바입니다", Snackbar.LENGTH_LONG).show();
    }
}
