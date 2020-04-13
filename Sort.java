import java.util.ArrayList;

public class Sort{

    public static void main(String []args){
        ArrayList<String> nameList = new ArrayList<String>();
        //right order
        // ("Biff");
        // ("Doc");
        // ("George");
        // ("Jennifer");
        // ("Lorraine");
        // ("Marty");
        // ("Strickland");
        
        
        nameList.add("Strickland");
        nameList.add("George");
        nameList.add("Lorraine");
        nameList.add("Biff");
        nameList.add("Marty");
        nameList.add("Doc");
        nameList.add("Jennifer");

         electionSort(nameList);
        insertionSort(nameList);
        bubbleSort(nameList);
    }

    public static void selectionSort(ArrayList<String> list){
        String g;

        System.out.println("The Selection Sorted List is: ");

        for(int j = 0; j < list.size(); j++){
            int min = j;

            for(int k = j + 1; k < list.size(); k++){
                if(list.get(k).compareTo(list.get(min)) < 0){
                    min = k;
                }
            }

            if(min != j){
                g = list.get(j);
                list.set(j, list.get(min));
                list.set(min , g);
            }
        }

        for(int j = 0; j < list.size(); j++){
            System.out.println(list.get(j));
        }
    }


    public static void insertionSort(ArrayList<String> list){
        String g;

        System.out.println("The insertion Sorted list is: ");

        for(int j = 0; j < list.size(); j++){
            g = list.get(j);


            int k = j;
            while(k > 0 && list.get(k - 1).compareTo(g) > 0){
                list.set(k, list.get(k-1));
                k--;
            }

            list.set(k, g);

        }

        for(int j = 0; j < list.size(); j++){
            System.out.println(list.get(j));
        }
    }

    public static void bubbleSort(ArrayList<String> list){
        String g;

        System.out.println("The bubble sorted list is: ");
        for(int j = 0; j < list.size(); j++){
            for(int k = j + 1 ; k < list.size(); k++){
                if(list.get(j).compareTo(list.get(k)) > 0){
                    g = list.get(j);
                    list.set(j, list.get(k));
                    list.set(k, g);
                }

            }
        }
        for(int j = 0; j < list.size(); j++){
            System.out.println(list.get(j));
        }
    }
}