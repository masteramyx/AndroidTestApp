package com.example.kyle.testapp;

import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by Kyle on 1/27/2018.
 */

public class ProfileActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView profileImageView = (ImageView) findViewById(R.id.profileImageView);
        TextView userNameTextView = (TextView) findViewById(R.id.usernameTextView);
        TextView charHeight = (TextView) findViewById(R.id.charHeight);
        TextView mass =(TextView) findViewById(R.id.mass);
        TextView hair =(TextView) findViewById(R.id.hair_color);
        TextView skin =(TextView) findViewById(R.id.skin_color);
        TextView eye =(TextView) findViewById(R.id.eye_color);
        TextView birth =(TextView) findViewById(R.id.birth_year);
        TextView gender =(TextView) findViewById(R.id.gender);


        Intent intent = getIntent();
        final String userName = intent.getStringExtra(CharactersAdapter.KEY_NAME);
        String image = intent.getStringExtra(CharactersAdapter.KEY_IMAGE);
        final String height1 = intent.getStringExtra(CharactersAdapter.KEY_HT);
        final String mass1 = intent.getStringExtra(CharactersAdapter.KEY_MASS);
        final String hair1 = intent.getStringExtra(CharactersAdapter.KEY_HAIR);
        final String skin1 = intent.getStringExtra(CharactersAdapter.KEY_SKIN);
        final String eye1 = intent.getStringExtra(CharactersAdapter.KEY_EYE);
        final String birth1 = intent.getStringExtra(CharactersAdapter.KEY_BIRTH);
        final String gen1 = intent.getStringExtra(CharactersAdapter.KEY_GEN);

        Picasso.with(this)
                .load(image)
                .into(profileImageView);

        //Name
        userNameTextView.setText(userName);
        //Height
        String height1_2 = "Height: " + height1;
        charHeight.setText(height1_2);
        //Mass
        String mass1_2 = "Mass:" + mass1;
        mass.setText(mass1_2);
        //Hair
        String hair1_2 = "Hair: " + hair1;
        hair.setText(hair1_2);
        //Skin
        String skin1_2 = "Skin: " + skin1;
        skin.setText(skin1_2);
        //eye
        String eye1_2 = "Eye: " + eye1;
        eye.setText(eye1_2);
        //Birth
        String birth1_2 = "Birthdate: " + birth1;
        birth.setText(birth1_2);
        //Gender
        String gen1_2 = "Gender: "+ gen1;
        gender.setText(gen1_2);

    }
}
