package de.filter;

public class FilterBook extends FilterBasic
{
   public static final String PROPERTY_FILTER_UNIVERSE = "filterUniverse";
   public static final String PROPERTY_FILTER_AUTHOR = "filterAuthor";
   private String[] filterUniverse;
   private String[] filterAuthor;

   public String[] getFilterUniverse()
   {
      return this.filterUniverse;
   }

   public FilterBook setFilterUniverse(String[] value)
   {
      this.filterUniverse = value;
      return this;
   }

   public String[] getFilterAuthor()
   {
      return this.filterAuthor;
   }

   public FilterBook setFilterAuthor(String[] value)
   {
      this.filterAuthor = value;
      return this;
   }
}
