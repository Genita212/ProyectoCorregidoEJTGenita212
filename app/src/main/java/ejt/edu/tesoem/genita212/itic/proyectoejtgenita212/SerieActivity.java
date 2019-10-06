package ejt.edu.tesoem.genita212.itic.proyectoejtgenita212;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SerieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serie);
    }
    public void volvermenu(View v){
        Intent menu= new Intent(this, MenuActivity.class);
        startActivity(menu);
        finish();
    }
}
