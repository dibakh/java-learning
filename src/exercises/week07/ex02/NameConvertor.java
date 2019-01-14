package exercises.week07.ex02;

import java.util.List;

public class NameConvertor {
    public void convertNameToNickName() {

        NameGartherer nickNameGatherer = new NameGartherer();
        NickNameCreator nickNameCreator = new NickNameCreator();

        List<String> names = nickNameGatherer.gather();
        List<String> nickNames = nickNameCreator.creator(names);
        nickNameCreator.display(nickNames);



    }

}
