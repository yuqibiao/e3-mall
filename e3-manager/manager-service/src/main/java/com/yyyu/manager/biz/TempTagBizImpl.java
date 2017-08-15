package com.yyyu.manager.biz;

import com.yyyu.manager.dao.TempTagMapper;
import com.yyyu.manager.inter.TempTagBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Referenced classes of package com.yyyu.crm.biz:
//            TempTagBiz

@Service
public class TempTagBizImpl
    implements TempTagBiz
{

    public TempTagBizImpl()
    {
    }

    public void addTag(List list)
    {
        tempTagMapper.addTag(list);
    }

    @Autowired
    private TempTagMapper tempTagMapper;
}
