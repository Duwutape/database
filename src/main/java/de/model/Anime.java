package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.Collection;

public class Anime
{
   public static final String PROPERTY_NUM_EPISODES = "numEpisodes";
   public static final String PROPERTY_LEN_EPISODES = "lenEpisodes";
   public static final String PROPERTY_LEN_ANIME = "lenAnime";
   public static final String PROPERTY_PREQUEL = "prequel";
   public static final String PROPERTY_SEQUEL = "sequel";
   public static final String PROPERTY_NAME_ENG = "nameEng";
   public static final String PROPERTY_ALIAS = "alias";
   public static final String PROPERTY_NAME_JAP = "nameJap";
   public static final String PROPERTY_NAME_GER = "nameGer";
   public static final String PROPERTY_YEAR = "year";
   public static final String PROPERTY_FSK = "fsk";
   public static final String PROPERTY_GENRE = "genre";
   private int numEpisodes;
   private float lenEpisodes;
   private float lenAnime;
   private List<Anime> prequel;
   private List<Anime> sequel;
   private String nameEng;
   private List<String> alias;
   private String nameJap;
   private String nameGer;
   private List<Integer> year;
   private int fsk;
   private List<String> genre;

   public int getNumEpisodes()
   {
      return this.numEpisodes;
   }

   public Anime setNumEpisodes(int value)
   {
      this.numEpisodes = value;
      return this;
   }

   public float getLenEpisodes()
   {
      return this.lenEpisodes;
   }

   public Anime setLenEpisodes(float value)
   {
      this.lenEpisodes = value;
      return this;
   }

   public float getLenAnime()
   {
      return this.lenAnime;
   }

   public Anime setLenAnime(float value)
   {
      this.lenAnime = value;
      return this;
   }

   public List<Anime> getPrequel()
   {
      return this.prequel != null ? Collections.unmodifiableList(this.prequel) : Collections.emptyList();
   }

   public Anime withPrequel(Anime value)
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

   public Anime withPrequel(Anime... value)
   {
      for (final Anime item : value)
      {
         this.withPrequel(item);
      }
      return this;
   }

   public Anime withPrequel(Collection<? extends Anime> value)
   {
      for (final Anime item : value)
      {
         this.withPrequel(item);
      }
      return this;
   }

   public Anime withoutPrequel(Anime value)
   {
      if (this.prequel != null && this.prequel.remove(value))
      {
         value.withoutSequel(this);
      }
      return this;
   }

   public Anime withoutPrequel(Anime... value)
   {
      for (final Anime item : value)
      {
         this.withoutPrequel(item);
      }
      return this;
   }

   public Anime withoutPrequel(Collection<? extends Anime> value)
   {
      for (final Anime item : value)
      {
         this.withoutPrequel(item);
      }
      return this;
   }

   public List<Anime> getSequel()
   {
      return this.sequel != null ? Collections.unmodifiableList(this.sequel) : Collections.emptyList();
   }

   public Anime withSequel(Anime value)
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

   public Anime withSequel(Anime... value)
   {
      for (final Anime item : value)
      {
         this.withSequel(item);
      }
      return this;
   }

   public Anime withSequel(Collection<? extends Anime> value)
   {
      for (final Anime item : value)
      {
         this.withSequel(item);
      }
      return this;
   }

   public Anime withoutSequel(Anime value)
   {
      if (this.sequel != null && this.sequel.remove(value))
      {
         value.withoutPrequel(this);
      }
      return this;
   }

   public Anime withoutSequel(Anime... value)
   {
      for (final Anime item : value)
      {
         this.withoutSequel(item);
      }
      return this;
   }

   public Anime withoutSequel(Collection<? extends Anime> value)
   {
      for (final Anime item : value)
      {
         this.withoutSequel(item);
      }
      return this;
   }

   public String getNameEng()
   {
      return this.nameEng;
   }

   public Anime setNameEng(String value)
   {
      this.nameEng = value;
      return this;
   }

   public List<String> getAlias()
   {
      return this.alias != null ? Collections.unmodifiableList(this.alias) : Collections.emptyList();
   }

   public Anime withAlias(String value)
   {
      if (this.alias == null)
      {
         this.alias = new ArrayList<>();
      }
      this.alias.add(value);
      return this;
   }

   public Anime withAlias(String... value)
   {
      this.withAlias(Arrays.asList(value));
      return this;
   }

   public Anime withAlias(Collection<? extends String> value)
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

   public Anime withoutAlias(String value)
   {
      this.alias.removeAll(Collections.singleton(value));
      return this;
   }

   public Anime withoutAlias(String... value)
   {
      this.withoutAlias(Arrays.asList(value));
      return this;
   }

   public Anime withoutAlias(Collection<? extends String> value)
   {
      if (this.alias != null)
      {
         this.alias.removeAll(value);
      }
      return this;
   }

   public String getNameJap()
   {
      return this.nameJap;
   }

   public Anime setNameJap(String value)
   {
      this.nameJap = value;
      return this;
   }

   public String getNameGer()
   {
      return this.nameGer;
   }

   public Anime setNameGer(String value)
   {
      this.nameGer = value;
      return this;
   }

   public List<Integer> getYear()
   {
      return this.year != null ? Collections.unmodifiableList(this.year) : Collections.emptyList();
   }

   public Anime withYear(Integer value)
   {
      if (this.year == null)
      {
         this.year = new ArrayList<>();
      }
      this.year.add(value);
      return this;
   }

   public Anime withYear(Integer... value)
   {
      this.withYear(Arrays.asList(value));
      return this;
   }

   public Anime withYear(Collection<? extends Integer> value)
   {
      if (this.year == null)
      {
         this.year = new ArrayList<>(value);
      }
      else
      {
         this.year.addAll(value);
      }
      return this;
   }

   public Anime withoutYear(Integer value)
   {
      this.year.removeAll(Collections.singleton(value));
      return this;
   }

   public Anime withoutYear(Integer... value)
   {
      this.withoutYear(Arrays.asList(value));
      return this;
   }

   public Anime withoutYear(Collection<? extends Integer> value)
   {
      if (this.year != null)
      {
         this.year.removeAll(value);
      }
      return this;
   }

   public int getFsk()
   {
      return this.fsk;
   }

   public Anime setFsk(int value)
   {
      this.fsk = value;
      return this;
   }

   public List<String> getGenre()
   {
      return this.genre != null ? Collections.unmodifiableList(this.genre) : Collections.emptyList();
   }

   public Anime withGenre(String value)
   {
      if (this.genre == null)
      {
         this.genre = new ArrayList<>();
      }
      this.genre.add(value);
      return this;
   }

   public Anime withGenre(String... value)
   {
      this.withGenre(Arrays.asList(value));
      return this;
   }

   public Anime withGenre(Collection<? extends String> value)
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

   public Anime withoutGenre(String value)
   {
      this.genre.removeAll(Collections.singleton(value));
      return this;
   }

   public Anime withoutGenre(String... value)
   {
      this.withoutGenre(Arrays.asList(value));
      return this;
   }

   public Anime withoutGenre(Collection<? extends String> value)
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
      result.append(' ').append(this.getNameJap());
      result.append(' ').append(this.getNameEng());
      result.append(' ').append(this.getNameGer());
      result.append(' ').append(this.getGenre());
      return result.substring(1);
   }

   public void removeYou()
   {
      this.withoutPrequel(new ArrayList<>(this.getPrequel()));
      this.withoutSequel(new ArrayList<>(this.getSequel()));
   }
}
