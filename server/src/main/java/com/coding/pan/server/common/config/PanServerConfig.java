package com.coding.pan.server.common.config;

import com.coding.pan.core.constants.RPanConstants;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "com.coding.pan.server")
@Data
public class PanServerConfig {

    /**
     * 文件分片的过期天数
     */
    private Integer chunkFileExpirationDays = RPanConstants.ONE_INT;

    /**
     * 分享链接的前缀
     */
    private String sharePrefix = "https://cloakdrive.online/share/";

}
