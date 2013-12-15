package com.mgnyniuk.parallel;

import com.gpusim2.config.GridSimConfig;

import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

/**
 * Created by maksym on 12/14/13.
 */
public class ConfigurationUtil {

    private static void deserializeConfigs(List<GridSimConfig> gridSimConfigList) throws FileNotFoundException {
        int i = 0;
        for (GridSimConfig gridSimConfig : gridSimConfigList) {
            FileOutputStream out = new FileOutputStream("config" + i + ".xml");
            XMLEncoder xmlEncoder = new XMLEncoder(out);
            xmlEncoder.writeObject(gridSimConfig);
            xmlEncoder.flush();
            xmlEncoder.close();

            i++;

        }
    }
}
