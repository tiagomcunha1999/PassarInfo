package pt.ipg.passarinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText Nome = (EditText) findViewById(R.id.editText);
        String message = Nome.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        EditText Idade = (EditText) findViewById(R.id.editText2);
        String message = Idade.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        EditText editText = (EditText) findViewById(R.id.editText3);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        EditText editText = (EditText) findViewById(R.id.editText4);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        EditText editText = (EditText) findViewById(R.id.editText5;
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        EditText editText = (EditText) findViewById(R.id.editText6);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
