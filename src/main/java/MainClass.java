import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

/**
 * Created by maksym on 12/14/13.
 */
public class MainClass {

    public static void main(String[] args) {
        Config cfg = new Config();
        Hazelcast.newHazelcastInstance(cfg);
    }
}
