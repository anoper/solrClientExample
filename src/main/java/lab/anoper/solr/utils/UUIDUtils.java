package lab.anoper.solr.utils;

import java.util.UUID;

/**
 * Author: YanJiahong
 * Date: 2018/5/11
 */
public class UUIDUtils {
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
