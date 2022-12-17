package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.Collection;

public class Anime
extends Basic {
   public static final String PROPERTY_NUM_EPISODES = "numEpisodes";
   public static final String PROPERTY_LEN_EPISODES = "lenEpisodes";
   public static final String PROPERTY_LEN_ANIME = "lenAnime";
   public static final String PROPERTY_PREQUEL = "prequel";
   public static final String PROPERTY_SEQUEL = "sequel";
   public static final String PROPERTY_NAME_ENG = "nameEng";
   private int numEpisodes;
   private float lenEpisodes;
   private float lenAnime;
   private List<Anime> prequel;
   private List<Anime> sequel;
   private String nameEng;

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

   @Override
   public String toString()
   {
      final StringBuilder result = new StringBuilder(super.toString());
      result.append(' ').append(this.getNameEng());
      return result.toString();
   }

   public void removeYou()
   {
      this.withoutPrequel(new ArrayList<>(this.getPrequel()));
      this.withoutSequel(new ArrayList<>(this.getSequel()));
   }
}
