package helpers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.ConverterUtils.DataSource;


public class DataSetHelper {

    public static Instances getInstanceFromFile(String pFileName)
    {
        Instances data = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(pFileName));
            data = new Instances(reader);
            reader.close();
            // setting class attribute
            data.setClassIndex(data.numAttributes() - 1);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        } 
        return data;
        
    }
}