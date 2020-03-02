package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.recipeapp.models.RecipeModel;

import java.util.HashSet;
import java.util.Set;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailActivity extends AppCompatActivity {
    public static final String RECIPE_POSITION = "recipe_position";
    public static final String PREFERENCE_NAME = "com.example.recipeapp";
    public static final String PREFERENCE_KEY_NAME = "favourite";
    Set<String> mFavourite;
    int Position;
    TextView name, headline, description, ingredients, calories, carbos, country, difficulty,
     products, proteins, weeks, userName, email, time, fats, id;
    CircleImageView image;
    ImageView favorite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initialized();

        mFavourite = getFavourite();
        saveFavourite();
    }


    private void initialized() {
        Intent intent = getIntent();

        name = findViewById(R.id.recipe_name);
        headline = findViewById(R.id.headline);
        fats = findViewById(R.id.fats);
        time = findViewById(R.id.time);
        email = findViewById(R.id.email);
        userName = findViewById(R.id.userName);
        weeks = findViewById(R.id.weeks);
        proteins = findViewById(R.id.proteins);
        products = findViewById(R.id.products);
        difficulty = findViewById(R.id.difficulty);
        id = findViewById(R.id.id);
        country = findViewById(R.id.country);
        calories = findViewById(R.id.calories);
        carbos = findViewById(R.id.carbos);
        description = findViewById(R.id.description);
        ingredients = findViewById(R.id.ingredients);
        image = findViewById(R.id.recipeImage);
        favorite = findViewById(R.id.favorites);



        if (intent != null) {
            Position = intent.getIntExtra(RECIPE_POSITION, 0);
            RecipeModel recipe = RecipeActivity.getRecipe(Position);

            Glide.with(this).load(recipe.getImage())
                    .error(R.mipmap.ic_launcher)
                    .apply(RequestOptions.centerCropTransform())
                    .into(image);
            name.setText(recipe.getName());
            ingredients.setText(recipe.getIngredients().toString());
            description.setText(recipe.getDescription());
            carbos.setText(recipe.getCarbos());
            calories.setText(recipe.getCalories());
            country.setText(recipe.getCountry());
            id.setText(recipe.getId());
            difficulty.setText(recipe.getDifficulty().toString());
            products.setText(recipe.getProducts().toString());
            proteins.setText(recipe.getProteins());
            weeks.setText(recipe.getWeeks().toString());
            userName.setText(recipe.getUser().getName());
            email.setText(recipe.getUser().getEmail());
            time.setText(recipe.getTime());
            fats.setText(recipe.getFats());
            headline.setText(recipe.getHeadline());
        }
    }

    public void favor(View v){

        if (ConfirmFavourite (Position)){
            mFavourite.remove(Integer.toString(Position));
            Toast.makeText(DetailActivity.this,"Removed from favorite list",Toast.LENGTH_SHORT).show();
        }else {
            mFavourite.add(Integer.toString(Position));
            Toast.makeText(DetailActivity.this,"Added to your favorite list",Toast.LENGTH_SHORT).show();
        }
        saveFavourite();
    }

    private boolean ConfirmFavourite(int isPosition) {
        Set<String> FavCF = getFavourite();
        if (FavCF.contains(Integer.toString(isPosition))){
            return true;
        }else {
            return false;
        }
    }

    private void saveFavourite() {
        SharedPreferences preferences = getSharedPreferences(PREFERENCE_NAME, 0);
        SharedPreferences.Editor editP = preferences.edit();
        editP.putStringSet(PREFERENCE_KEY_NAME, mFavourite).apply();
        if (ConfirmFavourite(Position)) {
            favorite.setImageResource(R.drawable.yeslove);
        } else {
            favorite.setImageResource(R.drawable.like);
        }
    }

    private Set<String> getFavourite() {
        SharedPreferences preferences = getSharedPreferences(PREFERENCE_NAME, 0);
        return preferences.getStringSet(PREFERENCE_KEY_NAME, new HashSet<String>());
    }

}
