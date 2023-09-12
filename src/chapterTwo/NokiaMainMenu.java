package chapterTwo;

import java.util.Scanner;

public class NokiaMainMenu {


    public static void main(String[] args) {


        NokiaMainMenu nokiaMainMenu = new NokiaMainMenu();

        nokiaMainMenu.welcome();

    }


        private  Scanner scanner = new Scanner(System.in);


      public void welcome(){System.out.println("""
                For Nokia Main menu
                press
                1. Phone book
                2. Messages
                3. Chat
                4. Call Register
                5. Tones
                6. Settings
                7. Call Divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM services
                """);

        int myInput = scanner.nextInt();
        switch (myInput) {
            case 1:
                System.out.println("phone book");
                System.out.println("""
                        For phone book,
                        press
                        1.search
                        2.service Nos
                        3.Add Name
                        4.Erase
                        5.Edit
                        6.Assign tone
                        7.Send B' Card
                        8.Options
                        9.Speed Dials
                        10.Voice Tags
                                      """);

                int mineInput = scanner.nextInt();
                switch (mineInput) {
                    case 1:
                        System.out.println("search");
                        break;
                    case 2:
                        System.out.println("service Nos");
                        break;
                    case 3:
                        System.out.println("Add Name");
                        break;
                    case 4:
                        System.out.println("Erase");
                        break;
                    case 5:
                        System.out.println("Edit");
                        break;
                    case 6:
                        System.out.println("Assign tone");
                        break;
                    case 7:
                        System.out.println("Send B' Card");
                        break;
                    case 8:
                        System.out.println("Options");
                        System.out.println("""
                                For Options,
                                press
                                1.Type of view
                                2.Memory status.
                                                      
                                                """);

                        int yourInput = scanner.nextInt();
                        switch (yourInput) {
                            case 1:
                                System.out.println("Type of view");
                                break;
                            case 2:
                                System.out.println("Memory status.");
                                break;
                        }
                        break;
                    case 9:
                        System.out.println("Speed Dials");
                        break;
                    case 10:
                        System.out.println("Voice Tags");
                        break;

                }

        }
        switch (myInput) {
            case 2:
                System.out.println("Messages");
                System.out.println("""
                        For Messages,
                        press
                        1.Write messages
                        2.Inbox
                        3.Outbox
                        4.Picture messages
                        5.Templates
                        6.Smileys
                        7.Message settings
                        8.Info service
                        9.voice mailbox number
                        10.Service command editor
                                      """);
                int smsInput = scanner.nextInt();
                switch (smsInput) {
                    case 1:
                        System.out.println("Write messages");
                        break;
                    case 2:
                        System.out.println("Inbox");
                        break;
                    case 3:
                        System.out.println("Outbox");
                        break;
                    case 4:
                        System.out.println("Picture messages ");
                        break;
                    case 5:
                        System.out.println("Templates");
                        break;
                    case 6:
                        System.out.println("Smileys");
                        break;
                    case 7:
                        System.out.println("Message settings");
                        System.out.println("""
                                For message settings
                                 press
                                 1.Set 1
                                 2.Common
                                                      """);
                        int setInput = scanner.nextInt();
                        switch (setInput) {
                            case 1:
                                System.out.println("Set 1");
                                System.out.println("""
                                        for set 1
                                         press
                                         1. Message centre number
                                         2. Messages sent as
                                         3. Message Validity
                                                              """);
                                int meInput = scanner.nextInt();
                                switch (meInput) {
                                    case 1:
                                        System.out.println("Message centre number");
                                        break;
                                    case 2:
                                        System.out.println("Messages sent as");
                                        break;
                                    case 3:
                                        System.out.println("Message Validity");
                                }
                            case 2:
                                System.out.println("Common");
                                System.out.println("""
                                        For Common
                                        press
                                        1.Delivery reports
                                        2.Reply via same centre
                                        3.Character support
                                        """);
                                int comInput = scanner.nextInt();
                                switch (comInput) {
                                    case 1:
                                        System.out.println("Delivery reports");
                                        break;
                                    case 2:
                                        System.out.println("Reply via same centre");
                                        break;
                                    case 3:
                                        System.out.println("Character support");
                                        break;

                                }
                        }
                        break;
                    case 8:
                        System.out.println("Info service");
                        break;
                    case 9:
                        System.out.println("voice mailbox number");
                        break;
                    case 10:
                        System.out.println("Service command editor");
                        break;
                }
        }
        switch (myInput) {
            case 3:
                System.out.println("Chat");
                break;
        }
        switch (myInput) {
            case 4:
                System.out.println("Call register");
                System.out.println("""
                        For Call register
                        press
                        1.Missed calls
                        2.Received calls
                        3.Dialled numbers
                        4.Erase recent call lists
                        5.Show call duration
                        6.Show call costs
                        7.Call cost settings
                        8.Prepaid credit
                                          """);
                int CallInput = scanner.nextInt();
                switch (CallInput) {
                    case 1:
                        System.out.println("Missed calls");
                        break;
                    case 2:
                        System.out.println("Received calls");
                        break;
                    case 3:
                        System.out.println("Dialled numbers");
                        break;
                    case 4:
                        System.out.println("Erase recent call lists");
                        break;
                    case 5:
                        System.out.println("Show call duration");
                        System.out.println("""
                                For Show call duration
                                 press
                                 1.Last call duration
                                 2.All calls duration
                                 3.Received calls duration
                                 4.Dialled calls duration
                                 5.Clear timer
                                 """);
                        int callInput = scanner.nextInt();
                        switch (callInput) {
                            case 1:
                                System.out.println("Last call duration");
                                break;
                            case 2:
                                System.out.println("All calls duration");
                                break;
                            case 3:
                                System.out.println("Received calls duration");
                                break;
                            case 4:
                                System.out.println("Dialled calls duration");
                                break;
                            case 5:
                                System.out.println("Clear timer");
                                break;


                        }
                        break;
                    case 6:
                        System.out.println("Show call costs");
                        System.out.println("""
                                For show call costs
                                 press
                                 1.Last call cost
                                 2.All costs call
                                 3.Clear counters   
                                                   """);
                        int ShowInput = scanner.nextInt();
                        switch (ShowInput) {
                            case 1:
                                System.out.println("Last call cost");
                                break;
                            case 2:
                                System.out.println("All costs call");
                                break;
                            case 3:
                                System.out.println("Clear counters");
                                break;
                        }
                        break;
                    case 7:
                        System.out.println("Call cost settings");
                        System.out.println("""
                                For call cost settings
                                press
                                1.Call cost limit
                                2.Show costs in
                                                 """);
                        int CostInput = scanner.nextInt();
                        switch (CostInput) {
                            case 1:
                                System.out.println("Call cost limit");
                                break;
                            case 2:
                                System.out.println("Show costs in");
                                break;

                        }
                        break;
                    case 8:
                        System.out.println("Prepaid credit");
                        break;
                }
        }
        switch (myInput) {
            case 5:  //tones settings
                System.out.println("Tones");
                System.out.println("""
                        For Tones,
                        press
                        1.Ringing Tone
                        2.Ringing Volume
                        3.Incoming call alert
                        4.Composer
                        5.Message alert tone
                        6.KeyPad tones
                        7.Warning and game tones
                        8.Vibrating alert
                        9.Screen saver""");
                int ToneInput = scanner.nextInt();
                switch (ToneInput) {
                    case 1:
                        System.out.println("Ringing Tone");
                        break;
                    case 2:
                        System.out.println("Ringing Volume");
                        break;
                    case 3:
                        System.out.println("Incoming call alert");
                        break;
                    case 4:
                        System.out.println("Composer");
                        break;
                    case 5:
                        System.out.println("Message alert tone");
                        break;
                    case 6:
                        System.out.println("KeyPad tones");
                        break;
                    case 7:
                        System.out.println("Warning and game tones ");
                        break;
                    case 8:
                        System.out.println("Vibrating alert");
                        break;
                    case 9:
                        System.out.println("Screen saver");
                        break;
                }
        }
        switch (myInput) {
            case 6: //settings
                System.out.println("Settings");
                System.out.println("""
                        for settings
                        press
                        1. Call settings
                        2.Phone settings
                        3.Security settings
                        4.Restore factory settings
                                            """);
                int SettingInput = scanner.nextInt();
                switch (SettingInput) {
                    case 1:
                        System.out.println("Call settings");
                        System.out.println("""
                                for call settings
                                press
                                1.Automatic radial
                                2.Speed dialling
                                3.Call waiting options
                                4.Own number sending
                                5.Phone line in use
                                6.Automatic answer""");
                        int SettInput = scanner.nextInt();
                        switch (SettInput) {
                            case 1:
                                System.out.println("Automatic radial");
                                break;
                            case 2:
                                System.out.println("Speed dialling");
                                break;
                            case 3:
                                System.out.println("Call waiting options");
                                break;
                            case 4:
                                System.out.println("Own number sending");
                                break;
                            case 5:
                                System.out.println("Phone line in use");
                                break;
                            case 6:
                                System.out.println("Automatic answer");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Phone settings");
                        System.out.println("""
                                for Phone settings
                                press
                                1.Language
                                2.Cell info display
                                3.Welcome note
                                4.Network selection
                                5.Lights
                                6.Confirm SIM service actions""");
                        int PhoneInput = scanner.nextInt();
                        switch (PhoneInput) {
                            case 1:
                                System.out.println("Language");
                                break;
                            case 2:
                                System.out.println("Cell info display");
                                break;
                            case 3:
                                System.out.println("Welcome note");
                                break;
                            case 4:
                                System.out.println("Network selection");
                                break;
                            case 5:
                                System.out.println("Lights");
                                break;
                            case 6:
                                System.out.println("Confirm SIM service actions");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Security settings");
                        System.out.println("""
                                for Security settings
                                press
                                1.Pin code request
                                2.Call barring service
                                3.Fixed dialling
                                4.Closed user group
                                5.Phone security
                                6.CChange access codes""");
                        int SecInput = scanner.nextInt();
                        switch (SecInput) {
                            case 1:
                                System.out.println("Pin code request");
                                break;
                            case 2:
                                System.out.println("Call barring service");
                                break;
                            case 3:
                                System.out.println("Fixed dialling");
                                break;
                            case 4:
                                System.out.println("Closed user group");
                                break;
                            case 5:
                                System.out.println("Phone security");
                                break;
                            case 6:
                                System.out.println("Change access codes");
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("Restore factory settings");
                        break;
                }
        }
        switch (myInput) {
            case 7:
                System.out.println("Call divert");
                break;
        }

        switch (myInput) {
            case 8:
                System.out.println("Games");
                break;
        }
        switch (myInput) {
            case 9:
                System.out.println("Calculator");
                break;
        }
        switch (myInput) {
            case 10:
                System.out.println("Remainder");
                break;
        }
        switch (myInput) {
            case 11:
                System.out.println("Clock");
                System.out.println("""
                        For Clock,
                        press
                        1.Alarm clock
                        2.Clock settings
                        3.Date settings
                        4.Stopwatch
                        5.Countdown timer
                        6.Auto update of date and time
                                                     """);

                int ClockInput = scanner.nextInt();
                switch (ClockInput) {
                    case 1:
                        System.out.println("Alarm clock");
                        break;
                    case 2:
                        System.out.println("Clock settings");
                        break;
                    case 3:
                        System.out.println("Date settings");
                        break;
                    case 4:
                        System.out.println("Stopwatch");
                        break;
                    case 5:
                        System.out.println("Countdown timer");
                        break;
                    case 6:
                        System.out.println("Auto update of date and time");
                        break;
                }
        }
        switch (myInput) {
            case 12:
                System.out.println("Profiles");
                break;
        }
        switch (myInput) {
            case 13:
                System.out.println("SIM services");
                break;


        }
    }

}

//}


