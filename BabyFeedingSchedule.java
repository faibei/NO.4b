public class BabyFeedingSchedule {

    public static void main(String[] args) {
        // Define quantities and times
        double porridgeTotalLiters = 2.0;
        double milkTotalLiters = 2.0;
        double cupSizeLiters = 0.5;
        int porridgeFeedIntervalMinutes = 45;
        int milkFeedIntervalMinutes = 30;

        // Calculate the total number of feedings for porridge and milk
        int porridgeFeedings = (int) (porridgeTotalLiters / cupSizeLiters / 0.5);
        int milkFeedings = (int) (milkTotalLiters / cupSizeLiters);

        // Calculate total feeding time for each
        int totalPorridgeTime = (porridgeFeedings - 1) * porridgeFeedIntervalMinutes;
        int totalMilkTime = (milkFeedings - 1) * milkFeedIntervalMinutes;

        // Find the maximum time required for either porridge or milk
        int totalTime = Math.max(totalPorridgeTime, totalMilkTime) + Math.max(porridgeFeedIntervalMinutes, milkFeedIntervalMinutes);

        // Print the result
        System.out.println("Total time to finish both porridge and milk: " + totalTime + " minutes");
    }
}
