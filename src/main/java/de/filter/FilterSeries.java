package de.filter;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.Collection;

public class FilterSeries {
   public static final String PROPERTY_FILTER_LANGUAGE = "filterLanguage";
   public static final String PROPERTY_FILTER_GENRE = "filterGenre";
   public static final String PROPERTY_FILTER_YEAR = "filterYear";
   public static final String PROPERTY_FILTER_FSK = "filterFsk";
   public static final String PROPERTY_FILTER_PLATFORM = "filterPlatform";
   private List<String> filterLanguage;
   private List<String> filterGenre;
   private List<Integer> filterYear;
   private List<Integer> filterFsk;
   private List<String> filterPlatform;

   public List<String> getFilterLanguage()
   {
      return this.filterLanguage != null ? Collections.unmodifiableList(this.filterLanguage) : Collections.emptyList();
   }

   public FilterSeries withFilterLanguage(String value)
   {
      if (this.filterLanguage == null)
      {
         this.filterLanguage = new ArrayList<>();
      }
      this.filterLanguage.add(value);
      return this;
   }

   public FilterSeries withFilterLanguage(String... value)
   {
      this.withFilterLanguage(Arrays.asList(value));
      return this;
   }

   public FilterSeries withFilterLanguage(Collection<? extends String> value)
   {
      if (this.filterLanguage == null)
      {
         this.filterLanguage = new ArrayList<>(value);
      }
      else
      {
         this.filterLanguage.addAll(value);
      }
      return this;
   }

   public FilterSeries withoutFilterLanguage(String value)
   {
      this.filterLanguage.removeAll(Collections.singleton(value));
      return this;
   }

   public FilterSeries withoutFilterLanguage(String... value)
   {
      this.withoutFilterLanguage(Arrays.asList(value));
      return this;
   }

   public FilterSeries withoutFilterLanguage(Collection<? extends String> value)
   {
      if (this.filterLanguage != null)
      {
         this.filterLanguage.removeAll(value);
      }
      return this;
   }

   public List<String> getFilterGenre()
   {
      return this.filterGenre != null ? Collections.unmodifiableList(this.filterGenre) : Collections.emptyList();
   }

   public FilterSeries withFilterGenre(String value)
   {
      if (this.filterGenre == null)
      {
         this.filterGenre = new ArrayList<>();
      }
      this.filterGenre.add(value);
      return this;
   }

   public FilterSeries withFilterGenre(String... value)
   {
      this.withFilterGenre(Arrays.asList(value));
      return this;
   }

   public FilterSeries withFilterGenre(Collection<? extends String> value)
   {
      if (this.filterGenre == null)
      {
         this.filterGenre = new ArrayList<>(value);
      }
      else
      {
         this.filterGenre.addAll(value);
      }
      return this;
   }

   public FilterSeries withoutFilterGenre(String value)
   {
      this.filterGenre.removeAll(Collections.singleton(value));
      return this;
   }

   public FilterSeries withoutFilterGenre(String... value)
   {
      this.withoutFilterGenre(Arrays.asList(value));
      return this;
   }

   public FilterSeries withoutFilterGenre(Collection<? extends String> value)
   {
      if (this.filterGenre != null)
      {
         this.filterGenre.removeAll(value);
      }
      return this;
   }

   public List<Integer> getFilterYear()
   {
      return this.filterYear != null ? Collections.unmodifiableList(this.filterYear) : Collections.emptyList();
   }

   public FilterSeries withFilterYear(Integer value)
   {
      if (this.filterYear == null)
      {
         this.filterYear = new ArrayList<>();
      }
      this.filterYear.add(value);
      return this;
   }

   public FilterSeries withFilterYear(Integer... value)
   {
      this.withFilterYear(Arrays.asList(value));
      return this;
   }

   public FilterSeries withFilterYear(Collection<? extends Integer> value)
   {
      if (this.filterYear == null)
      {
         this.filterYear = new ArrayList<>(value);
      }
      else
      {
         this.filterYear.addAll(value);
      }
      return this;
   }

   public FilterSeries withoutFilterYear(Integer value)
   {
      this.filterYear.removeAll(Collections.singleton(value));
      return this;
   }

   public FilterSeries withoutFilterYear(Integer... value)
   {
      this.withoutFilterYear(Arrays.asList(value));
      return this;
   }

   public FilterSeries withoutFilterYear(Collection<? extends Integer> value)
   {
      if (this.filterYear != null)
      {
         this.filterYear.removeAll(value);
      }
      return this;
   }

   public List<Integer> getFilterFsk()
   {
      return this.filterFsk != null ? Collections.unmodifiableList(this.filterFsk) : Collections.emptyList();
   }

   public FilterSeries withFilterFsk(Integer value)
   {
      if (this.filterFsk == null)
      {
         this.filterFsk = new ArrayList<>();
      }
      this.filterFsk.add(value);
      return this;
   }

   public FilterSeries withFilterFsk(Integer... value)
   {
      this.withFilterFsk(Arrays.asList(value));
      return this;
   }

   public FilterSeries withFilterFsk(Collection<? extends Integer> value)
   {
      if (this.filterFsk == null)
      {
         this.filterFsk = new ArrayList<>(value);
      }
      else
      {
         this.filterFsk.addAll(value);
      }
      return this;
   }

   public FilterSeries withoutFilterFsk(Integer value)
   {
      this.filterFsk.removeAll(Collections.singleton(value));
      return this;
   }

   public FilterSeries withoutFilterFsk(Integer... value)
   {
      this.withoutFilterFsk(Arrays.asList(value));
      return this;
   }

   public FilterSeries withoutFilterFsk(Collection<? extends Integer> value)
   {
      if (this.filterFsk != null)
      {
         this.filterFsk.removeAll(value);
      }
      return this;
   }

   public List<String> getFilterPlatform()
   {
      return this.filterPlatform != null ? Collections.unmodifiableList(this.filterPlatform) : Collections.emptyList();
   }

   public FilterSeries withFilterPlatform(String value)
   {
      if (this.filterPlatform == null)
      {
         this.filterPlatform = new ArrayList<>();
      }
      this.filterPlatform.add(value);
      return this;
   }

   public FilterSeries withFilterPlatform(String... value)
   {
      this.withFilterPlatform(Arrays.asList(value));
      return this;
   }

   public FilterSeries withFilterPlatform(Collection<? extends String> value)
   {
      if (this.filterPlatform == null)
      {
         this.filterPlatform = new ArrayList<>(value);
      }
      else
      {
         this.filterPlatform.addAll(value);
      }
      return this;
   }

   public FilterSeries withoutFilterPlatform(String value)
   {
      this.filterPlatform.removeAll(Collections.singleton(value));
      return this;
   }

   public FilterSeries withoutFilterPlatform(String... value)
   {
      this.withoutFilterPlatform(Arrays.asList(value));
      return this;
   }

   public FilterSeries withoutFilterPlatform(Collection<? extends String> value)
   {
      if (this.filterPlatform != null)
      {
         this.filterPlatform.removeAll(value);
      }
      return this;
   }

   @Override
   public String toString()
   {
      final StringBuilder result = new StringBuilder();
      result.append(' ').append(this.getFilterLanguage());
      result.append(' ').append(this.getFilterGenre());
      result.append(' ').append(this.getFilterPlatform());
      return result.substring(1);
   }
}
