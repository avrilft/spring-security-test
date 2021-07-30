package cn.avrilft.spring.security.gen;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.converts.DB2TypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author yanxd
 * @version 1.0
 * @date 2021-07-30
 */
public class Application {

    public static void main(String[] args) {
        AutoGenerator ag = new AutoGenerator();
        ag.setTemplateEngine(new FreemarkerTemplateEngine());

        DataSourceConfig dsg = new DataSourceConfig();
        dsg.setDriverName("com.mysql.jdbc.Driver");
        dsg.setDbType(DbType.MYSQL);
        dsg.setUrl("jdbc://localhost:3306/test");
        dsg.setUsername("root");
        dsg.setPassword("yxd123456");

        GlobalConfig gc = new GlobalConfig();
        gc.setAuthor("yanxd");
        gc.setIdType(IdType.AUTO);
        String packageDir = Paths.get(System.getProperty("user.dir"),
                "AnnotationSecurity",
                "src",
                "main",
                "java").toString();
        gc.setOutputDir(packageDir);
        gc.setOpen(false);
        ag.setGlobalConfig(gc);

        PackageConfig pg = new PackageConfig();
        pg.setModuleName("user");
        pg.setParent("cn.avrilft.spring.security");
        ag.setPackageInfo(pg);

        FileOutConfig outc = new FileOutConfig() {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return "";
            }
        };

    }

}
