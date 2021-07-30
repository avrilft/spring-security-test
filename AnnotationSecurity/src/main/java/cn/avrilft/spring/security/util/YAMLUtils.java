package cn.avrilft.spring.security.util;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.*;

/**
 * @author yanxd
 * @version 1.0
 * @date 2021-07-30
 */
public class YAMLUtils {

    private YAMLUtils(){}



    public static <T> T parse(String yaml, Class<T> type) throws IOException {
        return parse(yaml, "utf-8", type);
    }

    public static <T> T parse(String yaml, String encode, Class<T> type) throws IOException {
        try (FileInputStream in = new FileInputStream(yaml);
            InputStreamReader reader = new InputStreamReader(in, encode)) {
            return parse(reader, type);
        }
    }

    public static <T> T parse(Reader yaml, Class<T> type) {
        Yaml parser = new Yaml(new Constructor(type));
        return parser.load(yaml);
    }

}
