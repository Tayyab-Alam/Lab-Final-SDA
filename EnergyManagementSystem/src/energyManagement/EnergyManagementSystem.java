/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energyManagement;

public class EnergyManagementSystem {
    public static void main(String[] args) {
        // Create instances of classes
        MobileApp mobileApp = new MobileApp("app123", "user456");
        CloudServer cloudServer = new CloudServer("server789");
        SmartMeter smartMeter = new SmartMeter("meter101");
        Analytics analytics = new Analytics("analytics202");

        
        smartMeter.sendEnergyDataToCloud(cloudServer); 
        cloudServer.sendDataToApp(mobileApp);  
        String analysisResult = analytics.analyzeEnergyData();  
        System.out.println(analysisResult);  
        mobileApp.displayEnergyData();  

        
        String insights = analytics.provideInsights();
        System.out.println("Analytics Insights: " + insights);
    }
}
