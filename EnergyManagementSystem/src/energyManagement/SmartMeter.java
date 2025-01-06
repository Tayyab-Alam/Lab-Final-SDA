/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energyManagement;

public class SmartMeter {
    private String meterId;
    private float currentEnergyUsage;

    // Constructor
    public SmartMeter(String meterId) {
        this.meterId = meterId;
        this.currentEnergyUsage = 100.5f; // Example energy usage
    }

    // Method to get energy data
    public float getEnergyData() {
        return currentEnergyUsage;
    }

    // Method to send energy data to the CloudServer
    public void sendEnergyDataToCloud(CloudServer server) {
        System.out.println("Sending energy data to CloudServer...");
        server.storeData();
    }
}

