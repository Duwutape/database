package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.Collection;

public class Season
{
   public static final String PROPERTY_NUM_EPISODES = "numEpisodes";
   public static final String PROPERTY_LEN_EPISODES = "lenEpisodes";
   public static final String PROPERTY_LEN_SEASON = "lenSeason";
   public static final String PROPERTY_PREQUEL = "prequel";
   public static final String PROPERTY_SEQUEL = "sequel";
   public static final String PROPERTY_SERIES = "series";
   public static final String PROPERTY_NAME = "name";
   public static final String PROPERTY_YEAR_OV = "yearOV";
   public static final String PROPERTY_YEAR_GER = "yearGer";
   public static final String PROPERTY_FSK = "fsk";
   public static final String PROPERTY_GENRE = "genre";
   public static final String PROPERTY_PLATFORM = "platform";
   private int numEpisodes;
   private float lenEpisodes;
   private float lenSeason;
   private List<Season> prequel;
   private List<Season> sequel;
   private Series series;
   private String name;
   private List<Integer> yearOV;
   private List<Integer> yearGer;
   private int fsk;
   private List<String> genre;
   private List<String> platform;

   public int getNumEpisodes()
   {
      return this.numEpisodes;
   }

   public Season setNumEpisodes(int value)
   {
      this.numEpisodes = value;
      return this;
   }

   public float getLenEpisodes()
   {
      return this.lenEpisodes;
   }

   public Season setLenEpisodes(float value)
   {
      this.lenEpisodes = value;
      return this;
   }

   public float getLenSeason()
   {
      return this.lenSeason;
   }

   public Season setLenSeason(float value)
   {
      this.lenSeason = value;
      return this;
   }

   public List<Season> getPrequel()
   {
      return this.prequel != null ? Collections.unmodifiableList(this.prequel) : Collections.emptyList();
   }

   public Season withPrequel(Season value)
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

   public Season withPrequel(Season... value)
   {
      for (final Season item : value)
      {
         this.withPrequel(item);
      }
      return this;
   }

   public Season withPrequel(Collection<? extends Season> value)
   {
      for (final Season item : value)
      {
         this.withPrequel(item);
      }
      return this;
   }

   public Season withoutPrequel(Season value)
   {
      if (this.prequel != null && this.prequel.remove(value))
      {
         value.withoutSequel(this);
      }
      return this;
   }

   public Season withoutPrequel(Season... value)
   {
      for (final Season item : value)
      {
         this.withoutPrequel(item);
      }
      return this;
   }

   public Season withoutPrequel(Collection<? extends Season> value)
   {
      for (final Season item : value)
      {
         this.withoutPrequel(item);
      }
      return this;
   }

   public List<Season> getSequel()
   {
      return this.sequel != null ? Collections.unmodifiableList(this.sequel) : Collections.emptyList();
   }

   public Season withSequel(Season value)
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

   public Season withSequel(Season... value)
   {
      for (final Season item : value)
      {
         this.withSequel(item);
      }
      return this;
   }

   public Season withSequel(Collection<? extends Season> value)
   {
      for (final Season item : value)
      {
         this.withSequel(item);
      }
      return this;
   }

   public Season withoutSequel(Season value)
   {
      if (this.sequel != null && this.sequel.remove(value))
      {
         value.withoutPrequel(this);
      }
      return this;
   }

   public Season withoutSequel(Season... value)
   {
      for (final Season item : value)
      {
         this.withoutSequel(item);
      }
      return this;
   }

   public Season withoutSequel(Collection<? extends Season> value)
   {
      for (final Season item : value)
      {
         this.withoutSequel(item);
      }
      return this;
   }

   public Series getSeries()
   {
      return this.series;
   }

   public Season setSeries(Series value)
   {
      if (this.series == value)
      {
         return this;
      }

      final Series oldValue = this.series;
      if (this.series != null)
      {
         this.series = null;
         oldValue.withoutSeasons(this);
      }
      this.series = value;
      if (value != null)
      {
         value.withSeasons(this);
      }
      return this;
   }

   public String getName()
   {
      return this.name;
   }

   public Season setName(String value)
   {
      this.name = value;
      return this;
   }

   public List<Integer> getYearOV()
   {
      return this.yearOV != null ? Collections.unmodifiableList(this.yearOV) : Collections.emptyList();
   }

   public Season withYearOV(Integer value)
   {
      if (this.yearOV == null)
      {
         this.yearOV = new ArrayList<>();
      }
      this.yearOV.add(value);
      return this;
   }

   public Season withYearOV(Integer... value)
   {
      this.withYearOV(Arrays.asList(value));
      return this;
   }

   public Season withYearOV(Collection<? extends Integer> value)
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

   public Season withoutYearOV(Integer value)
   {
      this.yearOV.removeAll(Collections.singleton(value));
      return this;
   }

   public Season withoutYearOV(Integer... value)
   {
      this.withoutYearOV(Arrays.asList(value));
      return this;
   }

   public Season withoutYearOV(Collection<? extends Integer> value)
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

   public Season withYearGer(Integer value)
   {
      if (this.yearGer == null)
      {
         this.yearGer = new ArrayList<>();
      }
      this.yearGer.add(value);
      return this;
   }

   public Season withYearGer(Integer... value)
   {
      this.withYearGer(Arrays.asList(value));
      return this;
   }

   public Season withYearGer(Collection<? extends Integer> value)
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

   public Season withoutYearGer(Integer value)
   {
      this.yearGer.removeAll(Collections.singleton(value));
      return this;
   }

   public Season withoutYearGer(Integer... value)
   {
      this.withoutYearGer(Arrays.asList(value));
      return this;
   }

   public Season withoutYearGer(Collection<? extends Integer> value)
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

   public Season setFsk(int value)
   {
      this.fsk = value;
      return this;
   }

   public List<String> getGenre()
   {
      return this.genre != null ? Collections.unmodifiableList(this.genre) : Collections.emptyList();
   }

   public Season withGenre(String value)
   {
      if (this.genre == null)
      {
         this.genre = new ArrayList<>();
      }
      this.genre.add(value);
      return this;
   }

   public Season withGenre(String... value)
   {
      this.withGenre(Arrays.asList(value));
      return this;
   }

   public Season withGenre(Collection<? extends String> value)
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

   public Season withoutGenre(String value)
   {
      this.genre.removeAll(Collections.singleton(value));
      return this;
   }

   public Season withoutGenre(String... value)
   {
      this.withoutGenre(Arrays.asList(value));
      return this;
   }

   public Season withoutGenre(Collection<? extends String> value)
   {
      if (this.genre != null)
      {
         this.genre.removeAll(value);
      }
      return this;
   }

   public List<String> getPlatform()
   {
      return this.platform != null ? Collections.unmodifiableList(this.platform) : Collections.emptyList();
   }

   public Season withPlatform(String value)
   {
      if (this.platform == null)
      {
         this.platform = new ArrayList<>();
      }
      this.platform.add(value);
      return this;
   }

   public Season withPlatform(String... value)
   {
      this.withPlatform(Arrays.asList(value));
      return this;
   }

   public Season withPlatform(Collection<? extends String> value)
   {
      if (this.platform == null)
      {
         this.platform = new ArrayList<>(value);
      }
      else
      {
         this.platform.addAll(value);
      }
      return this;
   }

   public Season withoutPlatform(String value)
   {
      this.platform.removeAll(Collections.singleton(value));
      return this;
   }

   public Season withoutPlatform(String... value)
   {
      this.withoutPlatform(Arrays.asList(value));
      return this;
   }

   public Season withoutPlatform(Collection<? extends String> value)
   {
      if (this.platform != null)
      {
         this.platform.removeAll(value);
      }
      return this;
   }

   public void removeYou()
   {
      this.withoutPrequel(new ArrayList<>(this.getPrequel()));
      this.withoutSequel(new ArrayList<>(this.getSequel()));
      this.setSeries(null);
   }

   @Override
   public String toString()
   {
      final StringBuilder result = new StringBuilder();
      result.append(' ').append(this.getName());
      result.append(' ').append(this.getGenre());
      result.append(' ').append(this.getPlatform());
      return result.substring(1);
   }
}
