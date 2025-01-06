/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energyManagement;

public class MobileApp {
    private String appId;
    private String userId;
    private String energyData;

    // Constructor
    public MobileApp(String appId, String userId) {
        this.appId = appId;
        this.userId = userId;
    }

    // Method to get energy data
    public String getEnergyData() {
        return energyData;
    }

    // Method to display energy data
    public void displayEnergyData() {
        System.out.println("Energy Data for User (" + userId + "): " + energyData);
    }

    // Method to set energy data (for simulation)
    public void setEnergyData(String energyData) {
        this.energyData = energyData;
    }
}

