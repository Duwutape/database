package de.filter;

public class FilterMovie extends FilterBasic
{
   public static final String PROPERTY_FILTER_UNIVERSE = "filterUniverse";
   private String[] filterUniverse;

   public String[] getFilterUniverse()
   {
      return this.filterUniverse;
   }

   public FilterMovie setFilterUniverse(String[] value)
   {
      this.filterUniverse = value;
      return this;
   }
}
