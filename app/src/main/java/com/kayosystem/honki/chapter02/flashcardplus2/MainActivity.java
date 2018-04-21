package com.kayosystem.honki.chapter02.flashcardplus2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Card> mCards;
    CardAdapter mCardAdapter;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView =(ListView)findViewById(R.id.listView);
        mCards = new ArrayList<Card>();

        mCards.add(new Card(R.drawable.pictman_voice, getString(R.string.voice_title),
                getString(R.string.voice_content),getString(R.string.voice_meaning)));
        mCards.add(new Card(R.drawable.pictman_sing, getString(R.string.sing_title),
                getString(R.string.sing_content),getString(R.string.sing_meaning)));

        mCardAdapter = new CardAdapter(this, R.layout.card, mCards);
        mListView.setAdapter(mCardAdapter);
    }
}
