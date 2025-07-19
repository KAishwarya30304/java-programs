import java.util.Scanner;

public class Bill_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int ITEM_COUNT = sc.nextInt();
        double subtotal = 0;
        double totalDiscount = 0;

        for (int i = 0; i < ITEM_COUNT; i++) {
            System.out.print("Item name: ");
            String name = sc.nextLine();

            System.out.print("Qty: ");
            int qty = sc.nextInt();

            System.out.print("Price per unit: ");
            double price = sc.nextDouble();
            sc.nextLine(); 

            double itemTotal = qty * price;
            double itemDiscount = 0;

            if (qty > 5) {
                itemDiscount = itemTotal * 0.10; 
            }

            subtotal += itemTotal - itemDiscount;
            totalDiscount += itemDiscount;
        }

        double additionalDiscount = 0;
        if (subtotal > 1000) {
            additionalDiscount = subtotal * 0.05; // 5% extra discount
        }

        double finalTotal = subtotal - additionalDiscount;
        totalDiscount += additionalDiscount;

        System.out.println("\n----- Bill Summary -----");
        System.out.println("Subtotal: ₹" + Math.round(subtotal));
        System.out.println("Discount: ₹" + Math.round(totalDiscount));
        System.out.println("Final Total: ₹" + Math.round(finalTotal));
    }
}
