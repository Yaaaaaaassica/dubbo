package io.github.spafka.cluster;

import org.apache.zookeeper.server.ServerConfig;
import org.apache.zookeeper.server.ZooKeeperServerMain;
import org.apache.zookeeper.server.quorum.QuorumPeerConfig;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ZkStandalone {


    public static void main(String[] args) throws IOException, QuorumPeerConfig.ConfigException {


        new File("/tmp/zookeeper").deleteOnExit();

        QuorumPeerConfig config = new QuorumPeerConfig();
        InputStream is = ZkStandalone.class.getResourceAsStream("/zookeeper.properties");
        Properties p = new Properties();
        p.load(is);
        config.parseProperties(p);
        ServerConfig serverconfig = new ServerConfig();
        serverconfig.readFrom(config);
        new ZooKeeperServerMain().runFromConfig(serverconfig);
    }

}
