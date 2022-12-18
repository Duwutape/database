package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;

public class WatchlistUnsure
{
   public static final String PROPERTY_UNSURE_SERIES = "unsureSeries";
   public static final String PROPERTY_UNSURE_ANIME = "unsureAnime";
   public static final String PROPERTY_UNSURE_MOVIE = "unsureMovie";
   public static final String PROPERTY_UNSURE_GAME = "unsureGame";
   public static final String PROPERTY_UNSURE_BOOK = "unsureBook";
   private List<Series> unsureSeries;
   private List<Anime> unsureAnime;
   private List<Movie> unsureMovie;
   private List<Game> unsureGame;
   private List<Book> unsureBook;

   public List<Series> getUnsureSeries()
   {
      return this.unsureSeries != null ? Collections.unmodifiableList(this.unsureSeries) : Collections.emptyList();
   }

   public WatchlistUnsure withUnsureSeries(Series value)
   {
      if (this.unsureSeries == null)
      {
         this.unsureSeries = new ArrayList<>();
      }
      if (!this.unsureSeries.contains(value))
      {
         this.unsureSeries.add(value);
      }
      return this;
   }

   public WatchlistUnsure withUnsureSeries(Series... value)
   {
      for (final Series item : value)
      {
         this.withUnsureSeries(item);
      }
      return this;
   }

   public WatchlistUnsure withUnsureSeries(Collection<? extends Series> value)
   {
      for (final Series item : value)
      {
         this.withUnsureSeries(item);
      }
      return this;
   }

   public WatchlistUnsure withoutUnsureSeries(Series value)
   {
      if (this.unsureSeries != null)
      {
         this.unsureSeries.remove(value);
      }
      return this;
   }

   public WatchlistUnsure withoutUnsureSeries(Series... value)
   {
      for (final Series item : value)
      {
         this.withoutUnsureSeries(item);
      }
      return this;
   }

   public WatchlistUnsure withoutUnsureSeries(Collection<? extends Series> value)
   {
      for (final Series item : value)
      {
         this.withoutUnsureSeries(item);
      }
      return this;
   }

   public List<Anime> getUnsureAnime()
   {
      return this.unsureAnime != null ? Collections.unmodifiableList(this.unsureAnime) : Collections.emptyList();
   }

   public WatchlistUnsure withUnsureAnime(Anime value)
   {
      if (this.unsureAnime == null)
      {
         this.unsureAnime = new ArrayList<>();
      }
      if (!this.unsureAnime.contains(value))
      {
         this.unsureAnime.add(value);
      }
      return this;
   }

   public WatchlistUnsure withUnsureAnime(Anime... value)
   {
      for (final Anime item : value)
      {
         this.withUnsureAnime(item);
      }
      return this;
   }

   public WatchlistUnsure withUnsureAnime(Collection<? extends Anime> value)
   {
      for (final Anime item : value)
      {
         this.withUnsureAnime(item);
      }
      return this;
   }

   public WatchlistUnsure withoutUnsureAnime(Anime value)
   {
      if (this.unsureAnime != null)
      {
         this.unsureAnime.remove(value);
      }
      return this;
   }

   public WatchlistUnsure withoutUnsureAnime(Anime... value)
   {
      for (final Anime item : value)
      {
         this.withoutUnsureAnime(item);
      }
      return this;
   }

   public WatchlistUnsure withoutUnsureAnime(Collection<? extends Anime> value)
   {
      for (final Anime item : value)
      {
         this.withoutUnsureAnime(item);
      }
      return this;
   }

   public List<Movie> getUnsureMovie()
   {
      return this.unsureMovie != null ? Collections.unmodifiableList(this.unsureMovie) : Collections.emptyList();
   }

   public WatchlistUnsure withUnsureMovie(Movie value)
   {
      if (this.unsureMovie == null)
      {
         this.unsureMovie = new ArrayList<>();
      }
      if (!this.unsureMovie.contains(value))
      {
         this.unsureMovie.add(value);
      }
      return this;
   }

   public WatchlistUnsure withUnsureMovie(Movie... value)
   {
      for (final Movie item : value)
      {
         this.withUnsureMovie(item);
      }
      return this;
   }

   public WatchlistUnsure withUnsureMovie(Collection<? extends Movie> value)
   {
      for (final Movie item : value)
      {
         this.withUnsureMovie(item);
      }
      return this;
   }

   public WatchlistUnsure withoutUnsureMovie(Movie value)
   {
      if (this.unsureMovie != null)
      {
         this.unsureMovie.remove(value);
      }
      return this;
   }

   public WatchlistUnsure withoutUnsureMovie(Movie... value)
   {
      for (final Movie item : value)
      {
         this.withoutUnsureMovie(item);
      }
      return this;
   }

   public WatchlistUnsure withoutUnsureMovie(Collection<? extends Movie> value)
   {
      for (final Movie item : value)
      {
         this.withoutUnsureMovie(item);
      }
      return this;
   }

   public List<Game> getUnsureGame()
   {
      return this.unsureGame != null ? Collections.unmodifiableList(this.unsureGame) : Collections.emptyList();
   }

   public WatchlistUnsure withUnsureGame(Game value)
   {
      if (this.unsureGame == null)
      {
         this.unsureGame = new ArrayList<>();
      }
      if (!this.unsureGame.contains(value))
      {
         this.unsureGame.add(value);
      }
      return this;
   }

   public WatchlistUnsure withUnsureGame(Game... value)
   {
      for (final Game item : value)
      {
         this.withUnsureGame(item);
      }
      return this;
   }

   public WatchlistUnsure withUnsureGame(Collection<? extends Game> value)
   {
      for (final Game item : value)
      {
         this.withUnsureGame(item);
      }
      return this;
   }

   public WatchlistUnsure withoutUnsureGame(Game value)
   {
      if (this.unsureGame != null)
      {
         this.unsureGame.remove(value);
      }
      return this;
   }

   public WatchlistUnsure withoutUnsureGame(Game... value)
   {
      for (final Game item : value)
      {
         this.withoutUnsureGame(item);
      }
      return this;
   }

   public WatchlistUnsure withoutUnsureGame(Collection<? extends Game> value)
   {
      for (final Game item : value)
      {
         this.withoutUnsureGame(item);
      }
      return this;
   }

   public List<Book> getUnsureBook()
   {
      return this.unsureBook != null ? Collections.unmodifiableList(this.unsureBook) : Collections.emptyList();
   }

   public WatchlistUnsure withUnsureBook(Book value)
   {
      if (this.unsureBook == null)
      {
         this.unsureBook = new ArrayList<>();
      }
      if (!this.unsureBook.contains(value))
      {
         this.unsureBook.add(value);
      }
      return this;
   }

   public WatchlistUnsure withUnsureBook(Book... value)
   {
      for (final Book item : value)
      {
         this.withUnsureBook(item);
      }
      return this;
   }

   public WatchlistUnsure withUnsureBook(Collection<? extends Book> value)
   {
      for (final Book item : value)
      {
         this.withUnsureBook(item);
      }
      return this;
   }

   public WatchlistUnsure withoutUnsureBook(Book value)
   {
      if (this.unsureBook != null)
      {
         this.unsureBook.remove(value);
      }
      return this;
   }

   public WatchlistUnsure withoutUnsureBook(Book... value)
   {
      for (final Book item : value)
      {
         this.withoutUnsureBook(item);
      }
      return this;
   }

   public WatchlistUnsure withoutUnsureBook(Collection<? extends Book> value)
   {
      for (final Book item : value)
      {
         this.withoutUnsureBook(item);
      }
      return this;
   }

   public void removeYou()
   {
      this.withoutUnsureSeries(new ArrayList<>(this.getUnsureSeries()));
      this.withoutUnsureAnime(new ArrayList<>(this.getUnsureAnime()));
      this.withoutUnsureMovie(new ArrayList<>(this.getUnsureMovie()));
      this.withoutUnsureGame(new ArrayList<>(this.getUnsureGame()));
      this.withoutUnsureBook(new ArrayList<>(this.getUnsureBook()));
   }
}
