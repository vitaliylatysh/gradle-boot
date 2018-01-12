package com.globallogic.dc.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class ChapterBase extends AbstractProduct {

    private List<SubChapter> subChapters;

    public ChapterBase(final String key, final String title, final String description) {
        super(key, title, description);
    }

    public ChapterBase(final String key, final String title, final String description,
                       final List<SubChapter> subChapters) {
        super(key, title, description);
        this.subChapters = subChapters;
    }

    public List<SubChapter> getSubChapters() {
        return this.subChapters;
    }

    public void setSubChapters(final List<SubChapter> subChapters) {
        this.subChapters = subChapters;
    }

    public boolean hasSubChapters() {
        return this.subChapters != null && !this.subChapters.isEmpty();
    }

    public void addSubChapters(final Collection<SubChapter> subChapters) {
        if (this.subChapters == null) {
            this.subChapters = new ArrayList<>();
        }
        this.subChapters.addAll(subChapters);
    }

    public void addSubChapter(final SubChapter subChapter) {
        if (this.subChapters == null) {
            this.subChapters = new ArrayList<>();
        }
        this.subChapters.add(subChapter);
    }

}
