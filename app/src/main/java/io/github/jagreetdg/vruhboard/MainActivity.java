package io.github.jagreetdg.vruhboard;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> txts;
    private ArrayList<Integer> pb_ids;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txts = new ArrayList<>();
        pb_ids = new ArrayList<>();
        Button vb = (Button)findViewById(R.id.vruh_button);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.vruh_button);
        vb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                Toast.makeText(getApplicationContext(), "Vruhing",Toast.LENGTH_SHORT).show();
            }
        });
        Button rn = (Button)findViewById(R.id.dev_vjz);
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        rn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content =
                        "Updates :\n\t" +
                        "1) Aur Daal (New Audio)\n\t" +
                        "2) Babar Bichi (New Audio)\n\t" +
                        "3) Danny Hatori (New Audio)\n\t"+
                        "4) E Site EE (New Audio)\n\t" +
                        "5) Femels Cri (New Audio)\n\t" +
                        "6) Haaalp (New Audio)\n\t" +
                        "7) Jabo to Jabo Kothay (New Audio)\n\t" +
                        "8) Lok Jodi Chodon (New Audio)\n\t" +
                        "9) Mouse Ta Dao (New Audio)\n\t" +
                        "10) Raw DC (New Audio)\n\t" +
                        "11) Sohom Cri (New Audio)\n\t" +
                        "12) Sohom Cri 2 (New Audio)\n\t" +
                        "13) Sohom Grunge (New Audio)\n\t" +
                        "14) Sohom Moo (New Audio)\n\t" +
                        "15) Sohom Horn (New Audio)\n\t" +
                        "16) Undeserving Idiot (New Audio)\n\t" +
                        "17) WTF Is Happening (New Audio)\n\t" +
                        "18) Wally Spank (New Audio)\n\t" +
                        "19) Wally vs PP (New Audio)\n\t" +
                        "20) Oh Yeah 2 (New Audio)\n\t"+
                        "21) Sohom Sike (New Audio)\n\t"+
                        "22) UI Overhaul\n\t" +
                        "23) Changed Background\n" +
                        "Known Bugs :\n" +
                        "Audio not playing till the end/not playing at all on click" + "\n" +
                        "Hotfix - Restarting the app should solve the problem" + "\n" +
                        "If possible please send a report to the dev detailing how to reciprocate the said bug for ease of debugging";
                builder.setMessage(content).setCancelable(false)
                        .setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                Toast.makeText(getApplicationContext(),"Thank You for using this app :)",
                                        Toast.LENGTH_LONG).show();
                            }
                        })
                        .setNegativeButton("Cuntinue", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                                Toast.makeText(getApplicationContext(),"Already Broken :(",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.setTitle(R.string.rn_title);
                alert.show();
            }
        });
        fillArrays();
        initRecyclerView();
    }

    private void initRecyclerView(){
        RecyclerView rv = findViewById(R.id.recycler_view);
        RVListAdapter adapter = new RVListAdapter(this,txts,pb_ids);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }

    private void fillArrays(){
        txts.add("Angle Check");
        pb_ids.add(R.raw.angle_check);
        txts.add("Dhuke Gechi Bujhte Parini");
        pb_ids.add(R.raw.dhuke_gechi_bujhte_parini);
        txts.add("E Ka Hai Bhai");
        pb_ids.add(R.raw.e_ka_hai_bhai);
        txts.add("Either Mukh Bondo");
        pb_ids.add(R.raw.either_mukh_bondo);
        txts.add("Ekhane Lok Jodi");
        pb_ids.add(R.raw.ekhane_lok_jodi);
        txts.add("Eki Tumi Ekhane");
        pb_ids.add(R.raw.eki_tumi_ekhane);
        txts.add("Game Sense Baby");
        pb_ids.add(R.raw.game_sense_baby);
        txts.add("Han Bolo Uwu");
        pb_ids.add(R.raw.han_bolo_uwu);
        txts.add("HP");
        pb_ids.add(R.raw.hp);
        txts.add("Ishhhhhhh");
        pb_ids.add(R.raw.ishhhhhhh);
        txts.add("Let's Go");
        pb_ids.add(R.raw.lets_go);
        txts.add("Oh My Gawd");
        pb_ids.add(R.raw.oh_my_gawd);
        txts.add("Oh Yeah");
        pb_ids.add(R.raw.oh_yeah);
        txts.add("Our Naru");
        pb_ids.add(R.raw.our_naru);
        txts.add("V2 Aur Daal");
        pb_ids.add(R.raw.v2_aur_daal);
        txts.add("V2 Babar Bichi");
        pb_ids.add(R.raw.v2_babar_bichi);
        txts.add("V2 Danny Hatori");
        pb_ids.add(R.raw.v2_dannyhatori);
        txts.add("V2 E Site Ee");
        pb_ids.add(R.raw.v2_e_site_ee);
        txts.add("V2 Femels Cri");
        pb_ids.add(R.raw.v2_femels_cri);
        txts.add("V2 Haaalp");
        pb_ids.add(R.raw.v2_haaalp);
        txts.add("V2 Jabo to Jabo Kothaye");
        pb_ids.add(R.raw.v2_jabo_to_jabo_kothay);
        txts.add("V2 Lok Jodi Chodon");
        pb_ids.add(R.raw.v2_lok_jodi_chodon);
        txts.add("V2 Mouse Ta Dao");
        pb_ids.add(R.raw.v2_mouse_ta_dao);
        txts.add("V2 Raw DC");
        pb_ids.add(R.raw.v2_raw_dc);
        txts.add("V2 Sohom Cri");
        pb_ids.add(R.raw.v2_sohom_cri);
        txts.add("V2 Sohom Cri 2");
        pb_ids.add(R.raw.v2_sohom_cri2);
        txts.add("V2 Sohom Moo");
        pb_ids.add(R.raw.v2_sohom_moo);
        txts.add("V2 Sohom Horn");
        pb_ids.add(R.raw.v2_sohom_horn);
        txts.add("V2 Sohom Grunge");
        pb_ids.add(R.raw.v2_sohom_grunge);
        txts.add("V2 Sohom Chinchinchoo");
        pb_ids.add(R.raw.v2_sohom_chinchinchoo);
        txts.add("V2 Undeserving Idiot");
        pb_ids.add(R.raw.v2_sohom_sike);
        txts.add("V2 Sohom Sike");
        pb_ids.add(R.raw.v2_undeserving_idiot);
        txts.add("V2 WTF Is Happening");
        pb_ids.add(R.raw.v2_wtf_is_happening);
        txts.add("V2 Wally Spank");
        pb_ids.add(R.raw.v2_wally_spank);
        txts.add("V2 Wally PP");
        pb_ids.add(R.raw.v2_wally_vs_pp);
        txts.add("V2 Oh Yeah 2");
        pb_ids.add(R.raw.v2_oh_yeah_2);
    }
}
