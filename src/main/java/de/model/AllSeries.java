package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;

public class AllSeries
{
   public static final String PROPERTY_SERIES_LIST = "seriesList";
   private List<Series> seriesList;

   public List<Series> getSeriesList()
   {
      return this.seriesList != null ? Collections.unmodifiableList(this.seriesList) : Collections.emptyList();
   }

   public AllSeries withSeriesList(Series value)
   {
      if (this.seriesList == null)
      {
         this.seriesList = new ArrayList<>();
      }
      if (!this.seriesList.contains(value))
      {
         this.seriesList.add(value);
      }
      return this;
   }

   public AllSeries withSeriesList(Series... value)
   {
      for (final Series item : value)
      {
         this.withSeriesList(item);
      }
      return this;
   }

   public AllSeries withSeriesList(Collection<? extends Series> value)
   {
      for (final Series item : value)
      {
         this.withSeriesList(item);
      }
      return this;
   }

   public AllSeries withoutSeriesList(Series value)
   {
      if (this.seriesList != null)
      {
         this.seriesList.remove(value);
      }
      return this;
   }

   public AllSeries withoutSeriesList(Series... value)
   {
      for (final Series item : value)
      {
         this.withoutSeriesList(item);
      }
      return this;
   }

   public AllSeries withoutSeriesList(Collection<? extends Series> value)
   {
      for (final Series item : value)
      {
         this.withoutSeriesList(item);
      }
      return this;
   }

   public void removeYou()
   {
      this.withoutSeriesList(new ArrayList<>(this.getSeriesList()));
   }
}
