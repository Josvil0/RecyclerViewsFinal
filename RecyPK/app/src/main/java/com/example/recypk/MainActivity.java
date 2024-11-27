package com.example.recypk;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PokemonAdapter pokemonAdapter;
    private List<Pokemon> pokemonList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        pokemonList = new ArrayList<>();
        pokemonList.add(new Pokemon("bulbasaur", "https://pokeapi.co/api/v2/pokemon-species/1/"));
        pokemonList.add(new Pokemon("ivysaur", "https://pokeapi.co/api/v2/pokemon-species/2/"));
        pokemonList.add(new Pokemon("venusaur", "https://pokeapi.co/api/v2/pokemon-species/3/"));
        pokemonList.add(new Pokemon("charmander", "https://pokeapi.co/api/v2/pokemon-species/4/"));
        pokemonList.add(new Pokemon("charmeleon", "https://pokeapi.co/api/v2/pokemon-species/5/"));
        pokemonList.add(new Pokemon("charizard", "https://pokeapi.co/api/v2/pokemon-species/6/"));
        pokemonList.add(new Pokemon("squirtle", "https://pokeapi.co/api/v2/pokemon-species/7/"));
        pokemonList.add(new Pokemon("wartortle", "https://pokeapi.co/api/v2/pokemon-species/8/"));
        pokemonList.add(new Pokemon("blastoise", "https://pokeapi.co/api/v2/pokemon-species/9/"));
        pokemonList.add(new Pokemon("caterpie", "https://pokeapi.co/api/v2/pokemon-species/10/"));
        pokemonList.add(new Pokemon("metapod", "https://pokeapi.co/api/v2/pokemon-species/11/"));
        pokemonList.add(new Pokemon("butterfree", "https://pokeapi.co/api/v2/pokemon-species/12/"));
        pokemonList.add(new Pokemon("weedle", "https://pokeapi.co/api/v2/pokemon-species/13/"));
        pokemonList.add(new Pokemon("kakuna", "https://pokeapi.co/api/v2/pokemon-species/14/"));
        pokemonList.add(new Pokemon("beedrill", "https://pokeapi.co/api/v2/pokemon-species/15/"));
        pokemonList.add(new Pokemon("pidgey", "https://pokeapi.co/api/v2/pokemon-species/16/"));
        pokemonList.add(new Pokemon("pidgeotto", "https://pokeapi.co/api/v2/pokemon-species/17/"));
        pokemonList.add(new Pokemon("pidgeot", "https://pokeapi.co/api/v2/pokemon-species/18/"));
        pokemonList.add(new Pokemon("rattata", "https://pokeapi.co/api/v2/pokemon-species/19/"));
        pokemonList.add(new Pokemon("raticate", "https://pokeapi.co/api/v2/pokemon-species/20/"));

        pokemonAdapter = new PokemonAdapter(pokemonList);
        recyclerView.setAdapter(pokemonAdapter);
    }
}
