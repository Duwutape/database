package de.filter;

public class FilterBasic
{
   public static final String PROPERTY_FILTER_YEAR = "filterYear";
   public static final String PROPERTY_FILTER_FSK = "filterFsk";
   public static final String PROPERTY_FILTER_GENRE = "filterGenre";
   private String[] filterYear;
   private String[] filterFsk;
   private String[] filterGenre;

   public String[] getFilterYear()
   {
      return this.filterYear;
   }

   public FilterBasic setFilterYear(String[] value)
   {
      this.filterYear = value;
      return this;
   }

   public String[] getFilterFsk()
   {
      return this.filterFsk;
   }

   public FilterBasic setFilterFsk(String[] value)
   {
      this.filterFsk = value;
      return this;
   }

   public String[] getFilterGenre()
   {
      return this.filterGenre;
   }

   public FilterBasic setFilterGenre(String[] value)
   {
      this.filterGenre = value;
      return this;
   }
}
