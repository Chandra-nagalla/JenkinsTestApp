package org.com.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity  implements LoginView {
    private EditText etUsername,etPassword;
    private LoginPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUsername = findViewById(R.id.username);
        etPassword = findViewById(R.id.password);
        presenter = new LoginPresenter(this);
    }

    @Override
    public void setUserName(String s) {
        etUsername.setText(s);
    }

    @Override
    public String getPassword() {
        return etPassword.getText().toString();
    }

    @Override
    public void showPasswordErrorEmpty(String s) {
        etPassword.setError(s);
    }

    public void login(View v){
           presenter.onLoginClicked();
    }

    @Override
    public String getUserName() {
        return etUsername.getText().toString();
    }

    @Override
    public void showUserNameError(String s) {
            etUsername.setError(s);
    }
}
