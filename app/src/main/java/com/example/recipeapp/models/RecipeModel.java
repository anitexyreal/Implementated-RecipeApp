package com.example.recipeapp.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RecipeModel {

        @SerializedName("calories")
        @Expose
        private String calories;
        @SerializedName("carbos")
        @Expose
        private String carbos;
        @SerializedName("card")
        @Expose
        private String card;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("deliverable_ingredients")
        @Expose
        private List<String> deliverableIngredients = null;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("difficulty")
        @Expose
        private Integer difficulty;
        @SerializedName("fats")
        @Expose
        private String fats;
        @SerializedName("favorites")
        @Expose
        private Integer favorites;
        @SerializedName("fibers")
        @Expose
        private String fibers;
        @SerializedName("headline")
        @Expose
        private String headline;
        @SerializedName("highlighted")
        @Expose
        private Boolean highlighted;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("image")
        @Expose
        private String image;
        @SerializedName("incompatibilities")
        @Expose
        private Object incompatibilities;
        @SerializedName("ingredients")
        @Expose
        private List<String> ingredients = null;
        @SerializedName("keywords")
        @Expose
        private List<String> keywords = null;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("products")
        @Expose
        private List<String> products = null;
        @SerializedName("proteins")
        @Expose
        private String proteins;
        @SerializedName("rating")
        @Expose
        private Double rating;
        @SerializedName("ratings")
        @Expose
        private Integer ratings;
        @SerializedName("thumb")
        @Expose
        private String thumb;
        @SerializedName("time")
        @Expose
        private String time;
        @SerializedName("undeliverable_ingredients")
        @Expose
        private List<Object> undeliverableIngredients = null;
        @SerializedName("user")
        @Expose
        private User user;
        @SerializedName("weeks")
        @Expose
        private List<String> weeks = null;

        public String getCalories() {
            return calories;
        }

        public void setCalories(String calories) {
            this.calories = calories;
        }

        public String getCarbos() {
            return carbos;
        }

        public void setCarbos(String carbos) {
            this.carbos = carbos;
        }

        public String getCard() {
            return card;
        }

        public void setCard(String card) {
            this.card = card;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public List<String> getDeliverableIngredients() {
            return deliverableIngredients;
        }

        public void setDeliverableIngredients(List<String> deliverableIngredients) {
            this.deliverableIngredients = deliverableIngredients;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getDifficulty() {
            return difficulty;
        }

        public void setDifficulty(Integer difficulty) {
            this.difficulty = difficulty;
        }

        public String getFats() {
            return fats;
        }

        public void setFats(String fats) {
            this.fats = fats;
        }

        public Integer getFavorites() {
            return favorites;
        }

        public void setFavorites(Integer favorites) {
            this.favorites = favorites;
        }

        public String getFibers() {
            return fibers;
        }

        public void setFibers(String fibers) {
            this.fibers = fibers;
        }

        public String getHeadline() {
            return headline;
        }

        public void setHeadline(String headline) {
            this.headline = headline;
        }

        public Boolean getHighlighted() {
            return highlighted;
        }

        public void setHighlighted(Boolean highlighted) {
            this.highlighted = highlighted;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public Object getIncompatibilities() {
            return incompatibilities;
        }

        public void setIncompatibilities(Object incompatibilities) {
            this.incompatibilities = incompatibilities;
        }

        public List<String> getIngredients() {
            return ingredients;
        }

        public void setIngredients(List<String> ingredients) {
            this.ingredients = ingredients;
        }

        public List<String> getKeywords() {
            return keywords;
        }

        public void setKeywords(List<String> keywords) {
            this.keywords = keywords;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getProducts() {
            return products;
        }

        public void setProducts(List<String> products) {
            this.products = products;
        }

        public String getProteins() {
            return proteins;
        }

        public void setProteins(String proteins) {
            this.proteins = proteins;
        }

        public Double getRating() {
            return rating;
        }

        public void setRating(Double rating) {
            this.rating = rating;
        }

        public Integer getRatings() {
            return ratings;
        }

        public void setRatings(Integer ratings) {
            this.ratings = ratings;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public List<Object> getUndeliverableIngredients() {
            return undeliverableIngredients;
        }

        public void setUndeliverableIngredients(List<Object> undeliverableIngredients) {
            this.undeliverableIngredients = undeliverableIngredients;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public List<String> getWeeks() {
            return weeks;
        }

        public void setWeeks(List<String> weeks) {
            this.weeks = weeks;
        }


}
