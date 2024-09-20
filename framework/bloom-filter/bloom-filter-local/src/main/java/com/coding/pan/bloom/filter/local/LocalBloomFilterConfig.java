package com.coding.pan.bloom.filter.local;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "com.coding.pan.bloom.filter.local")
@Data
public class LocalBloomFilterConfig {

    private List<LocalBloomFilterConfigItem> items;

}
