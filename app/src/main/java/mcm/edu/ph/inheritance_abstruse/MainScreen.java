package mcm.edu.ph.inheritance_abstruse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);
        Button heroButton = findViewById(R.id.heroesBtn);
        Button monsterButton = findViewById(R.id.monstersBtn);

        heroButton.setOnClickListener(this);
        monsterButton.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.heroesBtn:
                Intent Hero = new Intent(this, MainActivityHero.class);
                startActivity(Hero);
                break;
            case R.id.monstersBtn:
                Intent Monster = new Intent (this, MainActivityMonster.class);
                startActivity(Monster);
                break;
        }
    }
}