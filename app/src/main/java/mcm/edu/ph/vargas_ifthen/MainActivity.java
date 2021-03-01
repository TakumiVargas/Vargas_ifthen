 package mcm.edu.ph.vargas_ifthen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDecision1 = findViewById(R.id.btnDecision1);
        Button btnDecision2 = findViewById(R.id.btnDecision2);

        TextView txtLore = findViewById(R.id.txtLore);
        TextView txtAns = findViewById(R.id.txtAns);
        btnDecision1.setOnClickListener(this);
        btnDecision2.setOnClickListener(this);

        txtLore.setText("I went outside and got hit by a truck and died and got resurrected to another universe. \n \nNow what will you do?");
        txtAns.setText("First Decision: Find out where the heck am i and find a nearby village \n \n" +
                "Second Decision: Find out what my superpowers is");
    }

    @Override
    public void onClick(View view) {

        TextView txtLore = findViewById(R.id.txtLore);
        TextView txtAns = findViewById(R.id.txtAns);

        if (view.getId() == R.id.btnDecision1) {
            txtLore.setText("You found a nearby village and talked to the people and asked where am i? \n \nThe people answered you are in the Springvale village in Mondstadt");
            txtAns.setText("First Decision: Go to the main city of Mondstadt and ask more information \n \n" +
                    "Second Decision: Kill Monsters without any armor or a weapon");
            if (view.getId() == R.id.btnDecision1) {
                txtLore.setText("You ask questions and found out you are in the world of Teyvat");
            }
            if (view.getId() == R.id.btnDecision2) {
                txtLore.setText("You died but respawned to the waypoint anyways");
            } else if (view.getId() == R.id.btnDecision2) {
                txtLore.setText("You tried everything you could to find out your superpowers but sadly you don't have one.");
                txtAns.setText("First Decision: Go to the Main City and borrow some dull swords to earn some coins while defeating monsters \n \n" +
                        "Second Decision: Keep trying until something happens");

                if (view.getId() == R.id.btnDecision1) {
                    txtLore.setText("You borrowed some Dull sword from the craftsman and killed weak monsters to earn some coins");
                }
                if (view.getId() == R.id.btnDecision2) {
                    txtLore.setText("Nothing Happens");
                }
            }
        }
    }
}

