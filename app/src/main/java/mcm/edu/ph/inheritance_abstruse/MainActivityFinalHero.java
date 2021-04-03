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

public class MainActivityFinalHero extends AppCompatActivity {
    private String classs, scs;
    private ImageView z, a, b, c, d, e, f, g, h;
    private Spinner spin;
    private TextView txtheroHP, txtheroMP, txtHeroSTR, txtHeroAGI, txtHeroINT, txtClass, txtheroArmor;
    double lvln;
    EditText lvl;
    private Button back, select;

    Hero Swordmaster = new Hero(100, 150, 10, 1, 1, 100, 100, 10, 1, 1, 1);
    Hero Mercenary = new Hero(100, 150, 10, 1, 1, 100, 100, 10, 1, 1, 1);
    Hero ElementalLord = new Hero(100, 300, 1, 1, 15, 100, 100, 1, 1, 15, 1);
    Hero ForceUser = new Hero(100, 300, 1, 1, 15, 100, 100, 1, 1, 15, 1);
    Hero Chaser = new Hero(100, 120, 6, 10, 1, 100, 100, 6, 10, 1, 1);
    Hero Bringer = new Hero(100, 120, 6, 10, 1, 100, 100, 6, 10, 1, 1);
    Hero BowMaster = new Hero(100, 125, 1, 10, 1, 100, 100, 1, 10, 1, 1);
    Hero Acrobat = new Hero(100, 125, 1, 10, 1, 100, 100, 1, 10, 1, 1);

    @Override
    protected void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.acitivty_mainactivityfinalhero);


        classs = getIntent().getStringExtra("classs");
        z = findViewById(R.id.imageLogoVisible);
        a = findViewById(R.id.imageSwordMaster);
        b = findViewById(R.id.imageMercenary);
        c = findViewById(R.id.imageElementalLord);
        d = findViewById(R.id.imageForceUser);
        e = findViewById(R.id.imageChaser);
        f = findViewById(R.id.imageBringer);
        g = findViewById(R.id.imageBowMaster);
        h = findViewById(R.id.imageAcrobat);
        back = findViewById(R.id.heroClassesBtn);
        txtheroHP = findViewById(R.id.heroHPresult);
        txtheroMP = findViewById(R.id.heroMPresult);
        txtheroArmor = findViewById(R.id.heroARMORresult);
        txtHeroSTR = findViewById(R.id.heroSTRresult);
        txtHeroAGI = findViewById(R.id.heroAGIresult);
        txtHeroINT = findViewById(R.id.heroINTresult);
        txtClass = findViewById(R.id.Classtxt);
        lvl = findViewById(R.id.lvl);
        spin = findViewById(R.id.heroClass);

        z.setImageResource(R.drawable.logovisible);
        a.setImageResource(R.drawable.swordmaster);
        b.setImageResource(R.drawable.mercenary);
        c.setImageResource(R.drawable.elementallord1);
        d.setImageResource(R.drawable.forceuser1);
        e.setImageResource(R.drawable.chaser);
        f.setImageResource(R.drawable.bringer);
        g.setImageResource(R.drawable.bowmaster1);
        h.setImageResource(R.drawable.acrobbat1);

        z.setVisibility(View.VISIBLE);
        a.setVisibility(View.GONE);
        b.setVisibility(View.GONE);
        c.setVisibility(View.GONE);
        d.setVisibility(View.GONE);
        e.setVisibility(View.GONE);
        f.setVisibility(View.GONE);
        g.setVisibility(View.GONE);
        h.setVisibility(View.GONE);


        if (classs.equals("Warrior")) {
            ArrayAdapter<CharSequence> sub = ArrayAdapter.createFromResource(this,
                    R.array.Warrior, android.R.layout.simple_dropdown_item_1line);
            spin.setAdapter(sub);
            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    scs = spin.getSelectedItem().toString();
                    if (scs.equals("SwordMaster")) {
                        z.setVisibility(View.GONE);
                        a.setVisibility(View.VISIBLE);
                        b.setVisibility(View.GONE);
                        c.setVisibility(View.GONE);
                        d.setVisibility(View.GONE);
                        e.setVisibility(View.GONE);
                        f.setVisibility(View.GONE);
                        g.setVisibility(View.GONE);
                        h.setVisibility(View.GONE);
                        lvln = Double.parseDouble(lvl.getText().toString());
                        Swordmaster.setLevel(lvln);
                        Swordmaster.getLevel();
                        txtheroHP.setText(String.valueOf((Swordmaster.hpp())));
                        txtheroMP.setText(String.valueOf((Swordmaster.mpp())));
                        txtheroArmor.setText(String.valueOf((Swordmaster.getBaseArmor())));
                        txtHeroSTR.setText(String.valueOf((Swordmaster.strr())));
                        txtHeroAGI.setText(String.valueOf(Swordmaster.agii()));
                        txtHeroINT.setText(String.valueOf(Swordmaster.intt()));
                    } else {
                        z.setVisibility(View.GONE);
                        a.setVisibility(View.GONE);
                        b.setVisibility(View.VISIBLE);
                        c.setVisibility(View.GONE);
                        d.setVisibility(View.GONE);
                        e.setVisibility(View.GONE);
                        f.setVisibility(View.GONE);
                        g.setVisibility(View.GONE);
                        h.setVisibility(View.GONE);
                        lvln = Double.parseDouble(lvl.getText().toString());
                        Mercenary.setLevel(lvln);
                        Mercenary.getLevel();
                        txtheroHP.setText(String.valueOf((Mercenary.hpp())));
                        txtheroMP.setText(String.valueOf((Mercenary.mpp())));
                        txtheroArmor.setText(String.valueOf((Mercenary.getBaseArmor())));
                        txtHeroSTR.setText(String.valueOf((Mercenary.strr())));
                        txtHeroAGI.setText(String.valueOf(Mercenary.agii()));
                        txtHeroINT.setText(String.valueOf(Mercenary.intt()));
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

        } else if (classs.equals("Mage")) {
            ArrayAdapter<CharSequence> sub = ArrayAdapter.createFromResource(
                    this, R.array.Mage, android.R.layout.simple_dropdown_item_1line);
            spin.setAdapter(sub);
            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    scs = spin.getSelectedItem().toString();
                    if (scs.equals("ElementalLord")) {
                        z.setVisibility(View.GONE);
                        a.setVisibility(View.GONE);
                        b.setVisibility(View.GONE);
                        c.setVisibility(View.VISIBLE);
                        d.setVisibility(View.GONE);
                        e.setVisibility(View.GONE);
                        f.setVisibility(View.GONE);
                        g.setVisibility(View.GONE);
                        h.setVisibility(View.GONE);
                        lvln = Double.parseDouble(lvl.getText().toString());
                        ElementalLord.setLevel(lvln);
                        ElementalLord.getLevel();
                        txtheroHP.setText(String.valueOf((ElementalLord.hpp())));
                        txtheroMP.setText(String.valueOf((ElementalLord.mpp())));
                        txtheroArmor.setText(String.valueOf((ElementalLord.getBaseArmor())));
                        txtHeroSTR.setText(String.valueOf((ElementalLord.strr())));
                        txtHeroAGI.setText(String.valueOf(ElementalLord.agii()));
                        txtHeroINT.setText(String.valueOf(ElementalLord.intt()));
                    }
                    else {
                        z.setVisibility(View.GONE);
                        a.setVisibility(View.GONE);
                        b.setVisibility(View.GONE);
                        c.setVisibility(View.GONE);
                        d.setVisibility(View.VISIBLE);
                        e.setVisibility(View.GONE);
                        f.setVisibility(View.GONE);
                        g.setVisibility(View.GONE);
                        h.setVisibility(View.GONE);
                        lvln = Double.parseDouble(lvl.getText().toString());
                        ForceUser.setLevel(lvln);
                        ForceUser.getLevel();
                        txtheroHP.setText(String.valueOf((ForceUser.hpp())));
                        txtheroMP.setText(String.valueOf((ForceUser.mpp())));
                        txtheroArmor.setText(String.valueOf((ForceUser.getBaseArmor())));
                        txtHeroSTR.setText(String.valueOf((ForceUser.strr())));
                        txtHeroAGI.setText(String.valueOf(ForceUser.agii()));
                        txtHeroINT.setText(String.valueOf(ForceUser.intt()));
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });

        }
        else if (classs.equals("Assassin")) {
            ArrayAdapter<CharSequence> sub = ArrayAdapter.createFromResource(
                    this, R.array.Assassin, android.R.layout.simple_dropdown_item_1line);
            spin.setAdapter(sub);
            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    scs = spin.getSelectedItem().toString();
                    if (scs.equals("Chaser")) {
                        z.setVisibility(View.GONE);
                        a.setVisibility(View.GONE);
                        b.setVisibility(View.GONE);
                        c.setVisibility(View.GONE);
                        d.setVisibility(View.GONE);
                        e.setVisibility(View.VISIBLE);
                        f.setVisibility(View.GONE);
                        g.setVisibility(View.GONE);
                        h.setVisibility(View.GONE);
                        lvln = Double.parseDouble(lvl.getText().toString());
                        Chaser.setLevel(lvln);
                        Chaser.getLevel();
                        txtheroHP.setText(String.valueOf((Chaser.hpp())));
                        txtheroMP.setText(String.valueOf((Chaser.mpp())));
                        txtheroArmor.setText(String.valueOf((Chaser.getBaseArmor())));
                        txtHeroSTR.setText(String.valueOf((Chaser.strr())));
                        txtHeroAGI.setText(String.valueOf(Chaser.agii()));
                        txtHeroINT.setText(String.valueOf(Chaser.intt()));
                    }
                    else {
                        z.setVisibility(View.GONE);
                        a.setVisibility(View.GONE);
                        b.setVisibility(View.GONE);
                        c.setVisibility(View.GONE);
                        d.setVisibility(View.GONE);
                        e.setVisibility(View.GONE);
                        f.setVisibility(View.VISIBLE);
                        g.setVisibility(View.GONE);
                        h.setVisibility(View.GONE);
                        lvln = Double.parseDouble(lvl.getText().toString());
                        Bringer.setLevel(lvln);
                        Bringer.getLevel();
                        txtheroHP.setText(String.valueOf((Bringer.hpp())));
                        txtheroMP.setText(String.valueOf((Bringer.mpp())));
                        txtheroArmor.setText(String.valueOf((Bringer.getBaseArmor())));
                        txtHeroSTR.setText(String.valueOf((Bringer.strr())));
                        txtHeroAGI.setText(String.valueOf(Bringer.agii()));
                        txtHeroINT.setText(String.valueOf(Bringer.intt()));
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

        } else if (classs.equals("Archer")) {
            ArrayAdapter<CharSequence> sub = ArrayAdapter.createFromResource(
                    this, R.array.Archer, android.R.layout.simple_dropdown_item_1line);
            spin.setAdapter(sub);
            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    scs = spin.getSelectedItem().toString();
                    if (scs.equals("BowMaster")) {
                        z.setVisibility(View.GONE);
                        a.setVisibility(View.GONE);
                        b.setVisibility(View.GONE);
                        c.setVisibility(View.GONE);
                        d.setVisibility(View.GONE);
                        e.setVisibility(View.GONE);
                        f.setVisibility(View.GONE);
                        g.setVisibility(View.VISIBLE);
                        h.setVisibility(View.GONE);
                        lvln = Double.parseDouble(lvl.getText().toString());
                        BowMaster.setLevel(lvln);
                        BowMaster.getLevel();
                        txtheroHP.setText(String.valueOf((BowMaster.hpp())));
                        txtheroMP.setText(String.valueOf((BowMaster.mpp())));
                        txtheroArmor.setText(String.valueOf((BowMaster.getBaseArmor())));
                        txtHeroSTR.setText(String.valueOf((BowMaster.strr())));
                        txtHeroAGI.setText(String.valueOf(BowMaster.agii()));
                        txtHeroINT.setText(String.valueOf(BowMaster.intt()));
                    } else {
                        z.setVisibility(View.GONE);
                        a.setVisibility(View.GONE);
                        b.setVisibility(View.GONE);
                        c.setVisibility(View.GONE);
                        d.setVisibility(View.GONE);
                        e.setVisibility(View.GONE);
                        f.setVisibility(View.GONE);
                        g.setVisibility(View.GONE);
                        h.setVisibility(View.VISIBLE);
                        lvln = Double.parseDouble(lvl.getText().toString());
                        Acrobat.setLevel(lvln);
                        Acrobat.getLevel();
                        txtheroHP.setText(String.valueOf((Acrobat.hpp())));
                        txtheroMP.setText(String.valueOf((Acrobat.mpp())));
                        txtheroArmor.setText(String.valueOf((Acrobat.getBaseArmor())));
                        txtHeroSTR.setText(String.valueOf((Acrobat.strr())));
                        txtHeroAGI.setText(String.valueOf(Acrobat.agii()));
                        txtHeroINT.setText(String.valueOf(Acrobat.intt()));
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
        }
    }
}