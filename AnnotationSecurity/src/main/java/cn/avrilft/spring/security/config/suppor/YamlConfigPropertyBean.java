package cn.avrilft.spring.security.config.suppor;

import lombok.*;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.InputStream;

/**
 * @author yanxd
 * @version 1.0
 * @date 2021-07-30
 */
@Data
public class YamlConfigPropertyBean<T> implements FactoryBean<T> {

    private Class<T> type;
    private String yamlReader;
    private String encode = "utf-8";
    private boolean singleton = false;


    @Override
    public T getObject() throws Exception {

        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return type;
    }

    @Override
    public boolean isSingleton() {
        return singleton;
    }
}
