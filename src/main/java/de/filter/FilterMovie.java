package de.filter;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.Collection;

public class FilterMovie {
   public static final String PROPERTY_FILTER_UNIVERSE = "filterUniverse";
   public static final String PROPERTY_FILTER_YEAR = "filterYear";
   public static final String PROPERTY_FILTER_FSK = "filterFsk";
   private List<String> filterUniverse;
   private List<Integer> filterYear;
   private List<Integer> filterFsk;

   public List<String> getFilterUniverse()
   {
      return this.filterUniverse != null ? Collections.unmodifiableList(this.filterUniverse) : Collections.emptyList();
   }

   public FilterMovie withFilterUniverse(String value)
   {
      if (this.filterUniverse == null)
      {
         this.filterUniverse = new ArrayList<>();
      }
      this.filterUniverse.add(value);
      return this;
   }

   public FilterMovie withFilterUniverse(String... value)
   {
      this.withFilterUniverse(Arrays.asList(value));
      return this;
   }

   public FilterMovie withFilterUniverse(Collection<? extends String> value)
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

   public FilterMovie withoutFilterUniverse(String value)
   {
      this.filterUniverse.removeAll(Collections.singleton(value));
      return this;
   }

   public FilterMovie withoutFilterUniverse(String... value)
   {
      this.withoutFilterUniverse(Arrays.asList(value));
      return this;
   }

   public FilterMovie withoutFilterUniverse(Collection<? extends String> value)
   {
      if (this.filterUniverse != null)
      {
         this.filterUniverse.removeAll(value);
      }
      return this;
   }

   public List<Integer> getFilterYear()
   {
      return this.filterYear != null ? Collections.unmodifiableList(this.filterYear) : Collections.emptyList();
   }

   public FilterMovie withFilterYear(Integer value)
   {
      if (this.filterYear == null)
      {
         this.filterYear = new ArrayList<>();
      }
      this.filterYear.add(value);
      return this;
   }

   public FilterMovie withFilterYear(Integer... value)
   {
      this.withFilterYear(Arrays.asList(value));
      return this;
   }

   public FilterMovie withFilterYear(Collection<? extends Integer> value)
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

   public FilterMovie withoutFilterYear(Integer value)
   {
      this.filterYear.removeAll(Collections.singleton(value));
      return this;
   }

   public FilterMovie withoutFilterYear(Integer... value)
   {
      this.withoutFilterYear(Arrays.asList(value));
      return this;
   }

   public FilterMovie withoutFilterYear(Collection<? extends Integer> value)
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

   public FilterMovie withFilterFsk(Integer value)
   {
      if (this.filterFsk == null)
      {
         this.filterFsk = new ArrayList<>();
      }
      this.filterFsk.add(value);
      return this;
   }

   public FilterMovie withFilterFsk(Integer... value)
   {
      this.withFilterFsk(Arrays.asList(value));
      return this;
   }

   public FilterMovie withFilterFsk(Collection<? extends Integer> value)
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

   public FilterMovie withoutFilterFsk(Integer value)
   {
      this.filterFsk.removeAll(Collections.singleton(value));
      return this;
   }

   public FilterMovie withoutFilterFsk(Integer... value)
   {
      this.withoutFilterFsk(Arrays.asList(value));
      return this;
   }

   public FilterMovie withoutFilterFsk(Collection<? extends Integer> value)
   {
      if (this.filterFsk != null)
      {
         this.filterFsk.removeAll(value);
      }
      return this;
   }

   @Override
   public String toString()
   {
      final StringBuilder result = new StringBuilder();
      result.append(' ').append(this.getFilterUniverse());
      return result.substring(1);
   }
}
