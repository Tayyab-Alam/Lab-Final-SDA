/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energyManagement;

public class CloudServer {
    private String serverId;
    private String cloudData;

    // Constructor
    public CloudServer(String serverId) {
        this.serverId = serverId;
    }

    // Method to send data to the mobile app
    public void sendDataToApp(MobileApp app) {
        cloudData = "Energy data from cloud server";  // Simulated cloud data
        app.setEnergyData(cloudData);
        System.out.println("Data sent to Mobile App.");
    }

    // Method to store data (simulation)
    public void storeData() {
        System.out.println("Data stored in Cloud Server.");
    }
}

