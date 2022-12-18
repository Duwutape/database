package de.model;

import org.fulib.builder.ClassModelDecorator;
import org.fulib.builder.ClassModelManager;
import org.fulib.builder.reflect.Link;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class GenModel implements ClassModelDecorator {

    class User {
        @Link
        ArrayList<WatchlistCom> completed;
        @Link
        ArrayList<WatchlistCurr> currently;
        @Link
        ArrayList<WatchlistHold> hold;
        @Link
        ArrayList<WatchlistUnsure> unsure;
        @Link
        ArrayList<WatchlistDrop> dropped;
    }

    class WatchlistCom {
        @Link
        ArrayList<Series> completedSeries;
        @Link
        ArrayList<Anime> completedAnime;
        @Link
        ArrayList<Movie> completedMovie;
        @Link
        ArrayList<Game> completedGame;
        @Link
        ArrayList<Book> completedBook;
    }

    class WatchlistCurr {
        @Link
        ArrayList<Series> currentSeries;
        @Link
        ArrayList<Anime> currentAnime;
        @Link
        ArrayList<Movie> currentMovie;
        @Link
        ArrayList<Game> currentGame;
        @Link
        ArrayList<Book> currentBook;
    }

    class WatchlistHold {
        @Link
        ArrayList<Series> holdSeries;
        @Link
        ArrayList<Anime> holdAnime;
        @Link
        ArrayList<Movie> holdMovie;
        @Link
        ArrayList<Game> holdGame;
        @Link
        ArrayList<Book> holdBook;
    }

    class WatchlistUnsure {
        @Link
        ArrayList<Series> unsureSeries;
        @Link
        ArrayList<Anime> unsureAnime;
        @Link
        ArrayList<Movie> unsureMovie;
        @Link
        ArrayList<Game> unsureGame;
        @Link
        ArrayList<Book> unsureBook;
    }

    class WatchlistDrop {
        @Link
        ArrayList<Series> droppedSeries;
        @Link
        ArrayList<Anime> droppedAnime;
        @Link
        ArrayList<Movie> droppedMovie;
        @Link
        ArrayList<Game> droppedGame;
        @Link
        ArrayList<Book> droppedBook;
    }

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
