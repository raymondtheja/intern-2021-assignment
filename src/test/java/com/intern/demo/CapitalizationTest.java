package com.intern.demo;


import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.MockitoAnnotations.initMocks;

public class CapitalizationTest {
    @InjectMocks
    private SearchServiceImpl searchService;

    @Before
    public void setUp(){
        initMocks(this);
    }

    //    @After
//    public void tearDown(){
//
//    }

    @Test
    public void convertToMapTest() {
        //TODO COMPLETE THIS
        List<Book> books = searchService.findAllBookName();
        assertNotNull(books);

        Map<String, List<String>> result = Capitalization.convertToMap(books);
        System.out.println(result);
        assertNotNull(result);
    }
}
