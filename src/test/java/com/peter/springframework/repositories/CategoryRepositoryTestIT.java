package com.peter.springframework.repositories;

import com.peter.springframework.domain.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.ldap.DataLdapTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CategoryRepositoryTestIT {

    @Autowired
    CategoryRepository categoryRepository;

    @Test
    public void findByDescription() throws Exception {
        Optional<Category> categoryOptional=categoryRepository.findByDescription("American");
        assertEquals("American",categoryOptional.get().getDescription());
    }

}