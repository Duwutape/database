package de.filter;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.Collection;

public class FilterBook {
   public static final String PROPERTY_FILTER_UNIVERSE = "filterUniverse";
   public static final String PROPERTY_FILTER_AUTHOR = "filterAuthor";
   public static final String PROPERTY_FILTER_YEAR = "filterYear";
   private List<String> filterUniverse;
   private List<String> filterAuthor;
   private List<Integer> filterYear;

   public List<String> getFilterUniverse()
   {
      return this.filterUniverse != null ? Collections.unmodifiableList(this.filterUniverse) : Collections.emptyList();
   }

   public FilterBook withFilterUniverse(String value)
   {
      if (this.filterUniverse == null)
      {
         this.filterUniverse = new ArrayList<>();
      }
      this.filterUniverse.add(value);
      return this;
   }

   public FilterBook withFilterUniverse(String... value)
   {
      this.withFilterUniverse(Arrays.asList(value));
      return this;
   }

   public FilterBook withFilterUniverse(Collection<? extends String> value)
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

   public FilterBook withoutFilterUniverse(String value)
   {
      this.filterUniverse.removeAll(Collections.singleton(value));
      return this;
   }

   public FilterBook withoutFilterUniverse(String... value)
   {
      this.withoutFilterUniverse(Arrays.asList(value));
      return this;
   }

   public FilterBook withoutFilterUniverse(Collection<? extends String> value)
   {
      if (this.filterUniverse != null)
      {
         this.filterUniverse.removeAll(value);
      }
      return this;
   }

   public List<String> getFilterAuthor()
   {
      return this.filterAuthor != null ? Collections.unmodifiableList(this.filterAuthor) : Collections.emptyList();
   }

   public FilterBook withFilterAuthor(String value)
   {
      if (this.filterAuthor == null)
      {
         this.filterAuthor = new ArrayList<>();
      }
      this.filterAuthor.add(value);
      return this;
   }

   public FilterBook withFilterAuthor(String... value)
   {
      this.withFilterAuthor(Arrays.asList(value));
      return this;
   }

   public FilterBook withFilterAuthor(Collection<? extends String> value)
   {
      if (this.filterAuthor == null)
      {
         this.filterAuthor = new ArrayList<>(value);
      }
      else
      {
         this.filterAuthor.addAll(value);
      }
      return this;
   }

   public FilterBook withoutFilterAuthor(String value)
   {
      this.filterAuthor.removeAll(Collections.singleton(value));
      return this;
   }

   public FilterBook withoutFilterAuthor(String... value)
   {
      this.withoutFilterAuthor(Arrays.asList(value));
      return this;
   }

   public FilterBook withoutFilterAuthor(Collection<? extends String> value)
   {
      if (this.filterAuthor != null)
      {
         this.filterAuthor.removeAll(value);
      }
      return this;
   }

   public List<Integer> getFilterYear()
   {
      return this.filterYear != null ? Collections.unmodifiableList(this.filterYear) : Collections.emptyList();
   }

   public FilterBook withFilterYear(Integer value)
   {
      if (this.filterYear == null)
      {
         this.filterYear = new ArrayList<>();
      }
      this.filterYear.add(value);
      return this;
   }

   public FilterBook withFilterYear(Integer... value)
   {
      this.withFilterYear(Arrays.asList(value));
      return this;
   }

   public FilterBook withFilterYear(Collection<? extends Integer> value)
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

   public FilterBook withoutFilterYear(Integer value)
   {
      this.filterYear.removeAll(Collections.singleton(value));
      return this;
   }

   public FilterBook withoutFilterYear(Integer... value)
   {
      this.withoutFilterYear(Arrays.asList(value));
      return this;
   }

   public FilterBook withoutFilterYear(Collection<? extends Integer> value)
   {
      if (this.filterYear != null)
      {
         this.filterYear.removeAll(value);
      }
      return this;
   }

   @Override
   public String toString()
   {
      final StringBuilder result = new StringBuilder();
      result.append(' ').append(this.getFilterUniverse());
      result.append(' ').append(this.getFilterAuthor());
      return result.substring(1);
   }
}
