package com.globallogic.dc.repository.fs.impl.mock;

import com.globallogic.dc.model.Chapter;
import com.globallogic.dc.repository.ProductsDao;
import com.globallogic.dc.repository.fs.AbstractFileSystemDAO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ChapterDaoMockImpl extends AbstractFileSystemDAO<Chapter> implements ProductsDao<Chapter> {

    @Override
    public List<Chapter> getAll() {
        return null;
    }

    @Override
    public Chapter getById(final String id) {
        return null;
    }

    @Override
    protected Chapter fromDto(final String dto) {
        return null;
    }

    @Override
    protected String getFileName() {
        return null;
    }
}
