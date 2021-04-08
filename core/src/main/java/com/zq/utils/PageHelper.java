package com.zq.utils;


import java.util.Objects;
/**
 * @author zhaoqi
 * @since 2020-10-10
 */

public class PageHelper {


    private Integer offset ;

    private Integer pageSize;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public static PageHelper check(Integer pageNo, Integer pageSize) {
        if (Objects.isNull(pageNo) || pageNo <= 1) {
            pageNo = 1;
        }
        if (Objects.isNull(pageSize)) {
            pageSize = 20;
        }

        PageHelper pageHelper = new PageHelper();
        pageHelper.setOffset((pageNo - 1) * pageSize);
        pageHelper.setPageSize(pageSize);
        return pageHelper;
    }

}
