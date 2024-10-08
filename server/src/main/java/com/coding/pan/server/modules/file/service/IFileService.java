package com.coding.pan.server.modules.file.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coding.pan.server.modules.file.context.FileChunkMergeAndSaveContext;
import com.coding.pan.server.modules.file.context.FileSaveContext;
import com.coding.pan.server.modules.file.context.QueryRealFileListContext;
import com.coding.pan.server.modules.file.entity.RPanFile;

import java.util.List;

/**
 * @author 273JIA coding
 * @description 针对表【r_pan_file(物理文件信息表)】的数据库操作Service
 * @createDate 2024-07-09 18:36:41
 */
public interface IFileService extends IService<RPanFile> {

    /**
     * 根据条件查询用户的实际文件列表
     *
     * @param context
     * @return
     */
    List<RPanFile> getFileList(QueryRealFileListContext context);

    /**
     * 上传单文件并保存实体记录
     *
     * @param context
     */
    void saveFile(FileSaveContext context);

    /**
     * 合并物理文件并保存物理文件记录
     *
     * @param context
     */
    void mergeFileChunkAndSaveFile(FileChunkMergeAndSaveContext context);

}
