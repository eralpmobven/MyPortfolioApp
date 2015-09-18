package com.eralpyucel.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button spotifyButton, scoresButton, libraryButton, buildButton, xyzButton, capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUI();
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    private void setUI() {
        spotifyButton=(Button)findViewById(R.id.spotify_button);
        scoresButton=(Button)findViewById(R.id.scores_button);
        libraryButton=(Button)findViewById(R.id.library_button);
        buildButton=(Button)findViewById(R.id.build_button);
        xyzButton=(Button)findViewById(R.id.xyz_button);
        capstoneButton=(Button)findViewById(R.id.capstone_button);

        spotifyButton.setOnClickListener(this);
        scoresButton.setOnClickListener(this);
        libraryButton.setOnClickListener(this);
        buildButton.setOnClickListener(this);
        xyzButton.setOnClickListener(this);
        capstoneButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.spotify_button:
                showMessage(getResources().getString(R.string.toast_spotify));
                break;
            case R.id.scores_button:
                showMessage(getResources().getString(R.string.toast_scores));
                break;
            case R.id.library_button:
                showMessage(getResources().getString(R.string.toast_library));
                break;
            case R.id.build_button:
                showMessage(getResources().getString(R.string.toast_build));
                break;
            case R.id.xyz_button:
                showMessage(getResources().getString(R.string.toast_xyz));
                break;
            case R.id.capstone_button:
                showMessage(getResources().getString(R.string.toast_capstone));
                break;
        }
    }

    private void showMessage(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}
