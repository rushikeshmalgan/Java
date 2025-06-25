// public class ifElse {
//     public static void main(String[] args) {
//         int a = 100;
//         int b = 200;
//         if (a > b ) {
//             System.out.println("A is grater than B");
//         } else if (a < b) {
//             System.out.println("A is less than B");
//         } else {
//             System.out.println("A is equal to B");
//         }
//     }
// }
//         // This is a comment

// public class ifElse {
//     public static void main(String[] args) {
//         int age = 27; // Example age, you can change this value to test different conditions
//         // Check the age and print appropriate messages
//         if (age < 18) {
//             System.out.println("You are not allowed to drive");
//         } else if (age >= 18 && age < 21) {
//             System.out.println("You can drive with a learner's permit");
//         } else if (age >= 21 && age < 65) {
//             System.out.println("You can drive with a full license");
//         } else {
//             System.out.println("You are eligible for a senior citizen driving license");
//         }
//     }
// }





public class ifElse {
    public static void main(String[] args) {
        //example for voting eligibility
        int age = 21; // Example age, you can change this value to test different conditions
        // Check the age and print appropriate messages
        if (age < 18) {
            System.out.println("You are not eligible to vote");
        } else if (age >= 18 && age < 21) {
            System.out.println("You can vote but cannot drink alcohol");
        } else if (age >= 21 && age < 65) {
            System.out.println("You can vote and drink alcohol");
        } else {
            System.out.println("You are eligible for senior citizen benefits");
        }
    }
}

