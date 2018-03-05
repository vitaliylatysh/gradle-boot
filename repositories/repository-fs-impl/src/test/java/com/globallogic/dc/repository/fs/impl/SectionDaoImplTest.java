package com.globallogic.dc.repository.fs.impl;

import com.globallogic.dc.model.Section;
import com.globallogic.dc.repository.SectionDao;
import com.globallogic.dc.repository.fs.config.RepositoryConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RepositoryConfig.class)
public class SectionDaoImplTest {

    @Autowired
    private SectionDao sectionDao;

    @Test
    public void testGetSectionsBySubChapterId() {
        List<Section> sections = sectionDao.getSectionsBySubChapterId("22");

        assertEquals(2, sections.size());
    }
}
