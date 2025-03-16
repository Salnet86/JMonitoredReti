package com.example.myapp;


import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;
import java.io.File;

public class SystemStats {
    private double cpuUsage;
    private double temperature;
    private long totalDiskSpace;
    private long freeDiskSpace;

    public SystemStats() {

        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        CentralProcessor processor = hardware.getProcessor();

        // Calcolo uso CPU
        double[] load = processor.getSystemLoadAverage(1);
        this.cpuUsage = (load[0] >= 0) ? load[0] * 100 : 0;

        // Temperatura CPU (non tutti i sistemi la supportano)
        this.temperature = hardware.getSensors().getCpuTemperature();

        // Spazio su disco
        File disk = new File("/");
        this.totalDiskSpace = disk.getTotalSpace() / (1024 * 1024 * 1024); // Converti in GB
        this.freeDiskSpace = disk.getFreeSpace() / (1024 * 1024 * 1024); // Converti in GB
    }

    public double getCpuUsage() { 
        return cpuUsage; 
    }

    public double getTemperature() { 
        return temperature; 
    }

    public long getTotalDiskSpace() { 
        return totalDiskSpace;
         }

    public long getFreeDiskSpace() { 
    return freeDiskSpace; 
   }
}