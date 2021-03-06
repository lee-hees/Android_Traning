package dsu.software.logindemo;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dsu.software.logindemo.utils.DisplayUtils;
import spencerstudios.com.bungeelib.Bungee;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = LoginActivity.class.getSimpleName();

    @BindView(R.id.signUp_btn)
    AppCompatButton signUpButton;
    @BindView(R.id.login_btn)
    AppCompatButton loginButton;
    @BindView(R.id.email)
    AppCompatButton emailBox;
    @BindView(R.id.password)
    AppCompatButton passwordBox;
    @BindView(R.id.forgotten_password)
    AppCompatButton forgottenPasswordBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ActionBar actionbar = getSupportActionBar();
        if (null != actionbar) {
            actionbar.hide();
        }

    }

    @OnClick(R.id.signUp_btn)
    public void userSignUp(View view) {
        Intent signUpIntent = new Intent(this, SignUpActivity.class);
        startActivity(signUpIntent);
        Bungee.slideLeft(LoginActivity.this);
    }

    @OnClick(R.id.login_btn)
    public void loginUser(View view) {

        String email = Objects.requireNonNull(emailBox.getText()).toString();
        String password = Objects.requireNonNull(passwordBox.getText()).toString();

        if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
            DisplayUtils.showToast(this, "All login fields must be filled");
        } else if (!email.contains("@")) {
            DisplayUtils.showToast(this, "Invalid email address");
        } else {
            DisplayUtils.showToast(this, "Add login code here");
        }

    }

    @OnClick(R.id.forgotten_password)
    public void resetPassword(View view) {
        Intent resetIntent = new Intent(this, ResetPasswordActivity.class);
        startActivity(resetIntent);
        Bungee.slideLeft(LoginActivity.this);
    }


}
