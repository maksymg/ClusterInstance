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

    public static void deserializeConfigs(List<GridSimConfig> gridSimConfigList, int startIndex) throws FileNotFoundException {
        int i = startIndex;
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
