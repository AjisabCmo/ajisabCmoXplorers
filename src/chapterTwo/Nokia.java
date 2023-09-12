package chapterTwo;

import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {

        Nokia nokia = new Nokia();
      nokia.Welcome();

    }

      private Scanner scanner = new Scanner(System.in);
        public void Welcome(){
            System.out.println("""
                    Welcome to nokia
                    press 1 for Main Menu
                    press # to Quit
                    """);
            int response = scanner.nextInt();
            if (response == 1){
                mainMenu();
            }


            }

    public void mainMenu() {System.out.println("""
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
            int response = scanner.nextInt();
            
            switch(response){
                case 1:
                    phoneBook();
                case 2:
                    messages();
                case 3:
                    chat();
                case 4:
                    callRegister();

            }
            

    }

    public void callRegister() {
        System.out.println("""
                1. Missed calls
                2. Received calls
                3. Dialled numbers
                4. Erase recent call lists
                5. Show call duration
                6.Show call costs
                7.Call cost settings
                8.prepaid credit
                """);
        int response = scanner.nextInt();
        if (response==1){
            missedCalls();
        }
        if (response==2){
            receivedCalls();
        }
        if (response==3){
            dialledNumber();
        }
        if (response==4){
            eraseRecentCallLists();
        }
        if(response==5){
            showCallDuration();
        }
        if(response==6){
            showCallCosts();
        }
        if (response==7){
            callCostSettings();
        }
        if (response==8){
            prepaidCredit();
        }
    }

   public void prepaidCredit() {
       System.out.println("""
               blank
               press 01 for call register
               press 00 for main menu
                              """);
       int response = scanner.nextInt();
       if (response==01){
           callRegister();
       }
       if (response==00){
           mainMenu();
       }else{
           mainMenu();
       }
    }

    public void callCostSettings() {
        System.out.println("""
                1.call cost limit
                2.Show costs in
                """);
        int response = scanner.nextInt();
        if (response==1){
            callCostLimit();
        }
        if (response==2){
            showCostsIn();
        }

    }

    public void showCostsIn() {
        System.out.println("""
                blank
                press 01 for call regisster
                press 00 for main menu
                                  """);
        int response = scanner.nextInt();
        if (response==01){
            callRegister();
        }
        if (response==00){
            mainMenu();
        }else{
            mainMenu();
        }

    }

    public void callCostLimit() {
        System.out.println("""
                blank
                press 01 for call register
                press 00 for main menu
                """);
        int response = scanner.nextInt();
        if (response==01){
            callRegister();
        }
        if(response==00){
            mainMenu();
        }else{
            mainMenu();
        }

    }

    public void showCallCosts() {
        System.out.println("""
                1. Last call cost
                2. All calls’ cost
                3. Clear counters
                """);
        int response = scanner.nextInt();
        if (response==1){
            lastCallCost();
        }
        if (response==2){
            allCallsCost();
        }
        if (response==3){
            clearCounters();
        }
    }

    public void clearCounters() {
        System.out.println("""
                blank
                press 01 for call register
                press 00 for main menu
                          """);
        int response = scanner.nextInt();
        if (response==01){
            callRegister();
        }
        if (response==00){
            mainMenu();
        }else{
            mainMenu();
        }

    }

    public void allCallsCost() {
        System.out.println("""
                blank
                press 01 for call register
                press 00 for main menu
                """);
        int response= scanner.nextInt();
        if (response==01){
            callRegister();
        }
        if (response==00){
            mainMenu();
        }else{
            mainMenu();
        }
    }


    public void lastCallCost() {
        System.out.println("""
                blank
                press 01 for call register
                press 00 for mainMenu
                """);
            int response= scanner.nextInt();
            if(response==01){
                callRegister();
            }
            if (response==00){
                mainMenu();
            }else{
                mainMenu();
            }
    }

    public void showCallDuration() {
        System.out.println("""
                1. Last call duration
                2. All calls’ duration
                3. Received calls’ duration
                4. Dialled calls’ duration
                5. Clear timers
                """);
        int response = scanner.nextInt();
        if(response==01){
            lastCallDuration();
        }
         if (response==02){
             allCallsDuration();
         }
         if (response==03){
             receivedCallsDuration();
         }
         if (response==04){
             dialledCallsDuration();
         }
         if(response ==05){
             clearTimer();
         }
    }

   public void clearTimer() {
       System.out.println("""
               blank
             press 01 for call register
              press 00 for mainMenu
               """);
       int response = scanner.nextInt();
       if (response==01){
           callRegister();
       }
       if (response==00){
           mainMenu();
       }else{
           mainMenu();
       }

    }

    public void dialledCallsDuration() {
        System.out.println("""
                 blank
             press 01 for call register
              press 00 for mainMenu
                """);
        int response = scanner.nextInt();
        if (response==01){
            callRegister();
        }
        if (response==00){
            mainMenu();
        }else{
            mainMenu();
        }

    }

    public void receivedCallsDuration() {
        System.out.println("""
                blank
             press 01 for call register
              press 00 for mainMenu
                """);
        int response = scanner.nextInt();
        if(response==01){
            callRegister();
        }
        if(response==00){
            mainMenu();
        }else {
            mainMenu();
        }

    }

    public void allCallsDuration() {
        System.out.println("""
                blank
             press 01 for call register
              press 00 for mainMenu
                """);
        int response = scanner.nextInt();
        if (response==01){
            callRegister();
        }
        if(response==00){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void lastCallDuration() {
        System.out.println("""
                blank
                press 01 for call register
                press 00 for mainMenu""");
        int response = scanner.nextInt();
        if(response==01){
            callRegister();
        }
           if (response==00) {
               mainMenu();
           }else{
               mainMenu();
           }
    }

    public void eraseRecentCallLists() {
     System.out.println("""
             blank
             press 01 for call register
                press 00 for mainMenu 
             """);
     int response = scanner.nextInt();
     if (response==01){
         callRegister();
     }
     if(response==00){
         mainMenu();
     }else{
         mainMenu();
     }

    }

    public void dialledNumber() {
        System.out.println("""
             blank
                press 01 for call register
                press 00 for mainMenu   
                """);
        int response = scanner.nextInt();
        if (response==01){
            callRegister();
        }
        if(response==00){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void receivedCalls() {
        System.out.println("""
                blank
                press 01 for call register
                press 00 for mainMenu
                """);
        int response = scanner.nextInt();
        if (response==01){
            callRegister();
        }
        if(response==00){
            mainMenu();
        }else{
            mainMenu();
        }

    }

    public void missedCalls() {
        System.out.println("""
                blank
                press 01 for call register
                press 00 for mainMenu
                """);
        int response = scanner.nextInt();
        if (response==01){
            callRegister();
        }
        if (response==00){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void chat() {
        System.out.println("""
                blank
                press 01 for chat
                press 00 for mainMenu
                """);
        int response = scanner.nextInt();
        if (response==01){
            chat();
        }
        if (response==0){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void messages() {
        System.out.println("""
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
        int response = scanner.nextInt();
        if (response==1){
            writeMessages();
        }
        if (response==2){
            inbox();
        }
        if (response==3){
            outbox();
        }
        if (response==4){
            pictureMessages();
        }
        if (response==5){
            templates();
        }
        if (response==6){
            smileys();
        }
        if (response==7){
            messageSettings();
        }
        if (response==8){
            infoService();
        }
        if (response==9){
            voiceMailboxNumber();
        }
        if (response==10){
            serviceCommandEditor();
        }
    }

    public void serviceCommandEditor() {
        System.out.println("""
                blank
                press 01 for messages
                press 00 for mainMenu
                """);
        int response = scanner.nextInt();
        if (response==01){
            messages();
        }
        if (response==00){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void voiceMailboxNumber() {
        System.out.println("""
                blank
                press 01 for messages
                press 00 for mainMenu
                """);
        int response = scanner.nextInt();
        if (response==01){
            messages();
        }
        if (response==00){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void infoService() {
        System.out.println("""
                blank
                 press 01 for messages
                press 00 for mainMenu
                """);
        int response = scanner.nextInt();
        if (response==01){
            messages();
        }
        if (response==00){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void messageSettings() {
        System.out.println("""
                press 
                1. set 1
                2. common
                """);
        int response= scanner.nextInt();
        if (response==1){
            set1();
        }
        if (response==2){
            common();
        }
    }

    public void common() {
        System.out.println("""
                1.delivery reports
                2.reply via same centre
                3.character support
                                  """);
        int response = scanner.nextInt();
        if (response==1){
            deliveryReports();
        }
        if (response==2){
            replyViaSameCentre();
        }
        if (response==3){
            characterSupport();
        }
    }

    public void characterSupport() {
        System.out.println("""
                blank
                 press 01 for messages
                press 00 for mainMenu
                """);
        int response = scanner.nextInt();
        if (response==01){
            messages();
        }
        if (response==00){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void replyViaSameCentre() {
        System.out.println("""
                blank
                press 01 for messages
                press 00 for mainMenu
                """);
        int response = scanner.nextInt();
        if (response==01){
            messages();
        }
        if (response==0){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void deliveryReports() {
        System.out.println("""
                blank
                press 01 for messages
                press 00 for mainMenu
                """);
        int response = scanner.nextInt();
        if (response==01){
            messages();
        }
        if (response==0){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void set1() {
        System.out.println("""
                1.Message centre number
                2.Messages sent as
                3.Message validity
                              """);
        int response = scanner.nextInt();
       if (response==1){
           messageCentreNumber();
       }
       if (response==2){
           messageSentAs();
       }
       if (response==3){
           messageValidity();
       }
    }

    public void messageValidity() {
        System.out.println("""
                blank
                press 01 for messages
                press 00 for mainMenu
                """);
        int response = scanner.nextInt();
        if (response==01){
            messages();
        }
        if (response==00){
            mainMenu();
        }else{
            mainMenu();
        }

    }

    public void messageSentAs() {
         System.out.println("""
                 blank
                 press 01 for messages
                press 00 for mainMenu
                 """);
         int response = scanner.nextInt();
         if (response==01){
             messages();
         }
         if (response==00){
             mainMenu();
         }else{
             mainMenu();
         }
    }

    public void messageCentreNumber() {
        System.out.println("""
                blank
                press 01 for messages
                press 00 for mainMenu
                """);
        int response = scanner.nextInt();
        if (response==01){
            messages();
        }
        if (response==00){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    private void smileys() {
        System.out.println("""
                blank
                press 01 for messages
                press 00 for mainMenu
                """);
        int response = scanner.nextInt();
        if (response==01){
            messages();
        }
        if (response==00){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void templates() {
        System.out.println("""
                blank
                press 01 for messages
                press 00 for mainMenu
                """);
        int response = scanner.nextInt();
        if (response==01){
            messages();
        }
        if (response==00){
            mainMenu();
        }else{
            mainMenu();
        }
    }


    public void pictureMessages() {
        System.out.println("""
                blank
                press 01 for messages
                press 00 for mainMenu
                """);
        int response = scanner.nextInt();
        if (response==01){
            messages();
        }
        if (response==00){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void outbox() {
        System.out.println("""
                blank
                press 01 for messages
                press 00 for mainMenu
                """);
        int response = scanner.nextInt();
        if (response==01){
            messages();
        }
        if (response==0){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void inbox() {
        System.out.println("""
                blank
                press 01 for messages
                press 00 for mainMenu
                """);
        int response = scanner.nextInt();
        if (response==01){
            messages();
        }
        if (response==00){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void writeMessages() {
        System.out.println("""
                blank
                press 01 for messages
                press 00 for mainMenu
                """);
        int response = scanner.nextInt();
        if (response==01){
            messages();
        }
        if (response==00){
            mainMenu();
        }else{
            mainMenu();
        }
    }


    public void phoneBook() {
        System.out.println("""
                1.Search
                2. Service Nos. 1
                3. Add name
                4. Erase
                5. Edit
                6. Assign tone
                7. Send b’card
                8.Options
                9.speed Dial
                10.voice tag
                
                """);
           int response = scanner.nextInt();
           if(response==1){
               search();

               }
              if(response==2){
                  ServiceNos();
              }
              if (response==3){
                  AddName();
              }
              if(response==4) {
                  Erase();
              }
              if(response==5){
                  Edit();
              }
              if(response==6){
                  AssignTone();
              }
              if (response==7){
                  SendbCard();
              }
           if (response == 8){
               phoneBookOption();

               if (response == 00){
                   mainMenu();
               }
           }
             if (response==9){
                 speeddials();
             }
             if (response==10){
                 voiceTags();
             }
        }

    private void voiceTags() {
        System.out.println("""
                blank
                press 01 for phone book
                press 00 for mainMenu
                """);
        int response= scanner.nextInt();
        if(response==01){
            phoneBook();
        }
        if(response==00){
            mainMenu();
        }else{
            mainMenu();
        }

    }

    private void speeddials() {
        System.out.println("""
                blank
                press 01 for phone book
                press 00 for mainMenu
                """);
        int response = scanner.nextInt();
        if(response==01){
            phoneBook();
        }
        if(response==00){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void SendbCard() {
        System.out.println("""
                blank
                press 01 for phone book
                press 00 for mainMenu""");
        int response = scanner.nextInt();
        if(response==01){
            phoneBook();
        }
        if(response==00){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void AssignTone() {
        System.out.println("""
                blank
                press 01 for phone book
                press 00 for mainMenu
                               """);
        int response= scanner.nextInt();
        if (response==01){
            phoneBook();
        }
        if(response==00){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void Edit() {
        System.out.println("""
                blank
                press 01 for phone book
                press 00 for mainMenu""");
        int response = scanner.nextInt();
        if (response==01){
            phoneBook();
        }
        if (response==0){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void Erase() {
        System.out.println("""
                blank
                press 01 for phone book
                press 00 for MainMenu
                            """);
        int response =scanner.nextInt();
        if (response==01){
            phoneBook();

        }
        if (response==00){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void AddName() {
        System.out.println("""
                blank
                press 01 for phone book
                press 00 for MainMenu
                                """);
        int response=scanner.nextInt();
        if (response==01){
            phoneBook();
        }
        if (response==00){
            mainMenu();
        }else{
            mainMenu();
        }
    }

    public void ServiceNos() {
        System.out.println("""
                blank
                press 01 for phone book
                press 00 for MainMenu
                """);
        int response= scanner.nextInt();
        if (response==01){
          phoneBook();
        }
        if(response==00){
           mainMenu();
        }else {
            mainMenu();
        }

    }

    public void search() {
        System.out.println("""
                blank
                press 01 for phone book
                press 00 for MainMenu
                """);
        int response= scanner.nextInt();
        if (response==00) {
           mainMenu();
        }
        if (response == 01) {
            phoneBook();
        }


        }

    public  void phoneBookOption() {
        System.out.println("""
                1.Type of view
                2.Memory status
                """);
        int response = scanner.nextInt();
        if (response==1){
            TypeOfView();

        }
        if (response==2){
            memoryStatus();
        }

        }

        public void memoryStatus(){
            System.out.println("""
                    blank
                press 01 for phone book
                press 00 for MainMenu
                   
                    
                    """);
            int response= scanner.nextInt();
            if(response==01){
                phoneBook();
            }
            if(response==00){
                mainMenu();
            }else{
                mainMenu();
            }
        }
    public void TypeOfView() {
        System.out.println("""
                blank
                press 01 for phone book
                press 00 for MainMenu
                """);
        int response= scanner.nextInt();
        if (response==01){
            phoneBook();
        }
        if (response==00){
            mainMenu();
        }else {
            mainMenu();
        }




    }


}




