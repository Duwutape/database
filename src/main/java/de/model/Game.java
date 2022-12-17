package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;

public class Game
extends Basic {
   public static final String PROPERTY_UNIVERSE = "universe";
   public static final String PROPERTY_PREQUEL = "prequel";
   public static final String PROPERTY_SEQUEL = "sequel";
   public static final String PROPERTY_PUBLISHED = "published";
   private String universe;
   private List<Game> prequel;
   private List<Game> sequel;
   private List<Release> published;

   public String getUniverse()
   {
      return this.universe;
   }

   public Game setUniverse(String value)
   {
      this.universe = value;
      return this;
   }

   public List<Game> getPrequel()
   {
      return this.prequel != null ? Collections.unmodifiableList(this.prequel) : Collections.emptyList();
   }

   public Game withPrequel(Game value)
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

   public Game withPrequel(Game... value)
   {
      for (final Game item : value)
      {
         this.withPrequel(item);
      }
      return this;
   }

   public Game withPrequel(Collection<? extends Game> value)
   {
      for (final Game item : value)
      {
         this.withPrequel(item);
      }
      return this;
   }

   public Game withoutPrequel(Game value)
   {
      if (this.prequel != null && this.prequel.remove(value))
      {
         value.withoutSequel(this);
      }
      return this;
   }

   public Game withoutPrequel(Game... value)
   {
      for (final Game item : value)
      {
         this.withoutPrequel(item);
      }
      return this;
   }

   public Game withoutPrequel(Collection<? extends Game> value)
   {
      for (final Game item : value)
      {
         this.withoutPrequel(item);
      }
      return this;
   }

   public List<Game> getSequel()
   {
      return this.sequel != null ? Collections.unmodifiableList(this.sequel) : Collections.emptyList();
   }

   public Game withSequel(Game value)
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

   public Game withSequel(Game... value)
   {
      for (final Game item : value)
      {
         this.withSequel(item);
      }
      return this;
   }

   public Game withSequel(Collection<? extends Game> value)
   {
      for (final Game item : value)
      {
         this.withSequel(item);
      }
      return this;
   }

   public Game withoutSequel(Game value)
   {
      if (this.sequel != null && this.sequel.remove(value))
      {
         value.withoutPrequel(this);
      }
      return this;
   }

   public Game withoutSequel(Game... value)
   {
      for (final Game item : value)
      {
         this.withoutSequel(item);
      }
      return this;
   }

   public Game withoutSequel(Collection<? extends Game> value)
   {
      for (final Game item : value)
      {
         this.withoutSequel(item);
      }
      return this;
   }

   public List<Release> getPublished()
   {
      return this.published != null ? Collections.unmodifiableList(this.published) : Collections.emptyList();
   }

   public Game withPublished(Release value)
   {
      if (this.published == null)
      {
         this.published = new ArrayList<>();
      }
      if (!this.published.contains(value))
      {
         this.published.add(value);
      }
      return this;
   }

   public Game withPublished(Release... value)
   {
      for (final Release item : value)
      {
         this.withPublished(item);
      }
      return this;
   }

   public Game withPublished(Collection<? extends Release> value)
   {
      for (final Release item : value)
      {
         this.withPublished(item);
      }
      return this;
   }

   public Game withoutPublished(Release value)
   {
      if (this.published != null)
      {
         this.published.remove(value);
      }
      return this;
   }

   public Game withoutPublished(Release... value)
   {
      for (final Release item : value)
      {
         this.withoutPublished(item);
      }
      return this;
   }

   public Game withoutPublished(Collection<? extends Release> value)
   {
      for (final Release item : value)
      {
         this.withoutPublished(item);
      }
      return this;
   }

   @Override
   public String toString()
   {
      final StringBuilder result = new StringBuilder(super.toString());
      result.append(' ').append(this.getUniverse());
      return result.toString();
   }

   public void removeYou()
   {
      this.withoutPrequel(new ArrayList<>(this.getPrequel()));
      this.withoutSequel(new ArrayList<>(this.getSequel()));
      this.withoutPublished(new ArrayList<>(this.getPublished()));
   }
}
