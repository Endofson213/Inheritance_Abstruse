package mcm.edu.ph.inheritance_abstruse;

import android.content.Intent;
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

public class MainActivityHero extends AppCompatActivity {
    Spinner classs;
    String scs;
    EditText lvl;
    Button subclassbtn, select;
    double lvln;
    ImageView a,b,c,d,z;
    TextView txtheroHP,txtheroMP,txtHeroSTR,txtHeroAGI,txtHeroINT,txtClass,txtheroArmor;

    Hero Warrior = new Hero(100,100,5,1,1,100,100,5,1,1,1);
    Hero Mage   = new Hero(100,150,1,1,5,100,100,1,1,1,1);
    Hero Archer = new Hero(100,100,1,5,1,100,100,1,5,1,1);
    Hero Assassin = new Hero(100,80,3,5,1,100,80,3,5,1,1);

    @Override
    protected void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.activity_heroes);


        subclassbtn = findViewById(R.id.heroClassesBtn);
        txtheroHP = findViewById(R.id.heroHPresult);
        txtheroMP = findViewById(R.id.heroMPresult);
        txtheroArmor = findViewById(R.id.heroARMORresult);
        txtHeroSTR = findViewById(R.id.heroSTRresult);
        txtHeroAGI = findViewById(R.id.heroAGIresult);
        txtHeroINT = findViewById(R.id.heroINTresult);
        txtClass = findViewById(R.id.Classtxt);
        lvl = findViewById(R.id.lvl);
        z = findViewById(R.id.imageLogoVisible);
        a = findViewById(R.id.imageWarriors);
        b = findViewById(R.id.imageMage);
        c = findViewById(R.id.imageArcher);
        d = findViewById(R.id.imageAssassin);
        z.setVisibility(View.VISIBLE);
        a.setVisibility(View.GONE);
        b.setVisibility(View.GONE);
        c.setVisibility(View.GONE);
        d.setVisibility(View.GONE);
        subclassbtn.setVisibility(View.GONE);
        z.setImageResource(R.drawable.logovisible);
        a.setImageResource(R.drawable.warriors1);
        b.setImageResource(R.drawable.mage1);
        c.setImageResource(R.drawable.archer1);
        d.setImageResource(R.drawable.assassin1);

        classs =findViewById(R.id.heroClass);

        ArrayAdapter<CharSequence> cLass = ArrayAdapter.createFromResource(
                this, R.array.Class, android.R.layout.simple_dropdown_item_1line);
        classs.setAdapter(cLass);

        classs.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                scs = classs.getSelectedItem().toString();
                subclassbtn.setVisibility(View.VISIBLE);
                if (scs.equals("Warrior")){
                    z.setVisibility(View.GONE);
                    a.setVisibility(View.VISIBLE);
                    b.setVisibility(View.GONE);
                    c.setVisibility(View.GONE);
                    d.setVisibility(View.GONE);
                    lvln=Double.parseDouble(lvl.getText().toString());
                    Warrior.setLevel(lvln);
                    Warrior.getLevel();
                    txtheroHP.setText(String.valueOf((Warrior.hpp())));
                    txtheroMP.setText(String.valueOf((Warrior.mpp())));
                    txtheroArmor.setText(String.valueOf((Warrior.getBaseArmor())));
                    txtHeroSTR.setText(String.valueOf((Warrior.strr())));
                    txtHeroAGI.setText(String.valueOf(Warrior.agii()));
                    txtHeroINT.setText(String.valueOf(Warrior.intt()));

                }
                else if(scs.equals("Mage")) {
                    z.setVisibility(View.GONE);
                    a.setVisibility(View.GONE);
                    b.setVisibility(View.VISIBLE);
                    c.setVisibility(View.GONE);
                    d.setVisibility(View.GONE);
                    lvln=Double.parseDouble(lvl.getText().toString());
                    Mage.setLevel(lvln);
                    Mage.getLevel();
                    txtheroHP.setText(String.valueOf((Mage.hpp())));
                    txtheroMP.setText(String.valueOf((Mage.mpp())));
                    txtheroArmor.setText(String.valueOf((Mage.getBaseArmor())));
                    txtHeroSTR.setText(String.valueOf((Mage.strr())));
                    txtHeroAGI.setText(String.valueOf(Mage.agii()));
                    txtHeroINT.setText(String.valueOf(Mage.intt()));

                }
                else if(scs.equals("Archer")) {
                    z.setVisibility(View.GONE);
                    a.setVisibility(View.GONE);
                    b.setVisibility(View.GONE);
                    c.setVisibility(View.VISIBLE);
                    d.setVisibility(View.GONE);
                    lvln=Double.parseDouble(lvl.getText().toString());
                    Archer.setLevel(lvln);
                    Archer.getLevel();
                    txtheroHP.setText(String.valueOf((Archer.hpp())));
                    txtheroMP.setText(String.valueOf((Archer.mpp())));
                    txtheroArmor.setText(String.valueOf((Archer.getBaseArmor())));
                    txtHeroSTR.setText(String.valueOf((Archer.strr())));
                    txtHeroAGI.setText(String.valueOf(Archer.agii()));
                    txtHeroINT.setText(String.valueOf(Archer.intt()));

                }
                else if(scs.equals("Assassin")) {
                    z.setVisibility(View.GONE);
                    a.setVisibility(View.GONE);
                    b.setVisibility(View.GONE);
                    c.setVisibility(View.GONE);
                    d.setVisibility(View.VISIBLE);
                    lvln=Double.parseDouble(lvl.getText().toString());
                    Assassin.setLevel(lvln);
                    Assassin.getLevel();
                    txtheroHP.setText(String.valueOf((Assassin.hpp())));
                    txtheroMP.setText(String.valueOf((Assassin.mpp())));
                    txtheroArmor.setText(String.valueOf(Assassin.getBaseArmor()));
                    txtHeroSTR.setText(String.valueOf((Assassin.strr())));
                    txtHeroAGI.setText(String.valueOf(Assassin.agii()));
                    txtHeroINT.setText(String.valueOf(Assassin.intt()));
            }
        }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        subclassbtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent back =new Intent(MainActivityHero.this,MainActivityFinalHero.class);
                        back.putExtra("classs",scs);
                        startActivity(back);
                        }
                });
    }
}
