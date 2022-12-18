package de.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;

public class AllAnime
{
   public static final String PROPERTY_ANIME_LIST = "animeList";
   private List<Anime> animeList;

   public List<Anime> getAnimeList()
   {
      return this.animeList != null ? Collections.unmodifiableList(this.animeList) : Collections.emptyList();
   }

   public AllAnime withAnimeList(Anime value)
   {
      if (this.animeList == null)
      {
         this.animeList = new ArrayList<>();
      }
      if (!this.animeList.contains(value))
      {
         this.animeList.add(value);
      }
      return this;
   }

   public AllAnime withAnimeList(Anime... value)
   {
      for (final Anime item : value)
      {
         this.withAnimeList(item);
      }
      return this;
   }

   public AllAnime withAnimeList(Collection<? extends Anime> value)
   {
      for (final Anime item : value)
      {
         this.withAnimeList(item);
      }
      return this;
   }

   public AllAnime withoutAnimeList(Anime value)
   {
      if (this.animeList != null)
      {
         this.animeList.remove(value);
      }
      return this;
   }

   public AllAnime withoutAnimeList(Anime... value)
   {
      for (final Anime item : value)
      {
         this.withoutAnimeList(item);
      }
      return this;
   }

   public AllAnime withoutAnimeList(Collection<? extends Anime> value)
   {
      for (final Anime item : value)
      {
         this.withoutAnimeList(item);
      }
      return this;
   }

   public void removeYou()
   {
      this.withoutAnimeList(new ArrayList<>(this.getAnimeList()));
   }
}
