package com.globallogic.dc.services.impl;

import com.globallogic.dc.model.Section;
import com.globallogic.dc.repository.fs.impl.SectionDaoImpl;
import com.globallogic.dc.services.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SectionServiceImpl")
public class SectionServiceImpl implements SectionService {

    @Autowired
    @Qualifier("SectionDaoImpl")
    private SectionDaoImpl sectionDaoImpl;

    @Override
    public List<Section> getSections() {
        return sectionDaoImpl.getAll();
    }

    @Override
    public Section getSectionById(final String id) {
        return sectionDaoImpl.getById(id);
    }

    @Override
    public List<Section> getSectionsBySubChapterId(final String id) {
        return sectionDaoImpl.getSectionsBySubChapterId(id);
    }
}
