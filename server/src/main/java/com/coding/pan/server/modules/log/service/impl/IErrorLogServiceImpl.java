package com.coding.pan.server.modules.log.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coding.pan.server.modules.log.entity.RPanErrorLog;
import com.coding.pan.server.modules.log.mapper.RPanErrorLogMapper;
import com.coding.pan.server.modules.log.service.IErrorLogService;
import org.springframework.stereotype.Service;

/**
 * @author 273JIA coding
 * @description 针对表【r_pan_error_log(错误日志表)】的数据库操作Service实现
 * @createDate 2024-07-09 18:37:48
 */
@Service
public class IErrorLogServiceImpl extends ServiceImpl<RPanErrorLogMapper, RPanErrorLog>
        implements IErrorLogService {

}




