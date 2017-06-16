package hu.borde.gyulatourguide;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import listadapters.HotelListAdapter;
import listitems.Hotel;
import listitems.Sight;

public class SightsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sights);


        final List<Sight> sightList = new ArrayList<>();

        sightList.add(new Sight("Almasy Castle", "Previous centuries have been dominated by these contrasts as we are today. And yet, even if we walked through every castle in Hungary or even Europe, we would still not learn anything about the world behind its curtains and about the real people, without which and whom the opulence and splendor would have ceased immediately, Until now!", R.drawable.almasy_castle));

        sightList.add(new Sight("The Medieval Gyula Castle & Bastion", "Built in the fifteenth century, it is the only intact remaining brick castle from the towns of the Hungarian Plains.", R.drawable.gyula_castle));

        sightList.add(new Sight("The centennial confectionery", "A second oldest confectionery in Hungary, which operates since 1840 in the beautiful building built in imperial style, with walls covered by paintings and furnished by unaltered original Biedermeier furniture.", R.drawable.gyula_centennial));

        sightList.add(new Sight("The Snail Garden", "By the Élővíz Canal (Living Water Canal) is stretching out the biggest green area of the city on a land of about 3.5 hectares, declared a natural park in the meantime.  It was named The Snail Garden because of the artificially created hill you can climb and descend on, in a spiral path.", R.drawable.snail_garden));

        sightList.add(new Sight("Parish Church of the Blessed Virgin Mary", "On the current place where nowadays the Parish Church of Blessed Virgin Mary is situated, before the arrival of the Turks, was also a church. In this respect it has been preserved with great care the painting of the Virgin Mary \"Nadia Szűz Mária\". Later, during the Turkish occupation, both the painting and the church were destroyed and burned down.", R.drawable.mary_church));

        sightList.add(new Sight("Ladics House", "Built on one level in the early nineteenth century, this common baroque house\n" +
                "served as a notary house.  Lawyer Dr. György Ladics and his wife were the first to reside here\n" +
                "and in later years their descendants, until its final transformation into a\n" +
                "museum.", R.drawable.ladics));

        sightList.add(new Sight("Erkel Ferenc Memorial House", "The School of Németgyula and the teacher's house were built in 1795. In 1821 the house that served as a school and also a home for the teachers' family, received an additional classroom to the old one.", R.drawable.erkel_house));

        sightList.add(new Sight("Ceremony Hall", "The Ceremony Hall (in the former building of the County House) is one of the attractions that are seldom listed on our town landmarks list due to its administrative character. In the local newspapers photos from events or festivities that are held in this town centre building are often seen, but they focus less on the building and the hall of ceremonies, and more on people participating in these events - naturally!", R.drawable.ceremony_hall));

        sightList.add(new Sight("Castle Bath & AquaPalace", "The Castle Bath of Gyula offers approx. 5000 m² water surface area with a total of 16 pools of thermal water. The thermal water of 72°C erupts to the surface from a depth of 2,500 meters beneath our earth's surface. We recommend it primarily for the treatment of musculoskeletal conditions and diseases as well as for localised nervous system rehabilitative treatments following accidents.", R.drawable.bath));

        sightList.add(new Sight("Gyulavári Castle", "The idea of \u200B\u200Bcreating a visitor center at Castle Gyulavári started from the desire\n" +
                "of renovation, conservation and rehabilitation of the region and the importance\n" +
                "of present values, \u200B\u200Benvironment, nature, craftsmanship, culture and ethnography.\n" +
                "All these are also reflected in this residence of the former nobility.", R.drawable.gyulavari));

        ListView listView = (ListView) findViewById(R.id.sights_listview);

        SightsListAdapter adapter = new SightsListAdapter(this, sightList);

        listView.setAdapter(adapter);

        listView.setDivider(new ColorDrawable(ContextCompat.getColor(this, R.color.colorPrimaryDark)));
        listView.setDividerHeight(5);


    }
}
