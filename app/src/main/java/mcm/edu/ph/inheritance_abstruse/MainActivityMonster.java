package mcm.edu.ph.inheritance_abstruse;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityMonster extends AppCompatActivity {
    Spinner klass;
    String scs;
    ImageView z, a;
    TextView txtMonsterHP, txtMonsterParry, txtMonsterEvasion,txtClass;
    double lvln;
    EditText lvl;
    Button back, select;

    Monster Goblin = new Monster(100,1,1,
            1,100,1,1);

    @Override
    protected void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.acitvity_mainactivitymonster);


        txtMonsterHP = findViewById(R.id.monsterHPresult);
        txtMonsterEvasion = findViewById(R.id.monsterEvasionresult);
        txtMonsterParry = findViewById(R.id.monsterParryresult);
        lvl = findViewById(R.id.monsterlvl);
        z = findViewById(R.id.imageLogoVisible);
        a = findViewById(R.id.imageGoblin);
        z.setImageResource(R.drawable.logovisible);
        a.setImageResource(R.drawable.goblin);
        z.setVisibility(View.VISIBLE);
        a.setVisibility(View.GONE);

        klass = findViewById(R.id.monsterClassResult);

        ArrayAdapter<CharSequence> sub = ArrayAdapter.createFromResource(this,
                R.array.Goblin, android.R.layout.simple_dropdown_item_1line);
        klass.setAdapter(sub);

        klass.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    scs = klass.getSelectedItem().toString();
                    if (scs.equals("Goblin")) {
                        z.setVisibility(View.GONE);
                        a.setVisibility(View.VISIBLE);
                        lvln = Double.parseDouble(lvl.getText().toString());
                        Goblin.setLevel(lvln);
                        Goblin.getLevel();
                        txtMonsterHP.setText(String.valueOf((Goblin.hpm())));
                        txtMonsterParry.setText(String.valueOf((Goblin.parry())));
                        txtMonsterEvasion.setText(String.valueOf(Goblin.evasion()));
                    }
                    else {
                        z.setVisibility(View.VISIBLE);
                        a.setVisibility(View.GONE);
                        lvln = Double.parseDouble(lvl.getText().toString());
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

                }
        }