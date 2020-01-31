package com.rkcpinfo.springreactivemongodb.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.rkcpinfo.springreactivemongodb.domain.Article;

/**
 * Spring Data MongoDB reactive repository for the Article entity.
 * @author com.rkcpinfo
 */
@Repository
public interface ArticleRepository extends ReactiveMongoRepository<Article, String> {
}
