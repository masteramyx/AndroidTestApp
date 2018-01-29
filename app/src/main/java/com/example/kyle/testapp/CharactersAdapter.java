package com.example.kyle.testapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Kyle on 1/27/2018.
 */

public class CharactersAdapter extends RecyclerView.Adapter<CharactersAdapter.ViewHolder>{



    public static final String KEY_NAME = "name";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_HT = "height";
    public static final String KEY_MASS = "mass";
    public static final String KEY_HAIR = "hair_color";
    public static final String KEY_SKIN = "skin_color";
    public static final String KEY_EYE = "eye_color";
    public static final String KEY_BIRTH = "birth_year";
    public static final String KEY_GEN = "gender";

    // we define a list from the CharactersList java class

    private List<CharactersList> charactersLists;
    private Context context;

    public CharactersAdapter(List<CharactersList> charactersLists, Context context) {

        // generate constructors to initialise the List and Context objects

        this.charactersLists = charactersLists;
        this.context = context;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // this method will be called whenever our ViewHolder is created
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.characters_list, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        // this method will bind the data to the ViewHolder from whence it'll be shown to other Views

        final CharactersList charactersList = charactersLists.get(position);
        holder.name.setText(charactersList.getName());

        Picasso.with(context)
                .load(charactersList.getImage())
                .into(holder.avatar_url);

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharactersList charactersList1 = charactersLists.get(position);
                Intent skipIntent = new Intent(v.getContext(), ProfileActivity.class);
                skipIntent.putExtra(KEY_NAME, charactersList1.getName());
                skipIntent.putExtra(KEY_HT, charactersList1.getHeight());
                skipIntent.putExtra(KEY_IMAGE, charactersList1.getImage());
                skipIntent.putExtra(KEY_MASS, charactersList1.getMass());
                skipIntent.putExtra(KEY_HAIR, charactersList1.getHair_color());
                skipIntent.putExtra(KEY_SKIN, charactersList1.getSkin_color());
                skipIntent.putExtra(KEY_EYE, charactersList1.getEye_color());
                skipIntent.putExtra(KEY_BIRTH, charactersList1.getBirth_year());
                skipIntent.putExtra(KEY_GEN, charactersList1.getGender());
                v.getContext().startActivity(skipIntent);
            }
        });

    }

    @Override

    //return the size of the listItems (developersList)

    public int getItemCount() {
        return charactersLists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder  {

        // define the View objects

        public TextView name;
        public ImageView avatar_url;
        public TextView html_url;
        public LinearLayout linearLayout;

        public ViewHolder(View itemView) {
            super(itemView);

            // initialize the View objects

            name = (TextView) itemView.findViewById(R.id.username);
            avatar_url = (ImageView) itemView.findViewById(R.id.imageView);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayout);
        }

    }
}


