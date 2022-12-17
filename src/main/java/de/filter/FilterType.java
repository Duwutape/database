package de.filter;

public class FilterType
{
   public static final String PROPERTY_FILTER = "filter";
   private String[] filter;

   public String[] getFilter()
   {
      return this.filter;
   }

   public FilterType setFilter(String[] value)
   {
      this.filter = value;
      return this;
   }
}
