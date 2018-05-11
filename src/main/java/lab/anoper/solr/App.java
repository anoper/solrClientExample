package lab.anoper.solr;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.common.SolrInputDocument;
import org.apache.solr.schema.DatePointField;
import org.apache.solr.schema.TrieDateField;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;

/**
 * Author: YanJiahong
 * Date: 2018/5/11
 */
public class App {
    public static void main(String[] args) throws IOException, SolrServerException {
        final String solrUrl = "http://192.168.30.196:8983/solr/microblog";
        SolrClient solr = new HttpSolrClient.Builder(solrUrl).build();

        for (int i = 0; i < 1; i++) {
            SolrInputDocument doc = new SolrInputDocument();
            doc.setField("id", i + "");
            doc.setField("screen_name", "@yan" + i);
            doc.setField("type", "POST");
            doc.setField("timestamp", "2058-06-02T11:23+08:00");
            doc.setField("lang", "en");
            int favoriates_count = new Random().nextInt(50);
            doc.setField("favorites_count", favoriates_count);
            doc.setField("text", "content" + i);
            solr.add(doc);
        }

        SolrInputDocument doc = new SolrInputDocument();
        doc.setField("id", "11");
        doc.setField("screen_name", "@yan0");
        doc.setField("type", "POST");
        doc.setField("timestamp", "2058-06-02T11:23+08:00");
        doc.setField("lang", "en");
        int favoriates_count = new Random().nextInt(50);
        doc.setField("favorites_count", favoriates_count);
        doc.setField("text", "content" + 11);
        solr.add(doc);

        solr.commit(true, true);
        System.out.println("commit successful!");




    }
}
