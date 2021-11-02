package lat.pam.utsprakpam1197050136soniawan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginBtn = findViewById(R.id.login_btn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    public void login() {
        TextView usernameL = findViewById(R.id.username_text);
        TextView passwordL = findViewById(R.id.password_text);
        String username = usernameL.getText().toString();
        String password = passwordL.getText().toString();

        if (username.equals("test") && password.equals("123456")) {
            Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
            startActivity(intent);
            this.finish();
        }  else {
            Toast toast = Toast.makeText(getApplicationContext(), "Username/Password salah", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}