package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;

public class WatchlistCurr
{
   public static final String PROPERTY_CURRENT_SERIES = "currentSeries";
   public static final String PROPERTY_CURRENT_ANIME = "currentAnime";
   public static final String PROPERTY_CURRENT_MOVIE = "currentMovie";
   public static final String PROPERTY_CURRENT_GAME = "currentGame";
   public static final String PROPERTY_CURRENT_BOOK = "currentBook";
   private List<Series> currentSeries;
   private List<Anime> currentAnime;
   private List<Movie> currentMovie;
   private List<Game> currentGame;
   private List<Book> currentBook;

   public List<Series> getCurrentSeries()
   {
      return this.currentSeries != null ? Collections.unmodifiableList(this.currentSeries) : Collections.emptyList();
   }

   public WatchlistCurr withCurrentSeries(Series value)
   {
      if (this.currentSeries == null)
      {
         this.currentSeries = new ArrayList<>();
      }
      if (!this.currentSeries.contains(value))
      {
         this.currentSeries.add(value);
      }
      return this;
   }

   public WatchlistCurr withCurrentSeries(Series... value)
   {
      for (final Series item : value)
      {
         this.withCurrentSeries(item);
      }
      return this;
   }

   public WatchlistCurr withCurrentSeries(Collection<? extends Series> value)
   {
      for (final Series item : value)
      {
         this.withCurrentSeries(item);
      }
      return this;
   }

   public WatchlistCurr withoutCurrentSeries(Series value)
   {
      if (this.currentSeries != null)
      {
         this.currentSeries.remove(value);
      }
      return this;
   }

   public WatchlistCurr withoutCurrentSeries(Series... value)
   {
      for (final Series item : value)
      {
         this.withoutCurrentSeries(item);
      }
      return this;
   }

   public WatchlistCurr withoutCurrentSeries(Collection<? extends Series> value)
   {
      for (final Series item : value)
      {
         this.withoutCurrentSeries(item);
      }
      return this;
   }

   public List<Anime> getCurrentAnime()
   {
      return this.currentAnime != null ? Collections.unmodifiableList(this.currentAnime) : Collections.emptyList();
   }

   public WatchlistCurr withCurrentAnime(Anime value)
   {
      if (this.currentAnime == null)
      {
         this.currentAnime = new ArrayList<>();
      }
      if (!this.currentAnime.contains(value))
      {
         this.currentAnime.add(value);
      }
      return this;
   }

   public WatchlistCurr withCurrentAnime(Anime... value)
   {
      for (final Anime item : value)
      {
         this.withCurrentAnime(item);
      }
      return this;
   }

   public WatchlistCurr withCurrentAnime(Collection<? extends Anime> value)
   {
      for (final Anime item : value)
      {
         this.withCurrentAnime(item);
      }
      return this;
   }

   public WatchlistCurr withoutCurrentAnime(Anime value)
   {
      if (this.currentAnime != null)
      {
         this.currentAnime.remove(value);
      }
      return this;
   }

   public WatchlistCurr withoutCurrentAnime(Anime... value)
   {
      for (final Anime item : value)
      {
         this.withoutCurrentAnime(item);
      }
      return this;
   }

   public WatchlistCurr withoutCurrentAnime(Collection<? extends Anime> value)
   {
      for (final Anime item : value)
      {
         this.withoutCurrentAnime(item);
      }
      return this;
   }

   public List<Movie> getCurrentMovie()
   {
      return this.currentMovie != null ? Collections.unmodifiableList(this.currentMovie) : Collections.emptyList();
   }

   public WatchlistCurr withCurrentMovie(Movie value)
   {
      if (this.currentMovie == null)
      {
         this.currentMovie = new ArrayList<>();
      }
      if (!this.currentMovie.contains(value))
      {
         this.currentMovie.add(value);
      }
      return this;
   }

   public WatchlistCurr withCurrentMovie(Movie... value)
   {
      for (final Movie item : value)
      {
         this.withCurrentMovie(item);
      }
      return this;
   }

   public WatchlistCurr withCurrentMovie(Collection<? extends Movie> value)
   {
      for (final Movie item : value)
      {
         this.withCurrentMovie(item);
      }
      return this;
   }

   public WatchlistCurr withoutCurrentMovie(Movie value)
   {
      if (this.currentMovie != null)
      {
         this.currentMovie.remove(value);
      }
      return this;
   }

   public WatchlistCurr withoutCurrentMovie(Movie... value)
   {
      for (final Movie item : value)
      {
         this.withoutCurrentMovie(item);
      }
      return this;
   }

   public WatchlistCurr withoutCurrentMovie(Collection<? extends Movie> value)
   {
      for (final Movie item : value)
      {
         this.withoutCurrentMovie(item);
      }
      return this;
   }

   public List<Game> getCurrentGame()
   {
      return this.currentGame != null ? Collections.unmodifiableList(this.currentGame) : Collections.emptyList();
   }

   public WatchlistCurr withCurrentGame(Game value)
   {
      if (this.currentGame == null)
      {
         this.currentGame = new ArrayList<>();
      }
      if (!this.currentGame.contains(value))
      {
         this.currentGame.add(value);
      }
      return this;
   }

   public WatchlistCurr withCurrentGame(Game... value)
   {
      for (final Game item : value)
      {
         this.withCurrentGame(item);
      }
      return this;
   }

   public WatchlistCurr withCurrentGame(Collection<? extends Game> value)
   {
      for (final Game item : value)
      {
         this.withCurrentGame(item);
      }
      return this;
   }

   public WatchlistCurr withoutCurrentGame(Game value)
   {
      if (this.currentGame != null)
      {
         this.currentGame.remove(value);
      }
      return this;
   }

   public WatchlistCurr withoutCurrentGame(Game... value)
   {
      for (final Game item : value)
      {
         this.withoutCurrentGame(item);
      }
      return this;
   }

   public WatchlistCurr withoutCurrentGame(Collection<? extends Game> value)
   {
      for (final Game item : value)
      {
         this.withoutCurrentGame(item);
      }
      return this;
   }

   public List<Book> getCurrentBook()
   {
      return this.currentBook != null ? Collections.unmodifiableList(this.currentBook) : Collections.emptyList();
   }

   public WatchlistCurr withCurrentBook(Book value)
   {
      if (this.currentBook == null)
      {
         this.currentBook = new ArrayList<>();
      }
      if (!this.currentBook.contains(value))
      {
         this.currentBook.add(value);
      }
      return this;
   }

   public WatchlistCurr withCurrentBook(Book... value)
   {
      for (final Book item : value)
      {
         this.withCurrentBook(item);
      }
      return this;
   }

   public WatchlistCurr withCurrentBook(Collection<? extends Book> value)
   {
      for (final Book item : value)
      {
         this.withCurrentBook(item);
      }
      return this;
   }

   public WatchlistCurr withoutCurrentBook(Book value)
   {
      if (this.currentBook != null)
      {
         this.currentBook.remove(value);
      }
      return this;
   }

   public WatchlistCurr withoutCurrentBook(Book... value)
   {
      for (final Book item : value)
      {
         this.withoutCurrentBook(item);
      }
      return this;
   }

   public WatchlistCurr withoutCurrentBook(Collection<? extends Book> value)
   {
      for (final Book item : value)
      {
         this.withoutCurrentBook(item);
      }
      return this;
   }

   public void removeYou()
   {
      this.withoutCurrentSeries(new ArrayList<>(this.getCurrentSeries()));
      this.withoutCurrentAnime(new ArrayList<>(this.getCurrentAnime()));
      this.withoutCurrentMovie(new ArrayList<>(this.getCurrentMovie()));
      this.withoutCurrentGame(new ArrayList<>(this.getCurrentGame()));
      this.withoutCurrentBook(new ArrayList<>(this.getCurrentBook()));
   }
}
