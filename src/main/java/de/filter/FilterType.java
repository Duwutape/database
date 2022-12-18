package de.filter;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.Collection;

public class FilterType
{
   public static final String PROPERTY_FILTER = "filter";
   private List<String> filter;

   public List<String> getFilter()
   {
      return this.filter != null ? Collections.unmodifiableList(this.filter) : Collections.emptyList();
   }

   public FilterType withFilter(String value)
   {
      if (this.filter == null)
      {
         this.filter = new ArrayList<>();
      }
      this.filter.add(value);
      return this;
   }

   public FilterType withFilter(String... value)
   {
      this.withFilter(Arrays.asList(value));
      return this;
   }

   public FilterType withFilter(Collection<? extends String> value)
   {
      if (this.filter == null)
      {
         this.filter = new ArrayList<>(value);
      }
      else
      {
         this.filter.addAll(value);
      }
      return this;
   }

   public FilterType withoutFilter(String value)
   {
      this.filter.removeAll(Collections.singleton(value));
      return this;
   }

   public FilterType withoutFilter(String... value)
   {
      this.withoutFilter(Arrays.asList(value));
      return this;
   }

   public FilterType withoutFilter(Collection<? extends String> value)
   {
      if (this.filter != null)
      {
         this.filter.removeAll(value);
      }
      return this;
   }

   @Override
   public String toString()
   {
      final StringBuilder result = new StringBuilder();
      result.append(' ').append(this.getFilter());
      return result.substring(1);
   }
}
