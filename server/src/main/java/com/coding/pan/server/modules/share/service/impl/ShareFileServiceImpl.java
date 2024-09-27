package com.coding.pan.server.modules.share.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Lists;
import com.coding.pan.core.exception.RPanBusinessException;
import com.coding.pan.core.utils.IdUtil;
import com.coding.pan.server.modules.share.context.SaveShareFilesContext;
import com.coding.pan.server.modules.share.entity.RPanShareFile;
import com.coding.pan.server.modules.share.mapper.RPanShareFileMapper;
import com.coding.pan.server.modules.share.service.IShareFileService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author 273JIA coding
 * @description 针对表【r_pan_share_file(用户分享文件表)】的数据库操作Service实现
 * @createDate 2024-07-09 18:38:38
 */
@Service
public class ShareFileServiceImpl extends ServiceImpl<RPanShareFileMapper, RPanShareFile> implements IShareFileService {

    /**
     * 保存分享的文件的对应关系
     *
     * @param context
     */
    @Override
    public void saveShareFiles(SaveShareFilesContext context) {
        Long shareId = context.getShareId();
        List<Long> shareFileIdList = context.getShareFileIdList();
        Long userId = context.getUserId();

        List<RPanShareFile> records = Lists.newArrayList();

        for (Long shareFileId : shareFileIdList) {
            RPanShareFile record = new RPanShareFile();
            record.setId(IdUtil.get());
            record.setShareId(shareId);
            record.setFileId(shareFileId);
            record.setCreateUser(userId);
            record.setCreateTime(new Date());
            records.add(record);
        }

        if (!saveBatch(records)) {
            throw new RPanBusinessException("Failed to save file sharing association");
        }
    }

}




