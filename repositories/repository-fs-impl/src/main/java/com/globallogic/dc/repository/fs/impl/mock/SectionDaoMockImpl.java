package com.globallogic.dc.repository.fs.impl.mock;

import com.globallogic.dc.model.Section;
import com.globallogic.dc.repository.ProductsDao;
import com.globallogic.dc.repository.fs.AbstractFileSystemDAO;

import java.util.List;

public class SectionDaoMockImpl extends AbstractFileSystemDAO<Section> implements ProductsDao<Section> {

    @Override
    public List<Section> getAll() {
        return null;
    }

    @Override
    public Section getById(final String id) {
        return null;
    }

    @Override
    protected Section fromDto(final String dto) {
        return null;
    }

    @Override
    protected String getFileName() {
        return null;
    }
}
