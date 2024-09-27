package com.example.exercice2tp1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText surface,nbrpiece;
    private TextView txt1,txt2,txt3,impb,impS,impt;
    private CheckBox piscine;
    private Button calculer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        surface=findViewById(R.id.surface);
        nbrpiece=findViewById(R.id.nbrpiece);
        piscine=findViewById(R.id.piscine);
        calculer=findViewById(R.id.calculer);
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        txt3=findViewById(R.id.txt3);
        impb=findViewById(R.id.impb);
        impS=findViewById(R.id.impS);
        impt=findViewById(R.id.impt);
        calculer.setOnClickListener(new View.OnClickListener() {
            int impotBase,impotSup,totale;

            @Override
            public void onClick(View v) {
                if(surface.getText().toString().isEmpty() || nbrpiece.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Remplir les champs obligatoire", Toast.LENGTH_LONG).show();
                }else{
                    impotBase=Integer.parseInt(surface.getText().toString())*2;
                    if(piscine.isChecked()) {
                        impotSup = (Integer.parseInt(nbrpiece.getText().toString()) * 50) + 100;
                    }else{
                        impotSup = (Integer.parseInt(nbrpiece.getText().toString()) * 50);
                    }
                    totale=impotBase+impotSup;
                    impb.setText("Impôt de base:");
                    txt1.setText(String.valueOf(impotBase));
                    impS.setText("Impôt Supplimentaire:");
                    txt2.setText(String.valueOf(impotSup));
                    impt.setText("Impôts totale:");
                    txt3.setText(String.valueOf(totale));
                }
            }
        });

    }
}