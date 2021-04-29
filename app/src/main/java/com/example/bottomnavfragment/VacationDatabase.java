package com.example.bottomnavfragment;

import java.util.ArrayList;

public class VacationDatabase {
    private static final String[] vacayPlaces = {
            "Hospital Playlist",
            "Secretary Kim",
            "True Beauty",
            "Start Up",
            "Hi bye, Mama!",
            "Extraordinary You",
            "Oh My Baby",
    };

    private static final String[] vacayDesc = {
            "Hospital Playlist bercerita tentang lima dokter yang telah berteman sejak mereka memasuki sekolah kedokteran pada tahun 1999.",
            "Berputar di sekitar wakil ketua narsis dari perusahaan besar, Lee Young-joon (Park Seo-joon), dan sekretarisnya yang sangat cakap, Kim Mi-so (Park Min-young). Kesalahpahaman muncul ketika dia mengumumkan bahwa dia akan mengundurkan diri dari posisinya, setelah bekerja untuk Lee Young-joon selama sembilan tahun.",
            "Im Ju-gyeong (Moon Ga-young) adalah seorang siswi SMA yang menjadi terkenal sebagai gadis cantik setelah menguasai seni rias dari YouTube. Dia berubah menjadi dewi karena keterampilan rias wajahnya, tetapi ia lebih memilih mati daripada menunjukkan wajahnya tanpa riasan kepada siapa pun.",
            "Start-Up berlatar belakang di kawasan fiksi Korea Selatan Silicon Valley yang disebut Sandbox dan menceritakan kisah orang-orang di dunia perusahaan startup.",
            "Cha Yu-ri (Kim Tae-hee) telah menjadi hantu sejak dia meninggal dalam kecelakaan tragis lima tahun lalu. Melalui proyek reinkarnasi, dia diberikan kemungkinan untuk menjadi manusia selama 49 hari. Dia kembali kepada putri dan suaminya yang telah menikah lagi, dan mencoba meringankan rasa sakit mereka sebelum pergi untuk selamanya.",
            "Bercerita tentang seorang siswi bernama Eun Dan-oh (Kim Hye-yoon) yang bersekolah di sebuah akademi bergengsi. Suatu hari, ia mengetahui bahwa dia dan semua orang di sekolahnya sebenarnya adalah karakter dalam manhwa yang berjudul Secret (비밀, RR: bimil). Ia memiliki kondisi jantung yang semakin memburuk, Dan-oh adalah karakter pendukung yang ditakdirkan segera meninggal dalam cerita ini.",
            "Jang Ha-ri (Jang Na-ra) adalah wanita lajang berusia 39 tahun dan juga seorang penggila kerja yang belum berkencan lebih dari 10 tahun, tetapi ia ingin memiliki anak. Tidak lama setelah ia menyerah akan cinta dan pernikahan, tiga pria datang dalam kehidupannya."

    };

    private static final int[] vacayImages = {
            R.drawable.hospitalplaylist,
            R.drawable.secretary,
            R.drawable.truebeautyjpg,
            R.drawable.startup,
            R.drawable.hibyemama,
            R.drawable.extraordinary,
            R.drawable.ohmybaby,
    };

    static ArrayList<VacationModel> getListData(){
        ArrayList<VacationModel> list = new ArrayList<>();
        for (int position = 0; position<vacayPlaces.length; position++){
            String name = vacayPlaces[position];
            String summary = vacayDesc[position];
            int photo = vacayImages[position];
            VacationModel vacay = new VacationModel(name, summary, photo);

            list.add(vacay);

        }
        return list;
    }


}
