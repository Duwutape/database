package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.Collection;

public class Series
{
   public static final String PROPERTY_LANGUAGE = "language";
   public static final String PROPERTY_SEASONS = "seasons";
   public static final String PROPERTY_ALIAS = "alias";
   public static final String PROPERTY_NAME_OV = "nameOV";
   public static final String PROPERTY_NAME_GER = "nameGer";
   public static final String PROPERTY_GENRE = "genre";
   private String language;
   private List<Season> seasons;
   private List<String> alias;
   private String nameOV;
   private String nameGer;
   private List<String> genre;

   public String getLanguage()
   {
      return this.language;
   }

   public Series setLanguage(String value)
   {
      this.language = value;
      return this;
   }

   public List<Season> getSeasons()
   {
      return this.seasons != null ? Collections.unmodifiableList(this.seasons) : Collections.emptyList();
   }

   public Series withSeasons(Season value)
   {
      if (this.seasons == null)
      {
         this.seasons = new ArrayList<>();
      }
      if (!this.seasons.contains(value))
      {
         this.seasons.add(value);
         value.setSeries(this);
      }
      return this;
   }

   public Series withSeasons(Season... value)
   {
      for (final Season item : value)
      {
         this.withSeasons(item);
      }
      return this;
   }

   public Series withSeasons(Collection<? extends Season> value)
   {
      for (final Season item : value)
      {
         this.withSeasons(item);
      }
      return this;
   }

   public Series withoutSeasons(Season value)
   {
      if (this.seasons != null && this.seasons.remove(value))
      {
         value.setSeries(null);
      }
      return this;
   }

   public Series withoutSeasons(Season... value)
   {
      for (final Season item : value)
      {
         this.withoutSeasons(item);
      }
      return this;
   }

   public Series withoutSeasons(Collection<? extends Season> value)
   {
      for (final Season item : value)
      {
         this.withoutSeasons(item);
      }
      return this;
   }

   public List<String> getAlias()
   {
      return this.alias != null ? Collections.unmodifiableList(this.alias) : Collections.emptyList();
   }

   public Series withAlias(String value)
   {
      if (this.alias == null)
      {
         this.alias = new ArrayList<>();
      }
      this.alias.add(value);
      return this;
   }

   public Series withAlias(String... value)
   {
      this.withAlias(Arrays.asList(value));
      return this;
   }

   public Series withAlias(Collection<? extends String> value)
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

   public Series withoutAlias(String value)
   {
      this.alias.removeAll(Collections.singleton(value));
      return this;
   }

   public Series withoutAlias(String... value)
   {
      this.withoutAlias(Arrays.asList(value));
      return this;
   }

   public Series withoutAlias(Collection<? extends String> value)
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

   public Series setNameOV(String value)
   {
      this.nameOV = value;
      return this;
   }

   public String getNameGer()
   {
      return this.nameGer;
   }

   public Series setNameGer(String value)
   {
      this.nameGer = value;
      return this;
   }

   public List<String> getGenre()
   {
      return this.genre != null ? Collections.unmodifiableList(this.genre) : Collections.emptyList();
   }

   public Series withGenre(String value)
   {
      if (this.genre == null)
      {
         this.genre = new ArrayList<>();
      }
      this.genre.add(value);
      return this;
   }

   public Series withGenre(String... value)
   {
      this.withGenre(Arrays.asList(value));
      return this;
   }

   public Series withGenre(Collection<? extends String> value)
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

   public Series withoutGenre(String value)
   {
      this.genre.removeAll(Collections.singleton(value));
      return this;
   }

   public Series withoutGenre(String... value)
   {
      this.withoutGenre(Arrays.asList(value));
      return this;
   }

   public Series withoutGenre(Collection<? extends String> value)
   {
      if (this.genre != null)
      {
         this.genre.removeAll(value);
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
      result.append(' ').append(this.getLanguage());
      result.append(' ').append(this.getGenre());
      return result.substring(1);
   }

   public void removeYou()
   {
      this.withoutSeasons(new ArrayList<>(this.getSeasons()));
   }
}
