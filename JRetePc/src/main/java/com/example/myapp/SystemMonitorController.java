package com.example.myapp;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class SystemMonitorController {
 

           @GetMapping("/")
           public String dashboard(Model model){
           
             SystemStats stats = new SystemStats();
             model.addAttribute("cpuUsage", stats.getCpuUsage());
             model.addAttribute("temperature", stats.getTemperature());
             model.addAttribute("totalDisk", stats.getTotalDiskSpace());
             model.addAttribute("freeDisk", stats.getFreeDiskSpace());
             return "index";
            } 


    

          @GetMapping("/dashboard")
          public String dashboard() {

            return "dashboard"; 


          }

    


@GetMapping("/stats")
@ResponseBody
public Map<String, Object> getSystemStats() {
    SystemStats systemStats = new SystemStats();
    Map<String, Object> stats = new HashMap<>();
    stats.put("cpuUsage", systemStats.getCpuUsage());
    stats.put("temperature", systemStats.getTemperature());
    stats.put("totalDiskSpace", systemStats.getTotalDiskSpace());
    stats.put("freeDiskSpace", systemStats.getFreeDiskSpace());
    return stats;
}






     


}