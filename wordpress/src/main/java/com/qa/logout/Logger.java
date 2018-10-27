package com.qa.logout;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    public static String outputFileName = getDateTimeByFormat(new Date(), "yyyyMMdd_HHmmss");
    private static String logFileName;
    private static OutputStreamWriter out;
    public static boolean LogFlag = true;

    public Logger(){}

    private static String getDateTimeByFormat(Date date,String format){
        SimpleDateFormat df = new SimpleDateFormat(format);
        return  df.format(date);
    }

    private static void writeLog(String logEntry){

        try {
            // 定义文件名称和路径
            logFileName = ".\\logs"+"\\"+outputFileName+".log";
            if (out == null){
                File logFile = new File(logFileName);
                if (!logFile.exists()){
                    logFile.createNewFile();
                }
                out = new OutputStreamWriter(new FileOutputStream(logFile), "UTF-8");
            }

            out.write(logEntry, 0, logEntry.length());
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e){
            System.out.println(LogType.LogTypeName.ERROR.toString()+"Failed to write the log file"+logFileName);
            e.printStackTrace();
        }
    }

    public static void log(LogType.LogTypeName logTypeName, String logMessage){
        Date date = new Date();
        String logTime = getDateTimeByFormat(date, "yyyy-MM-dd HH:mm:ss.SSSS");
        String logEntry = logTime+""+logTypeName.name() +":"+logMessage+"\r\n";
        System.out.println(logEntry);
        if (LogFlag){
            writeLog(logEntry);
        }
    }
}
