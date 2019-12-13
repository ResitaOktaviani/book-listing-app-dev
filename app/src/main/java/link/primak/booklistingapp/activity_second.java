package link.primak.booklistingapp;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void library(View view) {
        Intent intent = new Intent(activity_second.this, MainActivity.class);
        startActivity(intent);
    }

    public void socmed(View view) {
        Uri uri = Uri.parse("http://instagram.com/_u/resitaoktvni");
        Intent bukaig = new Intent(Intent.ACTION_VIEW, uri);
        bukaig.setPackage("com.instagram.android");
        try {
            startActivity(bukaig);
        }
        catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("htp://instagram.com/_u/resitaoktvni")));
        }
    }
}
