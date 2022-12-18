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
   private List<WatchlistCom> completed;
   private List<WatchlistCurr> currently;
   private List<WatchlistHold> hold;
   private List<WatchlistUnsure> unsure;
   private List<WatchlistDrop> dropped;

   public List<WatchlistCom> getCompleted()
   {
      return this.completed != null ? Collections.unmodifiableList(this.completed) : Collections.emptyList();
   }

   public User withCompleted(WatchlistCom value)
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

   public User withCompleted(WatchlistCom... value)
   {
      for (final WatchlistCom item : value)
      {
         this.withCompleted(item);
      }
      return this;
   }

   public User withCompleted(Collection<? extends WatchlistCom> value)
   {
      for (final WatchlistCom item : value)
      {
         this.withCompleted(item);
      }
      return this;
   }

   public User withoutCompleted(WatchlistCom value)
   {
      if (this.completed != null)
      {
         this.completed.remove(value);
      }
      return this;
   }

   public User withoutCompleted(WatchlistCom... value)
   {
      for (final WatchlistCom item : value)
      {
         this.withoutCompleted(item);
      }
      return this;
   }

   public User withoutCompleted(Collection<? extends WatchlistCom> value)
   {
      for (final WatchlistCom item : value)
      {
         this.withoutCompleted(item);
      }
      return this;
   }

   public List<WatchlistCurr> getCurrently()
   {
      return this.currently != null ? Collections.unmodifiableList(this.currently) : Collections.emptyList();
   }

   public User withCurrently(WatchlistCurr value)
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

   public User withCurrently(WatchlistCurr... value)
   {
      for (final WatchlistCurr item : value)
      {
         this.withCurrently(item);
      }
      return this;
   }

   public User withCurrently(Collection<? extends WatchlistCurr> value)
   {
      for (final WatchlistCurr item : value)
      {
         this.withCurrently(item);
      }
      return this;
   }

   public User withoutCurrently(WatchlistCurr value)
   {
      if (this.currently != null)
      {
         this.currently.remove(value);
      }
      return this;
   }

   public User withoutCurrently(WatchlistCurr... value)
   {
      for (final WatchlistCurr item : value)
      {
         this.withoutCurrently(item);
      }
      return this;
   }

   public User withoutCurrently(Collection<? extends WatchlistCurr> value)
   {
      for (final WatchlistCurr item : value)
      {
         this.withoutCurrently(item);
      }
      return this;
   }

   public List<WatchlistHold> getHold()
   {
      return this.hold != null ? Collections.unmodifiableList(this.hold) : Collections.emptyList();
   }

   public User withHold(WatchlistHold value)
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

   public User withHold(WatchlistHold... value)
   {
      for (final WatchlistHold item : value)
      {
         this.withHold(item);
      }
      return this;
   }

   public User withHold(Collection<? extends WatchlistHold> value)
   {
      for (final WatchlistHold item : value)
      {
         this.withHold(item);
      }
      return this;
   }

   public User withoutHold(WatchlistHold value)
   {
      if (this.hold != null)
      {
         this.hold.remove(value);
      }
      return this;
   }

   public User withoutHold(WatchlistHold... value)
   {
      for (final WatchlistHold item : value)
      {
         this.withoutHold(item);
      }
      return this;
   }

   public User withoutHold(Collection<? extends WatchlistHold> value)
   {
      for (final WatchlistHold item : value)
      {
         this.withoutHold(item);
      }
      return this;
   }

   public List<WatchlistUnsure> getUnsure()
   {
      return this.unsure != null ? Collections.unmodifiableList(this.unsure) : Collections.emptyList();
   }

   public User withUnsure(WatchlistUnsure value)
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

   public User withUnsure(WatchlistUnsure... value)
   {
      for (final WatchlistUnsure item : value)
      {
         this.withUnsure(item);
      }
      return this;
   }

   public User withUnsure(Collection<? extends WatchlistUnsure> value)
   {
      for (final WatchlistUnsure item : value)
      {
         this.withUnsure(item);
      }
      return this;
   }

   public User withoutUnsure(WatchlistUnsure value)
   {
      if (this.unsure != null)
      {
         this.unsure.remove(value);
      }
      return this;
   }

   public User withoutUnsure(WatchlistUnsure... value)
   {
      for (final WatchlistUnsure item : value)
      {
         this.withoutUnsure(item);
      }
      return this;
   }

   public User withoutUnsure(Collection<? extends WatchlistUnsure> value)
   {
      for (final WatchlistUnsure item : value)
      {
         this.withoutUnsure(item);
      }
      return this;
   }

   public List<WatchlistDrop> getDropped()
   {
      return this.dropped != null ? Collections.unmodifiableList(this.dropped) : Collections.emptyList();
   }

   public User withDropped(WatchlistDrop value)
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

   public User withDropped(WatchlistDrop... value)
   {
      for (final WatchlistDrop item : value)
      {
         this.withDropped(item);
      }
      return this;
   }

   public User withDropped(Collection<? extends WatchlistDrop> value)
   {
      for (final WatchlistDrop item : value)
      {
         this.withDropped(item);
      }
      return this;
   }

   public User withoutDropped(WatchlistDrop value)
   {
      if (this.dropped != null)
      {
         this.dropped.remove(value);
      }
      return this;
   }

   public User withoutDropped(WatchlistDrop... value)
   {
      for (final WatchlistDrop item : value)
      {
         this.withoutDropped(item);
      }
      return this;
   }

   public User withoutDropped(Collection<? extends WatchlistDrop> value)
   {
      for (final WatchlistDrop item : value)
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
