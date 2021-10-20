package com.demo.nacos.simple;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;

import java.util.Properties;

public class ConfigSimpleTest {
    public static void main(String[] args) {
        try {
            String serverAddr = "127.0.0.1:8848";
            String dataId = "app-manager.yml";
            String group = "DEFAULT_GROUP";

            Properties properties = new Properties();
            properties.put("serverAddr", serverAddr);
            ConfigService configService = NacosFactory.createConfigService(properties);
            String content = configService.getConfig(dataId, group, 5000);
            System.out.println(content);

            configService.publishConfig(dataId, group, "sys:\n\tname: may", "yaml");
            System.out.println(configService.getConfig(dataId, group, 5000));
        } catch (NacosException e) {
            e.printStackTrace();
        }
    }


}
