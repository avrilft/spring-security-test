package cn.avrilft.spring.security.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author yanxd
 * @version 1.0
 * @date 2021-07-30
 */
@Configuration
@MapperScan(basePackages = "cn.avrilft.spring.security.**.mapper")
public class MyBatisConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        factory.setDataSource(dataSource);
        factory.setTypeAliasesPackage("cn.avrilft.spring.security.**.entity");
        return factory;
    }




}
