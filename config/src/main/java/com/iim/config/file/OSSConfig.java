package com.iim.config.file;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by xibin on 2017/8/9.
 */
@Component
@ConfigurationProperties("oss")
public class OSSConfig {

    private String bucketid;

    private String basepath;

    public String getBucketid() {
        return bucketid;
    }

    public void setBucketid(String bucketid) {
        this.bucketid = bucketid;
    }

    public String getBasepath() {
        return basepath;
    }

    public void setBasepath(String basepath) {
        this.basepath = basepath;
    }

}
