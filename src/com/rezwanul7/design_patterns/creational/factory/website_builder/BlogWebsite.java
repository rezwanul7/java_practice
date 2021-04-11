package com.rezwanul7.design_patterns.creational.factory.website_builder;

import java.util.ArrayList;
import java.util.List;

public class BlogWebsite implements Website{
    List<Page> pages;
    public BlogWebsite(){
        pages = new ArrayList<>();
        pages.add(new Blog());
        pages.add(new Contact());
    }

    @Override
    public List<Page> getPages() {
        return null;
    }
}
