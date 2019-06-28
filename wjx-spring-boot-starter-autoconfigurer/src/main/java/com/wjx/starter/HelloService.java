package com.wjx.starter;

import com.wjx.starter.HelloProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloService {

    HelloProperties helloProperties;

    public String sayHelloWjx( String name ){
        return helloProperties.getPrefix()+"-" + name + "-" + helloProperties.getSuffix();
    }


}
