package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;

public class WatchlistHold
{
   public static final String PROPERTY_HOLD_SERIES = "holdSeries";
   public static final String PROPERTY_HOLD_ANIME = "holdAnime";
   public static final String PROPERTY_HOLD_MOVIE = "holdMovie";
   public static final String PROPERTY_HOLD_GAME = "holdGame";
   public static final String PROPERTY_HOLD_BOOK = "holdBook";
   private List<Series> holdSeries;
   private List<Anime> holdAnime;
   private List<Movie> holdMovie;
   private List<Game> holdGame;
   private List<Book> holdBook;

   public List<Series> getHoldSeries()
   {
      return this.holdSeries != null ? Collections.unmodifiableList(this.holdSeries) : Collections.emptyList();
   }

   public WatchlistHold withHoldSeries(Series value)
   {
      if (this.holdSeries == null)
      {
         this.holdSeries = new ArrayList<>();
      }
      if (!this.holdSeries.contains(value))
      {
         this.holdSeries.add(value);
      }
      return this;
   }

   public WatchlistHold withHoldSeries(Series... value)
   {
      for (final Series item : value)
      {
         this.withHoldSeries(item);
      }
      return this;
   }

   public WatchlistHold withHoldSeries(Collection<? extends Series> value)
   {
      for (final Series item : value)
      {
         this.withHoldSeries(item);
      }
      return this;
   }

   public WatchlistHold withoutHoldSeries(Series value)
   {
      if (this.holdSeries != null)
      {
         this.holdSeries.remove(value);
      }
      return this;
   }

   public WatchlistHold withoutHoldSeries(Series... value)
   {
      for (final Series item : value)
      {
         this.withoutHoldSeries(item);
      }
      return this;
   }

   public WatchlistHold withoutHoldSeries(Collection<? extends Series> value)
   {
      for (final Series item : value)
      {
         this.withoutHoldSeries(item);
      }
      return this;
   }

   public List<Anime> getHoldAnime()
   {
      return this.holdAnime != null ? Collections.unmodifiableList(this.holdAnime) : Collections.emptyList();
   }

   public WatchlistHold withHoldAnime(Anime value)
   {
      if (this.holdAnime == null)
      {
         this.holdAnime = new ArrayList<>();
      }
      if (!this.holdAnime.contains(value))
      {
         this.holdAnime.add(value);
      }
      return this;
   }

   public WatchlistHold withHoldAnime(Anime... value)
   {
      for (final Anime item : value)
      {
         this.withHoldAnime(item);
      }
      return this;
   }

   public WatchlistHold withHoldAnime(Collection<? extends Anime> value)
   {
      for (final Anime item : value)
      {
         this.withHoldAnime(item);
      }
      return this;
   }

   public WatchlistHold withoutHoldAnime(Anime value)
   {
      if (this.holdAnime != null)
      {
         this.holdAnime.remove(value);
      }
      return this;
   }

   public WatchlistHold withoutHoldAnime(Anime... value)
   {
      for (final Anime item : value)
      {
         this.withoutHoldAnime(item);
      }
      return this;
   }

   public WatchlistHold withoutHoldAnime(Collection<? extends Anime> value)
   {
      for (final Anime item : value)
      {
         this.withoutHoldAnime(item);
      }
      return this;
   }

   public List<Movie> getHoldMovie()
   {
      return this.holdMovie != null ? Collections.unmodifiableList(this.holdMovie) : Collections.emptyList();
   }

   public WatchlistHold withHoldMovie(Movie value)
   {
      if (this.holdMovie == null)
      {
         this.holdMovie = new ArrayList<>();
      }
      if (!this.holdMovie.contains(value))
      {
         this.holdMovie.add(value);
      }
      return this;
   }

   public WatchlistHold withHoldMovie(Movie... value)
   {
      for (final Movie item : value)
      {
         this.withHoldMovie(item);
      }
      return this;
   }

   public WatchlistHold withHoldMovie(Collection<? extends Movie> value)
   {
      for (final Movie item : value)
      {
         this.withHoldMovie(item);
      }
      return this;
   }

   public WatchlistHold withoutHoldMovie(Movie value)
   {
      if (this.holdMovie != null)
      {
         this.holdMovie.remove(value);
      }
      return this;
   }

   public WatchlistHold withoutHoldMovie(Movie... value)
   {
      for (final Movie item : value)
      {
         this.withoutHoldMovie(item);
      }
      return this;
   }

   public WatchlistHold withoutHoldMovie(Collection<? extends Movie> value)
   {
      for (final Movie item : value)
      {
         this.withoutHoldMovie(item);
      }
      return this;
   }

   public List<Game> getHoldGame()
   {
      return this.holdGame != null ? Collections.unmodifiableList(this.holdGame) : Collections.emptyList();
   }

   public WatchlistHold withHoldGame(Game value)
   {
      if (this.holdGame == null)
      {
         this.holdGame = new ArrayList<>();
      }
      if (!this.holdGame.contains(value))
      {
         this.holdGame.add(value);
      }
      return this;
   }

   public WatchlistHold withHoldGame(Game... value)
   {
      for (final Game item : value)
      {
         this.withHoldGame(item);
      }
      return this;
   }

   public WatchlistHold withHoldGame(Collection<? extends Game> value)
   {
      for (final Game item : value)
      {
         this.withHoldGame(item);
      }
      return this;
   }

   public WatchlistHold withoutHoldGame(Game value)
   {
      if (this.holdGame != null)
      {
         this.holdGame.remove(value);
      }
      return this;
   }

   public WatchlistHold withoutHoldGame(Game... value)
   {
      for (final Game item : value)
      {
         this.withoutHoldGame(item);
      }
      return this;
   }

   public WatchlistHold withoutHoldGame(Collection<? extends Game> value)
   {
      for (final Game item : value)
      {
         this.withoutHoldGame(item);
      }
      return this;
   }

   public List<Book> getHoldBook()
   {
      return this.holdBook != null ? Collections.unmodifiableList(this.holdBook) : Collections.emptyList();
   }

   public WatchlistHold withHoldBook(Book value)
   {
      if (this.holdBook == null)
      {
         this.holdBook = new ArrayList<>();
      }
      if (!this.holdBook.contains(value))
      {
         this.holdBook.add(value);
      }
      return this;
   }

   public WatchlistHold withHoldBook(Book... value)
   {
      for (final Book item : value)
      {
         this.withHoldBook(item);
      }
      return this;
   }

   public WatchlistHold withHoldBook(Collection<? extends Book> value)
   {
      for (final Book item : value)
      {
         this.withHoldBook(item);
      }
      return this;
   }

   public WatchlistHold withoutHoldBook(Book value)
   {
      if (this.holdBook != null)
      {
         this.holdBook.remove(value);
      }
      return this;
   }

   public WatchlistHold withoutHoldBook(Book... value)
   {
      for (final Book item : value)
      {
         this.withoutHoldBook(item);
      }
      return this;
   }

   public WatchlistHold withoutHoldBook(Collection<? extends Book> value)
   {
      for (final Book item : value)
      {
         this.withoutHoldBook(item);
      }
      return this;
   }

   public void removeYou()
   {
      this.withoutHoldSeries(new ArrayList<>(this.getHoldSeries()));
      this.withoutHoldAnime(new ArrayList<>(this.getHoldAnime()));
      this.withoutHoldMovie(new ArrayList<>(this.getHoldMovie()));
      this.withoutHoldGame(new ArrayList<>(this.getHoldGame()));
      this.withoutHoldBook(new ArrayList<>(this.getHoldBook()));
   }
}
