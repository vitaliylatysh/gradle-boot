package com.globallogic.dc.model;

import java.util.Collection;
import java.util.List;

public class Chapter extends ChapterBase {

    public Chapter(
            final String key,
            final String title,
            final String description) {
        super(key, title, description);
    }

    public Chapter(
            final String key,
            final String title,
            final String description,
            final List<SubChapter> subChapters) {
        super(key, title, description, subChapters);
    }

    @Override
    protected void doAddSubChapter(final SubChapter subChapter) {
        if (!subChapter.hasChapter() || subChapter.getChapter() != this) {
            if (subChapter.hasChapter() && subChapter.getChapter().containsSubChapter(subChapter)) {
                subChapter.getChapter().removeSubChapter(subChapter);
            }
            subChapter.setChapter(this);
        } else {
            super.doAddSubChapter(subChapter);
        }
    }

    @Override
    public void addSubChapters(final Collection<SubChapter> subChapters) {
        super.addSubChapters(subChapters);
    }
}
