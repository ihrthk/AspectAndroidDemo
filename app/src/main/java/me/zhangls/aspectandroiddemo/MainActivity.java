package me.zhangls.aspectandroiddemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    public String sayHello() {
        return "Hello, world.";
    }

    public String sayGoodbye() {
        return "Hello, world.";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = TextView.class.cast(findViewById(R.id.tv));
        textView.setText(sayGoodbye());
    }

}
