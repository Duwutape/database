package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;

public class Movie
extends Basic {
   public static final String PROPERTY_UNIVERSE = "universe";
   public static final String PROPERTY_LENGTH = "length";
   public static final String PROPERTY_PREQUEL = "prequel";
   public static final String PROPERTY_SEQUEL = "sequel";
   private String universe;
   private int length;
   private List<Movie> prequel;
   private List<Movie> sequel;

   public String getUniverse()
   {
      return this.universe;
   }

   public Movie setUniverse(String value)
   {
      this.universe = value;
      return this;
   }

   public int getLength()
   {
      return this.length;
   }

   public Movie setLength(int value)
   {
      this.length = value;
      return this;
   }

   public List<Movie> getPrequel()
   {
      return this.prequel != null ? Collections.unmodifiableList(this.prequel) : Collections.emptyList();
   }

   public Movie withPrequel(Movie value)
   {
      if (this.prequel == null)
      {
         this.prequel = new ArrayList<>();
      }
      if (!this.prequel.contains(value))
      {
         this.prequel.add(value);
         value.withSequel(this);
      }
      return this;
   }

   public Movie withPrequel(Movie... value)
   {
      for (final Movie item : value)
      {
         this.withPrequel(item);
      }
      return this;
   }

   public Movie withPrequel(Collection<? extends Movie> value)
   {
      for (final Movie item : value)
      {
         this.withPrequel(item);
      }
      return this;
   }

   public Movie withoutPrequel(Movie value)
   {
      if (this.prequel != null && this.prequel.remove(value))
      {
         value.withoutSequel(this);
      }
      return this;
   }

   public Movie withoutPrequel(Movie... value)
   {
      for (final Movie item : value)
      {
         this.withoutPrequel(item);
      }
      return this;
   }

   public Movie withoutPrequel(Collection<? extends Movie> value)
   {
      for (final Movie item : value)
      {
         this.withoutPrequel(item);
      }
      return this;
   }

   public List<Movie> getSequel()
   {
      return this.sequel != null ? Collections.unmodifiableList(this.sequel) : Collections.emptyList();
   }

   public Movie withSequel(Movie value)
   {
      if (this.sequel == null)
      {
         this.sequel = new ArrayList<>();
      }
      if (!this.sequel.contains(value))
      {
         this.sequel.add(value);
         value.withPrequel(this);
      }
      return this;
   }

   public Movie withSequel(Movie... value)
   {
      for (final Movie item : value)
      {
         this.withSequel(item);
      }
      return this;
   }

   public Movie withSequel(Collection<? extends Movie> value)
   {
      for (final Movie item : value)
      {
         this.withSequel(item);
      }
      return this;
   }

   public Movie withoutSequel(Movie value)
   {
      if (this.sequel != null && this.sequel.remove(value))
      {
         value.withoutPrequel(this);
      }
      return this;
   }

   public Movie withoutSequel(Movie... value)
   {
      for (final Movie item : value)
      {
         this.withoutSequel(item);
      }
      return this;
   }

   public Movie withoutSequel(Collection<? extends Movie> value)
   {
      for (final Movie item : value)
      {
         this.withoutSequel(item);
      }
      return this;
   }

   @Override
   public String toString()
   {
      final StringBuilder result = new StringBuilder(super.toString());
      result.append(' ').append(this.getUniverse());
      return result.toString();
   }

   public void removeYou()
   {
      this.withoutPrequel(new ArrayList<>(this.getPrequel()));
      this.withoutSequel(new ArrayList<>(this.getSequel()));
   }
}
