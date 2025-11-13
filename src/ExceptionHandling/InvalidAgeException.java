package ExceptionHandling;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

 class AgeValidator {
    static void registerUser(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("❌ Not eligible — must be 18 or older!");
        } else {
            System.out.println("✅ Registration successful!");
        }
    }

    public static void main(String[] args) {
        try {
            registerUser(15);
        } catch (InvalidAgeException e) {
            System.out.println("⚠️ Exception caught: " + e.getMessage());
        }
    }
}
