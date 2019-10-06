package ejt.edu.tesoem.genita212.itic.proyectoejtgenita212;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void cargacarrera(View v){
        Intent carrera= new Intent(this,CarreraActivity.class);
        startActivity(carrera);
        finish();
    }
    public void cargamusica(View v){
        Intent musica= new Intent(this,MusicaActivity.class);
        startActivity(musica);
        finish();
    }
    public void cargalibro(View v){
        Intent libro= new Intent(this,LibrosActivity.class);
        startActivity(libro);
        finish();
    }
    public void cargacomida(View v){
        Intent comida= new Intent(this,ComidaActivity.class);
        startActivity(comida);
        finish();
    }
    public void cargapelicula(View v){
        Intent pelicula= new Intent(this,PeliculasActivity.class);
        startActivity(pelicula);
        finish();
    }
    public void cargaviajes(View v){
        Intent viajes= new Intent(this,ViajesActivity.class);
        startActivity(viajes);
        finish();
    }
    public void cargaserie(View v){
        Intent serie= new Intent(this,SerieActivity.class);
        startActivity(serie);
        finish();
    }
    public void cargadeporte(View v){
        Intent deporte= new Intent(this,DeporteActivity.class);
        startActivity(deporte);
        finish();
    }
}
