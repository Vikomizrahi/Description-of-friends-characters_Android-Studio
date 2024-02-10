package com.example.friendsrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Ross Geller", "Ross is passionate about his work and exhibits a nerdy, awkward demeanor in social situations.",R.drawable.ross));
        items.add(new Item("Joey Tribbiani", "Joey known for his charming, albeit dim-witted, personality, his love for food, and his aspiring acting career.",R.drawable.joey));
        items.add(new Item("Monica Geller", "Monica is known for her perfectionist tendencies, culinary skills, and competitive nature.",R.drawable.monica_geller));
        items.add(new Item("Rachel Green", "Rachel is a fashion-forward, determined, and sometimes naive character who evolves from a wealthy, runaway bride to a successful career woman throughout the series.",R.drawable.rachel));
        items.add(new Item("Chandler Bing", "Chandler is known for his quick wit, sarcastic humor, and endearing awkwardness.",R.drawable.c));
        items.add(new Item("Phoebe Buffay", "is a free-spirited, eccentric, and whimsical character known for her quirky personality, unique worldview, and unconventional past.",R.drawable.phoebe));
        items.add(new Item("Ben Geller", "Ben is depicted as a sweet and curious child who brings joy to his father's life despite the challenges of co-parenting.",R.drawable.ben));
        items.add(new Item("Carol Geller", "Carol is depicted as a confident and independent woman who navigates co-parenting with Ross after their divorce.",R.drawable.carol));
        items.add(new Item("Gunther", "Gunther known for his role as the manager of the Central Perk coffeehouse, where the main characters frequently hang.",R.drawable.gunther));
        items.add(new Item("Janice", "Janice Known for her distinct laugh and catchphrase \"OMG\", Janice is depicted as an exuberant and eccentric woman with a penchant for dramatic entrances.",R.drawable.janice));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}