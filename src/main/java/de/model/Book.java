package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

public class Book
{
   public static final String PROPERTY_UNIVERSE = "universe";
   public static final String PROPERTY_AUTHOR = "author";
   public static final String PROPERTY_DATE = "date";
   public static final String PROPERTY_PREQUEL = "prequel";
   public static final String PROPERTY_SEQUEL = "sequel";
   public static final String PROPERTY_ALIAS = "alias";
   public static final String PROPERTY_NAME_OV = "nameOV";
   public static final String PROPERTY_NAME_GER = "nameGer";
   private String universe;
   private List<String> author;
   private Date date;
   private List<Book> prequel;
   private List<Book> sequel;
   private List<String> alias;
   private String nameOV;
   private String nameGer;

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

   public List<Book> getPrequel()
   {
      return this.prequel != null ? Collections.unmodifiableList(this.prequel) : Collections.emptyList();
   }

   public Book withPrequel(Book value)
   {
      if (this.prequel == null)
      {
         this.prequel = new ArrayList<>();
      }
      if (!this.prequel.contains(value))
      {
         this.prequel.add(value);
         value.withSequel(this);
      }
      return this;
   }

   public Book withPrequel(Book... value)
   {
      for (final Book item : value)
      {
         this.withPrequel(item);
      }
      return this;
   }

   public Book withPrequel(Collection<? extends Book> value)
   {
      for (final Book item : value)
      {
         this.withPrequel(item);
      }
      return this;
   }

   public Book withoutPrequel(Book value)
   {
      if (this.prequel != null && this.prequel.remove(value))
      {
         value.withoutSequel(this);
      }
      return this;
   }

   public Book withoutPrequel(Book... value)
   {
      for (final Book item : value)
      {
         this.withoutPrequel(item);
      }
      return this;
   }

   public Book withoutPrequel(Collection<? extends Book> value)
   {
      for (final Book item : value)
      {
         this.withoutPrequel(item);
      }
      return this;
   }

   public List<Book> getSequel()
   {
      return this.sequel != null ? Collections.unmodifiableList(this.sequel) : Collections.emptyList();
   }

   public Book withSequel(Book value)
   {
      if (this.sequel == null)
      {
         this.sequel = new ArrayList<>();
      }
      if (!this.sequel.contains(value))
      {
         this.sequel.add(value);
         value.withPrequel(this);
      }
      return this;
   }

   public Book withSequel(Book... value)
   {
      for (final Book item : value)
      {
         this.withSequel(item);
      }
      return this;
   }

   public Book withSequel(Collection<? extends Book> value)
   {
      for (final Book item : value)
      {
         this.withSequel(item);
      }
      return this;
   }

   public Book withoutSequel(Book value)
   {
      if (this.sequel != null && this.sequel.remove(value))
      {
         value.withoutPrequel(this);
      }
      return this;
   }

   public Book withoutSequel(Book... value)
   {
      for (final Book item : value)
      {
         this.withoutSequel(item);
      }
      return this;
   }

   public Book withoutSequel(Collection<? extends Book> value)
   {
      for (final Book item : value)
      {
         this.withoutSequel(item);
      }
      return this;
   }

   public List<String> getAlias()
   {
      return this.alias != null ? Collections.unmodifiableList(this.alias) : Collections.emptyList();
   }

   public Book withAlias(String value)
   {
      if (this.alias == null)
      {
         this.alias = new ArrayList<>();
      }
      this.alias.add(value);
      return this;
   }

   public Book withAlias(String... value)
   {
      this.withAlias(Arrays.asList(value));
      return this;
   }

   public Book withAlias(Collection<? extends String> value)
   {
      if (this.alias == null)
      {
         this.alias = new ArrayList<>(value);
      }
      else
      {
         this.alias.addAll(value);
      }
      return this;
   }

   public Book withoutAlias(String value)
   {
      this.alias.removeAll(Collections.singleton(value));
      return this;
   }

   public Book withoutAlias(String... value)
   {
      this.withoutAlias(Arrays.asList(value));
      return this;
   }

   public Book withoutAlias(Collection<? extends String> value)
   {
      if (this.alias != null)
      {
         this.alias.removeAll(value);
      }
      return this;
   }

   public String getNameOV()
   {
      return this.nameOV;
   }

   public Book setNameOV(String value)
   {
      this.nameOV = value;
      return this;
   }

   public String getNameGer()
   {
      return this.nameGer;
   }

   public Book setNameGer(String value)
   {
      this.nameGer = value;
      return this;
   }

   @Override
   public String toString()
   {
      final StringBuilder result = new StringBuilder();
      result.append(' ').append(this.getAlias());
      result.append(' ').append(this.getNameOV());
      result.append(' ').append(this.getNameGer());
      result.append(' ').append(this.getUniverse());
      result.append(' ').append(this.getAuthor());
      return result.substring(1);
   }

   public void removeYou()
   {
      this.withoutPrequel(new ArrayList<>(this.getPrequel()));
      this.withoutSequel(new ArrayList<>(this.getSequel()));
   }
}
