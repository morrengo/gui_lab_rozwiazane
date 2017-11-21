package pl.edu.agh.layout_gui_lab;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RelativeLayoutActivity extends AppCompatActivity {
    LinearLayout ll;
    private final Context ctx = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        final EditText editText = (EditText) findViewById(R.id.editText);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = editText.getText().toString();
                editText.setText(text.toUpperCase(),TextView.BufferType.EDITABLE);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = editText.getText().toString();
                editText.setText(text.toLowerCase(),TextView.BufferType.EDITABLE);
            }
        });
    }
}
