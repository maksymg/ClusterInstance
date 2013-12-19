package com.mgnyniuk.base;

import com.gpusim2.config.GridSimOutput;
import com.hazelcast.config.Config;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MaxSizeConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by maksym on 12/14/13.
 */
public class Main {

    public static ConcurrentMap<Integer, GridSimOutput> outputMap;

    public static void main(String[] args) {
        Config cfg = new Config();
        cfg.setProperty("hazelcast.icmp.timeout", "2000000000");
        HazelcastInstance hz = Hazelcast.newHazelcastInstance(cfg);

        outputMap = hz.getMap("outputMap");
    }
}
