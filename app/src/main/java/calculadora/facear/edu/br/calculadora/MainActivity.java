package calculadora.facear.edu.br.calculadora;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView resultado;
    Double valorUm;
    Integer operacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        resultado = findViewById(R.id.resultado);
        resultado.setTextSize(30);

        Button b9 = findViewById(R.id.botao9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+"9");
                //Toast.makeText(getApplicationContext(), "9", Toast.LENGTH_LONG).show();
            }
        });

        Button b8 = findViewById(R.id.botao8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+"8");
                //Toast.makeText(getApplicationContext(), "8", Toast.LENGTH_LONG).show();
            }
        });

        Button b7 = findViewById(R.id.botao7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+"7");
                //Toast.makeText(getApplicationContext(), "7", Toast.LENGTH_LONG).show();
            }
        });

        Button b6 = findViewById(R.id.botao6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+"6");
                //Toast.makeText(getApplicationContext(), "6", Toast.LENGTH_LONG).show();
            }
        });

        Button b5 = findViewById(R.id.botao5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+"5");
                //Toast.makeText(getApplicationContext(), "5", Toast.LENGTH_LONG).show();
            }
        });

        Button b4 = findViewById(R.id.botao4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+"4");
                //Toast.makeText(getApplicationContext(), "4", Toast.LENGTH_LONG).show();
            }
        });

        Button b3 = findViewById(R.id.botao3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+"3");
                //Toast.makeText(getApplicationContext(), "3", Toast.LENGTH_LONG).show();
            }
        });

        Button b2 = findViewById(R.id.botao2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+"2");
                //Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_LONG).show();
            }
        });

        Button b1 = findViewById(R.id.botao1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+"1");
                //Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_LONG).show();
            }
        });

        Button b0 = findViewById(R.id.botao0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+"0");
                //Toast.makeText(getApplicationContext(), "0", Toast.LENGTH_LONG).show();
            }
        });

        Button bC = findViewById(R.id.botaoC);
        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText("");
            }
        });

        Button bPonto = findViewById(R.id.botaoPonto);
        bPonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultado.getText().equals("")){
                    resultado.setText("0.");
                }
                else{
                    resultado.setText(resultado.getText()+".");
                }
            }
        });

        Button bMais = findViewById(R.id.botaoMais);
        bMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorUm = Double.parseDouble(resultado.getText().toString());
                operacao = 1;
                resultado.setText("");
            }
        });

        Button bMenos = findViewById(R.id.botaoMenos);
        bMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorUm = Double.parseDouble(resultado.getText().toString());
                operacao = 2;
                resultado.setText("");
            }
        });

        Button bVezes = findViewById(R.id.botaoX);
        bVezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorUm = Double.parseDouble(resultado.getText().toString());
                operacao = 3;
                resultado.setText("");
            }
        });

        Button bDivisao = findViewById(R.id.botaoDivisao);
        bDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorUm = Double.parseDouble(resultado.getText().toString());
                operacao = 4;
                resultado.setText("");
            }
        });

        Button bIgual = findViewById(R.id.botaoIgual);
        bIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double valorDois = Double.parseDouble(resultado.getText().toString());
                Double r = 0.0;
                if(operacao == 1){
                    r = valorUm + valorDois;
                }
                else if(operacao == 2){
                    r = valorUm - valorDois;
                }
                else if(operacao == 3){
                    r = valorUm * valorDois;
                }
                else if(operacao == 4){
                    r = valorUm/valorDois;
                }

                resultado.setText(r.toString());
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
