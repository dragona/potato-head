package mg.studio.android.lab001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView mouth, arms, ears, eyebrows, eyes, glasses, hat, mustache, nose, shoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mouth = findViewById(R.id.mouth);
        arms = findViewById(R.id.arms);
        ears = findViewById(R.id.ears);
        eyebrows = findViewById(R.id.eyebrows);
        eyes = findViewById(R.id.eyes);
        glasses = findViewById(R.id.glasses);
        hat = findViewById(R.id.hat);
        mustache = findViewById(R.id.mustache);
        nose = findViewById(R.id.nose);
        shoes = findViewById(R.id.shoes);
    }

    public void cbMouth(View view) {
        mToast("cbMouth");
    }

    public void cbArms(View view) {
        mToast("cbArms");
    }

    public void cbEars(View view) {
        mToast("cbEars");
    }

    public void cbHat(View view) {
        mToast("cdHat");
    }

    public void cbEyebrow(View view) {
        mToast("cbEyebrow");
    }

    public void cbEye(View view) {
        mToast("cbEyebrow");
    }

    public void cbGlasses(View view) {
        mToast("cbGlasses");
    }

    public void cbMustache(View view) {
        mToast("cbMustache");
    }

    public void cbNose(View view) {
        mToast("cbNose");
    }

    public void cbShoes(View view) {
        mToast("cbShoes");
    }

    private void mToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}
