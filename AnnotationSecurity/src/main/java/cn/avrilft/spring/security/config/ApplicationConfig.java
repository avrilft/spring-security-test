package cn.avrilft.spring.security.config;

import cn.avrilft.spring.security.config.props.DataSourceProperty;
import cn.avrilft.spring.security.util.YAMLUtils;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;
import java.io.IOException;
import java.net.URL;

/**
 * @author yanxd
 * @version 1.0
 * @date 2021-07-27
 */
@Configuration
@Import({SecurityConfig.class, MyBatisConfig.class})
public class ApplicationConfig {

    @Bean
    public DataSourceProperty dataSourceProperty() {
        try {
            URL config = ApplicationConfig.class.getResource("/datasource.yml");
            return YAMLUtils.parse(config.getPath(), DataSourceProperty.class);
        } catch (IOException e) {
            e.printStackTrace();
            return new DataSourceProperty();
        }
    }

    @Bean
    public DataSource datasource(DataSourceProperty prop) {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDbType("MYSQL");
        dataSource.setDriverClassName(prop.getDriver());
        dataSource.setUrl(prop.getUrl());
        dataSource.setUsername(prop.getUserName());
        dataSource.setPassword(prop.getPassword());
        dataSource.setMaxActive(prop.getMaxActive());
        dataSource.setMinIdle(prop.getMinActive());
        return dataSource;
    }

}
