package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;

public class AllMovie
{
   public static final String PROPERTY_MOVIE_LIST = "movieList";
   private List<Movie> movieList;

   public List<Movie> getMovieList()
   {
      return this.movieList != null ? Collections.unmodifiableList(this.movieList) : Collections.emptyList();
   }

   public AllMovie withMovieList(Movie value)
   {
      if (this.movieList == null)
      {
         this.movieList = new ArrayList<>();
      }
      if (!this.movieList.contains(value))
      {
         this.movieList.add(value);
      }
      return this;
   }

   public AllMovie withMovieList(Movie... value)
   {
      for (final Movie item : value)
      {
         this.withMovieList(item);
      }
      return this;
   }

   public AllMovie withMovieList(Collection<? extends Movie> value)
   {
      for (final Movie item : value)
      {
         this.withMovieList(item);
      }
      return this;
   }

   public AllMovie withoutMovieList(Movie value)
   {
      if (this.movieList != null)
      {
         this.movieList.remove(value);
      }
      return this;
   }

   public AllMovie withoutMovieList(Movie... value)
   {
      for (final Movie item : value)
      {
         this.withoutMovieList(item);
      }
      return this;
   }

   public AllMovie withoutMovieList(Collection<? extends Movie> value)
   {
      for (final Movie item : value)
      {
         this.withoutMovieList(item);
      }
      return this;
   }

   public void removeYou()
   {
      this.withoutMovieList(new ArrayList<>(this.getMovieList()));
   }
}
