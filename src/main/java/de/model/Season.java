package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.Collection;

public class Season
extends Basic {
   public static final String PROPERTY_NUM_EPISODES = "numEpisodes";
   public static final String PROPERTY_LEN_EPISODES = "lenEpisodes";
   public static final String PROPERTY_LEN_SEASON = "lenSeason";
   public static final String PROPERTY_PREQUEL = "prequel";
   public static final String PROPERTY_SEQUEL = "sequel";
   public static final String PROPERTY_SERIES = "series";
   private int numEpisodes;
   private float lenEpisodes;
   private float lenSeason;
   private List<Season> prequel;
   private List<Season> sequel;
   private Series series;

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

   public void removeYou()
   {
      this.withoutPrequel(new ArrayList<>(this.getPrequel()));
      this.withoutSequel(new ArrayList<>(this.getSequel()));
      this.setSeries(null);
   }
}
