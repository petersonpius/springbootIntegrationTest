package com.peter.springframework.services;

import com.peter.springframework.domain.Recipe;
import com.peter.springframework.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by jt on 6/13/17.
 */
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        Iterator it=recipeSet.iterator();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        while(it.hasNext()){
           Recipe e=(Recipe) it.next();
           System.out.println(e.toString());

        }
        return recipeSet;
    }
}
