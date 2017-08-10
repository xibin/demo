package com.iim.model.base;

import javax.persistence.*;

/**
 * Created by xibin on 2017/8/8.
 */
public class BaseEntity {

    @Transient
    private int page = 1;

    @Transient
    private int rows = 10;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
}
