package Ex03;

public class Tool {
    private String name;

    public Tool(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }
}


//    Derek wants to hang a painting at home but he realized that for that he needs to buy a hammer.
//        Develop the code that is used to give him the tool and ask him to hang the painting.
//        Follow the instructions below:
//        You need the following classes: Derek, Tool and PaintingApplication.

//        A Tool has a name. It also has a getName method.

//        Derek has a tool as attribute, but he does not receive it through the constructor. Instead he receives it with a setTool method. He also has the methods canHangPainting and hangPainting.
//        In the canHangPainting Derek checks if he has a tool called hammer. If so he returns true, otherwise false.
//        In the hangPainting method, if Derek canHangPainting it will say he can hang the painting. Otherwise he will say that he’s missing the hammer.
//        In the PaintingApplication class main method, create a Derek object and ask him to hang the painting. He should say he’s missing the hammer. Later, create a hammer Tool, give it to Derek and ask him again to hang the painting. He should say that he can hang the painting.