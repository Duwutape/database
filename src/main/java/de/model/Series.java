package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.Collection;

public class Series
extends Basic {
   public static final String PROPERTY_LANGUAGE = "language";
   public static final String PROPERTY_SEASONS = "seasons";
   private String language;
   private List<Season> seasons;

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

   @Override
   public String toString()
   {
      final StringBuilder result = new StringBuilder(super.toString());
      result.append(' ').append(this.getLanguage());
      return result.toString();
   }

   public void removeYou()
   {
      this.withoutSeasons(new ArrayList<>(this.getSeasons()));
   }
}
