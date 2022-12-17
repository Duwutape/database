package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;

public class Watchlist
{
   public static final String PROPERTY_SERIES_LIST = "seriesList";
   public static final String PROPERTY_ANIME_LIST = "animeList";
   public static final String PROPERTY_MOVIES_LIST = "MoviesList";
   public static final String PROPERTY_GAMES_LIST = "gamesList";
   public static final String PROPERTY_BOOKS_LIST = "booksList";
   private List<Series> seriesList;
   private List<Anime> animeList;
   private List<Movie> MoviesList;
   private List<Game> gamesList;
   private List<Book> booksList;

   public List<Series> getSeriesList()
   {
      return this.seriesList != null ? Collections.unmodifiableList(this.seriesList) : Collections.emptyList();
   }

   public Watchlist withSeriesList(Series value)
   {
      if (this.seriesList == null)
      {
         this.seriesList = new ArrayList<>();
      }
      if (!this.seriesList.contains(value))
      {
         this.seriesList.add(value);
      }
      return this;
   }

   public Watchlist withSeriesList(Series... value)
   {
      for (final Series item : value)
      {
         this.withSeriesList(item);
      }
      return this;
   }

   public Watchlist withSeriesList(Collection<? extends Series> value)
   {
      for (final Series item : value)
      {
         this.withSeriesList(item);
      }
      return this;
   }

   public Watchlist withoutSeriesList(Series value)
   {
      if (this.seriesList != null)
      {
         this.seriesList.remove(value);
      }
      return this;
   }

   public Watchlist withoutSeriesList(Series... value)
   {
      for (final Series item : value)
      {
         this.withoutSeriesList(item);
      }
      return this;
   }

   public Watchlist withoutSeriesList(Collection<? extends Series> value)
   {
      for (final Series item : value)
      {
         this.withoutSeriesList(item);
      }
      return this;
   }

   public List<Anime> getAnimeList()
   {
      return this.animeList != null ? Collections.unmodifiableList(this.animeList) : Collections.emptyList();
   }

   public Watchlist withAnimeList(Anime value)
   {
      if (this.animeList == null)
      {
         this.animeList = new ArrayList<>();
      }
      if (!this.animeList.contains(value))
      {
         this.animeList.add(value);
      }
      return this;
   }

   public Watchlist withAnimeList(Anime... value)
   {
      for (final Anime item : value)
      {
         this.withAnimeList(item);
      }
      return this;
   }

   public Watchlist withAnimeList(Collection<? extends Anime> value)
   {
      for (final Anime item : value)
      {
         this.withAnimeList(item);
      }
      return this;
   }

   public Watchlist withoutAnimeList(Anime value)
   {
      if (this.animeList != null)
      {
         this.animeList.remove(value);
      }
      return this;
   }

   public Watchlist withoutAnimeList(Anime... value)
   {
      for (final Anime item : value)
      {
         this.withoutAnimeList(item);
      }
      return this;
   }

   public Watchlist withoutAnimeList(Collection<? extends Anime> value)
   {
      for (final Anime item : value)
      {
         this.withoutAnimeList(item);
      }
      return this;
   }

   public List<Movie> getMoviesList()
   {
      return this.MoviesList != null ? Collections.unmodifiableList(this.MoviesList) : Collections.emptyList();
   }

   public Watchlist withMoviesList(Movie value)
   {
      if (this.MoviesList == null)
      {
         this.MoviesList = new ArrayList<>();
      }
      if (!this.MoviesList.contains(value))
      {
         this.MoviesList.add(value);
      }
      return this;
   }

   public Watchlist withMoviesList(Movie... value)
   {
      for (final Movie item : value)
      {
         this.withMoviesList(item);
      }
      return this;
   }

   public Watchlist withMoviesList(Collection<? extends Movie> value)
   {
      for (final Movie item : value)
      {
         this.withMoviesList(item);
      }
      return this;
   }

   public Watchlist withoutMoviesList(Movie value)
   {
      if (this.MoviesList != null)
      {
         this.MoviesList.remove(value);
      }
      return this;
   }

   public Watchlist withoutMoviesList(Movie... value)
   {
      for (final Movie item : value)
      {
         this.withoutMoviesList(item);
      }
      return this;
   }

   public Watchlist withoutMoviesList(Collection<? extends Movie> value)
   {
      for (final Movie item : value)
      {
         this.withoutMoviesList(item);
      }
      return this;
   }

   public List<Game> getGamesList()
   {
      return this.gamesList != null ? Collections.unmodifiableList(this.gamesList) : Collections.emptyList();
   }

   public Watchlist withGamesList(Game value)
   {
      if (this.gamesList == null)
      {
         this.gamesList = new ArrayList<>();
      }
      if (!this.gamesList.contains(value))
      {
         this.gamesList.add(value);
      }
      return this;
   }

   public Watchlist withGamesList(Game... value)
   {
      for (final Game item : value)
      {
         this.withGamesList(item);
      }
      return this;
   }

   public Watchlist withGamesList(Collection<? extends Game> value)
   {
      for (final Game item : value)
      {
         this.withGamesList(item);
      }
      return this;
   }

   public Watchlist withoutGamesList(Game value)
   {
      if (this.gamesList != null)
      {
         this.gamesList.remove(value);
      }
      return this;
   }

   public Watchlist withoutGamesList(Game... value)
   {
      for (final Game item : value)
      {
         this.withoutGamesList(item);
      }
      return this;
   }

   public Watchlist withoutGamesList(Collection<? extends Game> value)
   {
      for (final Game item : value)
      {
         this.withoutGamesList(item);
      }
      return this;
   }

   public List<Book> getBooksList()
   {
      return this.booksList != null ? Collections.unmodifiableList(this.booksList) : Collections.emptyList();
   }

   public Watchlist withBooksList(Book value)
   {
      if (this.booksList == null)
      {
         this.booksList = new ArrayList<>();
      }
      if (!this.booksList.contains(value))
      {
         this.booksList.add(value);
      }
      return this;
   }

   public Watchlist withBooksList(Book... value)
   {
      for (final Book item : value)
      {
         this.withBooksList(item);
      }
      return this;
   }

   public Watchlist withBooksList(Collection<? extends Book> value)
   {
      for (final Book item : value)
      {
         this.withBooksList(item);
      }
      return this;
   }

   public Watchlist withoutBooksList(Book value)
   {
      if (this.booksList != null)
      {
         this.booksList.remove(value);
      }
      return this;
   }

   public Watchlist withoutBooksList(Book... value)
   {
      for (final Book item : value)
      {
         this.withoutBooksList(item);
      }
      return this;
   }

   public Watchlist withoutBooksList(Collection<? extends Book> value)
   {
      for (final Book item : value)
      {
         this.withoutBooksList(item);
      }
      return this;
   }

   public void removeYou()
   {
      this.withoutSeriesList(new ArrayList<>(this.getSeriesList()));
      this.withoutAnimeList(new ArrayList<>(this.getAnimeList()));
      this.withoutMoviesList(new ArrayList<>(this.getMoviesList()));
      this.withoutGamesList(new ArrayList<>(this.getGamesList()));
      this.withoutBooksList(new ArrayList<>(this.getBooksList()));
   }
}
