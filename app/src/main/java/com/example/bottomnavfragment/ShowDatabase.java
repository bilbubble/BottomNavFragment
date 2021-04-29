package com.example.bottomnavfragment;

import java.util.ArrayList;

public class ShowDatabase {
    private static final int[] ShowImages = {
            R.drawable.hospitalplaylist,
            R.drawable.secretary,
            R.drawable.truebeautyjpg,
            R.drawable.startup,
            R.drawable.hibyemama,
            R.drawable.extraordinary,
            R.drawable.ohmybaby,
    };

    static ArrayList<ShowModel> getListData(){
        ArrayList<ShowModel> list = new ArrayList<>();
        for (int position = 0; position<ShowImages.length; position++){
            int photo = ShowImages[position];
            ShowModel show = new ShowModel(photo);

            list.add(show);

        }
        return list;
    }

}
