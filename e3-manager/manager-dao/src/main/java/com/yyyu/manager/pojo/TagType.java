package com.yyyu.manager.pojo;


public class TagType
{

    public TagType()
    {
    }

    public int getTypeId()
    {
        return typeId;
    }

    public void setTypeId(int typeId)
    {
        this.typeId = typeId;
    }

    public String getTypeName()
    {
        return typeName;
    }

    public void setTypeName(String typeName)
    {
        this.typeName = typeName;
    }

    public String getTypeDescription()
    {
        return typeDescription;
    }

    public void setTypeDescription(String typeDescription)
    {
        this.typeDescription = typeDescription;
    }

    private int typeId;
    private String typeName;
    private String typeDescription;
}
