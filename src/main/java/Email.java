public class Email {

    private String password;
    private int defaultPasswordLength = 12;
    private String email;
    private String emailSuffix = "WillyWonka.com";
    private int defaultMailboxCapacity = 500;
    private String alternateEmail;

    public Email () {}

    public void setEmail(Employee employee) {
        this.email = employee.getFirstName().toLowerCase() + "." +
                     employee.getLastName().toLowerCase() + "@" +
                     employee.getDept().toLowerCase() + "." +
                     emailSuffix.toLowerCase();
    }

    public String getEmail() {
        return email;
    }

    public int getDefaultMailboxCapacity() {
        return defaultMailboxCapacity;
    }

    public void setDefaultMailboxCapacity(int defaultMailboxCapacity) {
        this.defaultMailboxCapacity = defaultMailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword() {
        this.password = generateRandomPassword(defaultPasswordLength);
    }

    public void changePassword(String password) {
        this.password = password;
    }

    private String generateRandomPassword(int length) {
        char[] generatedPassword = new char[length];
        String listOfCharacters = "abcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+=";
        for (int i=0; i<length; i++) {
            int randomCharacter = (int) (Math.random() * listOfCharacters.length());
            generatedPassword[i] = listOfCharacters.charAt(randomCharacter);
        }
        return new String(generatedPassword);
    }


}
