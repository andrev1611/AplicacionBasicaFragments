package aplicacionbasicafragments.app.andrevera.com.aplicacionbasicafragments;

import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,fragmentUno.OnFragmentInteractionListener,fragmentDos.OnFragmentInteractionListener{

    Button btnFragment1,btnFragment2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //fragmentUno fr1=new fragmentUno();//Las clases creadas para los fragmentos
        //fragmentDos fr2=new fragmentDos();
        //Aquí lo que hago es decir que el fragmento 1 se muestre primero
        //getSupportFragmentManager().beginTransaction().add(R.id.contenedor,fr1);

        btnFragment1=(Button)findViewById(R.id.btnFragment1);
        btnFragment2=(Button)findViewById(R.id.btnFragment2);

        btnFragment1.setOnClickListener(this);
        btnFragment2.setOnClickListener(this);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnFragment1:
                fragmentUno fr1=new fragmentUno();
                FragmentTransaction transicion= getSupportFragmentManager().beginTransaction();
                transicion.replace(R.id.contenedor,fr1);
                transicion.commit();
                break;
            case R.id.btnFragment2:
                fragmentDos fr2=new fragmentDos();
                FragmentTransaction transicion2= getSupportFragmentManager().beginTransaction();
                transicion2.replace(R.id.contenedor,fr2);
                transicion2.commit();
                break;
        }
    }
}
