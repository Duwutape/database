package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.Collection;

public class Release
{
   public static final String PROPERTY_YEAR = "year";
   public static final String PROPERTY_PLATFORM = "platform";
   public static final String PROPERTY_NOTE = "note";
   private int year;
   private List<String> platform;
   private List<String> note;

   public int getYear()
   {
      return this.year;
   }

   public Release setYear(int value)
   {
      this.year = value;
      return this;
   }

   public List<String> getPlatform()
   {
      return this.platform != null ? Collections.unmodifiableList(this.platform) : Collections.emptyList();
   }

   public Release withPlatform(String value)
   {
      if (this.platform == null)
      {
         this.platform = new ArrayList<>();
      }
      this.platform.add(value);
      return this;
   }

   public Release withPlatform(String... value)
   {
      this.withPlatform(Arrays.asList(value));
      return this;
   }

   public Release withPlatform(Collection<? extends String> value)
   {
      if (this.platform == null)
      {
         this.platform = new ArrayList<>(value);
      }
      else
      {
         this.platform.addAll(value);
      }
      return this;
   }

   public Release withoutPlatform(String value)
   {
      this.platform.removeAll(Collections.singleton(value));
      return this;
   }

   public Release withoutPlatform(String... value)
   {
      this.withoutPlatform(Arrays.asList(value));
      return this;
   }

   public Release withoutPlatform(Collection<? extends String> value)
   {
      if (this.platform != null)
      {
         this.platform.removeAll(value);
      }
      return this;
   }

   public List<String> getNote()
   {
      return this.note != null ? Collections.unmodifiableList(this.note) : Collections.emptyList();
   }

   public Release withNote(String value)
   {
      if (this.note == null)
      {
         this.note = new ArrayList<>();
      }
      this.note.add(value);
      return this;
   }

   public Release withNote(String... value)
   {
      this.withNote(Arrays.asList(value));
      return this;
   }

   public Release withNote(Collection<? extends String> value)
   {
      if (this.note == null)
      {
         this.note = new ArrayList<>(value);
      }
      else
      {
         this.note.addAll(value);
      }
      return this;
   }

   public Release withoutNote(String value)
   {
      this.note.removeAll(Collections.singleton(value));
      return this;
   }

   public Release withoutNote(String... value)
   {
      this.withoutNote(Arrays.asList(value));
      return this;
   }

   public Release withoutNote(Collection<? extends String> value)
   {
      if (this.note != null)
      {
         this.note.removeAll(value);
      }
      return this;
   }

   @Override
   public String toString()
   {
      final StringBuilder result = new StringBuilder();
      result.append(' ').append(this.getPlatform());
      result.append(' ').append(this.getNote());
      return result.substring(1);
   }
}
