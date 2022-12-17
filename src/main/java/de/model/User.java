package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;

public class User
{
   public static final String PROPERTY_COMPLETED = "completed";
   public static final String PROPERTY_CURRENTLY = "currently";
   public static final String PROPERTY_HOLD = "hold";
   public static final String PROPERTY_UNSURE = "unsure";
   public static final String PROPERTY_DROPPED = "dropped";
   private List<Watchlist> completed;
   private List<Watchlist> currently;
   private List<Watchlist> hold;
   private List<Watchlist> unsure;
   private List<Watchlist> dropped;

   public List<Watchlist> getCompleted()
   {
      return this.completed != null ? Collections.unmodifiableList(this.completed) : Collections.emptyList();
   }

   public User withCompleted(Watchlist value)
   {
      if (this.completed == null)
      {
         this.completed = new ArrayList<>();
      }
      if (!this.completed.contains(value))
      {
         this.completed.add(value);
      }
      return this;
   }

   public User withCompleted(Watchlist... value)
   {
      for (final Watchlist item : value)
      {
         this.withCompleted(item);
      }
      return this;
   }

   public User withCompleted(Collection<? extends Watchlist> value)
   {
      for (final Watchlist item : value)
      {
         this.withCompleted(item);
      }
      return this;
   }

   public User withoutCompleted(Watchlist value)
   {
      if (this.completed != null)
      {
         this.completed.remove(value);
      }
      return this;
   }

   public User withoutCompleted(Watchlist... value)
   {
      for (final Watchlist item : value)
      {
         this.withoutCompleted(item);
      }
      return this;
   }

   public User withoutCompleted(Collection<? extends Watchlist> value)
   {
      for (final Watchlist item : value)
      {
         this.withoutCompleted(item);
      }
      return this;
   }

   public List<Watchlist> getCurrently()
   {
      return this.currently != null ? Collections.unmodifiableList(this.currently) : Collections.emptyList();
   }

   public User withCurrently(Watchlist value)
   {
      if (this.currently == null)
      {
         this.currently = new ArrayList<>();
      }
      if (!this.currently.contains(value))
      {
         this.currently.add(value);
      }
      return this;
   }

   public User withCurrently(Watchlist... value)
   {
      for (final Watchlist item : value)
      {
         this.withCurrently(item);
      }
      return this;
   }

   public User withCurrently(Collection<? extends Watchlist> value)
   {
      for (final Watchlist item : value)
      {
         this.withCurrently(item);
      }
      return this;
   }

   public User withoutCurrently(Watchlist value)
   {
      if (this.currently != null)
      {
         this.currently.remove(value);
      }
      return this;
   }

   public User withoutCurrently(Watchlist... value)
   {
      for (final Watchlist item : value)
      {
         this.withoutCurrently(item);
      }
      return this;
   }

   public User withoutCurrently(Collection<? extends Watchlist> value)
   {
      for (final Watchlist item : value)
      {
         this.withoutCurrently(item);
      }
      return this;
   }

   public List<Watchlist> getHold()
   {
      return this.hold != null ? Collections.unmodifiableList(this.hold) : Collections.emptyList();
   }

   public User withHold(Watchlist value)
   {
      if (this.hold == null)
      {
         this.hold = new ArrayList<>();
      }
      if (!this.hold.contains(value))
      {
         this.hold.add(value);
      }
      return this;
   }

   public User withHold(Watchlist... value)
   {
      for (final Watchlist item : value)
      {
         this.withHold(item);
      }
      return this;
   }

   public User withHold(Collection<? extends Watchlist> value)
   {
      for (final Watchlist item : value)
      {
         this.withHold(item);
      }
      return this;
   }

   public User withoutHold(Watchlist value)
   {
      if (this.hold != null)
      {
         this.hold.remove(value);
      }
      return this;
   }

   public User withoutHold(Watchlist... value)
   {
      for (final Watchlist item : value)
      {
         this.withoutHold(item);
      }
      return this;
   }

   public User withoutHold(Collection<? extends Watchlist> value)
   {
      for (final Watchlist item : value)
      {
         this.withoutHold(item);
      }
      return this;
   }

   public List<Watchlist> getUnsure()
   {
      return this.unsure != null ? Collections.unmodifiableList(this.unsure) : Collections.emptyList();
   }

   public User withUnsure(Watchlist value)
   {
      if (this.unsure == null)
      {
         this.unsure = new ArrayList<>();
      }
      if (!this.unsure.contains(value))
      {
         this.unsure.add(value);
      }
      return this;
   }

   public User withUnsure(Watchlist... value)
   {
      for (final Watchlist item : value)
      {
         this.withUnsure(item);
      }
      return this;
   }

   public User withUnsure(Collection<? extends Watchlist> value)
   {
      for (final Watchlist item : value)
      {
         this.withUnsure(item);
      }
      return this;
   }

   public User withoutUnsure(Watchlist value)
   {
      if (this.unsure != null)
      {
         this.unsure.remove(value);
      }
      return this;
   }

   public User withoutUnsure(Watchlist... value)
   {
      for (final Watchlist item : value)
      {
         this.withoutUnsure(item);
      }
      return this;
   }

   public User withoutUnsure(Collection<? extends Watchlist> value)
   {
      for (final Watchlist item : value)
      {
         this.withoutUnsure(item);
      }
      return this;
   }

   public List<Watchlist> getDropped()
   {
      return this.dropped != null ? Collections.unmodifiableList(this.dropped) : Collections.emptyList();
   }

   public User withDropped(Watchlist value)
   {
      if (this.dropped == null)
      {
         this.dropped = new ArrayList<>();
      }
      if (!this.dropped.contains(value))
      {
         this.dropped.add(value);
      }
      return this;
   }

   public User withDropped(Watchlist... value)
   {
      for (final Watchlist item : value)
      {
         this.withDropped(item);
      }
      return this;
   }

   public User withDropped(Collection<? extends Watchlist> value)
   {
      for (final Watchlist item : value)
      {
         this.withDropped(item);
      }
      return this;
   }

   public User withoutDropped(Watchlist value)
   {
      if (this.dropped != null)
      {
         this.dropped.remove(value);
      }
      return this;
   }

   public User withoutDropped(Watchlist... value)
   {
      for (final Watchlist item : value)
      {
         this.withoutDropped(item);
      }
      return this;
   }

   public User withoutDropped(Collection<? extends Watchlist> value)
   {
      for (final Watchlist item : value)
      {
         this.withoutDropped(item);
      }
      return this;
   }

   public void removeYou()
   {
      this.withoutCompleted(new ArrayList<>(this.getCompleted()));
      this.withoutCurrently(new ArrayList<>(this.getCurrently()));
      this.withoutHold(new ArrayList<>(this.getHold()));
      this.withoutUnsure(new ArrayList<>(this.getUnsure()));
      this.withoutDropped(new ArrayList<>(this.getDropped()));
   }
}
