package redis.json;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.UnifiedJedis;

public class RedisJsonTest {
    public static void main(String[] args) {
        try (Jedis jedis = new Jedis("localhist",6379)) {
            UnifiedJedis jedis1 = new UnifiedJedis();
        }
    }
}
