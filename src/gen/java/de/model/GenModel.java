package de.model;

import org.fulib.builder.ClassModelDecorator;
import org.fulib.builder.ClassModelManager;
import org.fulib.builder.reflect.Link;

import java.util.ArrayList;
import java.util.Date;

@SuppressWarnings("unused")
public class GenModel implements ClassModelDecorator {

    class User {
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
    class Watchlist {
        @Link
        ArrayList<Series> seriesList;

        @Link
        ArrayList<Anime> animeList;
        @Link
        ArrayList<Movie> MoviesList;
        @Link
        ArrayList<Game> gamesList;
        @Link
        ArrayList<Book> booksList;
    }

    class Basic {
        ArrayList<String> alias;
        String nameOV;
        String nameGer;
        ArrayList<Integer> yearOV;
        ArrayList<Integer> yearGer;
        int fsk;
        ArrayList<String> genre;
        ArrayList<String> platform;
    }

    class Series extends Basic{
        String language;
        @Link("series")
        ArrayList<Season> seasons;

    }

    class Season extends Basic {
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

    class Anime extends Basic{
        String nameEng;
        int numEpisodes;
        float lenEpisodes;
        float lenAnime;
        @Link("sequel")
        ArrayList<Anime> prequel;
        @Link("prequel")
        ArrayList<Anime> sequel;
    }

    class Movie extends Basic {
        String universe;
        int length;
        @Link("sequel")
        ArrayList<Movie> prequel;
        @Link("prequel")
        ArrayList<Movie> sequel;
    }

    class Game extends Basic {
        String universe;
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

    class Book extends Basic {
        String universe;
        ArrayList<String> author;
        Date date;

    }

    @Override
    public void decorate(ClassModelManager mm) {
        mm.getClassModel().setDefaultPropertyStyle(org.fulib.builder.Type.POJO);
        mm.haveNestedClasses(GenModel.class);
    }

}
