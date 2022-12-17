package de.filter;

public class FilterSeries extends FilterBasic
{
   public static final String PROPERTY_FILTER_LANGUAGE = "filterLanguage";
   public static final String PROPERTY_FILTER_PLATFORM = "filterPlatform";
   private String[] filterLanguage;
   private String[] filterPlatform;

   public String[] getFilterLanguage()
   {
      return this.filterLanguage;
   }

   public FilterSeries setFilterLanguage(String[] value)
   {
      this.filterLanguage = value;
      return this;
   }

   public String[] getFilterPlatform()
   {
      return this.filterPlatform;
   }

   public FilterSeries setFilterPlatform(String[] value)
   {
      this.filterPlatform = value;
      return this;
   }
}
