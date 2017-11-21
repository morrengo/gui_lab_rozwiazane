package pl.edu.agh.layout_gui_lab;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LinearLayoutActivity extends AppCompatActivity {
    LinearLayout ll;
    private final Context ctx = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll = (LinearLayout) findViewById(R.id.linear);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView = new TextView(ctx);
                textView.setTextSize(40);
                textView.setText("text");
                ll.addView(textView);
                ll.invalidate();
            }
        });
    }
}
