package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;

public class WatchlistCom
{
   public static final String PROPERTY_COMPLETED_SERIES = "completedSeries";
   public static final String PROPERTY_COMPLETED_ANIME = "completedAnime";
   public static final String PROPERTY_COMPLETED_MOVIE = "completedMovie";
   public static final String PROPERTY_COMPLETED_GAME = "completedGame";
   public static final String PROPERTY_COMPLETED_BOOK = "completedBook";
   private List<Series> completedSeries;
   private List<Anime> completedAnime;
   private List<Movie> completedMovie;
   private List<Game> completedGame;
   private List<Book> completedBook;

   public List<Series> getCompletedSeries()
   {
      return this.completedSeries != null ? Collections.unmodifiableList(this.completedSeries) : Collections.emptyList();
   }

   public WatchlistCom withCompletedSeries(Series value)
   {
      if (this.completedSeries == null)
      {
         this.completedSeries = new ArrayList<>();
      }
      if (!this.completedSeries.contains(value))
      {
         this.completedSeries.add(value);
      }
      return this;
   }

   public WatchlistCom withCompletedSeries(Series... value)
   {
      for (final Series item : value)
      {
         this.withCompletedSeries(item);
      }
      return this;
   }

   public WatchlistCom withCompletedSeries(Collection<? extends Series> value)
   {
      for (final Series item : value)
      {
         this.withCompletedSeries(item);
      }
      return this;
   }

   public WatchlistCom withoutCompletedSeries(Series value)
   {
      if (this.completedSeries != null)
      {
         this.completedSeries.remove(value);
      }
      return this;
   }

   public WatchlistCom withoutCompletedSeries(Series... value)
   {
      for (final Series item : value)
      {
         this.withoutCompletedSeries(item);
      }
      return this;
   }

   public WatchlistCom withoutCompletedSeries(Collection<? extends Series> value)
   {
      for (final Series item : value)
      {
         this.withoutCompletedSeries(item);
      }
      return this;
   }

   public List<Anime> getCompletedAnime()
   {
      return this.completedAnime != null ? Collections.unmodifiableList(this.completedAnime) : Collections.emptyList();
   }

   public WatchlistCom withCompletedAnime(Anime value)
   {
      if (this.completedAnime == null)
      {
         this.completedAnime = new ArrayList<>();
      }
      if (!this.completedAnime.contains(value))
      {
         this.completedAnime.add(value);
      }
      return this;
   }

   public WatchlistCom withCompletedAnime(Anime... value)
   {
      for (final Anime item : value)
      {
         this.withCompletedAnime(item);
      }
      return this;
   }

   public WatchlistCom withCompletedAnime(Collection<? extends Anime> value)
   {
      for (final Anime item : value)
      {
         this.withCompletedAnime(item);
      }
      return this;
   }

   public WatchlistCom withoutCompletedAnime(Anime value)
   {
      if (this.completedAnime != null)
      {
         this.completedAnime.remove(value);
      }
      return this;
   }

   public WatchlistCom withoutCompletedAnime(Anime... value)
   {
      for (final Anime item : value)
      {
         this.withoutCompletedAnime(item);
      }
      return this;
   }

   public WatchlistCom withoutCompletedAnime(Collection<? extends Anime> value)
   {
      for (final Anime item : value)
      {
         this.withoutCompletedAnime(item);
      }
      return this;
   }

   public List<Movie> getCompletedMovie()
   {
      return this.completedMovie != null ? Collections.unmodifiableList(this.completedMovie) : Collections.emptyList();
   }

   public WatchlistCom withCompletedMovie(Movie value)
   {
      if (this.completedMovie == null)
      {
         this.completedMovie = new ArrayList<>();
      }
      if (!this.completedMovie.contains(value))
      {
         this.completedMovie.add(value);
      }
      return this;
   }

   public WatchlistCom withCompletedMovie(Movie... value)
   {
      for (final Movie item : value)
      {
         this.withCompletedMovie(item);
      }
      return this;
   }

   public WatchlistCom withCompletedMovie(Collection<? extends Movie> value)
   {
      for (final Movie item : value)
      {
         this.withCompletedMovie(item);
      }
      return this;
   }

   public WatchlistCom withoutCompletedMovie(Movie value)
   {
      if (this.completedMovie != null)
      {
         this.completedMovie.remove(value);
      }
      return this;
   }

   public WatchlistCom withoutCompletedMovie(Movie... value)
   {
      for (final Movie item : value)
      {
         this.withoutCompletedMovie(item);
      }
      return this;
   }

   public WatchlistCom withoutCompletedMovie(Collection<? extends Movie> value)
   {
      for (final Movie item : value)
      {
         this.withoutCompletedMovie(item);
      }
      return this;
   }

   public List<Game> getCompletedGame()
   {
      return this.completedGame != null ? Collections.unmodifiableList(this.completedGame) : Collections.emptyList();
   }

   public WatchlistCom withCompletedGame(Game value)
   {
      if (this.completedGame == null)
      {
         this.completedGame = new ArrayList<>();
      }
      if (!this.completedGame.contains(value))
      {
         this.completedGame.add(value);
      }
      return this;
   }

   public WatchlistCom withCompletedGame(Game... value)
   {
      for (final Game item : value)
      {
         this.withCompletedGame(item);
      }
      return this;
   }

   public WatchlistCom withCompletedGame(Collection<? extends Game> value)
   {
      for (final Game item : value)
      {
         this.withCompletedGame(item);
      }
      return this;
   }

   public WatchlistCom withoutCompletedGame(Game value)
   {
      if (this.completedGame != null)
      {
         this.completedGame.remove(value);
      }
      return this;
   }

   public WatchlistCom withoutCompletedGame(Game... value)
   {
      for (final Game item : value)
      {
         this.withoutCompletedGame(item);
      }
      return this;
   }

   public WatchlistCom withoutCompletedGame(Collection<? extends Game> value)
   {
      for (final Game item : value)
      {
         this.withoutCompletedGame(item);
      }
      return this;
   }

   public List<Book> getCompletedBook()
   {
      return this.completedBook != null ? Collections.unmodifiableList(this.completedBook) : Collections.emptyList();
   }

   public WatchlistCom withCompletedBook(Book value)
   {
      if (this.completedBook == null)
      {
         this.completedBook = new ArrayList<>();
      }
      if (!this.completedBook.contains(value))
      {
         this.completedBook.add(value);
      }
      return this;
   }

   public WatchlistCom withCompletedBook(Book... value)
   {
      for (final Book item : value)
      {
         this.withCompletedBook(item);
      }
      return this;
   }

   public WatchlistCom withCompletedBook(Collection<? extends Book> value)
   {
      for (final Book item : value)
      {
         this.withCompletedBook(item);
      }
      return this;
   }

   public WatchlistCom withoutCompletedBook(Book value)
   {
      if (this.completedBook != null)
      {
         this.completedBook.remove(value);
      }
      return this;
   }

   public WatchlistCom withoutCompletedBook(Book... value)
   {
      for (final Book item : value)
      {
         this.withoutCompletedBook(item);
      }
      return this;
   }

   public WatchlistCom withoutCompletedBook(Collection<? extends Book> value)
   {
      for (final Book item : value)
      {
         this.withoutCompletedBook(item);
      }
      return this;
   }

   public void removeYou()
   {
      this.withoutCompletedSeries(new ArrayList<>(this.getCompletedSeries()));
      this.withoutCompletedAnime(new ArrayList<>(this.getCompletedAnime()));
      this.withoutCompletedMovie(new ArrayList<>(this.getCompletedMovie()));
      this.withoutCompletedGame(new ArrayList<>(this.getCompletedGame()));
      this.withoutCompletedBook(new ArrayList<>(this.getCompletedBook()));
   }
}
