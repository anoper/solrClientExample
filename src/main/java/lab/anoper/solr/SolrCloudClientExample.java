package lab.anoper.solr;

import org.apache.solr.client.solrj.SolrRequest;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.params.CommonParams;
import org.apache.solr.common.params.ModifiableSolrParams;

import java.io.IOException;

/**
 * Author: YanJiahong
 * Date: 2018/5/11
 */
public class SolrCloudClientExample {
  public static void main(String[] args) throws IOException, SolrServerException {
    String zkUrlPort = "server01:2181";
    String collection = "products";
    CloudSolrClient client = new CloudSolrClient(zkUrlPort);
    ModifiableSolrParams params = new ModifiableSolrParams();
    params.set(CommonParams.Q, "*:*");
    params.set("indent", "on");
    params.set(CommonParams.WT, "json");

    QueryResponse qr = client.query(collection, params, SolrRequest.METHOD.POST);
    System.out.println(qr);

  }
}
