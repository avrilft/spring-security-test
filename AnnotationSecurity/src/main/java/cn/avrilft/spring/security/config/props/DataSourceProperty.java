package cn.avrilft.spring.security.config.props;

import lombok.Data;

/**
 * @author yanxd
 * @version 1.0
 * @date 2021-07-30
 */
@Data
public class DataSourceProperty {

    private String driver;
    private String url;
    private String userName;
    private String password;
    private Integer maxActive = 20;
    private Integer minActive = 5;


}
