package top.mrys.mongohelper;

import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * @author mrys
 * @date 2020/7/31
 */
public class SpringMongoTemplateMongoHelper implements MongoHelper {

    private MongoTemplate mongoTemplate;

    public SpringMongoTemplateMongoHelper(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Find find() {
        return null;
    }
}
