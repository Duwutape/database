package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.Arrays;

public class Game
{
   public static final String PROPERTY_UNIVERSE = "universe";
   public static final String PROPERTY_PREQUEL = "prequel";
   public static final String PROPERTY_SEQUEL = "sequel";
   public static final String PROPERTY_ALIAS = "alias";
   public static final String PROPERTY_NAME_OV = "nameOV";
   public static final String PROPERTY_NAME_GER = "nameGer";
   public static final String PROPERTY_USK = "usk";
   public static final String PROPERTY_GENRE = "genre";
   public static final String PROPERTY_PUBLISHED = "published";
   private String universe;
   private List<Game> prequel;
   private List<Game> sequel;
   private List<String> alias;
   private String nameOV;
   private String nameGer;
   private int usk;
   private List<String> genre;
   private List<Release> published;

   public String getUniverse()
   {
      return this.universe;
   }

   public Game setUniverse(String value)
   {
      this.universe = value;
      return this;
   }

   public List<Game> getPrequel()
   {
      return this.prequel != null ? Collections.unmodifiableList(this.prequel) : Collections.emptyList();
   }

   public Game withPrequel(Game value)
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

   public Game withPrequel(Game... value)
   {
      for (final Game item : value)
      {
         this.withPrequel(item);
      }
      return this;
   }

   public Game withPrequel(Collection<? extends Game> value)
   {
      for (final Game item : value)
      {
         this.withPrequel(item);
      }
      return this;
   }

   public Game withoutPrequel(Game value)
   {
      if (this.prequel != null && this.prequel.remove(value))
      {
         value.withoutSequel(this);
      }
      return this;
   }

   public Game withoutPrequel(Game... value)
   {
      for (final Game item : value)
      {
         this.withoutPrequel(item);
      }
      return this;
   }

   public Game withoutPrequel(Collection<? extends Game> value)
   {
      for (final Game item : value)
      {
         this.withoutPrequel(item);
      }
      return this;
   }

   public List<Game> getSequel()
   {
      return this.sequel != null ? Collections.unmodifiableList(this.sequel) : Collections.emptyList();
   }

   public Game withSequel(Game value)
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

   public Game withSequel(Game... value)
   {
      for (final Game item : value)
      {
         this.withSequel(item);
      }
      return this;
   }

   public Game withSequel(Collection<? extends Game> value)
   {
      for (final Game item : value)
      {
         this.withSequel(item);
      }
      return this;
   }

   public Game withoutSequel(Game value)
   {
      if (this.sequel != null && this.sequel.remove(value))
      {
         value.withoutPrequel(this);
      }
      return this;
   }

   public Game withoutSequel(Game... value)
   {
      for (final Game item : value)
      {
         this.withoutSequel(item);
      }
      return this;
   }

   public Game withoutSequel(Collection<? extends Game> value)
   {
      for (final Game item : value)
      {
         this.withoutSequel(item);
      }
      return this;
   }

   public List<String> getAlias()
   {
      return this.alias != null ? Collections.unmodifiableList(this.alias) : Collections.emptyList();
   }

   public Game withAlias(String value)
   {
      if (this.alias == null)
      {
         this.alias = new ArrayList<>();
      }
      this.alias.add(value);
      return this;
   }

   public Game withAlias(String... value)
   {
      this.withAlias(Arrays.asList(value));
      return this;
   }

   public Game withAlias(Collection<? extends String> value)
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

   public Game withoutAlias(String value)
   {
      this.alias.removeAll(Collections.singleton(value));
      return this;
   }

   public Game withoutAlias(String... value)
   {
      this.withoutAlias(Arrays.asList(value));
      return this;
   }

   public Game withoutAlias(Collection<? extends String> value)
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

   public Game setNameOV(String value)
   {
      this.nameOV = value;
      return this;
   }

   public String getNameGer()
   {
      return this.nameGer;
   }

   public Game setNameGer(String value)
   {
      this.nameGer = value;
      return this;
   }

   public int getUsk()
   {
      return this.usk;
   }

   public Game setUsk(int value)
   {
      this.usk = value;
      return this;
   }

   public List<String> getGenre()
   {
      return this.genre != null ? Collections.unmodifiableList(this.genre) : Collections.emptyList();
   }

   public Game withGenre(String value)
   {
      if (this.genre == null)
      {
         this.genre = new ArrayList<>();
      }
      this.genre.add(value);
      return this;
   }

   public Game withGenre(String... value)
   {
      this.withGenre(Arrays.asList(value));
      return this;
   }

   public Game withGenre(Collection<? extends String> value)
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

   public Game withoutGenre(String value)
   {
      this.genre.removeAll(Collections.singleton(value));
      return this;
   }

   public Game withoutGenre(String... value)
   {
      this.withoutGenre(Arrays.asList(value));
      return this;
   }

   public Game withoutGenre(Collection<? extends String> value)
   {
      if (this.genre != null)
      {
         this.genre.removeAll(value);
      }
      return this;
   }

   public List<Release> getPublished()
   {
      return this.published != null ? Collections.unmodifiableList(this.published) : Collections.emptyList();
   }

   public Game withPublished(Release value)
   {
      if (this.published == null)
      {
         this.published = new ArrayList<>();
      }
      if (!this.published.contains(value))
      {
         this.published.add(value);
      }
      return this;
   }

   public Game withPublished(Release... value)
   {
      for (final Release item : value)
      {
         this.withPublished(item);
      }
      return this;
   }

   public Game withPublished(Collection<? extends Release> value)
   {
      for (final Release item : value)
      {
         this.withPublished(item);
      }
      return this;
   }

   public Game withoutPublished(Release value)
   {
      if (this.published != null)
      {
         this.published.remove(value);
      }
      return this;
   }

   public Game withoutPublished(Release... value)
   {
      for (final Release item : value)
      {
         this.withoutPublished(item);
      }
      return this;
   }

   public Game withoutPublished(Collection<? extends Release> value)
   {
      for (final Release item : value)
      {
         this.withoutPublished(item);
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
      result.append(' ').append(this.getUniverse());
      result.append(' ').append(this.getGenre());
      return result.substring(1);
   }

   public void removeYou()
   {
      this.withoutPrequel(new ArrayList<>(this.getPrequel()));
      this.withoutSequel(new ArrayList<>(this.getSequel()));
      this.withoutPublished(new ArrayList<>(this.getPublished()));
   }
}
