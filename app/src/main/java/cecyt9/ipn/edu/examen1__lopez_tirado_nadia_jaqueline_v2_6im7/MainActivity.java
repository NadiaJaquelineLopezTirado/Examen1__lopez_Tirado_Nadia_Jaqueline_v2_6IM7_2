package cecyt9.ipn.edu.examen1__lopez_tirado_nadia_jaqueline_v2_6im7;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText txtNumero;
    Double resultado;
    Double txtNumero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNumero = (EditText) findViewById(R.id.txtNumero);

    }

    public void Convertir(View v){
        if(txtNumero.getText().toString().equals("")){
            Toast toast =  Toast.makeText(getApplicationContext(), "Error. Ingresa un numero", Toast.LENGTH_SHORT);
            toast.show();
        }else {
            Intent envia = new Intent(this, Main2Activity.class);
            Bundle datos = new Bundle();
            txtNumero2 = Double.parseDouble(txtNumero.getText().toString());
            resultado = (txtNumero2 / 15);
            datos.putDouble("Numero", resultado);
            envia.putExtras(datos);
            finish();
            startActivity(envia);
        }
    }
}
