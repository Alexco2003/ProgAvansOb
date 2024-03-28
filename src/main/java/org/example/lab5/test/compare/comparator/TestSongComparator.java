package org.example.lab5.test.compare.comparator;

import org.example.lab5.compare.comparator.Song;
import org.example.lab5.compare.comparator.SongNameComparator;
import org.example.lab5.compare.comparator.SongRatingComparator;
import org.example.lab5.compare.comparator.SongYearComparator;


import java.util.Arrays;

public class TestSongComparator {
    public static void main(String[] args) {
        Song thriftShop = new Song("Thrift Shop", 2013, 9);
        Song happy = new Song("Happy", 2014, 8);
        Song irreplaceable = new Song("Irreplaceable", 2007, 10);

        Song[] songs = {thriftShop, happy, irreplaceable};

        System.out.println("SORTED BY RATING: ");
        SongRatingComparator ratingCompare = new SongRatingComparator();
        Arrays.sort(songs, ratingCompare);
        for (Song song : songs) {
            System.out.println("\t" + song.getName() + "-" + song.getRating());
        }

        System.out.println("SORTED BY NAME: ");
        SongNameComparator nameComparator = new SongNameComparator();
        Arrays.sort(songs, nameComparator);
        for (Song song : songs) {
            System.out.println("\t" + song.getName());
        }

        System.out.println("SORTED BY YEAR: ");
        SongYearComparator yearComparator = new SongYearComparator();
        Arrays.sort(songs, yearComparator);
        for (Song song : songs) {
            System.out.println("\t" + song.getName() + " - " + song.getYear());
        }


    }
}
