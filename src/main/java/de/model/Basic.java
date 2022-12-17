package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.Collection;

public class Basic
{
   public static final String PROPERTY_ALIAS = "alias";
   public static final String PROPERTY_NAME_OV = "nameOV";
   public static final String PROPERTY_NAME_GER = "nameGer";
   public static final String PROPERTY_YEAR_OV = "yearOV";
   public static final String PROPERTY_YEAR_GER = "yearGer";
   public static final String PROPERTY_FSK = "fsk";
   public static final String PROPERTY_GENRE = "genre";
   public static final String PROPERTY_PALTFORM = "paltform";
   private List<String> alias;
   private String nameOV;
   private String nameGer;
   private List<Integer> yearOV;
   private List<Integer> yearGer;
   private int fsk;
   private List<String> genre;
   private List<String> paltform;

   public List<String> getAlias()
   {
      return this.alias != null ? Collections.unmodifiableList(this.alias) : Collections.emptyList();
   }

   public Basic withAlias(String value)
   {
      if (this.alias == null)
      {
         this.alias = new ArrayList<>();
      }
      this.alias.add(value);
      return this;
   }

   public Basic withAlias(String... value)
   {
      this.withAlias(Arrays.asList(value));
      return this;
   }

   public Basic withAlias(Collection<? extends String> value)
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

   public Basic withoutAlias(String value)
   {
      this.alias.removeAll(Collections.singleton(value));
      return this;
   }

   public Basic withoutAlias(String... value)
   {
      this.withoutAlias(Arrays.asList(value));
      return this;
   }

   public Basic withoutAlias(Collection<? extends String> value)
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

   public Basic setNameOV(String value)
   {
      this.nameOV = value;
      return this;
   }

   public String getNameGer()
   {
      return this.nameGer;
   }

   public Basic setNameGer(String value)
   {
      this.nameGer = value;
      return this;
   }

   public List<Integer> getYearOV()
   {
      return this.yearOV != null ? Collections.unmodifiableList(this.yearOV) : Collections.emptyList();
   }

   public Basic withYearOV(Integer value)
   {
      if (this.yearOV == null)
      {
         this.yearOV = new ArrayList<>();
      }
      this.yearOV.add(value);
      return this;
   }

   public Basic withYearOV(Integer... value)
   {
      this.withYearOV(Arrays.asList(value));
      return this;
   }

   public Basic withYearOV(Collection<? extends Integer> value)
   {
      if (this.yearOV == null)
      {
         this.yearOV = new ArrayList<>(value);
      }
      else
      {
         this.yearOV.addAll(value);
      }
      return this;
   }

   public Basic withoutYearOV(Integer value)
   {
      this.yearOV.removeAll(Collections.singleton(value));
      return this;
   }

   public Basic withoutYearOV(Integer... value)
   {
      this.withoutYearOV(Arrays.asList(value));
      return this;
   }

   public Basic withoutYearOV(Collection<? extends Integer> value)
   {
      if (this.yearOV != null)
      {
         this.yearOV.removeAll(value);
      }
      return this;
   }

   public List<Integer> getYearGer()
   {
      return this.yearGer != null ? Collections.unmodifiableList(this.yearGer) : Collections.emptyList();
   }

   public Basic withYearGer(Integer value)
   {
      if (this.yearGer == null)
      {
         this.yearGer = new ArrayList<>();
      }
      this.yearGer.add(value);
      return this;
   }

   public Basic withYearGer(Integer... value)
   {
      this.withYearGer(Arrays.asList(value));
      return this;
   }

   public Basic withYearGer(Collection<? extends Integer> value)
   {
      if (this.yearGer == null)
      {
         this.yearGer = new ArrayList<>(value);
      }
      else
      {
         this.yearGer.addAll(value);
      }
      return this;
   }

   public Basic withoutYearGer(Integer value)
   {
      this.yearGer.removeAll(Collections.singleton(value));
      return this;
   }

   public Basic withoutYearGer(Integer... value)
   {
      this.withoutYearGer(Arrays.asList(value));
      return this;
   }

   public Basic withoutYearGer(Collection<? extends Integer> value)
   {
      if (this.yearGer != null)
      {
         this.yearGer.removeAll(value);
      }
      return this;
   }

   public int getFsk()
   {
      return this.fsk;
   }

   public Basic setFsk(int value)
   {
      this.fsk = value;
      return this;
   }

   public List<String> getGenre()
   {
      return this.genre != null ? Collections.unmodifiableList(this.genre) : Collections.emptyList();
   }

   public Basic withGenre(String value)
   {
      if (this.genre == null)
      {
         this.genre = new ArrayList<>();
      }
      this.genre.add(value);
      return this;
   }

   public Basic withGenre(String... value)
   {
      this.withGenre(Arrays.asList(value));
      return this;
   }

   public Basic withGenre(Collection<? extends String> value)
   {
      if (this.genre == null)
      {
         this.genre = new ArrayList<>(value);
      }
      else
      {
         this.genre.addAll(value);
      }
      return this;
   }

   public Basic withoutGenre(String value)
   {
      this.genre.removeAll(Collections.singleton(value));
      return this;
   }

   public Basic withoutGenre(String... value)
   {
      this.withoutGenre(Arrays.asList(value));
      return this;
   }

   public Basic withoutGenre(Collection<? extends String> value)
   {
      if (this.genre != null)
      {
         this.genre.removeAll(value);
      }
      return this;
   }

   public List<String> getPaltform()
   {
      return this.paltform != null ? Collections.unmodifiableList(this.paltform) : Collections.emptyList();
   }

   public Basic withPaltform(String value)
   {
      if (this.paltform == null)
      {
         this.paltform = new ArrayList<>();
      }
      this.paltform.add(value);
      return this;
   }

   public Basic withPaltform(String... value)
   {
      this.withPaltform(Arrays.asList(value));
      return this;
   }

   public Basic withPaltform(Collection<? extends String> value)
   {
      if (this.paltform == null)
      {
         this.paltform = new ArrayList<>(value);
      }
      else
      {
         this.paltform.addAll(value);
      }
      return this;
   }

   public Basic withoutPaltform(String value)
   {
      this.paltform.removeAll(Collections.singleton(value));
      return this;
   }

   public Basic withoutPaltform(String... value)
   {
      this.withoutPaltform(Arrays.asList(value));
      return this;
   }

   public Basic withoutPaltform(Collection<? extends String> value)
   {
      if (this.paltform != null)
      {
         this.paltform.removeAll(value);
      }
      return this;
   }

   @Override
   public String toString()
   {
      final StringBuilder result = new StringBuilder();
      result.append(' ').append(this.getAlias());
      result.append(' ').append(this.getNameOV());
      result.append(' ').append(this.getNameGer());
      result.append(' ').append(this.getGenre());
      result.append(' ').append(this.getPaltform());
      return result.substring(1);
   }
}
