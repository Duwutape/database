package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.Arrays;

public class Movie
{
   public static final String PROPERTY_UNIVERSE = "universe";
   public static final String PROPERTY_LENGTH = "length";
   public static final String PROPERTY_PREQUEL = "prequel";
   public static final String PROPERTY_SEQUEL = "sequel";
   public static final String PROPERTY_ALIAS = "alias";
   public static final String PROPERTY_NAME_OV = "nameOV";
   public static final String PROPERTY_NAME_GER = "nameGer";
   public static final String PROPERTY_YEAR = "year";
   public static final String PROPERTY_FSK = "fsk";
   private String universe;
   private int length;
   private List<Movie> prequel;
   private List<Movie> sequel;
   private List<String> alias;
   private String nameOV;
   private String nameGer;
   private int year;
   private int fsk;

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

   public List<String> getAlias()
   {
      return this.alias != null ? Collections.unmodifiableList(this.alias) : Collections.emptyList();
   }

   public Movie withAlias(String value)
   {
      if (this.alias == null)
      {
         this.alias = new ArrayList<>();
      }
      this.alias.add(value);
      return this;
   }

   public Movie withAlias(String... value)
   {
      this.withAlias(Arrays.asList(value));
      return this;
   }

   public Movie withAlias(Collection<? extends String> value)
   {
      if (this.alias == null)
      {
         this.alias = new ArrayList<>(value);
      }
      else
      {
         this.alias.addAll(value);
      }
      return this;
   }

   public Movie withoutAlias(String value)
   {
      this.alias.removeAll(Collections.singleton(value));
      return this;
   }

   public Movie withoutAlias(String... value)
   {
      this.withoutAlias(Arrays.asList(value));
      return this;
   }

   public Movie withoutAlias(Collection<? extends String> value)
   {
      if (this.alias != null)
      {
         this.alias.removeAll(value);
      }
      return this;
   }

   public String getNameOV()
   {
      return this.nameOV;
   }

   public Movie setNameOV(String value)
   {
      this.nameOV = value;
      return this;
   }

   public String getNameGer()
   {
      return this.nameGer;
   }

   public Movie setNameGer(String value)
   {
      this.nameGer = value;
      return this;
   }

   public int getYear()
   {
      return this.year;
   }

   public Movie setYear(int value)
   {
      this.year = value;
      return this;
   }

   public int getFsk()
   {
      return this.fsk;
   }

   public Movie setFsk(int value)
   {
      this.fsk = value;
      return this;
   }

   @Override
   public String toString()
   {
      final StringBuilder result = new StringBuilder();
      result.append(' ').append(this.getAlias());
      result.append(' ').append(this.getNameOV());
      result.append(' ').append(this.getNameGer());
      result.append(' ').append(this.getUniverse());
      return result.substring(1);
   }

   public void removeYou()
   {
      this.withoutPrequel(new ArrayList<>(this.getPrequel()));
      this.withoutSequel(new ArrayList<>(this.getSequel()));
   }
}
