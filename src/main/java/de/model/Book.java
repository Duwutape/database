package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

public class Book
extends Basic {
   public static final String PROPERTY_UNIVERSE = "universe";
   public static final String PROPERTY_AUTHOR = "author";
   public static final String PROPERTY_DATE = "date";
   private String universe;
   private List<String> author;
   private Date date;

   public String getUniverse()
   {
      return this.universe;
   }

   public Book setUniverse(String value)
   {
      this.universe = value;
      return this;
   }

   public List<String> getAuthor()
   {
      return this.author != null ? Collections.unmodifiableList(this.author) : Collections.emptyList();
   }

   public Book withAuthor(String value)
   {
      if (this.author == null)
      {
         this.author = new ArrayList<>();
      }
      this.author.add(value);
      return this;
   }

   public Book withAuthor(String... value)
   {
      this.withAuthor(Arrays.asList(value));
      return this;
   }

   public Book withAuthor(Collection<? extends String> value)
   {
      if (this.author == null)
      {
         this.author = new ArrayList<>(value);
      }
      else
      {
         this.author.addAll(value);
      }
      return this;
   }

   public Book withoutAuthor(String value)
   {
      this.author.removeAll(Collections.singleton(value));
      return this;
   }

   public Book withoutAuthor(String... value)
   {
      this.withoutAuthor(Arrays.asList(value));
      return this;
   }

   public Book withoutAuthor(Collection<? extends String> value)
   {
      if (this.author != null)
      {
         this.author.removeAll(value);
      }
      return this;
   }

   public Date getDate()
   {
      return this.date;
   }

   public Book setDate(Date value)
   {
      this.date = value;
      return this;
   }

   @Override
   public String toString()
   {
      final StringBuilder result = new StringBuilder(super.toString());
      result.append(' ').append(this.getUniverse());
      result.append(' ').append(this.getAuthor());
      return result.toString();
   }
}
