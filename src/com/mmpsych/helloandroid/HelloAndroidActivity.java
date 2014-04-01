package com.mmpsych.helloandroid;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class HelloAndroidActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Resources res = getResources();
        TextView textView = new TextView(this);
        textView.setText(res.getString(R.string.message));

        //Nelle Activity (ed in generale in tutte le classi derivate da android.content.Context) si può usare il metodo di convenienza getString(), riducendo il tutto a:
        String message = getString(R.string.message);
        //La scorciatoia vale solo per le stringe, ma non per gli altri tipi di risorsa disponibili


        setContentView(textView);
//        setContentView(R.layout.main);
    }
}

//        Differenza tra res e assets
//        La differenza tra le cartelle res e assets è poco evidente, eppure c’è. La directory res è pensata per gestire le risorse in
//        maniera struttura, ed infatti è suddivisa in sottocartelle. Tutte le risorse posizionate in res vengono prese in esame dal
//        sistema di build e riferite nella speciale classe R. Quelle dentro res, dunque, sono delle risorse gestite. Sotto assets, invece, è
//        possibile depositare qualsiasi file si desideri senza che il sistema di build esegua un’analisi preventiva e crei il riferimento
//        in R. Le risorse esterne conservate nella directory assets possono essere caricate servendosi della classe
//        android.content.res.AssetManager. Nella maggior parte dei casi, comunque, non c’è bisogno di ricorrere alla cartella assets,
//        poiché res offre una maniera semplificata e completa per l’accesso alle risorse.
