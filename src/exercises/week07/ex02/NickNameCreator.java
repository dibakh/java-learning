package exercises.week07.ex02;

import java.util.ArrayList;
import java.util.List;

public class NickNameCreator {
    private List<String> nickNames = new ArrayList<>();

    public List<String> creator(List<String> names) {

        for (String name : names) {
            int lengthOfName = name.length();

            if (lengthOfName == 1) {
                nickNames.add(name);
            } else {

                String nickName = name.substring(0, lengthOfName / 2);
                nickNames.add(nickName);
            }
        }

        return  nickNames;
    }

    public void display(List<String> nickNames) {
        System.out.println("nickName : " + nickNames);
    }
}


