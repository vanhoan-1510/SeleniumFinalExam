package TestCases;


import Common.FakeData;
import Common.Log;
import PageObjects.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FTTC01 extends TestBase {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    BookTicketPage bookTicketPage = new BookTicketPage();
    MyTicketPage myTicketPage = new MyTicketPage();

    @Test(dataProvider = "getData", description = "'Manage ticket' displays remaining available number of booking.")
    public void MyTicket(Object[] data) throws InterruptedException {
        String username = FakeData.createRandomEmail(data[0].toString());
        String password = data[1].toString() + FakeData.RandomNumber();
        String pid = FakeData.RandomNumber();
        String departDate1 = data[2].toString();
        String departDate2 = data[3].toString();
        String departDate3 = data[4].toString();
        String departDate4 = data[5].toString();
        String departDate5 = data[6].toString();
        String departDate6 = data[7].toString();
        String departStation = data[8].toString();
        String arriveStation = data[9].toString();

        Log.info("Navigate to Register page.");
        homePage.moveToRegisterPage();
        Log.info("Register new account.");
        registerPage.register(username, password, password, pid);

        Log.info("Navigate to Login page.");
        registerPage.moveToLoginPage();
        Log.info("Login to Safe Railway.");
        loginPage.login(username, password);

        Log.info("Navigate to Book Ticket page.");
        homePage.moveToBookTicketPage();
        Log.info("Book ticket 1.");
        bookTicketPage.bookTicket(departDate1, departStation, arriveStation);
        Log.info("Navigate to Book Ticket page.");
        homePage.moveToBookTicketPage();
        Log.info("Book ticket 2.");
        bookTicketPage.bookTicket(departDate2, departStation, arriveStation);
        Log.info("Navigate to Book Ticket page.");
        homePage.moveToBookTicketPage();
        Log.info("Book ticket 3.");
        bookTicketPage.bookTicket(departDate3, departStation, arriveStation);
        Log.info("Navigate to Book Ticket page.");
        homePage.moveToBookTicketPage();
        Log.info("Book ticket 4.");
        bookTicketPage.bookTicket(departDate4, departStation, arriveStation);
        Log.info("Navigate to Book Ticket page.");
        homePage.moveToBookTicketPage();
        Log.info("Book ticket 5.");
        bookTicketPage.bookTicket(departDate5, departStation, arriveStation);
        Log.info("Navigate to Book Ticket page.");
        homePage.moveToBookTicketPage();
        Log.info("Book ticket 6.");
        bookTicketPage.bookTicket(departDate6, departStation, arriveStation);

        Log.info("Navigate to My Ticket Page.");
        bookTicketPage.moveToMyTicketPage();

        Log.info("Check that the web page displays correctly with the description.");
        String expectedMessage = "You currently book 6 tickets, you can book 4 more.";
        String actualMessage = myTicketPage.getInfoMessage().getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}