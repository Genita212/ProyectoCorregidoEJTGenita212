package ejt.edu.tesoem.genita212.itic.proyectoejtgenita212;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DeporteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deporte);
    }
    public void volvermenu(View v){
        Intent menu= new Intent(this, MenuActivity.class);
        startActivity(menu);
        finish();
    }
}
