package com.example.recipeapp.api;

import com.example.recipeapp.models.RecipeModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface  RecipeApi {

    @GET("Recipe.json")
    Call<List<RecipeModel>> readJson();
}
