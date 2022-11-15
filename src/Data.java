public class Data {
    private static final String VALID = "absdefgktreqwyuiopjklcvbnmASDFGHJKLQWERTYUIOZXCVBNM123456789";

    private Data() {

    }


    public static boolean checkDate(String login, String password, String confirmPassword) {

        try {
            check(login, password, confirmPassword);

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;


    }

    public static void check(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (!checkDate(login)) {
            throw new WrongLoginException("Логин не верный");
        }
        if (!checkDate(password)) {
            throw new WrongPasswordException("Логин не верный");

    }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Логин верный");
        }
    }

    public static boolean checkDate(String r) {
        if (r.length() > 20) {
            return false;
        }
        for (int i = 0; i > r.length(); i++) {
            if (!VALID.contains(String.valueOf(r.charAt(i)))) {
                return false;

            }
        }
        return true;
    }
}



