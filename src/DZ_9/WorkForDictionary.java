package DZ_9;


import java.io.IOException;

public class WorkForDictionary implements Runnable{
    String world;
    Dictionary dictionary;

    private void startWork() throws InterruptedException, IOException {
        System.out.println("\n\n\n\tWelcome to my Dictionary!\n");
        System.out.println("\t\t Please wait");
        System.out.print("\t  ");
        for(int i=0;i<9; i++){
            System.out.print("* ");
            Thread.sleep(400);
        }
       System.out.print("\u000C");
        /*while (true){
            System.out.println("\t\tMENU");

        }*/
    }



    @Override
    public void run() {
        try {
            startWork();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
