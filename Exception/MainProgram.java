package java_core.Exception;

class VotingException extends Exception {
    VotingException(String msg) {
        super(msg);
    }
}

class FailException extends Exception {
    FailException(String msg) {
        super(msg);
    }
}

class InvalidPasswordException extends Exception {
    InvalidPasswordException(String msg) {
        super(msg);
    }
}

class BillException extends Exception {
    BillException(String msg) {
        super(msg);
    }
}

class SpeedLimitException extends Exception {
    SpeedLimitException(String msg) {
        super(msg);
    }
}

public class MainProgram {

    static void checkVote(int age) throws VotingException {
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            throw new VotingException("Not eligible for voting");
        }
    }

    static void checkResult(int marks) throws FailException {
        if (marks >= 35) {
            System.out.println("Pass");
        } else {
            throw new FailException("Fail in exam");
        }
    }

    static void checkPassword(String password) throws InvalidPasswordException {
        if (password.equals("admin123")) {
            System.out.println("Login successful");
        } else {
            throw new InvalidPasswordException("Invalid password");
        }
    }

    static void checkBill(int units) throws BillException {
        if (units >= 100) {
            System.out.println("High bill generated");
        } else {
            throw new BillException("Low usage, no extra charges");
        }
    }

    static void checkSpeed(int speed) throws SpeedLimitException {
        if (speed <= 80) {
            System.out.println("Safe driving");
        } else {
            throw new SpeedLimitException("Speed limit exceeded");
        }
    }

    public static void main(String[] args) {

        try {
            checkVote(17);
        } catch (VotingException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkResult(30);
        } catch (FailException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkPassword("1234");
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkBill(80);
        } catch (BillException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkSpeed(90);
        } catch (SpeedLimitException e) {
            System.out.println(e.getMessage());
        }
    }
}