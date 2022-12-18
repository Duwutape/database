package de.model;

import org.fulib.builder.ClassModelDecorator;
import org.fulib.builder.ClassModelManager;
import org.fulib.builder.reflect.Link;

import java.util.ArrayList;
import java.util.Date;

@SuppressWarnings("unused")
public class GenModel implements ClassModelDecorator {

    /*    class User {
            @Link
            ArrayList<Watchlist> completed;
            @Link
            ArrayList<Watchlist> currently;
            @Link
            ArrayList<Watchlist> hold;
            @Link
            ArrayList<Watchlist> unsure;
            @Link
            ArrayList<Watchlist> dropped;
        }

        class Watchlist{
            @Link
            ArrayList completed;
            @Link
            ArrayList currently;
            @Link
            ArrayList hold;
            @Link
            ArrayList unsure;
            @Link
            ArrayList dropped;
        }*/

    class AllSeries {
        @Link
        ArrayList<Series> seriesList;
    }

    class Series {
        ArrayList<String> alias;
        String nameOV;
        String nameGer;
        String language;
        ArrayList<String> genre;
        @Link("series")
        ArrayList<Season> seasons;

    }

    class Season {
        String name;
        ArrayList<Integer> yearOV;
        ArrayList<Integer> yearGer;
        int fsk;
        ArrayList<String> platform;
        int numEpisodes;
        float lenEpisodes;
        float lenSeason;
        @Link("sequel")
        ArrayList<Season> prequel;
        @Link("prequel")
        ArrayList<Season> sequel;
        @Link("seasons")
        Series series;
    }

    class AllAnime {
        @Link
        ArrayList<Anime> animeList;
    }

    class Anime {
        ArrayList<String> alias;
        String nameJap;
        String nameEng;
        String nameGer;
        ArrayList<Integer> year;
        int fsk;
        ArrayList<String> genre;
        int numEpisodes;
        float lenEpisodes;
        float lenAnime;
        @Link("sequel")
        ArrayList<Anime> prequel;
        @Link("prequel")
        ArrayList<Anime> sequel;
    }

    class AllMovie {
        @Link
        ArrayList<Movie> movieList;
    }

    class Movie {
        ArrayList<String> alias;
        String nameOV;
        String nameGer;
        String universe;
        int year;
        int fsk;
        int length;
        @Link("sequel")
        ArrayList<Movie> prequel;
        @Link("prequel")
        ArrayList<Movie> sequel;
    }

    class AllGame {
        @Link
        ArrayList<Game> gameList;
    }

    class Game {
        ArrayList<String> alias;
        String nameOV;
        String nameGer;
        String universe;
        int usk;
        ArrayList<String> genre;
        @Link("sequel")
        ArrayList<Game> prequel;
        @Link("prequel")
        ArrayList<Game> sequel;
        @Link
        ArrayList<Release> published;
    }

    class Release {
        int year;
        ArrayList<String> platform;
        ArrayList<String> note;
    }

    class AllBook {
        @Link
        ArrayList<Book> bookList;
    }

    class Book {
        ArrayList<String> alias;
        String nameOV;
        String nameGer;
        String universe;
        ArrayList<String> author;
        int year;
        @Link("sequel")
        ArrayList<Book> prequel;
        @Link("prequel")
        ArrayList<Book> sequel;
    }

    @Override
    public void decorate(ClassModelManager mm) {
        mm.getClassModel().setDefaultPropertyStyle(org.fulib.builder.Type.POJO);
        mm.haveNestedClasses(GenModel.class);
    }

}
