package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;

public class WatchlistDrop
{
   public static final String PROPERTY_DROPPED_SERIES = "droppedSeries";
   public static final String PROPERTY_DROPPED_ANIME = "droppedAnime";
   public static final String PROPERTY_DROPPED_MOVIE = "droppedMovie";
   public static final String PROPERTY_DROPPED_GAME = "droppedGame";
   public static final String PROPERTY_DROPPED_BOOK = "droppedBook";
   private List<Series> droppedSeries;
   private List<Anime> droppedAnime;
   private List<Movie> droppedMovie;
   private List<Game> droppedGame;
   private List<Book> droppedBook;

   public List<Series> getDroppedSeries()
   {
      return this.droppedSeries != null ? Collections.unmodifiableList(this.droppedSeries) : Collections.emptyList();
   }

   public WatchlistDrop withDroppedSeries(Series value)
   {
      if (this.droppedSeries == null)
      {
         this.droppedSeries = new ArrayList<>();
      }
      if (!this.droppedSeries.contains(value))
      {
         this.droppedSeries.add(value);
      }
      return this;
   }

   public WatchlistDrop withDroppedSeries(Series... value)
   {
      for (final Series item : value)
      {
         this.withDroppedSeries(item);
      }
      return this;
   }

   public WatchlistDrop withDroppedSeries(Collection<? extends Series> value)
   {
      for (final Series item : value)
      {
         this.withDroppedSeries(item);
      }
      return this;
   }

   public WatchlistDrop withoutDroppedSeries(Series value)
   {
      if (this.droppedSeries != null)
      {
         this.droppedSeries.remove(value);
      }
      return this;
   }

   public WatchlistDrop withoutDroppedSeries(Series... value)
   {
      for (final Series item : value)
      {
         this.withoutDroppedSeries(item);
      }
      return this;
   }

   public WatchlistDrop withoutDroppedSeries(Collection<? extends Series> value)
   {
      for (final Series item : value)
      {
         this.withoutDroppedSeries(item);
      }
      return this;
   }

   public List<Anime> getDroppedAnime()
   {
      return this.droppedAnime != null ? Collections.unmodifiableList(this.droppedAnime) : Collections.emptyList();
   }

   public WatchlistDrop withDroppedAnime(Anime value)
   {
      if (this.droppedAnime == null)
      {
         this.droppedAnime = new ArrayList<>();
      }
      if (!this.droppedAnime.contains(value))
      {
         this.droppedAnime.add(value);
      }
      return this;
   }

   public WatchlistDrop withDroppedAnime(Anime... value)
   {
      for (final Anime item : value)
      {
         this.withDroppedAnime(item);
      }
      return this;
   }

   public WatchlistDrop withDroppedAnime(Collection<? extends Anime> value)
   {
      for (final Anime item : value)
      {
         this.withDroppedAnime(item);
      }
      return this;
   }

   public WatchlistDrop withoutDroppedAnime(Anime value)
   {
      if (this.droppedAnime != null)
      {
         this.droppedAnime.remove(value);
      }
      return this;
   }

   public WatchlistDrop withoutDroppedAnime(Anime... value)
   {
      for (final Anime item : value)
      {
         this.withoutDroppedAnime(item);
      }
      return this;
   }

   public WatchlistDrop withoutDroppedAnime(Collection<? extends Anime> value)
   {
      for (final Anime item : value)
      {
         this.withoutDroppedAnime(item);
      }
      return this;
   }

   public List<Movie> getDroppedMovie()
   {
      return this.droppedMovie != null ? Collections.unmodifiableList(this.droppedMovie) : Collections.emptyList();
   }

   public WatchlistDrop withDroppedMovie(Movie value)
   {
      if (this.droppedMovie == null)
      {
         this.droppedMovie = new ArrayList<>();
      }
      if (!this.droppedMovie.contains(value))
      {
         this.droppedMovie.add(value);
      }
      return this;
   }

   public WatchlistDrop withDroppedMovie(Movie... value)
   {
      for (final Movie item : value)
      {
         this.withDroppedMovie(item);
      }
      return this;
   }

   public WatchlistDrop withDroppedMovie(Collection<? extends Movie> value)
   {
      for (final Movie item : value)
      {
         this.withDroppedMovie(item);
      }
      return this;
   }

   public WatchlistDrop withoutDroppedMovie(Movie value)
   {
      if (this.droppedMovie != null)
      {
         this.droppedMovie.remove(value);
      }
      return this;
   }

   public WatchlistDrop withoutDroppedMovie(Movie... value)
   {
      for (final Movie item : value)
      {
         this.withoutDroppedMovie(item);
      }
      return this;
   }

   public WatchlistDrop withoutDroppedMovie(Collection<? extends Movie> value)
   {
      for (final Movie item : value)
      {
         this.withoutDroppedMovie(item);
      }
      return this;
   }

   public List<Game> getDroppedGame()
   {
      return this.droppedGame != null ? Collections.unmodifiableList(this.droppedGame) : Collections.emptyList();
   }

   public WatchlistDrop withDroppedGame(Game value)
   {
      if (this.droppedGame == null)
      {
         this.droppedGame = new ArrayList<>();
      }
      if (!this.droppedGame.contains(value))
      {
         this.droppedGame.add(value);
      }
      return this;
   }

   public WatchlistDrop withDroppedGame(Game... value)
   {
      for (final Game item : value)
      {
         this.withDroppedGame(item);
      }
      return this;
   }

   public WatchlistDrop withDroppedGame(Collection<? extends Game> value)
   {
      for (final Game item : value)
      {
         this.withDroppedGame(item);
      }
      return this;
   }

   public WatchlistDrop withoutDroppedGame(Game value)
   {
      if (this.droppedGame != null)
      {
         this.droppedGame.remove(value);
      }
      return this;
   }

   public WatchlistDrop withoutDroppedGame(Game... value)
   {
      for (final Game item : value)
      {
         this.withoutDroppedGame(item);
      }
      return this;
   }

   public WatchlistDrop withoutDroppedGame(Collection<? extends Game> value)
   {
      for (final Game item : value)
      {
         this.withoutDroppedGame(item);
      }
      return this;
   }

   public List<Book> getDroppedBook()
   {
      return this.droppedBook != null ? Collections.unmodifiableList(this.droppedBook) : Collections.emptyList();
   }

   public WatchlistDrop withDroppedBook(Book value)
   {
      if (this.droppedBook == null)
      {
         this.droppedBook = new ArrayList<>();
      }
      if (!this.droppedBook.contains(value))
      {
         this.droppedBook.add(value);
      }
      return this;
   }

   public WatchlistDrop withDroppedBook(Book... value)
   {
      for (final Book item : value)
      {
         this.withDroppedBook(item);
      }
      return this;
   }

   public WatchlistDrop withDroppedBook(Collection<? extends Book> value)
   {
      for (final Book item : value)
      {
         this.withDroppedBook(item);
      }
      return this;
   }

   public WatchlistDrop withoutDroppedBook(Book value)
   {
      if (this.droppedBook != null)
      {
         this.droppedBook.remove(value);
      }
      return this;
   }

   public WatchlistDrop withoutDroppedBook(Book... value)
   {
      for (final Book item : value)
      {
         this.withoutDroppedBook(item);
      }
      return this;
   }

   public WatchlistDrop withoutDroppedBook(Collection<? extends Book> value)
   {
      for (final Book item : value)
      {
         this.withoutDroppedBook(item);
      }
      return this;
   }

   public void removeYou()
   {
      this.withoutDroppedSeries(new ArrayList<>(this.getDroppedSeries()));
      this.withoutDroppedAnime(new ArrayList<>(this.getDroppedAnime()));
      this.withoutDroppedMovie(new ArrayList<>(this.getDroppedMovie()));
      this.withoutDroppedGame(new ArrayList<>(this.getDroppedGame()));
      this.withoutDroppedBook(new ArrayList<>(this.getDroppedBook()));
   }
}
