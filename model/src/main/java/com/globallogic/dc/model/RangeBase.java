package com.globallogic.dc.model;

import java.util.Collection;
import java.util.List;

public abstract class RangeBase extends ProductBase {

    private List<SubChapter> subChapters;
    private List<Item> items;
    private List<Section> sections;

    public List<SubChapter> getSubChapters() {
        return subChapters;
    }

    public void setSubChapters(final List<SubChapter> subChapters) {
        this.subChapters = subChapters;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(final List<Section> sections) {
        this.sections = sections;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(final List<Item> items) {
        this.items = items;
    }

    public void addSubChapters(final Collection<SubChapter> subChapters) {
        this.subChapters.addAll(subChapters);
    }

    public void addSubChapter(final SubChapter subChapter) {
        this.subChapters.add(subChapter);
    }

    public void addItems(final Collection<Item> items) {
        this.items.addAll(items);
    }

    public void addItem(final Item item) {
        this.items.add(item);
    }

    public void addSections(final Collection<Section> sections) {
        this.sections.addAll(sections);
    }

    public void addSection(final Section section) {
        this.sections.add(section);
    }

}