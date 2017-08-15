package com.yyyu.manager.biz;

import com.yyyu.manager.dao.TagTypeMapper;
import com.yyyu.manager.inter.TagTypeBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Referenced classes of package com.yyyu.crm.biz:
//            TagTypeBiz

@Service
public class TagTypeBizImpl
    implements TagTypeBiz
{

    public TagTypeBizImpl()
    {
    }

    public List getTagType()
    {
        return tagTypeMapper.getTagType();
    }

    @Autowired
    private TagTypeMapper tagTypeMapper;
}
