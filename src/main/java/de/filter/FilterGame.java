package de.filter;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.Collection;

public class FilterGame {
   public static final String PROPERTY_FILTER_UNIVERSE = "filterUniverse";
   public static final String PROPERTY_FILTER_USK = "filterUsk";
   public static final String PROPERTY_FILTER_GENRE = "filterGenre";
   public static final String PROPERTY_FILTER_YEAR = "filterYear";
   public static final String PROPERTY_FILTER_PLATFORM = "filterPlatform";
   private List<String> filterUniverse;
   private List<Integer> filterUsk;
   private List<String> filterGenre;
   private List<Integer> filterYear;
   private List<String> filterPlatform;

   public List<String> getFilterUniverse()
   {
      return this.filterUniverse != null ? Collections.unmodifiableList(this.filterUniverse) : Collections.emptyList();
   }

   public FilterGame withFilterUniverse(String value)
   {
      if (this.filterUniverse == null)
      {
         this.filterUniverse = new ArrayList<>();
      }
      this.filterUniverse.add(value);
      return this;
   }

   public FilterGame withFilterUniverse(String... value)
   {
      this.withFilterUniverse(Arrays.asList(value));
      return this;
   }

   public FilterGame withFilterUniverse(Collection<? extends String> value)
   {
      if (this.filterUniverse == null)
      {
         this.filterUniverse = new ArrayList<>(value);
      }
      else
      {
         this.filterUniverse.addAll(value);
      }
      return this;
   }

   public FilterGame withoutFilterUniverse(String value)
   {
      this.filterUniverse.removeAll(Collections.singleton(value));
      return this;
   }

   public FilterGame withoutFilterUniverse(String... value)
   {
      this.withoutFilterUniverse(Arrays.asList(value));
      return this;
   }

   public FilterGame withoutFilterUniverse(Collection<? extends String> value)
   {
      if (this.filterUniverse != null)
      {
         this.filterUniverse.removeAll(value);
      }
      return this;
   }

   public List<Integer> getFilterUsk()
   {
      return this.filterUsk != null ? Collections.unmodifiableList(this.filterUsk) : Collections.emptyList();
   }

   public FilterGame withFilterUsk(Integer value)
   {
      if (this.filterUsk == null)
      {
         this.filterUsk = new ArrayList<>();
      }
      this.filterUsk.add(value);
      return this;
   }

   public FilterGame withFilterUsk(Integer... value)
   {
      this.withFilterUsk(Arrays.asList(value));
      return this;
   }

   public FilterGame withFilterUsk(Collection<? extends Integer> value)
   {
      if (this.filterUsk == null)
      {
         this.filterUsk = new ArrayList<>(value);
      }
      else
      {
         this.filterUsk.addAll(value);
      }
      return this;
   }

   public FilterGame withoutFilterUsk(Integer value)
   {
      this.filterUsk.removeAll(Collections.singleton(value));
      return this;
   }

   public FilterGame withoutFilterUsk(Integer... value)
   {
      this.withoutFilterUsk(Arrays.asList(value));
      return this;
   }

   public FilterGame withoutFilterUsk(Collection<? extends Integer> value)
   {
      if (this.filterUsk != null)
      {
         this.filterUsk.removeAll(value);
      }
      return this;
   }

   public List<String> getFilterGenre()
   {
      return this.filterGenre != null ? Collections.unmodifiableList(this.filterGenre) : Collections.emptyList();
   }

   public FilterGame withFilterGenre(String value)
   {
      if (this.filterGenre == null)
      {
         this.filterGenre = new ArrayList<>();
      }
      this.filterGenre.add(value);
      return this;
   }

   public FilterGame withFilterGenre(String... value)
   {
      this.withFilterGenre(Arrays.asList(value));
      return this;
   }

   public FilterGame withFilterGenre(Collection<? extends String> value)
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

   public FilterGame withoutFilterGenre(String value)
   {
      this.filterGenre.removeAll(Collections.singleton(value));
      return this;
   }

   public FilterGame withoutFilterGenre(String... value)
   {
      this.withoutFilterGenre(Arrays.asList(value));
      return this;
   }

   public FilterGame withoutFilterGenre(Collection<? extends String> value)
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

   public FilterGame withFilterYear(Integer value)
   {
      if (this.filterYear == null)
      {
         this.filterYear = new ArrayList<>();
      }
      this.filterYear.add(value);
      return this;
   }

   public FilterGame withFilterYear(Integer... value)
   {
      this.withFilterYear(Arrays.asList(value));
      return this;
   }

   public FilterGame withFilterYear(Collection<? extends Integer> value)
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

   public FilterGame withoutFilterYear(Integer value)
   {
      this.filterYear.removeAll(Collections.singleton(value));
      return this;
   }

   public FilterGame withoutFilterYear(Integer... value)
   {
      this.withoutFilterYear(Arrays.asList(value));
      return this;
   }

   public FilterGame withoutFilterYear(Collection<? extends Integer> value)
   {
      if (this.filterYear != null)
      {
         this.filterYear.removeAll(value);
      }
      return this;
   }

   public List<String> getFilterPlatform()
   {
      return this.filterPlatform != null ? Collections.unmodifiableList(this.filterPlatform) : Collections.emptyList();
   }

   public FilterGame withFilterPlatform(String value)
   {
      if (this.filterPlatform == null)
      {
         this.filterPlatform = new ArrayList<>();
      }
      this.filterPlatform.add(value);
      return this;
   }

   public FilterGame withFilterPlatform(String... value)
   {
      this.withFilterPlatform(Arrays.asList(value));
      return this;
   }

   public FilterGame withFilterPlatform(Collection<? extends String> value)
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

   public FilterGame withoutFilterPlatform(String value)
   {
      this.filterPlatform.removeAll(Collections.singleton(value));
      return this;
   }

   public FilterGame withoutFilterPlatform(String... value)
   {
      this.withoutFilterPlatform(Arrays.asList(value));
      return this;
   }

   public FilterGame withoutFilterPlatform(Collection<? extends String> value)
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
      result.append(' ').append(this.getFilterUniverse());
      result.append(' ').append(this.getFilterGenre());
      result.append(' ').append(this.getFilterPlatform());
      return result.substring(1);
   }
}
