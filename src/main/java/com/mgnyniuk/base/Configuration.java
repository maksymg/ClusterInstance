package com.mgnyniuk.base;

import com.gpusim2.config.GridSimConfig;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by maksym on 12/14/13.
 */
public class Configuration implements Callable<Boolean>, Serializable {

    private List<GridSimConfig> gridSimConfigList;

    public Configuration() { }

    public Configuration(List<GridSimConfig> gridSimConfigList) {
        this.gridSimConfigList = gridSimConfigList;
    }

    public Boolean call() throws IOException {
        int i = 0;
        for (GridSimConfig gridSimConfig : gridSimConfigList) {
            FileOutputStream out = new FileOutputStream("config" + i + ".xml");
            XMLEncoder xmlEncoder = new XMLEncoder(out);
            xmlEncoder.writeObject(gridSimConfig);
            xmlEncoder.flush();
            xmlEncoder.close();

            i++;
        }

        return true;
    }
}
