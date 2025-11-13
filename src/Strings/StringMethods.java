package Strings;

public class StringMethods {
        public static void main(String[] args) {

            // 1️⃣ Creating Strings
            String str1 = "Java Programming";
            String str2 = "java programming";
            String str3 = "   Hello World   ";

            // 2️⃣ length()
            System.out.println("Length: " + str1.length());

            // 3️⃣ charAt()
            System.out.println("Character at index 2: " + str1.charAt(2));

            // 4️⃣ substring()
            System.out.println("Substring (5 to end): " + str1.substring(5));
            System.out.println("Substring (0 to 4): " + str1.substring(0, 4));

            // 5️⃣ equals() and equalsIgnoreCase()
            System.out.println("Equals: " + str1.equals(str2));
            System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str2));

            // 6️⃣ compareTo() and compareToIgnoreCase()
            System.out.println("CompareTo: " + str1.compareTo(str2));
            System.out.println("CompareTo Ignore Case: " + str1.compareToIgnoreCase(str2));

            // 7️⃣ toUpperCase() and toLowerCase()
            System.out.println("UpperCase: " + str1.toUpperCase());
            System.out.println("LowerCase: " + str1.toLowerCase());

            // 8️⃣ trim()
            System.out.println("Before trim: '" + str3 + "'");
            System.out.println("After trim: '" + str3.trim() + "'");

            // 9️⃣ startsWith() and endsWith()
            System.out.println("Starts with 'Java': " + str1.startsWith("Java"));
            System.out.println("Ends with 'ing': " + str1.endsWith("ing"));

            // 🔟 contains()
            System.out.println("Contains 'gram': " + str1.contains("gram"));

            // 1️⃣1️⃣ indexOf() and lastIndexOf()
            System.out.println("Index of 'a': " + str1.indexOf('a'));
            System.out.println("Last index of 'a': " + str1.lastIndexOf('a'));

            // 1️⃣2️⃣ replace()
            System.out.println("Replace 'a' with '@': " + str1.replace('a', '@'));

            // 1️⃣3️⃣ split()
            String[] words = str1.split(" ");
            System.out.println("Split words:");
            for (String w : words) {
                System.out.println(" - " + w);
            }

            // 1️⃣4️⃣ concat()
            String combined = str1.concat(" is fun!");
            System.out.println("Concatenated String: " + combined);

            // 1️⃣5️⃣ toCharArray()
            char[] chars = str1.toCharArray();
            System.out.print("Character Array: ");
            for (char c : chars) System.out.print(c + " ");
            System.out.println();

            // 1️⃣6️⃣ isEmpty() and isBlank() (Java 11+)
            String empty = "";
            String blank = "   ";
            System.out.println("Is empty string empty? " + empty.isEmpty());
            System.out.println("Is blank string blank? " + blank.isBlank());

            // 1️⃣7️⃣ join()
            String joined = String.join("-", "Java", "Python", "C++");
            System.out.println("Joined string: " + joined);

            // 1️⃣8️⃣ repeat()
            System.out.println("Repeat 'Hi' 3 times: " + "Hi ".repeat(3));
        }
}
