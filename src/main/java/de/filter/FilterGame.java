package de.filter;

public class FilterGame extends FilterBasic
{
   public static final String PROPERTY_FILTER_UNIVERSE = "filterUniverse";
   private String[] filterUniverse;

   public String[] getFilterUniverse()
   {
      return this.filterUniverse;
   }

   public FilterGame setFilterUniverse(String[] value)
   {
      this.filterUniverse = value;
      return this;
   }
}
