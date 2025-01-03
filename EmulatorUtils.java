package com.mahmutsaglam.androidemulator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmulatorUtils {
    
    static {
        System.loadLibrary("native-lib");
    }

    public static String getDeviceModel() {
        return runShellCommand("getprop ro.product.model");
    }

    private static String runShellCommand(String command) {
        StringBuilder output = new StringBuilder();
        try {
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }
            reader.close();
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            output.append("Error: ").append(e.getMessage());
        }
        return output.toString();
    }

    public static native String getNativeMessage();
}
