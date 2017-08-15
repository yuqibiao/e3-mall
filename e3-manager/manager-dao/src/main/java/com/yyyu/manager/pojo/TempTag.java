package com.yyyu.manager.pojo;

import java.util.Date;

public class TempTag
{

    public TempTag()
    {
    }

    public long getTagId()
    {
        return tagId;
    }

    public void setTagId(long tagId)
    {
        this.tagId = tagId;
    }

    public String getTagEpc()
    {
        return tagEpc;
    }

    public void setTagEpc(String tagEpc)
    {
        this.tagEpc = tagEpc;
    }

    public int getTagType()
    {
        return tagType;
    }

    public void setTagType(int tagType)
    {
        this.tagType = tagType;
    }

    public Date getAddTime()
    {
        return addTime;
    }

    public void setAddTime(Date addTime)
    {
        this.addTime = addTime;
    }

    private long tagId;
    private String tagEpc;
    private int tagType;
    private Date addTime;
}
