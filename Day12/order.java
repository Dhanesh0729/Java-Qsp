package Day12;
import java.util.*;

public class order {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        System.out.println("Choose the desired Hotel \n 1. SS Hyderabad \n 2. Thalapakatti Biriyani \n 3. Ejey mama's Hotel \n 4. Buhari");
        Thread.sleep(500);
        System.out.println("Enter a Your Favorite Option");
        int hotel_number = sc.nextInt();

        switch (hotel_number) {
            case 1:{
                System.out.println("Thank You for Choosing SS Hyderabad");
                Thread.sleep(1000);
                System.out.println("SS Hyderabad has \n 1. Chicken Biriyani \n 2. Mutton Biriyani \n 3. BBQ Combo");
                System.out.println("Choose the Food");
                int food_number = sc.nextInt();
                switch (food_number) {
                    case 1:{
                        System.out.println("Thank you for ordering Chicken Biriyani");
                        double food_price = 200.0;
                        System.out.println(food_price);
                        System.out.println("Enter the Quantity : ");
                        int food_Quantity = sc.nextInt();
                        double Total_bill = food_price * food_Quantity;
                        System.out.println("Total bill is "+ Total_bill+"\n choose your Payment Method \n 1. UPI Payment \n 2. Cash");
                        int payment_method = sc.nextInt();
                        switch (payment_method) {
                            case 1:
                                int otp = (int)(Math.random()*999+999);
                                Thread.sleep(3000);
                                System.out.println(otp);
                                System.out.println("Enter the OTP for Payment Confirmation");
                                int User_otp = sc.nextInt();
                                if (otp==User_otp) {
                                    System.out.println("Payment Successful");
                                }
                                break;
                            case 2:{
                                System.out.println("Have a delicious day with SS Hyderabad");
                                break;
                            }
                            default:{
                                System.out.println("Invalid OTP");
                                break;
                            }
                        }
                        break;
                    }
                    case 2:{
                        System.out.println("Thank you for ordering Mutton Biriyani");
                        double food_price = 300.0;
                        System.out.println(food_price);
                        System.out.println("Enter the Quantity : ");
                        int food_Quantity = sc.nextInt();
                        double Total_bill = food_price * food_Quantity;
                        System.out.println("Total bill is "+ Total_bill+"\n choose your Payment Method \n 1. UPI Payment \n 2. Cash");
                        int payment_method = sc.nextInt();
                        switch (payment_method) {
                            case 1:
                                int otp = (int)(Math.random()*999+999);
                                Thread.sleep(3000);
                                System.out.println(otp);
                                System.out.println("Enter the OTP for Payment Confirmation");
                                int User_otp = sc.nextInt();
                                if (otp==User_otp) {
                                    System.out.println("Payment Successful");
                                }
                                break;
                            case 2:{
                                System.out.println("Have a delicious day with SS Hyderabad");
                                break;
                            }
                        
                            default:{
                                System.out.println("Invalid OTP");
                                break;
                            }
                        }
                        break;
                    }
                    case 3:{
                        System.out.println("Thank you for ordering BBQ Combo");
                        double food_price = 450.0;
                        System.out.println(food_price);
                        System.out.println("Enter the Quantity : ");
                        int food_Quantity = sc.nextInt();
                        double Total_bill = food_price * food_Quantity;
                        System.out.println("Total bill is "+ Total_bill+"\n choose your Payment Method \n 1. UPI Payment \n 2. Cash");
                        int payment_method = sc.nextInt();
                        switch (payment_method) {
                            case 1:
                                int otp = (int)(Math.random()*999+999);
                                Thread.sleep(3000);
                                System.out.println(otp);
                                System.out.println("Enter the OTP for Payment Confirmation");
                                int User_otp = sc.nextInt();
                                if (otp==User_otp) {
                                    System.out.println("Payment Successful");
                                    System.out.println("Have a delicious day with SS Hyderabad");
                                }
                                break;
                            case 2:{
                                System.out.println("Have a delicious day with SS Hyderabad");
                                break;
                            }
                            default:{
                                System.out.println("Invalid OTP");
                                break;
                            }
                        }
                        break;
                    }
                    default:{
                        System.out.println("Invalid Option");
                        break;
                    }
                }
                break;
            }

            //Thalapakatti Biriyani
            case 2:{
                System.out.println("Thank You for Choosing Thalapakatii Biriyani");
                Thread.sleep(1000);
                System.out.println("Thalapakatii Biriyani has \n 1. Chicken Biriyani \n 2. Mutton Biriyani \n 3. Prawn Biriyani");
                System.out.println("Choose the Food");
                int food_number = sc.nextInt();
                switch (food_number) {
                    case 1:{
                        System.out.println("Thank you for ordering Chicken Biriyani");
                        double food_price = 200.0;
                        System.out.println(food_price);
                        System.out.println("Enter the Quantity : ");
                        int food_Quantity = sc.nextInt();
                        double Total_bill = food_price * food_Quantity;
                        System.out.println("Total bill is "+ Total_bill+"\n choose your Payment Method \n 1. UPI Payment \n 2. Cash");
                        int payment_method = sc.nextInt();
                        switch (payment_method) {
                            case 1:
                                int otp = (int)(Math.random()*999+999);
                                Thread.sleep(3000);
                                System.out.println(otp);
                                System.out.println("Enter the OTP for Payment Confirmation");
                                int User_otp = sc.nextInt();
                                if (otp==User_otp) {
                                    System.out.println("Payment Successful");
                                }
                                break;
                            case 2:{
                                System.out.println("Have a delicious day with Thalapakatii Biriyani");
                                break;
                            }
                            default:{
                                System.out.println("Invalid OTP");
                                break;
                            }
                        }
                        break;
                    }
                    case 2:{
                        System.out.println("Thank you for ordering Mutton Biriyani");
                        double food_price = 300.0;
                        System.out.println(food_price);
                        System.out.println("Enter the Quantity : ");
                        int food_Quantity = sc.nextInt();
                        double Total_bill = food_price * food_Quantity;
                        System.out.println("Total bill is "+ Total_bill+"\n choose your Payment Method \n 1. UPI Payment \n 2. Cash");
                        int payment_method = sc.nextInt();
                        switch (payment_method) {
                            case 1:
                                int otp = (int)(Math.random()*999+999);
                                Thread.sleep(3000);
                                System.out.println(otp);
                                System.out.println("Enter the OTP for Payment Confirmation");
                                int User_otp = sc.nextInt();
                                if (otp==User_otp) {
                                    System.out.println("Payment Successful");
                                }
                                break;
                            case 2:{
                                System.out.println("Have a delicious day with Thalapakatii Biriyani");
                                break;
                            }
                        
                            default:{
                                System.out.println("Invalid OTP");
                                break;
                            }
                        }
                        break;
                    }
                    case 3:{
                        System.out.println("Thank you for ordering BBQ Combo");
                        double food_price = 450.0;
                        System.out.println(food_price);
                        System.out.println("Enter the Quantity : ");
                        int food_Quantity = sc.nextInt();
                        double Total_bill = food_price * food_Quantity;
                        System.out.println("Total bill is "+ Total_bill+"\n choose your Payment Method \n 1. UPI Payment \n 2. Cash");
                        int payment_method = sc.nextInt();
                        switch (payment_method) {
                            case 1:
                                int otp = (int)(Math.random()*999+999);
                                Thread.sleep(3000);
                                System.out.println(otp);
                                System.out.println("Enter the OTP for Payment Confirmation");
                                int User_otp = sc.nextInt();
                                if (otp==User_otp) {
                                    System.out.println("Payment Successful");
                                    System.out.println("Have a delicious day with Thalapakatii Biriyani");
                                }
                                break;
                            case 2:{
                                System.out.println("Have a delicious day with Thalapakatii Biriyani");
                                break;
                            }
                            default:{
                                System.out.println("Invalid OTP");
                                break;
                            }
                        }
                        break;
                    }
                    default:{
                        System.out.println("Invalid Option");
                        break;
                    }
                }
                break;
            }

            //Ejey mama's Hotel
            case 3:{
                System.out.println("Thank You for Choosing Ejey mama's Hotel");
                Thread.sleep(1000);
                System.out.println("SS Hyderabad has \n 1. Chicken Biriyani \n 2. Chicken Rice \n 3. Paneer Rice");
                System.out.println("Choose the Food");
                int food_number = sc.nextInt();
                switch (food_number) {
                    case 1:{
                        System.out.println("Thank you for ordering Chicken Biriyani");
                        double food_price = 200.0;
                        System.out.println(food_price);
                        System.out.println("Enter the Quantity : ");
                        int food_Quantity = sc.nextInt();
                        double Total_bill = food_price * food_Quantity;
                        System.out.println("Total bill is "+ Total_bill+"\n choose your Payment Method \n 1. UPI Payment \n 2. Cash");
                        int payment_method = sc.nextInt();
                        switch (payment_method) {
                            case 1:
                                int otp = (int)(Math.random()*999+999);
                                Thread.sleep(3000);
                                System.out.println(otp);
                                System.out.println("Enter the OTP for Payment Confirmation");
                                int User_otp = sc.nextInt();
                                if (otp==User_otp) {
                                    System.out.println("Payment Successful");
                                }
                                break;
                            case 2:{
                                System.out.println("Have a delicious day with Ejey mama's Hotel");
                                break;
                            }
                            default:{
                                System.out.println("Invalid OTP");
                                break;
                            }
                        }
                        break;
                    }
                    case 2:{
                        System.out.println("Thank you for ordering Chicken Rice");
                        double food_price = 300.0;
                        System.out.println(food_price);
                        System.out.println("Enter the Quantity : ");
                        int food_Quantity = sc.nextInt();
                        double Total_bill = food_price * food_Quantity;
                        System.out.println("Total bill is "+ Total_bill+"\n choose your Payment Method \n 1. UPI Payment \n 2. Cash");
                        int payment_method = sc.nextInt();
                        switch (payment_method) {
                            case 1:
                                int otp = (int)(Math.random()*999+999);
                                Thread.sleep(3000);
                                System.out.println(otp);
                                System.out.println("Enter the OTP for Payment Confirmation");
                                int User_otp = sc.nextInt();
                                if (otp==User_otp) {
                                    System.out.println("Payment Successful");
                                }
                                break;
                            case 2:{
                                System.out.println("Have a delicious day with Ejey mama's Hotel");
                                break;
                            }
                        
                            default:{
                                System.out.println("Invalid OTP");
                                break;
                            }
                        }
                        break;
                    }
                    case 3:{
                        System.out.println("Thank you for ordering Paneer Rice");
                        double food_price = 450.0;
                        System.out.println(food_price);
                        System.out.println("Enter the Quantity : ");
                        int food_Quantity = sc.nextInt();
                        double Total_bill = food_price * food_Quantity;
                        System.out.println("Total bill is "+ Total_bill+"\n choose your Payment Method \n 1. UPI Payment \n 2. Cash");
                        int payment_method = sc.nextInt();
                        switch (payment_method) {
                            case 1:
                                int otp = (int)(Math.random()*999+999);
                                Thread.sleep(3000);
                                System.out.println(otp);
                                System.out.println("Enter the OTP for Payment Confirmation");
                                int User_otp = sc.nextInt();
                                if (otp==User_otp) {
                                    System.out.println("Payment Successful");
                                    System.out.println("Have a delicious day with Ejey mama's Hotel");
                                }
                                break;
                            case 2:{
                                System.out.println("Have a delicious day with Ejey mama's Hotel");
                                break;
                            }
                            default:{
                                System.out.println("Invalid OTP");
                                break;
                            }
                        }
                        break;
                    }
                    default:{
                        System.out.println("Invalid Option");
                        break;
                    }
                }
                break;
            }

            //Buhari
            case 4:{
                System.out.println("Thank You for Choosing Buhari");
                Thread.sleep(1000);
                System.out.println("SS Hyderabad has \n 1. Chicken Biriyani \n 2. Mutton Biriyani \n 3. BBQ Combo");
                System.out.println("Choose the Food");
                int food_number = sc.nextInt();
                switch (food_number) {
                    case 1:{
                        System.out.println("Thank you for ordering Chicken Biriyani");
                        double food_price = 200.0;
                        System.out.println(food_price);
                        System.out.println("Enter the Quantity : ");
                        int food_Quantity = sc.nextInt();
                        double Total_bill = food_price * food_Quantity;
                        System.out.println("Total bill is "+ Total_bill+"\n choose your Payment Method \n 1. UPI Payment \n 2. Cash");
                        int payment_method = sc.nextInt();
                        switch (payment_method) {
                            case 1:
                                int otp = (int)(Math.random()*999+999);
                                Thread.sleep(3000);
                                System.out.println(otp);
                                System.out.println("Enter the OTP for Payment Confirmation");
                                int User_otp = sc.nextInt();
                                if (otp==User_otp) {
                                    System.out.println("Payment Successful");
                                }
                                break;
                            case 2:{
                                System.out.println("Have a delicious day with Buhari");
                                break;
                            }
                            default:{
                                System.out.println("Invalid OTP");
                                break;
                            }
                        }
                        break;
                    }
                    case 2:{
                        System.out.println("Thank you for ordering Mutton Biriyani");
                        double food_price = 300.0;
                        System.out.println(food_price);
                        System.out.println("Enter the Quantity : ");
                        int food_Quantity = sc.nextInt();
                        double Total_bill = food_price * food_Quantity;
                        System.out.println("Total bill is "+ Total_bill+"\n choose your Payment Method \n 1. UPI Payment \n 2. Cash");
                        int payment_method = sc.nextInt();
                        switch (payment_method) {
                            case 1:
                                int otp = (int)(Math.random()*999+999);
                                Thread.sleep(3000);
                                System.out.println(otp);
                                System.out.println("Enter the OTP for Payment Confirmation");
                                int User_otp = sc.nextInt();
                                if (otp==User_otp) {
                                    System.out.println("Payment Successful");
                                }
                                break;
                            case 2:{
                                System.out.println("Have a delicious day with Buhari");
                                break;
                            }
                        
                            default:{
                                System.out.println("Invalid OTP");
                                break;
                            }
                        }
                        break;
                    }
                    case 3:{
                        System.out.println("Thank you for ordering BBQ Combo");
                        double food_price = 450.0;
                        System.out.println(food_price);
                        System.out.println("Enter the Quantity : ");
                        int food_Quantity = sc.nextInt();
                        double Total_bill = food_price * food_Quantity;
                        System.out.println("Total bill is "+ Total_bill+"\n choose your Payment Method \n 1. UPI Payment \n 2. Cash");
                        int payment_method = sc.nextInt();
                        switch (payment_method) {
                            case 1:
                                int otp = (int)(Math.random()*999+999);
                                Thread.sleep(3000);
                                System.out.println(otp);
                                System.out.println("Enter the OTP for Payment Confirmation");
                                int User_otp = sc.nextInt();
                                if (otp==User_otp) {
                                    System.out.println("Payment Successful");
                                    System.out.println("Have a delicious day with Buhari");
                                }
                                break;
                            case 2:{
                                System.out.println("Have a delicious day with Buhari");
                                break;
                            }
                            default:{
                                System.out.println("Invalid OTP");
                                break;
                            }
                        }
                        break;
                    }
                    default:{
                        System.out.println("Invalid Option");
                        break;
                    }
                }
                break;
            }
            default:{
                System.out.println("Invalid Hotel");
                break;
            }
        }
    }
}
