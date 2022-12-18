package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;

public class AllBook
{
   public static final String PROPERTY_BOOK_LIST = "bookList";
   private List<Book> bookList;

   public List<Book> getBookList()
   {
      return this.bookList != null ? Collections.unmodifiableList(this.bookList) : Collections.emptyList();
   }

   public AllBook withBookList(Book value)
   {
      if (this.bookList == null)
      {
         this.bookList = new ArrayList<>();
      }
      if (!this.bookList.contains(value))
      {
         this.bookList.add(value);
      }
      return this;
   }

   public AllBook withBookList(Book... value)
   {
      for (final Book item : value)
      {
         this.withBookList(item);
      }
      return this;
   }

   public AllBook withBookList(Collection<? extends Book> value)
   {
      for (final Book item : value)
      {
         this.withBookList(item);
      }
      return this;
   }

   public AllBook withoutBookList(Book value)
   {
      if (this.bookList != null)
      {
         this.bookList.remove(value);
      }
      return this;
   }

   public AllBook withoutBookList(Book... value)
   {
      for (final Book item : value)
      {
         this.withoutBookList(item);
      }
      return this;
   }

   public AllBook withoutBookList(Collection<? extends Book> value)
   {
      for (final Book item : value)
      {
         this.withoutBookList(item);
      }
      return this;
   }

   public void removeYou()
   {
      this.withoutBookList(new ArrayList<>(this.getBookList()));
   }
}
