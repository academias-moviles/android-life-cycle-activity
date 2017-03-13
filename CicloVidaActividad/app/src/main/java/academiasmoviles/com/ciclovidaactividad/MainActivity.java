package academiasmoviles.com.ciclovidaactividad;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CicloVidaActividad", "On Start...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CicloVidaActividad", "On Resume...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CicloVidaActividad", "On Pause...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CicloVidaActividad", "On Stop...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CicloVidaActividad", "On Restart...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CicloVidaActividad", "On Destroy...");
    }

}