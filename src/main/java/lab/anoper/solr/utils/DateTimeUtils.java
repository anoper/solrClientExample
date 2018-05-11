package lab.anoper.solr.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/**
 * Author: YanJiahong
 * Date: 2018/5/11
 */
public class DateTimeUtils {

    /**
     * Time Zone ID for Shanghai
     */
    private static final String TZ_SH_ID = "Asia/Shanghai";

    /**
     * 符合ISO-8061标准的UTC时间格式
     */
    private static final String ISO8601_MIN_UTC_FORMAT = "yyyy-MM-dd'T'HH:mm'Z'";

    /**
     * 获取ISO-8061格式的中国的UTC时间, 精确到分钟
     * 示例: 2018-12-13T12:18Z
     * @return ISO-8061标准的中国UTC时间字符串
     */
    public String getChinaISOMinTime() {
        TimeZone tz = TimeZone.getTimeZone(TZ_SH_ID);
        DateFormat sdf = new SimpleDateFormat(ISO8601_MIN_UTC_FORMAT);
        return "";
    }
}
