package com.wjx.starter;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "wjx.hello")
public class HelloProperties {

    private String prefix;
    private String suffix;


}
