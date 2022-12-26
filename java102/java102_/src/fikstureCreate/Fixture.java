package fikstureCreate;


import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class Fixture {

    LinkedList<String> teamList = new LinkedList<>();


    public void run(){

        if (teamList.size() != 0){
            if (teamList.size() == 1){
                System.out.println("Tek takýmla Lig Olmazzz.");
            }
            else{
                if (teamList.size() % 2 != 0 ){
                    teamList.add("Bay");
                }
                printTeams();
            }
        }
        else{
            System.out.println("Eþleþtirilecek Takým Yok....");
        }
        round();


    }

    /////////////////////////////////////////////////

    private void printTeams(){
        System.out.println("Takýmlar \n");
        for (String team: teamList){
            System.out.println("-\t" + team.toUpperCase());
        }
    }

    private void round(){
        LinkedList<String> teamListWeek = new LinkedList<>();

        int round = 2 * (teamList.size() - 1);

        LinkedList<String> teamListBacup = new LinkedList<>(teamList);

        int value = (teamList.size() / 2);

        for (int i = 1; i < round / 2 + 1; i++) {

            for (int k = 0; k <= value + 2; k += 2) {
                teamListWeek.add(teamListBacup.get(k) + " " + teamListBacup.get(k + 1));
            }

            /*Liste içinde ilk öðe sabit tutulur. Liste ortasýndaki öðe ikinci öðe olarak listeye eklenir ve listenin son öðesi silinir. Liste saða kaydýrýlýr..*/

            teamListBacup.add(1, teamListBacup.get(value));
            teamListBacup.add(value, teamListBacup.get(teamListBacup.size() - 1));
            teamListBacup.remove(teamListBacup.size() - 1);
            teamListBacup.remove(teamListBacup.size() - 2);

        }
        for (int i = round / 2 + 2; i <= round + 1; i++) {
            for (int k = 0; k <= value + 2; k += 2) {
                teamListWeek.add(teamListBacup.get(k + 1) + " ---- " + teamListBacup.get(k));
            }
/*the first item of the list is kept constant.the item in the middle of the list becomes the second item in the list. and
the last item is deleted from the list .The list scrolls to the right.*/

            teamListBacup.add(1, teamListBacup.get(value));
            teamListBacup.add(value, teamListBacup.get(teamListBacup.size() - 1));
            teamListBacup.remove(teamListBacup.size() - 1);
            teamListBacup.remove(teamListBacup.size() - 2);
        }

        int count = 0;
        int num;


        for (int i = 1; i <= round; i++) {

            System.out.println("-----------------------------------\nRound " + i);

            List<String> bacup = new LinkedList<>();
            // he assigns matched Teams to the temporary list on a weekly basis.
            for (int n = count; n < count + value; n++) {

                bacup.add(teamListWeek.get(n));

            }
// It shuffles the ranks of the matched teams in the week. presses the screen.
            for (int m = 0; m < value; m++) {

                num = new Random().nextInt(bacup.size());
                System.out.println(bacup.get(num));
                bacup.remove(num);


            }


            count += value;

        }


    }


}



