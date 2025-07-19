import java.util.*;

public class Shift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        // Shift ID to Shift Name mapping
        Map<Integer, String> shiftMap = new LinkedHashMap<>();

        
        shiftMap.put(0, "Morning");
        shiftMap.put(1, "Noon");
        shiftMap.put(2, "Night");

        // Schedule storage: shift name → list of employee names
        Map<String, List<String>> schedule = new LinkedHashMap<>();
        for (String shift : shiftMap.values()) {
            schedule.put(shift, new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter employee name: ");
            String name = sc.nextLine();

            System.out.print("Enter preferred shift (0=Morning, 1=Noon, 2=Night): ");
            int shift = sc.nextInt();
            sc.nextLine(); // consume newline

            String shiftName = shiftMap.getOrDefault(shift, "Invalid");
            if (shiftName.equals("Invalid")) {
                System.out.println("❌ Invalid shift number. Skipping this entry.");
                continue;
            }

            List<String> employees = schedule.get(shiftName);
            if (employees.size() >= 3) {
                System.out.println("⚠ Shift '" + shiftName + "' is full. Choose a different shift.");
                i--; // re-enter for this employee
                continue;
            }

            employees.add(name);
        }

        // Output the schedule
        System.out.println("\n📋 Shift Schedule:");
        for (String shift : shiftMap.values()) {
            System.out.print(shift + ":");
            List<String> employees = schedule.get(shift);
            for (int i = 0; i < 3; i++) {
                if (i < employees.size()) {
                    System.out.print("[" + employees.get(i) + "]");
                } else {
                    System.out.print("[ - ] ");
                }
            }
            System.out.println();
        }
    }
}
