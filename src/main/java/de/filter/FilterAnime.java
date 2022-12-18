package de.filter;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.Collection;

public class FilterAnime {
   public static final String PROPERTY_FILTER_YEAR = "filterYear";
   public static final String PROPERTY_FILTER_FSK = "filterFsk";
   public static final String PROPERTY_FILTER_GENRE = "filterGenre";
   private List<Integer> filterYear;
   private List<Integer> filterFsk;
   private List<String> filterGenre;

   public List<Integer> getFilterYear()
   {
      return this.filterYear != null ? Collections.unmodifiableList(this.filterYear) : Collections.emptyList();
   }

   public FilterAnime withFilterYear(Integer value)
   {
      if (this.filterYear == null)
      {
         this.filterYear = new ArrayList<>();
      }
      this.filterYear.add(value);
      return this;
   }

   public FilterAnime withFilterYear(Integer... value)
   {
      this.withFilterYear(Arrays.asList(value));
      return this;
   }

   public FilterAnime withFilterYear(Collection<? extends Integer> value)
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

   public FilterAnime withoutFilterYear(Integer value)
   {
      this.filterYear.removeAll(Collections.singleton(value));
      return this;
   }

   public FilterAnime withoutFilterYear(Integer... value)
   {
      this.withoutFilterYear(Arrays.asList(value));
      return this;
   }

   public FilterAnime withoutFilterYear(Collection<? extends Integer> value)
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

   public FilterAnime withFilterFsk(Integer value)
   {
      if (this.filterFsk == null)
      {
         this.filterFsk = new ArrayList<>();
      }
      this.filterFsk.add(value);
      return this;
   }

   public FilterAnime withFilterFsk(Integer... value)
   {
      this.withFilterFsk(Arrays.asList(value));
      return this;
   }

   public FilterAnime withFilterFsk(Collection<? extends Integer> value)
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

   public FilterAnime withoutFilterFsk(Integer value)
   {
      this.filterFsk.removeAll(Collections.singleton(value));
      return this;
   }

   public FilterAnime withoutFilterFsk(Integer... value)
   {
      this.withoutFilterFsk(Arrays.asList(value));
      return this;
   }

   public FilterAnime withoutFilterFsk(Collection<? extends Integer> value)
   {
      if (this.filterFsk != null)
      {
         this.filterFsk.removeAll(value);
      }
      return this;
   }

   public List<String> getFilterGenre()
   {
      return this.filterGenre != null ? Collections.unmodifiableList(this.filterGenre) : Collections.emptyList();
   }

   public FilterAnime withFilterGenre(String value)
   {
      if (this.filterGenre == null)
      {
         this.filterGenre = new ArrayList<>();
      }
      this.filterGenre.add(value);
      return this;
   }

   public FilterAnime withFilterGenre(String... value)
   {
      this.withFilterGenre(Arrays.asList(value));
      return this;
   }

   public FilterAnime withFilterGenre(Collection<? extends String> value)
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

   public FilterAnime withoutFilterGenre(String value)
   {
      this.filterGenre.removeAll(Collections.singleton(value));
      return this;
   }

   public FilterAnime withoutFilterGenre(String... value)
   {
      this.withoutFilterGenre(Arrays.asList(value));
      return this;
   }

   public FilterAnime withoutFilterGenre(Collection<? extends String> value)
   {
      if (this.filterGenre != null)
      {
         this.filterGenre.removeAll(value);
      }
      return this;
   }

   @Override
   public String toString()
   {
      final StringBuilder result = new StringBuilder();
      result.append(' ').append(this.getFilterGenre());
      return result.substring(1);
   }
}
