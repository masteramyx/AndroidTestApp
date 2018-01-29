package com.example.kyle.testapp;

/**
 * Created by Kyle on 1/27/2018.
 */

public class CharactersList {

    private String name;
    private String image, height, mass, hair_color,skin_color,eye_color,birth_year,gender;


    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public String getHair_color() {
        return hair_color;
    }

    public String getEye_color() {
        return eye_color;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public String getGender() {
        return gender;
    }

    public String getMass() {
        return mass;
    }

    public String getHeight() {
        return height;
    }



    public CharactersList(String name, String image, String height, String mass, String hair_color, String skin_color, String eye_color, String birth_year, String gender) {
        this.name = name;
        this.image = image;
        this.height = height;
        this.mass = mass;
        this.hair_color = hair_color;
        this.skin_color = skin_color;
        this.eye_color = eye_color;
        this.birth_year = birth_year;
        this.gender = gender;


    }
}


