package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;

public class AllGame
{
   public static final String PROPERTY_GAME_LIST = "gameList";
   private List<Game> gameList;

   public List<Game> getGameList()
   {
      return this.gameList != null ? Collections.unmodifiableList(this.gameList) : Collections.emptyList();
   }

   public AllGame withGameList(Game value)
   {
      if (this.gameList == null)
      {
         this.gameList = new ArrayList<>();
      }
      if (!this.gameList.contains(value))
      {
         this.gameList.add(value);
      }
      return this;
   }

   public AllGame withGameList(Game... value)
   {
      for (final Game item : value)
      {
         this.withGameList(item);
      }
      return this;
   }

   public AllGame withGameList(Collection<? extends Game> value)
   {
      for (final Game item : value)
      {
         this.withGameList(item);
      }
      return this;
   }

   public AllGame withoutGameList(Game value)
   {
      if (this.gameList != null)
      {
         this.gameList.remove(value);
      }
      return this;
   }

   public AllGame withoutGameList(Game... value)
   {
      for (final Game item : value)
      {
         this.withoutGameList(item);
      }
      return this;
   }

   public AllGame withoutGameList(Collection<? extends Game> value)
   {
      for (final Game item : value)
      {
         this.withoutGameList(item);
      }
      return this;
   }

   public void removeYou()
   {
      this.withoutGameList(new ArrayList<>(this.getGameList()));
   }
}
