package com.sai;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@Configuration
@EnableSolrRepositories(basePackages={"com.sai.dao"})
public class SolrConfig {

	  @Bean
	    public SolrClient solrClient() {
	        return new HttpSolrClient("http://localhost:8983/solr");
	    }
	 
	    @Bean
	    public SolrTemplate solrTemplate(SolrClient client) throws Exception {
	        return new SolrTemplate(client);
	    }
}