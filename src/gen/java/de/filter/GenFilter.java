package de.filter;

import de.model.GenModel;
import org.fulib.builder.ClassModelDecorator;
import org.fulib.builder.ClassModelManager;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class GenFilter implements ClassModelDecorator {

    class FilterType {
        ArrayList<String> filter;
    }

    class FilterSeries {
        ArrayList<String> filterLanguage;
        ArrayList<String> filterGenre;
        ArrayList<Integer> filterYear;
        ArrayList<Integer> filterFsk;
        ArrayList<String> filterPlatform;
    }

    class FilterAnime {
        ArrayList<Integer> filterYear;
        ArrayList<Integer> filterFsk;
        ArrayList<String> filterGenre;
    }

    class FilterMovie {
        ArrayList<String> filterUniverse;
        ArrayList<Integer> filterYear;
        ArrayList<Integer> filterFsk;
    }

    class FilterGame {
        ArrayList<String> filterUniverse;
        ArrayList<Integer> filterUsk;
        ArrayList<String> filterGenre;
        ArrayList<Integer> filterYear;
        ArrayList<String> filterPlatform;
    }

    class FilterBook {
        ArrayList<String> filterUniverse;
        ArrayList<String> filterAuthor;
        ArrayList<Integer> filterYear;
    }

    @Override
    public void decorate(ClassModelManager mm) {
        mm.getClassModel().setDefaultPropertyStyle(org.fulib.builder.Type.POJO);
        mm.haveNestedClasses(GenFilter.class);
    }
}
