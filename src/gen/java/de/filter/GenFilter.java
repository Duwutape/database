package de.filter;

import de.model.GenModel;
import org.fulib.builder.ClassModelDecorator;
import org.fulib.builder.ClassModelManager;

@SuppressWarnings("unused")
public class GenFilter implements ClassModelDecorator {

    class FilterType {
        String[] filter;
    }

    class FilterBasic {
        String[] filterYear;
        String[] filterFsk;
        String[] filterGenre;
    }

    class FilterSeries extends FilterBasic {
        String[] filterLanguage;
        String[] filterPlatform;
    }

    class FilterAnime extends FilterBasic {

    }

    class FilterMovie extends FilterBasic {
        String[] filterUniverse;
    }

    class FilterGame extends FilterBasic {
        String[] filterUniverse;
    }

    class FilterBook extends FilterBasic {
        String[] filterUniverse;
        String[] filterAuthor;
    }

    @Override
    public void decorate(ClassModelManager mm) {
        mm.getClassModel().setDefaultPropertyStyle(org.fulib.builder.Type.POJO);
        mm.haveNestedClasses(GenFilter.class);
    }
}
