package top.mrys.mongohelper;

import java.util.ServiceLoader;

/**
 * @author mrys
 * @date 2020/7/31
 */
public interface MongoHelper {
    default MongoHelper getInstance() {
        ServiceLoader<MongoHelper> load = ServiceLoader.load(MongoHelper.class);
        return load.iterator().next();
    }



}
