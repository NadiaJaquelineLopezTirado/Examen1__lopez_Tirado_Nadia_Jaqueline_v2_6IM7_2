package cecyt9.ipn.edu.examen1__lopez_tirado_nadia_jaqueline_v2_6im7;

/**
 * Created by USUARIO on 30/03/2017.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends Activity {

    Double Num;
    TextView Mos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Mos = (TextView) findViewById(R.id.Muestrame);
        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();
        Num = recibe.getDouble("Num:");
        Mos.setText("Nombre: Lopez Tirado Nadia Jaqueline" + "\n" +
                "Resultado: " + Num.toString()
        );
    }

    public void Correo(View correo)
    {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto: Conversion");
        intent.putExtra(Intent.EXTRA_TEXT, "Cuerpo del correo: Lopez Tirado Nadia Jaqueline    Resultado: " + Num );
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "eoropezag@ipn.mx"} );
        startActivity(intent);
    }
}
