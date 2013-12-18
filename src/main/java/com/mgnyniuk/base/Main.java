package com.mgnyniuk.base;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

/**
 * Created by maksym on 12/14/13.
 */
public class Main {

    public static void main(String[] args) {
        Config cfg = new Config();
        cfg.setProperty("hazelcast.icmp.timeout", "2000000000");
        Hazelcast.newHazelcastInstance(cfg);
    }
}
