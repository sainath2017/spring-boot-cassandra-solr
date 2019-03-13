package com.sai.model;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@SolrDocument(solrCoreName = "customer")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Customer {
 @Id
 @Field
 private String id;
 
 @Field
 private String name;
 
 @Field
 private Integer age;
 
}
 
