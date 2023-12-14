package users;

public class User {
    private int userId;
    private String userName;
    private String userPassword;
    private double userHeight;
    private double  userWeight;
    private  double accaountBalance;
    private String userLanguage;

    public User() {
    }

    public User(String userName, String userPassword, String userLanguage) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userLanguage=userLanguage;
    }

    public User(int userId, String userName, String userPassword,  double userHeight, double userWeight, double accaountBalance) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userHeight = userHeight;
        this.userWeight = userWeight;
        this.accaountBalance = accaountBalance;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public double getUserHeight() {
        return userHeight;
    }

    public void setUserHeight(double userHeight) {
        this.userHeight = userHeight;
    }

    public double getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(double userWeight) {
        this.userWeight = userWeight;
    }

    public double getAccaountBalance() {
        return accaountBalance;
    }

    public void setAccaountBalance(double accaountBalance) {
        this.accaountBalance = accaountBalance;
    }

    public String getUserLanguage() {
        return userLanguage;
    }

    public void setUserLanguage(String userLanguage) {
        this.userLanguage = userLanguage;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userHeight=" + userHeight +
                ", userWeight=" + userWeight +
                ", accaountBalance=" + accaountBalance +
                '}';
    }
}
