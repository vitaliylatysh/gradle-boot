package com.globallogic.dc.repository.fs.impl.mock;

import com.globallogic.dc.model.Chapter;
import com.globallogic.dc.repository.ProductsDao;
import com.globallogic.dc.repository.fs.AbstractFileSystemDAO;

import java.util.List;

public class ChapterDaoMockImpl extends AbstractFileSystemDAO<Chapter> implements ProductsDao<Chapter> {

    private static volatile ChapterDaoMockImpl instance = null;

    private ChapterDaoMockImpl() {
    }

    public static ChapterDaoMockImpl getInstance() {
        if (instance == null) {
            synchronized (ChapterDaoMockImpl.class) {
                if (instance == null) {
                    instance = new ChapterDaoMockImpl();
                }
            }
        }
        return instance;
    }

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
