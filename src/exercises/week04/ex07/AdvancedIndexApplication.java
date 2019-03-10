package Ex07;

import java.util.*;

public class AdvancedIndexApplication {

    //    Matilda just bought a new book about social impact and as she opens it, she sees the index
//        Create the AdvancedIndexApplication class and write the following instructions in its main method:
    public static void main(String[] args) {

//           Create an empty index map connecting Integer for the page numbers and
//        a List of Topic for the several book topics that will appear in each page and display it.
        Map<Integer, List<Topic>> index = new HashMap<>();
        String message = "Index: ";
        System.out.println(message + index);

//        Put them into the index map from biggest to smallest page number and
//        display it to notice that the entries are automatically arranged.
        List<Topic> topics2 = new ArrayList<>();
        topics2.add(new Topic("possitive things"));
        topics2.add(new Topic("ecologic economy"));
        index.put(2, topics2);

        List<Topic> topics1 = new ArrayList<>();
        topics1.add(new Topic("connecting"));
        index.put(1, topics1);

        System.out.println(message + index);

//        Create two Integers that represent three different page numbers.
        System.out.println("index key: " + index.keySet());

//       Create three Topic objects.
//          Create two lists: topics1 and topics2 .
//        Add one Topic to topics1 and two into topics2 .


//          Put the page numbers and topic1 and topic2 respectively into the index map .
        index.put(1, topics1);
        index.put(2, topics2);
        System.out.println("index value: " + index.values());

//           Display the map keys. To display the Topic class create the toString method.
        System.out.println(index.keySet());

//           Display the map values. To display the Topic class create the toString method.
        System.out.println(index.values());


//           Create another different Topic .
        Topic differentTopic = new Topic("different Topic");


//           Get the topics1 from the map and call it stored . Add to stored the last Topic you created. Display the map.
        System.out.println(index.get(1));

//           Ask if one of the keys is contained in the map and display the answer.


//           Get the topics2 from the map and call it stored2 and display it.


//           Display its size.
        System.out.println("index size: " + index.size());


    }

    private static void displayMap(String message, Map<Integer, List<String>> index) {
        System.out.println(message + index.toString());
    }
}


