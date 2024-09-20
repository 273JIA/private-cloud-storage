package com.coding.pan.server.modules.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coding.pan.server.modules.user.context.QueryUserSearchHistoryContext;
import com.coding.pan.server.modules.user.entity.RPanUserSearchHistory;
import com.coding.pan.server.modules.user.mapper.RPanUserSearchHistoryMapper;
import com.coding.pan.server.modules.user.service.IUserSearchHistoryService;
import com.coding.pan.server.modules.user.vo.UserSearchHistoryVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 273JIA coding
 * @description 针对表【r_pan_user_search_history(用户搜索历史表)】的数据库操作Service实现
 * @createDate 2024-07-09 18:34:37
 */
@Service(value = "userSearchHistoryService")
public class UserSearchHistoryServiceImpl extends ServiceImpl<RPanUserSearchHistoryMapper, RPanUserSearchHistory> implements IUserSearchHistoryService {

    /**
     * 查询用户的搜索历史记录，默认十条
     *
     * @param context
     * @return
     */
    @Override
    public List<UserSearchHistoryVO> getUserSearchHistories(QueryUserSearchHistoryContext context) {
        return baseMapper.selectUserSearchHistories(context);
    }
}




