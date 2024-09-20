package com.coding.pan.server.modules.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coding.pan.server.modules.user.context.QueryUserSearchHistoryContext;
import com.coding.pan.server.modules.user.entity.RPanUserSearchHistory;
import com.coding.pan.server.modules.user.vo.UserSearchHistoryVO;

import java.util.List;

/**
 * @author 273JIA coding
 * @description 针对表【r_pan_user_search_history(用户搜索历史表)】的数据库操作Service
 * @createDate 2024-07-09 18:34:37
 */
public interface IUserSearchHistoryService extends IService<RPanUserSearchHistory> {

    /**
     * 查询用户的搜索历史记录，默认十条
     *
     * @param context
     * @return
     */
    List<UserSearchHistoryVO> getUserSearchHistories(QueryUserSearchHistoryContext context);

}
